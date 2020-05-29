package com.example.android.earthquakereportKushanTharaka2020;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DetailsViewAdapter extends ArrayAdapter<DetailsView> {
    private static final String LOG_TAG =DetailsViewAdapter.class.getSimpleName();

    public DetailsViewAdapter(Activity context, ArrayList<DetailsView>earthquakes) {
        super(context,0,earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent ){
            View listItemView = convertView;
            if(listItemView == null){
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }



        return listItemView;
    }
}
