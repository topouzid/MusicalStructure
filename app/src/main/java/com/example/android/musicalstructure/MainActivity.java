package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows my_music category
        TextView playMusic = (TextView) findViewById(R.id.my_music);
        // Set a click listener on that View
        playMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the my_music View is clicked on.
            @Override
            public void onClick(View v) {
                Intent myMusicIntent = new Intent(MainActivity.this, MyMusic.class);
                startActivity(myMusicIntent);
            }
        });

        //Find the view that shows music store category
        TextView buyMusic = (TextView) findViewById(R.id.store);
        // Set a click listener on that View
        buyMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the store View is clicked on.
            @Override
            public void onClick(View v) {
                Intent buyMusicIntent = new Intent(MainActivity.this, MusicShop.class);
                startActivity(buyMusicIntent);
            }
        });
    }
}
