package com.example.sahan.baseballapp;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YoutubeModel {
    @SerializedName("items")
    @Expose
    private String items;

    public YoutubeModel() {
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public YoutubeModel(String items) {

        this.items = items;
    }


}
