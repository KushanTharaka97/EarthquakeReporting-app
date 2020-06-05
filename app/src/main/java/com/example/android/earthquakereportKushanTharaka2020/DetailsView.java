package com.example.android.earthquakereportKushanTharaka2020;

public class DetailsView {
    private double magnitude;
    private String locationDetails;
    private Long timeInMiliSecond;

    public DetailsView(double magnitude, String locationDetails, Long timeInMiliSecond) {
        this.magnitude = magnitude;
        this.locationDetails = locationDetails;
        this.timeInMiliSecond = timeInMiliSecond;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocationDetails() {
        return locationDetails;
    }

    public Long gettimeInMiliSecond() {
        return timeInMiliSecond;
    }
}
