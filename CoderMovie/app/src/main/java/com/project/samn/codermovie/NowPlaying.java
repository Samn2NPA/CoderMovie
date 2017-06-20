package com.project.samn.codermovie;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Samn on 15-Jun-17.
 */

public class NowPlaying {
    @SerializedName("results")
    private List<Movie> movies;

    public List<Movie> getMovies(){ return this.movies; }
}
