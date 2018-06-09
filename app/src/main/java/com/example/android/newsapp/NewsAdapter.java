package com.example.android.newsapp;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class NewsAdapter extends ArrayAdapter<News> {
private static final String LOG_TAG = NewsAdapter.class.getSimpleName();




public NewsAdapter(Activity context, ArrayList<News> earthquakes ) {
    // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
    // the second argument is used when the ArrayAdapter is populating a single TextView.
    // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
    // going to use this second argument, so it can be any value. Here, we used 0.
    super(context, 0, earthquakes);
}

@NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    View listItemView = convertView;
    if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);
    }


    News currentEarthquake = getItem(position);



    TextView magTextView = (TextView) listItemView.findViewById(R.id.earthquake_mag);
    magTextView.setText(String.valueOf(currentEarthquake.getEarthquakeMag()));

    GradientDrawable magnitudeCircle = (GradientDrawable) magTextView.getBackground();




    TextView placeTextView = (TextView) listItemView.findViewById(R.id.earthquake_place);
    placeTextView.setText(currentEarthquake.getEarthquakePlace());



    TextView timeTextView = (TextView) listItemView.findViewById(R.id.earthquake_Time);
    timeTextView.setText(Long.toString(currentEarthquake.getEarthquakeTime()));


    // Return the whole list item layout (containing 2 TextViews and an ImageView)
    // so that it can be shown in the ListView
    return listItemView;
}

}

