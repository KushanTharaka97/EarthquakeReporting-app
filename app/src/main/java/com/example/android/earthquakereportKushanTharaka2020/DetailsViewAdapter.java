package com.example.android.earthquakereportKushanTharaka2020;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

        //location find in the TextView
        TextView locationTextOff = (TextView) listItemView.findViewById(R.id.locationOffset);
        locationTextOff.setText(currentDetailsView.getLocationOffsets());
        TextView locationText = (TextView) listItemView.findViewById(R.id.locationDetails);
        locationText.setText(currentDetailsView.getLocationDetails());

        //Date Display find
        Date timeDateObject = new Date(currentDetailsView.getDate());
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM DD, yyyy");
        String dateToDisplay = dateFormat.format(timeDateObject);
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(dateToDisplay);


        return listItemView;
    }
}
