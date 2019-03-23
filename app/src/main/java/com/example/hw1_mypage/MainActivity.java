package com.example.hw1_mypage;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView num_likes;
    FloatingActionButton like_fab;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;
        num_likes = findViewById(R.id.like_counter1);
        like_fab = findViewById(R.id.fab1);

        like_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_likes.setText(Integer.toString(++counter));
            }


        });
    }
}
