package com.example.sahan.baseballapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface RestAPI{
    @GET("/{videoid}/{key}/{part}")
    Call < Snippet > getVideoTitle(@Path("videoid") String videoID,@Path("key") String key,@Path("part") String part);
}
