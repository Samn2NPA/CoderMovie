package com.project.samn.codermovie.activity;

import android.content.res.Configuration;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubePlayerFragment;
import com.project.samn.codermovie.R;
import com.project.samn.codermovie.Utils.ResourceUtil;
import com.project.samn.codermovie.databinding.ActivityDetailMovieBinding;
import com.project.samn.codermovie.model.Movie;

public class DetailMovieActivity extends AppCompatActivity {

    private static final String TAG = DetailMovieActivity.class.getSimpleName();
    public static Movie movieDetail;
    private ActivityDetailMovieBinding binding;

    YouTubePlayerFragment youtubeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_movie);

        binding.setMovieDetail(movieDetail);

        youtubeFragment = (YouTubePlayerFragment)
                getFragmentManager().findFragmentById(R.id.youtubeFragment);

        final long movieID = getIntent().getLongExtra(ResourceUtil.MOVIE_ID, 0);

        ResourceUtil.isFullScreen = false; //detail_movie_activity thì KHÔNG fullscreen youtubeFragment
        ResourceUtil.getTrailerMovie(movieID, youtubeFragment);

    }

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        finish();
        super.onConfigurationChanged(newConfig);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_movie);

    }
}
