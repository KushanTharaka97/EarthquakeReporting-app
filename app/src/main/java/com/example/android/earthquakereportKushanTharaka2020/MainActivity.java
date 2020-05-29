package com.example.android.earthquakereportKushanTharaka2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG =MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<DetailsView> earthquakes = new ArrayList<DetailsView>();
        earthquakes.add(new DetailsView(10,"San Francisco","Feb 2, 2019"));
        earthquakes.add(new DetailsView(14,"London","Feb 6, 2019"));
        earthquakes.add(new DetailsView(16,"Tokyo","Feb 4, 2019"));
        earthquakes.add(new DetailsView(77,"Mexico City","Feb 3, 2019"));
        earthquakes.add(new DetailsView(22,"Moscow","Feb 1, 2019"));
        earthquakes.add(new DetailsView(44,"Rio de Janeiro","Jan 5, 2019"));
        earthquakes.add(new DetailsView(34,"Paris","Jan 4, 2019"));
        earthquakes.add(new DetailsView(99,"San Francisco","Feb 4, 2019"));




        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView=(ListView) findViewById(R.id.list);

        //Create a new String ArrayList for earthquakes | filling array with data
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,earthquakes);
       // DetailsViewAdapter


        //set adapter on list view| Now list can be generate earhquake array values |that we stored
       // earthquakeListView.setAdapter(adapter);

    }
}
