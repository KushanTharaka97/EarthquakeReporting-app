package com.example.android.earthquakereportKushanTharaka2020;

public class Earthquake {

    private String mag;

    private String place;

    private String time;

    public Earthquake(String mag, String place, String time) {
        this.mag = mag;
        this.place = place;
        this.time = time;
    }

    public String getMag() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }
}
