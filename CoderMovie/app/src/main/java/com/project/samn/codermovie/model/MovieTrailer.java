package com.project.samn.codermovie.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Samn on 20-Jun-17.
 */

/*name: "Exclusive Sneak",
        size: "HD",
        source: "6as8ahAr1Uc",
        type: "Teaser"*/
public class MovieTrailer {
    private long id;

    @SerializedName("name")
    private String name;

    @SerializedName("source")
    private String source;

    @SerializedName("type")
    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return this.source;
    }

    public String getType() {
        return type;
    }
}
