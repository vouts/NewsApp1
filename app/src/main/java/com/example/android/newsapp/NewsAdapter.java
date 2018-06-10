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




public NewsAdapter(Activity context, ArrayList<News> news ) {
    // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
    // the second argument is used when the ArrayAdapter is populating a single TextView.
    // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
    // going to use this second argument, so it can be any value. Here, we used 0.
    super(context, 0, news);
}

@NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    View listItemView = convertView;
    if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);
    }


    News currentNewsArticle = getItem(position);

    TextView titleTextView = listItemView.findViewById(R.id.news_title);
    titleTextView.setText(String.valueOf(currentNewsArticle.getNewsTitle()));


    TextView categoryTextView = listItemView.findViewById(R.id.news_category);
    categoryTextView.setText(currentNewsArticle.getNewsCategory());



    TextView authorTextView = listItemView.findViewById(R.id.news_author);
    authorTextView.setText(currentNewsArticle.getNewsAuhor());


    // Return the whole list item layout (containing 2 TextViews and an ImageView)
    // so that it can be shown in the ListView
    return listItemView;
}

}

