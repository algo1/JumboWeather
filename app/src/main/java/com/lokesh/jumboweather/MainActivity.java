package com.lokesh.jumboweather;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
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

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
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
import com.lokesh.jumboweather.appconstants.AppConstants;
import com.lokesh.jumboweather.appconstants.UserInformation;
import com.lokesh.jumboweather.network.NetworkInterface;
import com.lokesh.jumboweather.network.Urls;
import com.lokesh.jumboweather.utils.TimeUtils;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private LocationRequest mLocationRequest;
    private GoogleApiClient mGoogleApiClient;
    private String MAP_TAG = "MAP";
    private String NETWORK_TAG = "NETWORK";
    private String DEEPLINK_TAG = "DEEPLINK";


    // Ui References
    private TextView currentTemp;
    private TextView onewordWeather;
    private TextView currentLocation;
    private TextView currentTime;
    private TextView minTemp;
    private TextView maxTemp;
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


        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();

        if (data != null) {
            // handle deeplink
            handleDeeplink(data);
        } else {
            prepareGoogleApiLocationClient();
            registerLocationRequest();

        }

    }

    public void handleDeeplink(Uri data) {
        String lat = data.getQueryParameter("lat");
        String lng = data.getQueryParameter("lng");
        String location = data.getQueryParameter("location");

        if (TextUtils.isEmpty(lat) || TextUtils.isEmpty(lng)) {
            if (TextUtils.isEmpty(location)) {
                // Todo Invalid deeplink
            } else {
                // Todo fetch id for the particular location and proceed
            }

        } else {
            // latlng available , follow the usual procedure
            setUserLocationfromDeeplink(lat, lng);
        }
    }

    public void setCurrentDayExtremes(AccuWeatherFivedayForecastResponse data) {
        minTemp.setText(data.getDailyForecasts().get(0).getTemperature().getMinimum().getValue());
        maxTemp.setText(data.getDailyForecasts().get(0).getTemperature().getMaximum().getValue());
    }

    public void prepare5DayForecastCard(AccuWeatherFivedayForecastResponse data) {

        dayforecastList.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        dayforecastList.setLayoutManager(mLayoutManager);

        dayforecastAdapter = new DayforecastAdapter(data);
        dayforecastList.setAdapter(dayforecastAdapter);
    }

    public void prepare12HourForecast(List<AccuWeatherHourData> hourdatum) {

        hourforecastList.setHasFixedSize(true);

        hourLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        hourforecastList.setLayoutManager(hourLayoutManager);

        hourforecastAdapter = new HourforecastAdapter(hourdatum);
        hourforecastList.setAdapter(hourforecastAdapter);

    }

    public void bindUI() {
        currentTemp = (TextView) findViewById(R.id.currentTemp);
        onewordWeather = (TextView) findViewById(R.id.onewordWeather);
        currentLocation = (TextView) findViewById(R.id.currentLocation);
        currentTime = (TextView) findViewById(R.id.currentTime);

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

        currentTemp.setText(data.getTemperature().getMetric().getValue().toString());
        onewordWeather.setText(data.getWeatherText());

        prepareDetailView(data);

    }

    public void prepareDetailView(AccuWeatherCurrentWeatherData data) {

        String currentTemp = data.getTemperature().getMetric().getValue().toString();
        String humidity = data.getRelativeHumidity();
        String visibility = data.getVisibility().getMetric().getValue();
        String uvIndex = data.getUVIndex();
        String uvIndexTest = data.getUVIndexText();

        DetailRaven currentWeatherDetailsRaven = new DetailRaven(currentTemp, humidity, visibility, uvIndex, uvIndexTest, UserInformation.getLat(), UserInformation.getLng(), UserInformation.getUserLocation());

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
        mGoogleApiClient.connect();
        super.onStart();
    }

    @Override
    protected void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }


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

            }
        });

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

            }
        });

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
        UserInformation.setLat(Long.valueOf(lat));
        UserInformation.setLng(Long.valueOf(lng));
        getLocationId();
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

}
