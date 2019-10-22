package net.husnilkamil.infilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Iniasialisasi RecyclerView
        MovieListAdapter adapter = new MovieListAdapter();
        adapter.setListMovie(getMovieListData());

        RecyclerView recyclerView = findViewById(R.id.rvListMovie);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }


    public List<Movie> getMovieListData(){
        List<Movie> listMovie = new ArrayList<>();

        listMovie.add(new Movie());
        listMovie.add(new Movie());
        listMovie.add(new Movie());
        listMovie.add(new Movie());
        listMovie.add(new Movie());
        listMovie.add(new Movie());
        listMovie.add(new Movie());
        listMovie.add(new Movie());
        listMovie.add(new Movie());
        listMovie.add(new Movie());

        return listMovie;
    }
}
