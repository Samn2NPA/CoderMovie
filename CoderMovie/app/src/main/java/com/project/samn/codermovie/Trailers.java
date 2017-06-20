package com.project.samn.codermovie;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Samn on 20-Jun-17.
 */

public class Trailers {
    @SerializedName("youtube")
    private List<MovieTrailer> trailersList;

    public List<MovieTrailer> getTrailersList(){return this.trailersList; }

}
