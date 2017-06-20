package com.project.samn.codermovie;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Samn on 15-Jun-17.
 */

public interface MovieApi {
    @GET("now_playing")
    Call<NowPlaying> nowPlaying();

    @GET("trailers")
    Call<Trailers> youTubeTrailer();
}

