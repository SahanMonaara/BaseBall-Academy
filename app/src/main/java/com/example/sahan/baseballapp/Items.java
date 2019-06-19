package com.example.sahan.baseballapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Items {
    @SerializedName("snippet")
    @Expose
    private String snippet;

    public Items() {
    }

    public String getSnippet() {

        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public Items(String snippet) {

        this.snippet = snippet;
    }
}
