package com.example.android.earthquakereportKushanTharaka2020;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.SimpleTimeZone;

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
        double magnitudeDouble = currentDetailsView.getMagnitude();
        DecimalFormat formatterMag = new DecimalFormat("0.0");
        String magOutput = formatterMag.format(magnitudeDouble);
        nameTextView.setText(magOutput);

        //location find in the TextView
        //Check for the "of" in the property JSON object
        TextView locationTextOffSet = (TextView) listItemView.findViewById(R.id.locationOffset);
        TextView locationText = (TextView) listItemView.findViewById(R.id.locationDetails);

        if (currentDetailsView.getLocationDetails().contains("of")) {
            String[] locationDivider = currentDetailsView.getLocationDetails().split("of");

            String firstLocationDetail = locationDivider[0];
            String secondLocationDetail = locationDivider[1];

            locationTextOffSet.setText(firstLocationDetail);
            locationText.setText(secondLocationDetail);

        }

        //Date Display find
        //get date from the DetailsView ArrayList Classs
        Long timeDateObject = new Long(currentDetailsView.gettimeInMiliSecond());
        String dateToDisplay = formatDate(timeDateObject);

        //Initialize the place in main XML file
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(dateToDisplay);

        //time Display
        String timeToDisplay = formatTime(timeDateObject);
        TextView timeTextView = listItemView.findViewById(R.id.time);
        timeTextView.setText(timeToDisplay);



        //drawing in the background
        GradientDrawable magnitudeCircle = (GradientDrawable) nameTextView.getBackground();
        // Get the appropriate background color based on the current earthquake magnitude

        int magnitudeColorWithR = getMagnitudeColor(magnitudeDouble);
        // Set the color on the magnitude circle

        int magnitude1Color = ContextCompat.getColor(getContext(), magnitudeColorWithR);
        magnitudeCircle.setColor(magnitude1Color);

        return listItemView;
    }

    public int getMagnitudeColor(double magnitudeDouble) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitudeDouble);

        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;

        }
        return magnitudeColorResourceId;
    }

    //making the pattern of the DATE
    public String formatDate(Long dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM DD, yyyy");
        String dateToDisplay = dateFormat.format(dateObject);
        return dateToDisplay;
    }

    //get format from milisecond data object
    public String formatTime(Long dateObject){
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        String timeToDisplay = timeFormat.format(dateObject);
        return timeToDisplay;
    }
}
