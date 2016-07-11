package com.lokesh.jumboweather;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by lokeshponnada on 7/11/16.
 */
public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context mContext;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "jumbo_prefs";

    public PrefManager(Context context) {
        this.mContext = context;
        pref = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }


    public void writeToPreferences(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public String readFromPrefs(String key) {
        return pref.getString(key, "0");
    }


}
