package com.lokesh.jumboweather.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lokeshponnada on 7/10/16.
 */
public class TimeUtils {

    public static String getCurrentTimeinAMPM() {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getHourFromEpochTime(String epochTime) {
        Date date = new Date(Long.valueOf(epochTime) * 1000);
        DateFormat format = new SimpleDateFormat("HH:mm");
        String formatted = format.format(date);
        return formatted;
    }

    public static String getDayFromEpochTime(String epochTime) {
        Date date = new Date(Long.valueOf(epochTime) * 1000);
        DateFormat format = new SimpleDateFormat("EEEE");
        String formatted = format.format(date);
        return formatted;
    }
}
