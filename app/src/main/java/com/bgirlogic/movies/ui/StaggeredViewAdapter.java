package com.bgirlogic.movies.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bgirlogic.movies.R;
import com.bgirlogic.movies.api.models.Movie;

import java.util.List;

/**
 * Created by Senpai on 12/21/15.
 */
public class StaggeredViewAdapter extends RecyclerView.Adapter<StaggeredView> {

    private Context mContext;

    private List<Movie> mMovies;

    public StaggeredViewAdapter(Context context, List<Movie> movies) {
        this.mContext = context;
        this.mMovies = movies;
    }

    @Override
    public StaggeredView onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_item, parent, false);
        StaggeredView staggeredView = new StaggeredView(layoutView);
        return staggeredView;
    }

    @Override
    public void onBindViewHolder(StaggeredView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }
}
