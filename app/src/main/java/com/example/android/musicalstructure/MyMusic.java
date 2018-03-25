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

        //Songs are stored in an ArrayList
//        ArrayList<String> songsx = new ArrayList<String>();
//        songs.add("Song Title 1");
//        songs.add("Song Title 2");
//        songs.add("Song Title 3");
//        songs.add("Song Title 4");
//        songs.add("Song Title 5");
//        songs.add("Song Title 6");
//        songs.add("Song Title 7");
//        songs.add("Song Title 8");
//        songs.add("Song Title 9");
//        songs.add("Song Title 10");

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Havana (Audio) ft. Young Thug", "Camila Cabello", "POP", 2018, 0.99, "Hey nanana lyrics", R.drawable.havana));
        songs.add(new Song("Never be the Same", "Camila Cabello", "POP", 2018, 0.99, "Lyrics", R.drawable.camila));
        songs.add(new Song("You Are the Reason", "Calum Scott", "POP", 2018, 0.69, "Lyrics", R.drawable.calum));
        songs.add(new Song("Way Down we Go", "Kaleo", "Blues Rock / Alternative", 2016, 0.69, "Lyrics", R.drawable.kaleo));
        songs.add(new Song("Wind of Change", "Scorpions", "Classic Rock", 1990, 0.49, "Lyrics", R.drawable.scorpions));
        songs.add(new Song("The Unforgiven", "Metallica", "Metal", 1991, 0.69, "Lyrics", R.drawable.metallica));
        songs.add(new Song("Earth Song", "Michael Jackson", "POP", 1982, 0, "Lyrics", R.drawable.jackson));
        songs.add(new Song("High Hopes", "Pink Floyd", "Progressive Rock", 1994, 0.69, "Lyrics", R.drawable.pinkfloyd));

        /**
         * Create an ArrayAdapter to display a list to a ListView in XML
         * @type simple_list_item_1
         * @input songs ArrayList
         */
//        ArrayAdapter<String> songs_array = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);
//        ArrayAdapter<Song> songs_array = new ArrayAdapter<Song>(this, R.layout.song_item, songs);
        SongAdapter songs_adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.songs_list);
        listView.setAdapter(songs_adapter);
//        listView.setAdapter(songs_array);
    }
}
