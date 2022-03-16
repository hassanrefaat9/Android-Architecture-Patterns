package com.example.androidarchitecturepatterns.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.androidarchitecturepatterns.pojo.MovieModel;

public class MovieViewModel extends ViewModel {

    MutableLiveData<String>movieMutableLiveData = new MutableLiveData<>();
    public  void  getMovieName(){
        String movieName = getMovieFromDatabase().getName();
        movieMutableLiveData.setValue(movieName);
    }

    private MovieModel getMovieFromDatabase() {
        return new MovieModel("Breaking bad", "19/9/2002", "bad", 3);
    }
}
