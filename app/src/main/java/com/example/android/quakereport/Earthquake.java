package com.example.android.quakereport;

public class Earthquake {
    private String mMag;
    private String mPlace;
    private long mTimeInMilliseconds;

    public Earthquake(String mag, String place, long timeInMilliseconds) {
        mMag = mag;
        mPlace = place;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getMag() {
        return mMag;
    }

    public String getPlace() {
        return mPlace;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
