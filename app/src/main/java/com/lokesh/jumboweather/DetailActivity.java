package com.lokesh.jumboweather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.lokesh.jumboweather.network.NetworkInterface;
import com.lokesh.jumboweather.utils.TimeUtils;


/* As of now Google play services is compulsory for the map to work */

public class DetailActivity extends AppCompatActivity implements OnMapReadyCallback {

    private DetailRaven details;
    private GoogleMap mMap;
    private ImageLoader mImageLoader;


    //Ui References
    private TextView currentLocation;
    private TextView currentTime;
    private TextView currenttempValue;
    private TextView currentHumidity;
    private TextView currentVisibility;
    private TextView uvLevel;
    private NetworkImageView tempImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Intent extras = getIntent();
        if (extras != null) {
            details = (DetailRaven) extras.getParcelableExtra("details");
        } else {
            // Todo Retrieve from web service
        }

        prepareUI();
    }

    public void bindUi() {

        currentLocation = (TextView) findViewById(R.id.currentLocation);
        currentTime = (TextView) findViewById(R.id.currentTime);
        tempImage = (NetworkImageView) findViewById(R.id.tempImage);
        currenttempValue = (TextView) findViewById(R.id.currenttempValue);
        currentHumidity = (TextView) findViewById(R.id.currentHumidity);
        currentVisibility = (TextView) findViewById(R.id.currentVisibility);
        uvLevel = (TextView) findViewById(R.id.uvLevel);

        mImageLoader = VolleySingleton.getInstance(this).getImageLoader();

    }

    public void prepareUI() {

        // Make sure ui binding is done
        bindUi();

        currentLocation.setText(details.getUserLocation());
        currentTime.setText(TimeUtils.getCurrentTimeinAMPM());
        currenttempValue.setText(details.getCurrentTemp());
        currentHumidity.setText(details.getHumidity() + "%");
        currentVisibility.setText(details.getVisibility() + " km");
        uvLevel.setText(details.getUvIndexTest() + " " + details.getUvIndex());

        tempImage.setImageUrl(NetworkInterface.getWeatherIconUrl(details.getIcon()), mImageLoader);


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        setUserLocationonMap();
    }

    public void setUserLocationonMap() {

        if (details == null) {
            return;
        }

        LatLng latLng = new LatLng(details.getUserLat(), details.getUserLng());
        mMap.addMarker(new MarkerOptions().position(latLng));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(12), 400, null);
    }
}
