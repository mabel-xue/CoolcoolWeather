package com.mabel.coolcoolweather.gson;

/**
 * Created by mabelxue on 2017/5/11.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
