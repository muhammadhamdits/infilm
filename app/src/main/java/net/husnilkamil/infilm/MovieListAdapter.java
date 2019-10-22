package net.husnilkamil.infilm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieItemViewHolder> {

    private List<Movie> listMovie = new ArrayList<>();

    public void setListMovie(List<Movie> listMovie){
        this.listMovie = listMovie;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_item, parent, false);
        return new MovieItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieItemViewHolder holder, int position) {
        //Next Time
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class MovieItemViewHolder extends RecyclerView.ViewHolder {
        public MovieItemViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
