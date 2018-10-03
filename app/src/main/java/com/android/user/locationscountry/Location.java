package com.android.user.locationscountry;

public class Location {

    private String title;
    private String description;
    private int imageResourceId;

    Location(String title, String description, int imageResourceId) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    String getTitle() {
        return title;
    }

    String getDescription() {
        return description;
    }

    int getImageResourceId() {
        return imageResourceId;
    }
}
