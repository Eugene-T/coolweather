package com.coolweather.android.gson;

/**
 * Created by Eugene on 2018/1/22.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
