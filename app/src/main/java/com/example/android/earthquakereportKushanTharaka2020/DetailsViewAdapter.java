package com.example.android.earthquakereportKushanTharaka2020;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailsViewAdapter extends ArrayAdapter<DetailsView> {
    private static final String LOG_TAG = DetailsViewAdapter.class.getSimpleName();

    public DetailsViewAdapter(Activity context, ArrayList<DetailsView> earthquake) {
        //super class
        super(context, 0, earthquake);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        // Get the {@link AndroidFlavor} object located at this position in the list
        DetailsView currentDetailsView = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.mag);

        nameTextView.setText(currentDetailsView.getMagnitude());

        TextView locationText = (TextView) listItemView.findViewById(R.id.location);

        locationText.setText(currentDetailsView.getLocation());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);

        dateTextView.setText(currentDetailsView.getDate());


        return listItemView;
    }
}
