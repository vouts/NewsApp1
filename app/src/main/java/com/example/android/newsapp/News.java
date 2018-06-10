package com.example.android.newsapp;

public class News {

    private String newsTitle, newsURL, newsCategory, newsAuhor;

    public News( String title, String url, String category, String author){

        newsTitle = title;
        newsURL = url;
        newsCategory = category;
        newsAuhor = author;
    }


    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsUrl() {
        return newsURL;
    }

    public String getNewsCategory() {
        return newsCategory;
    }

    public String getNewsAuhor() {
        return newsAuhor;
    }
}
