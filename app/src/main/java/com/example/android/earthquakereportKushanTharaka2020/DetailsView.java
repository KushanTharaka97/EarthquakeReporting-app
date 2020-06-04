package com.example.android.earthquakereportKushanTharaka2020;

public class DetailsView {
    private Double magnitude;
    private String locationDetails;
    private Long date;

    public DetailsView(Double magnitude, String locationDetails, Long date) {
        this.magnitude = magnitude;
        this.locationDetails = locationDetails;
        this.date = date;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public String getLocationDetails() {
        return locationDetails;
    }

    public Long getDate() {
        return date;
    }
}
