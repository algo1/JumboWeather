package com.lokesh.jumboweather.utils;

import java.util.Random;

/**
 * Created by lokeshponnada on 7/11/16.
 */
public class MathUtils {


    // result is [0,upperIndex)
    public static int getRandomPhotoIndex(int upperIndex) {
        Random random = new Random();
        return random.nextInt(upperIndex);

    }
}
