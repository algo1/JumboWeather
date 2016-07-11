package com.lokesh.jumboweather.network;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.lokesh.jumboweather.DeviceDetails;
import com.lokesh.jumboweather.appconstants.AppConstants;
import com.lokesh.jumboweather.appconstants.UserInformation;
import com.lokesh.jumboweather.utils.ImageUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by lokeshponnada on 7/10/16.
 */
public class NetworkInterface {

    private static String NETWORK_TAG = "NETWORK";

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

    public static String getFlickrImageUrl(String farmId, String serverId, String id, String secret, Context ctx) {
        // Todo set the size suffix depending on device resolution and network
        // Stringbuilder ?
        String urlBlueprint = Urls.flickr_image_url;
        urlBlueprint = urlBlueprint.replace("{farm-id}", farmId);
        urlBlueprint = urlBlueprint.replace("{server-id}", serverId);
        urlBlueprint = urlBlueprint.replace("{id}", id);
        urlBlueprint = urlBlueprint.replace("{secret}", secret);

        String imageSize = ImageUtils.getAppropriateSize(AppConstants.DEVICE_DENSITY, DeviceDetails.getNetworkType(ctx));
        Log.d(NETWORK_TAG, "Size for device is " + imageSize);
        urlBlueprint = urlBlueprint.replace("[mstzb]", imageSize);
        return urlBlueprint;
    }

    public static String getFlickImageListUrl(String baseUrl) {
        String queryParam = "select * from flickr.photos.interestingness(20) where api_key=\"" + AppConstants.FLICKR_API_KEY + "\"";
        try {
            baseUrl = baseUrl + URLEncoder.encode(queryParam, "utf-8");
        } catch (UnsupportedEncodingException e) {
            Log.d(NETWORK_TAG, "Exception  encoding url");
            Log.d(NETWORK_TAG, e.toString());
        }
        return "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20flickr.photos.interestingness(20)%20where%20api_key%3D%221c8640b60720e223176e1bdaab861898%22%3B&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
    }
}
