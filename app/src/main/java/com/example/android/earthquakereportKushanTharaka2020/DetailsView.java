package com.example.android.earthquakereportKushanTharaka2020;

public class DetailsView {
    private String magnitude;
    private String locationDetails;
    private Long date;

    public DetailsView(String magnitude, String locationDetails, Long date) {
        this.magnitude = magnitude;
        this.locationDetails = locationDetails;
        this.date = date;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getLocationDetails() {
        return locationDetails;
    }

    public Long getDate() {
        return date;
    }
}
