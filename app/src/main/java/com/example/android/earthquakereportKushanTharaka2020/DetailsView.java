package com.example.android.earthquakereportKushanTharaka2020;

public class DetailsView {
    private double magnitude;
    private String locationDetails;
    private Long date;

    public DetailsView(double magnitude, String locationDetails, Long date) {
        this.magnitude = magnitude;
        this.locationDetails = locationDetails;
        this.date = date;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocationDetails() {
        return locationDetails;
    }

    public Long getDate() {
        return date;
    }
}
