package com.example.androidarchitecturepatterns.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidarchitecturepatterns.R;
import com.example.androidarchitecturepatterns.pojo.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn ;
    TextView tv;

    MovieViewModel movieViewModel ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textview);
        btn.setOnClickListener(this);

        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        movieViewModel.movieMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                tv.setText(s);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button){
            movieViewModel.getMovieName();
        }
    }


}