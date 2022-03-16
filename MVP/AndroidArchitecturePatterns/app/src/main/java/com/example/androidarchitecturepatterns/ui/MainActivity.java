package com.example.androidarchitecturepatterns.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidarchitecturepatterns.R;
import com.example.androidarchitecturepatterns.pojo.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener ,MovieView {
    Button btn ;
    TextView tv;
    MoviePresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textview);
        btn.setOnClickListener(this);
       presenter = new MoviePresenter(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button){
            presenter.getMovieName();
        }
    }

    @Override
    public void onGetMovieName(String movieName) {
        tv.setText(movieName);
    }
}