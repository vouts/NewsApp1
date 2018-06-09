package com.example.android.newsapp;

public class News {

    private Double earthquakeMag;
    private String earthquakePlace, earthquakeUrl;
    Long earthquakeTime;

    public News(Double mag, String place, Long time, String url){
        earthquakeMag = mag;
        earthquakePlace = place;
        earthquakeTime = time;
        earthquakeUrl = url;
    }

    public Double getEarthquakeMag(){
        return earthquakeMag;
    }

    public String getEarthquakePlace() {
        return earthquakePlace;
    }


    public Long getEarthquakeTime() {
        return earthquakeTime;
    }

    public String getEarthquakeUrl() {
        return earthquakeUrl;
    }
}
