package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MyMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        Intent startupIntent = getIntent();

        //Songs are stored in an ArrayList
        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Song Title 1");
        songs.add("Song Title 2");
        songs.add("Song Title 3");
        songs.add("Song Title 4");
        songs.add("Song Title 5");
        songs.add("Song Title 6");
        songs.add("Song Title 7");
        songs.add("Song Title 8");
        songs.add("Song Title 9");
        songs.add("Song Title 10");

        /**
         * Create an ArrayAdapter to display a list to a ListView in XML
         * @type activity_my_music
         * @input songs ArrayList
         */
        ArrayAdapter songs_array = new ArrayAdapter(this, R.layout.activity_my_music, songs);
        ListView listView = (ListView) findViewById(R.id.songs_list);
        listView.setAdapter(songs_array);
    }
}
