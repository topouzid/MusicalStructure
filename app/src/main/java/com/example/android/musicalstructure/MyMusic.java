package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        Intent startupIntent = getIntent();

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Havana (Audio) ft. Young Thug", "Camila Cabello", "POP", 2018, 0.99, "Hey nanana lyrics", R.drawable.havana));
        songs.add(new Song("Never be the Same", "Camila Cabello", "POP", 2018, 0.99, "Lyrics", R.drawable.camila));
        songs.add(new Song("You Are the Reason", "Calum Scott", "POP", 2018, 0.69, "Lyrics", R.drawable.calum));
        songs.add(new Song("Way Down we Go", "Kaleo", "Blues Rock / Alternative", 2016, 0.69, "Lyrics", R.drawable.kaleo));
        songs.add(new Song("Wind of Change", "Scorpions", "Classic Rock", 1990, 0.49, "Lyrics", R.drawable.scorpions));
        songs.add(new Song("The Unforgiven", "Metallica", "Metal", 1991, 0.69, "Lyrics", R.drawable.metallica));

        /**
         * Create a SongAdapter to display a list to a ListView in XML
         * @input songs ArrayList
         */
        SongAdapter songs_adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.songs_list);
        listView.setAdapter(songs_adapter);
    }
}
