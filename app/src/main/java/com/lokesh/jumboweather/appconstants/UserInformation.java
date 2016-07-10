package com.lokesh.jumboweather.appconstants;

/**
 * Created by lokeshponnada on 7/10/16.
 */
public class UserInformation {

    public static double getLat() {
        return lat;
    }

    public static void setLat(double lat) {
        UserInformation.lat = lat;
    }

    public static double getLng() {
        return lng;
    }

    public static void setLng(double lng) {
        UserInformation.lng = lng;
    }

    private static double lat;
    private static double lng;

    public static String getLocation() {
        return location;
    }

    public static void setLocation(String location) {
        UserInformation.location = location;
    }

    private static String location;


    public static String getAccuweather_locationid() {
        return accuweather_locationid;
    }

    public static void setAccuweather_locationid(String accuweather_locationid) {
        UserInformation.accuweather_locationid = accuweather_locationid;
    }

    private static String accuweather_locationid;
}
