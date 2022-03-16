package com.example.androidarchitecturepatterns.ui;

import com.example.androidarchitecturepatterns.pojo.MovieModel;

public class MoviePresenter {
    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }

    public MovieModel getMovieFromDatabase() {
        return new MovieModel("Cast away", "19/9/2002", "bad", 3);
    }
    public void getMovieName(){
        view.onGetMovieName(getMovieFromDatabase().getName());
    }
}