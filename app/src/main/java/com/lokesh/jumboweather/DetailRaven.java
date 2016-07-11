package com.lokesh.jumboweather;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by lokeshponnada on 7/11/16.
 */


/* This class is used for passing data to detail activity from main activity
* Modify this whenever detail data requirement changes*/

public class DetailRaven implements Parcelable {

    private String currentTemp;
    private String humidity;
    private String visibility;
    private String uvIndex;
    private String uvIndexTest;
    private double userLat;
    private double userLng;
    private String userLocation;
    private String icon;


    public DetailRaven(String currentTemp, String humidity, String visibility, String uvIndex, String uvIndexTest, double userLat, double userLng, String userLocation, String icon) {
        this.currentTemp = currentTemp;
        this.humidity = humidity;
        this.visibility = visibility;
        this.uvIndex = uvIndex;
        this.uvIndexTest = uvIndexTest;
        this.userLat = userLat;
        this.userLng = userLng;
        this.userLocation = userLocation;
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    public String getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(String currentTemp) {
        this.currentTemp = currentTemp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getUvIndexTest() {
        return uvIndexTest;
    }

    public void setUvIndexTest(String uvIndexTest) {
        this.uvIndexTest = uvIndexTest;
    }

    public double getUserLat() {
        return userLat;
    }

    public void setUserLat(double userLat) {
        this.userLat = userLat;
    }

    public double getUserLng() {
        return userLng;
    }

    public void setUserLng(double userLng) {
        this.userLng = userLng;
    }


    protected DetailRaven(Parcel in) {
        currentTemp = in.readString();
        humidity = in.readString();
        visibility = in.readString();
        uvIndex = in.readString();
        uvIndexTest = in.readString();
        userLat = in.readDouble();
        userLng = in.readDouble();
        userLocation = in.readString();
        icon = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(currentTemp);
        dest.writeString(humidity);
        dest.writeString(visibility);
        dest.writeString(uvIndex);
        dest.writeString(uvIndexTest);
        dest.writeDouble(userLat);
        dest.writeDouble(userLng);
        dest.writeString(userLocation);
        dest.writeString(icon);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<DetailRaven> CREATOR = new Parcelable.Creator<DetailRaven>() {
        @Override
        public DetailRaven createFromParcel(Parcel in) {
            return new DetailRaven(in);
        }

        @Override
        public DetailRaven[] newArray(int size) {
            return new DetailRaven[size];
        }
    };
}