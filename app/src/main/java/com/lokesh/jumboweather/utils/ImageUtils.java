package com.lokesh.jumboweather.utils;

import android.util.DisplayMetrics;

/**
 * Created by lokeshponnada on 7/11/16.
 */
public class ImageUtils {

    // Todo Much scope for optimization

    // refer https://www.flickr.com/services/api/misc.urls.html

    public static String getAppropriateSize(int deviceDensity, int networkType) {

        switch (networkType) {

            case 3:
                switch (deviceDensity) {
                    case DisplayMetrics.DENSITY_LOW:
                        return "q";
                    case DisplayMetrics.DENSITY_MEDIUM:
                        return "m";
                    case DisplayMetrics.DENSITY_HIGH:
                    default:
                        return "z";
                }
            case 4:
                switch (deviceDensity) {
                    case DisplayMetrics.DENSITY_LOW:
                        return "q";
                    case DisplayMetrics.DENSITY_MEDIUM:
                        return "m";
                    case DisplayMetrics.DENSITY_HIGH:
                        return "z";
                    default:
                        return "c";
                }
            case 2:
            default:
                return "q";
        }

    }

}
