package com.example.android.earthquakereportKushanTharaka2020;

public class DetailsView {
    private String magnitude;
    private String locationDetails;
    private String locationOffsets;
    private Long date;

    public DetailsView(String magnitude, String locationOffsets, String locationDetails, Long date) {
        this.magnitude = magnitude;
        this.locationDetails = locationDetails;
        this.locationOffsets = locationOffsets;
        this.date = date;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getLocationDetails() {
        return locationDetails;
    }

    public String getLocationOffsets() {
        return locationOffsets;
    }

    public Long getDate() {
        return date;
    }
}
