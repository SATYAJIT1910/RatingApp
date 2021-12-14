package com.satyajit.ratingapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button star;
    private RatingBar rating;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        star=findViewById(R.id.starbtn);
        rating=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.textView);
        star.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float value=rating.getRating();
                String myResult=Float.toString(value);
                textView.setText("You have rated "+myResult+" stars");
            }
        });
    }

}