package com.lokesh.jumboweather;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.StringRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lokesh.jumboweather.apiresponseobjects.AccuWeatherCurrentWeatherData;
import com.lokesh.jumboweather.apiresponseobjects.AccuWeatherFivedayForecastResponse;
import com.lokesh.jumboweather.apiresponseobjects.AccuWeatherGeolocationResponse;
import com.lokesh.jumboweather.apiresponseobjects.AccuWeatherHourData;
import com.lokesh.jumboweather.apiresponseobjects.FlickrInterestingPhotosResponse;
import com.lokesh.jumboweather.appconstants.AppConstants;
import com.lokesh.jumboweather.appconstants.UserInformation;
import com.lokesh.jumboweather.network.NetworkInterface;
import com.lokesh.jumboweather.network.Urls;
import com.lokesh.jumboweather.utils.MathUtils;
import com.lokesh.jumboweather.utils.TimeUtils;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private LocationRequest mLocationRequest;
    private GoogleApiClient mGoogleApiClient;
    private CountDownTimer refreshTimer;
    private CountDownTimer imageTimer;
    private ImageLoader mImageLoader;

    private String MAP_TAG = "MAP";
    private String NETWORK_TAG = "NETWORK";
    private String DEEPLINK_TAG = "DEEPLINK";
    private String REFRESH_TAG = "REFRESH";


    // Ui References
    private TextView currentTemp;
    private TextView onewordWeather;
    private TextView currentLocation;
    private TextView currentTime;
    private TextView minTemp;
    private TextView maxTemp;
    private NetworkImageView backgroundImage;
    private LinearLayout tempLayout;


    private RecyclerView dayforecastList;
    private RecyclerView.Adapter dayforecastAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private RecyclerView hourforecastList;
    private RecyclerView.Adapter hourforecastAdapter;
    private RecyclerView.LayoutManager hourLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindUI();

        doDeviceDensitySpecificWork();

        // No manadatory internet connection check as cached data is used

        mImageLoader = VolleySingleton.getInstance(this).getImageLoader();
        setUpBackgroundImage();


        Intent intent = getIntent();
        Uri data = intent.getData();

        if (data != null) {
            // handle deeplink
            Log.d(DEEPLINK_TAG, data.toString());
            handleDeeplink(data);
        } else {
            // get location from users device
            prepareGoogleApiLocationClient();
            registerLocationRequest();
        }

        setupRefreshTimer();


    }

    public void doDeviceDensitySpecificWork() {
        AppConstants.DEVICE_DENSITY = DeviceDetails.getDeviceDensity(this);
    }


    public void setUpBackgroundImage() {


        // Todo get device params and network type , make an appropriate req

        String lastUpdatedTime = new PrefManager(this).readFromPrefs("lastUpdatedTime");
        Date lastDate = new Date(Long.valueOf(lastUpdatedTime));
        Date currentDate = new Date(System.currentTimeMillis());
        long seconds = (currentDate.getTime() - lastDate.getTime());

        PrefManager prefManager = new PrefManager(this);
        String currentImageUrl = prefManager.readFromPrefs("currentImageUrl");

        Log.d(REFRESH_TAG, lastUpdatedTime + " - " + System.currentTimeMillis() + " - " + seconds);


        if (seconds >= AppConstants.IMAGE_REFRESH_RATE_In_Millis) {
            // Need to fetch a new image
            Log.d(REFRESH_TAG, "Loading dynamic bgImage ");
            fetchBackgroundImageList();

        } else {
            // Use the original image
            Log.d(REFRESH_TAG, "Use existing - " + currentImageUrl);
            backgroundImage.setErrorImageResId(R.drawable.default_bg);
            backgroundImage.setImageUrl(currentImageUrl, mImageLoader);
            setImageTimer(seconds);
        }
    }

    public void setImageTimer(long seconds) {

        Log.d(REFRESH_TAG, "Setting image Timer");

        long timeRemaining = AppConstants.IMAGE_REFRESH_RATE_In_Millis - seconds;

        imageTimer = new CountDownTimer(timeRemaining, timeRemaining) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                // Refresh bg
                if (!isFinishing()) {
                    setUpBackgroundImage();
                    imageTimer.cancel();
                    Log.d(REFRESH_TAG, "Background image refreshed");
                }

            }
        };

        imageTimer.start();
    }

    public void updateSharedPrefsofImagebg(String imageUrl) {
        PrefManager prefManager = new PrefManager(this);
        prefManager.writeToPreferences("lastUpdatedTime", String.valueOf(System.currentTimeMillis()));
        prefManager.writeToPreferences("currentImageUrl", imageUrl);
    }

    public void getandsetBackgroundImage(FlickrInterestingPhotosResponse data) {

        FlickrInterestingPhotosResponse.Photo randomPhoto = data.getQuery().getResults().getPhoto().get(MathUtils.getRandomPhotoIndex(data.getQuery().getCount()));
        // Todo fetch url as per network and free memory DOne
        String imageUrl = NetworkInterface.getFlickrImageUrl(randomPhoto.getFarm(), randomPhoto.getServer(), randomPhoto.getId(), randomPhoto.getSecret(), getApplicationContext());
        Log.d(NETWORK_TAG, randomPhoto.getFarm() + "-" + randomPhoto.getServer() + "-" + randomPhoto.getId() + "-" + randomPhoto.getSecret());
        Log.d(NETWORK_TAG, imageUrl);

        backgroundImage.setErrorImageResId(R.drawable.default_bg);
        backgroundImage.setImageUrl(imageUrl, mImageLoader);


        updateSharedPrefsofImagebg(imageUrl);

        setImageTimer(0);

    }

    public void fetchBackgroundImageList() {

        String url = Urls.flickr_imagelist_url;
        url = NetworkInterface.getFlickImageListUrl(url);

        StringRequest interestingImageListRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                Log.d(NETWORK_TAG, response);
                FlickrInterestingPhotosResponse data = gson.fromJson(response, FlickrInterestingPhotosResponse.class);
                getandsetBackgroundImage(data);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(NETWORK_TAG, "Error in fetchBackgroundImageList : " + error.toString());

            }
        });
        VolleySingleton.getInstance(this).addToRequestQueue(interestingImageListRequest);
    }

    public void setupRefreshTimer() {

        Log.d(REFRESH_TAG, "Refresh Timer set up done");

        refreshTimer = new CountDownTimer(AppConstants.REFRESH_RATE_in_Millis, AppConstants.REFRESH_RATE_in_Millis) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                if (!isFinishing()) {
                    refreshScreen();
                    refreshTimer.cancel();
                    refreshTimer.start();
                    Log.d(REFRESH_TAG, "Refresh Timer restarted");
                }
            }
        };

        refreshTimer.start();
    }

    @Override
    protected void onDestroy() {
        if (refreshTimer != null) {
            refreshTimer.cancel();
        }
        if (imageTimer != null) {
            imageTimer.cancel();
        }
        super.onDestroy();
    }


    public void refreshScreen() {

        Log.d(REFRESH_TAG, "Screen Refresh started");

        // Since Deeplink bypasses  creation
        if (mGoogleApiClient == null) {
            prepareGoogleApiLocationClient();
        }
        if (mLocationRequest == null) {
            registerLocationRequest();
        }

        // We need to refresh the screen , so perform all the tasks from beginning
        onConnected(null);
    }

    public void handleDeeplink(Uri data) {
        String lat = data.getQueryParameter("lat");
        String lng = data.getQueryParameter("lng");
        String location = data.getQueryParameter("location");

        if (TextUtils.isEmpty(lat) || TextUtils.isEmpty(lng)) {
            if (TextUtils.isEmpty(location)) {
                // Todo Invalid deeplink
                Toast.makeText(getApplicationContext(), "Link doesnot contain enough data", Toast.LENGTH_SHORT).show();
            } else {
                // Todo fetch id for the particular location and proceed
            }

        } else {
            // latlng available , follow the usual procedure
            setUserLocationfromDeeplink(lat, lng);
        }
    }

    public void setCurrentDayExtremes(AccuWeatherFivedayForecastResponse data) {
        minTemp.setText(data.getDailyForecasts().get(0).getTemperature().getMinimum().getValue() + AppConstants.DEGREE);
        maxTemp.setText(data.getDailyForecasts().get(0).getTemperature().getMaximum().getValue() + AppConstants.DEGREE);
    }

    public void prepare5DayForecastCard(AccuWeatherFivedayForecastResponse data) {

        dayforecastList.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        dayforecastList.setLayoutManager(mLayoutManager);

        dayforecastAdapter = new DayforecastAdapter(data, getApplicationContext());
        dayforecastList.setAdapter(dayforecastAdapter);
    }

    public void prepare12HourForecast(List<AccuWeatherHourData> hourdatum) {

        hourforecastList.setHasFixedSize(true);

        hourLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        hourforecastList.setLayoutManager(hourLayoutManager);

        hourforecastAdapter = new HourforecastAdapter(hourdatum, getApplicationContext());
        hourforecastList.setAdapter(hourforecastAdapter);

    }

    public void bindUI() {
        currentTemp = (TextView) findViewById(R.id.currentTemp);
        onewordWeather = (TextView) findViewById(R.id.onewordWeather);
        currentLocation = (TextView) findViewById(R.id.currentLocation);
        currentTime = (TextView) findViewById(R.id.currentTime);
        backgroundImage = (NetworkImageView) findViewById(R.id.backgroundImage);

        minTemp = (TextView) findViewById(R.id.minTemp);
        maxTemp = (TextView) findViewById(R.id.maxTemp);


        dayforecastList = (RecyclerView) findViewById(R.id.dayforecastList);

        hourforecastList = (RecyclerView) findViewById(R.id.hourforecastList);

        tempLayout = (LinearLayout) findViewById(R.id.tempLayout);
    }

    public void setUserDetails(AccuWeatherGeolocationResponse data) {
        if (data == null) {
            return;
        }
        currentLocation.setText(data.getEnglishName());
        currentTime.setText(TimeUtils.getCurrentTimeinAMPM().toUpperCase());
    }

    public void setCurrentWeatherData(AccuWeatherCurrentWeatherData data) {
        if (data == null) {
            // Handle
            return;
        }

        currentTemp.setText(data.getTemperature().getMetric().getValue().toString() + AppConstants.DEGREE);
        onewordWeather.setText(data.getWeatherText());

        prepareDetailView(data);

    }

    public void prepareDetailView(AccuWeatherCurrentWeatherData data) {

        String currentTemp = data.getTemperature().getMetric().getValue().toString();
        String humidity = data.getRelativeHumidity();
        String visibility = data.getVisibility().getMetric().getValue();
        String uvIndex = data.getUVIndex();
        String uvIndexTest = data.getUVIndexText();
        String icon = data.getWeatherIcon();

        DetailRaven currentWeatherDetailsRaven = new DetailRaven(currentTemp, humidity, visibility, uvIndex, uvIndexTest, UserInformation.getLat(), UserInformation.getLng(), UserInformation.getUserLocation(), icon);

        enableDetailClick(currentWeatherDetailsRaven);

    }

    public void enableDetailClick(final DetailRaven currentWeatherDetailsRaven) {
        if (tempLayout == null) {
            return;
        }

        tempLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailPageIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailPageIntent.putExtra("details", currentWeatherDetailsRaven);
                startActivity(detailPageIntent);
            }
        });
    }


    public void registerLocationRequest() {
        mLocationRequest = LocationRequest.create();
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    }

    public void prepareGoogleApiLocationClient() {
        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
        }

    }


    @Override
    protected void onStart() {
        if (mGoogleApiClient != null) {
            // Since deeplink data do not need user location
            mGoogleApiClient.connect();
        }
        super.onStart();
    }

    @Override
    protected void onStop() {
        if (mGoogleApiClient != null) {
            mGoogleApiClient.disconnect();
        }
        super.onStop();
    }


    // Todo Implement Runtime permissions
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case AppConstants.MY_PERMISSIONS_REQUEST_FINE_LOCATION:
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    // Todo Explain user about the need for location
                }
                return;

        }


    }


    public void fetchWeatherInfo() {
        // Todo implement test and set
        getCurrentWeather();
        getNext12HoursForecast();
        getNext5DayForecast();

    }


    public void getLocationId() {

        String url = Urls.accuweather_location_id;
        url = NetworkInterface.appendQueryParamsForLocationId(url);

        StringRequest locationIdRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(NETWORK_TAG, response);
                Gson gson = new Gson();
                AccuWeatherGeolocationResponse locationResponse = gson.fromJson(response, AccuWeatherGeolocationResponse.class);


                UserInformation.setAccuweather_locationid(locationResponse.getKey());
                UserInformation.setUserLocation(locationResponse.getEnglishName());
                setUserDetails(locationResponse);
                fetchWeatherInfo();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(NETWORK_TAG, "Error in getLocationId : " + error.toString());
            }
        }) {
            @Override
            public Priority getPriority() {
                return Priority.IMMEDIATE;
            }
        };

        VolleySingleton.getInstance(this).addToRequestQueue(locationIdRequest);
    }

    public void getCurrentWeather() {

        String url = Urls.accuweather_current_weather + UserInformation.getAccuweather_locationid() + "?";
        url = NetworkInterface.appendQueryParamsForCurrentWeather(url);

        Log.d(NETWORK_TAG, url);

        StringRequest currentWeatherRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(NETWORK_TAG, response);
                Gson gson = new Gson();
                AccuWeatherCurrentWeatherData[] dataArr = gson.fromJson(response, AccuWeatherCurrentWeatherData[].class);
                setCurrentWeatherData(dataArr[0]);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(NETWORK_TAG, "Error in getCurrentWeather : " + error.toString());
            }
        }) {
            @Override
            public Priority getPriority() {
                return Priority.HIGH;
            }
        };

        // Passing this also passes application context , see implementation
        VolleySingleton.getInstance(this).addToRequestQueue(currentWeatherRequest);

    }


    public void getNext12HoursForecast() {

        String url = Urls.accuweather_hourly_forecast + UserInformation.getAccuweather_locationid() + "?";
        url = NetworkInterface.appendQueryParamsFor12HourForecast(url);
        Log.d(NETWORK_TAG, url);

        StringRequest twelvehourForecastRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(NETWORK_TAG, response);
                Gson gson = new Gson();
                Type listType = new TypeToken<List<AccuWeatherHourData>>() {
                }.getType();
                List<AccuWeatherHourData> hourdatum = (List<AccuWeatherHourData>) gson.fromJson(response, listType);
                prepare12HourForecast(hourdatum);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(NETWORK_TAG, "Error in getNext12HoursForecast : " + error.toString());
            }
        });

        VolleySingleton.getInstance(this).addToRequestQueue(twelvehourForecastRequest);
    }

    public void getNext5DayForecast() {
        String url = Urls.accuweather_daily_forecast + UserInformation.getAccuweather_locationid() + "?";
        url = NetworkInterface.appendQueryParamsFor5DayForecast(url);
        Log.d(NETWORK_TAG, url);

        StringRequest FivedayForecastRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(NETWORK_TAG, response);
                Gson gson = new Gson();
                AccuWeatherFivedayForecastResponse data = gson.fromJson(response, AccuWeatherFivedayForecastResponse.class);
                setCurrentDayExtremes(data);
                prepare5DayForecastCard(data);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(NETWORK_TAG, "Error in getNext5DayForecast : " + error.toString());
            }
        });

        VolleySingleton.getInstance(this).addToRequestQueue(FivedayForecastRequest);
    }


    @Override
    public void onConnected(@Nullable Bundle bundle) {

        Location mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
                mGoogleApiClient);
        if (mLastLocation != null) {
            UserInformation.setLat(mLastLocation.getLatitude());
            UserInformation.setLng(mLastLocation.getLongitude());
            getLocationId();
            Log.d(MAP_TAG, "Location found : " + String.valueOf(mLastLocation.getLatitude()) + " , " + String.valueOf(mLastLocation.getLongitude()));
        }

    }

    public void setUserLocationfromDeeplink(String lat, String lng) {
        // lat lng wont be null
        UserInformation.setLat(Double.valueOf(lat));
        UserInformation.setLng(Double.valueOf(lng));
        getLocationId();
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

}
