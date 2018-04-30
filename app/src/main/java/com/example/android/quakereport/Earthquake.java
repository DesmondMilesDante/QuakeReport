package com.example.android.quakereport;

public class Earthquake {

    private String mLocation;

    private Double mMagnitude;

    private long mTimeInMilliseconds;

    private String mUrl;

    public Earthquake(Double magnitude, String country, long timeInMilliseconds,String url){
        mMagnitude = magnitude;
        mLocation = country;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl=url;

    }

    public Double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }
    public String getUrl(){
        return mUrl;
    }

}
