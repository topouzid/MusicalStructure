package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows my_music category
        TextView playMusic = (TextView) findViewById(R.id.my_music);
        // Set a click listener on that View
        playMusic.setOnClickListener(this);

        //Find the view that shows music store category
        TextView buyMusic = (TextView) findViewById(R.id.store);
        // Set a click listener on that View
        buyMusic.setOnClickListener(this);
    }

    @Override
    public void onClick(View V) {
        int id = V.getId();
        switch (id) {
            // The code in this method will be executed when the store View is clicked on.
            case R.id.store:
                Intent buyMusicIntent = new Intent(MainActivity.this, MusicShop.class);
                startActivity(buyMusicIntent);
                break;
            // The code in this method will be executed when the my_music View is clicked on.
            case R.id.my_music:
                Intent myMusicIntent = new Intent(MainActivity.this, MyMusic.class);
                startActivity(myMusicIntent);
                break;
        }
    }
}
