package com.lokesh.jumboweather.network;

import android.text.TextUtils;

import com.lokesh.jumboweather.appconstants.AppConstants;
import com.lokesh.jumboweather.appconstants.UserInformation;

/**
 * Created by lokeshponnada on 7/10/16.
 */
public class NetworkInterface {

    // Todo Include optional query params

    public static String appendQueryParamsFor12HourForecast(String baseUrl) {

        baseUrl = baseUrl + "apikey=" + AppConstants.ACCUWEATHER_API_KEY + "&";
        baseUrl = baseUrl + "language=" + "en-us" + "&";
        baseUrl = baseUrl + "details=" + "false" + "&";
        baseUrl = baseUrl + "metric=" + "true";

        return baseUrl;
    }

    public static String appendQueryParamsFor5DayForecast(String baseUrl) {

        baseUrl = baseUrl + "apikey=" + AppConstants.ACCUWEATHER_API_KEY + "&";
        baseUrl = baseUrl + "metric=true";
        return baseUrl;
    }

    public static String appendQueryParamsForLocationId(String baseUrl) {
        // Todo Add optional params
        baseUrl = baseUrl + "apikey=" + AppConstants.ACCUWEATHER_API_KEY + "&";
        baseUrl = baseUrl + "q=" + UserInformation.getLat() + "," + UserInformation.getLng();
        return baseUrl;
    }

    public static String appendQueryParamsForCurrentWeather(String baseUrl) {
        // Todo Add optional params
        baseUrl = baseUrl + "apikey=" + AppConstants.ACCUWEATHER_API_KEY + "&details=true";
        return baseUrl;
    }

    public static String getWeatherIconUrl(String iconNo) {
        // Todo dirty hack

        if (TextUtils.isEmpty(iconNo)) {
            return null;
        }

        if (iconNo.length() == 1) {
            iconNo = "0" + iconNo;
        }
        String url = Urls.accu_weather_icons + iconNo + "-s.png";
        return url;
    }
}
