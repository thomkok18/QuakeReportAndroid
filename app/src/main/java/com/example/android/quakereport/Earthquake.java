package com.example.android.quakereport;

public class Earthquake {
    private String mMag;
    private String mPlace;
    private String mDate;

    public Earthquake(String mag, String place, String date) {
        mMag = mag;
        mPlace = place;
        mDate = date;
    }

    public String getMag() {
        return mMag;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getDate() {
        return mDate;
    }
}
