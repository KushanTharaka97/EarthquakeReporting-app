package com.example.android.earthquakereportKushanTharaka2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG =MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<String> earthquakes = new ArrayList<>();
        earthquakes.add("San Francisco");
        earthquakes.add("London");
        earthquakes.add("Tokyo");
        earthquakes.add("Mexico City");
        earthquakes.add("Moscow");
        earthquakes.add("Rio de Janeiro");
        earthquakes.add("Paris");

    }
}
