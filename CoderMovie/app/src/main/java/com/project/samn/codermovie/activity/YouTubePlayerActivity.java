package com.project.samn.codermovie.activity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.project.samn.codermovie.R;
import com.project.samn.codermovie.Utils.ResourceUtil;
import com.project.samn.codermovie.model.Movie;

public class YouTubePlayerActivity extends YouTubeBaseActivity {

    private static final String TAG = YouTubePlayerActivity.class.getSimpleName();

    public static Movie moviePlayer;

    YouTubePlayerFragment youtubeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube_player);

        youtubeFragment = (YouTubePlayerFragment)
                getFragmentManager().findFragmentById(R.id.youtubeFragment);

        final long movieID = getIntent().getLongExtra(ResourceUtil.MOVIE_ID, 0);

        ResourceUtil.isFullScreen = true; //youtube_player_activity thì CÓ fullscreen youtubeFragment

        //lấy source trailer của movie qua movieID và load lên youtubeFragment
        ResourceUtil.getTrailerMovie(movieID, youtubeFragment);
    }
}
