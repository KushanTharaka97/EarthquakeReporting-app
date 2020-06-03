package com.example.android.earthquakereportKushanTharaka2020;

public class DetailsView {
    private String magnitude;
    private String location;
    private String date;

    public DetailsView(String magnitude, String location, String date) {
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
    }

    public String getMagnitude() {
        return String.valueOf(magnitude);
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }
}
