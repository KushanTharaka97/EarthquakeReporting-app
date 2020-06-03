package com.example.android.earthquakereportKushanTharaka2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        /*created a ArrayList and pass DetailView Object to ArrayList,
         then create earthquakes arrayliston it.*/
        ArrayList<DetailsView> earthquakes = QueryUtils.extractEarthquakes();

        /*Create adapter and use adapter object to make array visible in display*/
        DetailsViewAdapter quakeViewAdapter = new DetailsViewAdapter(this, earthquakes);

        //get the display list item initialize in the java class
        ListView earthQuakeDisplay = findViewById(R.id.earthQuakeList);

        //set ceated adapter to the List view
        earthQuakeDisplay.setAdapter(quakeViewAdapter);
    }
}
