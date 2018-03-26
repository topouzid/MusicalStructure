package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicShop extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_shop);
//        getActionBar().setDisplayHomeAsUpEnabled(true);

        Intent startupIntent = getIntent();

        /** Songs from the shop are stored in an ArrayList */
        ArrayList<Song> newSongs = new ArrayList<Song>();
        newSongs.add(new Song("High Hopes", "Pink Floyd", "Progressive Rock", 1994, 0.69, "Lyrics", R.drawable.pinkfloyd));
        newSongs.add(new Song("The Promise", "Michael Nyman", "OST", 1993, 0.49, "Instrumental", R.drawable.nyman));
        newSongs.add(new Song("Wake Me Up", "Avicii", "Electronic", 2013, 0.69, "Lyrics", R.drawable.avicii));
        newSongs.add(new Song("Tribute", "Tenacious D", "Alternative", 2001, 0.49, "Lyrics", R.drawable.tenaciousd));
        newSongs.add(new Song("Smells Like Teen Spirit", "Nirvana", "Alternative", 1991, 0.69, "Lyrics", R.drawable.nirvana));
        newSongs.add(new Song("Sweet Child O\' Mine", "Guns \'N Roses", "Hard Rock", 1987, 0.69, "Lyrics", R.drawable.gunsnroses));
        newSongs.add(new Song("Hotel California", "The Eagles", "Classic Rock", 1976, 0.49, "Lyrics", R.drawable.eagles));
        newSongs.add(new Song("Earth Song", "Michael Jackson", "POP", 1982, 0, "Lyrics", R.drawable.jackson));
        newSongs.add(new Song("Maria Maria", "Santana", "Latin Pop", 1999, 0.49, "Lyrics", R.drawable.santana));
        newSongs.add(new Song("La Isla Bonita", "Madonna", "POP", 1986, 0.49, "Lyrics", R.drawable.madonna));
        newSongs.add(new Song("Pray For Me", "The Weeknd, Kendrick Lamar", "POP", 2018, 0.99, "Lyrics", R.drawable.weeknd));
        newSongs.add(new Song("Sickboy", "The Chainsmokers", "POP", 2018, 0.69, "Lyrics", R.drawable.chainsmokers));
        newSongs.add(new Song("Jewel", "Cash Cash ft. Nikki Vianna", "Dance Electronic", 2018, 0.69, "Lyrics", R.drawable.cashcash));
        newSongs.add(new Song("Euphoria", "Loreen", "Eurovision", 2012, 0.49, "Lyrics", R.drawable.loreen));

        /**
         * Create a ShopAdapter to display a list to a ListView in XML
         * @input newSongs ArrayList
         */
        ShopAdapter newSongsAdapter = new ShopAdapter(this, newSongs);
        ListView listView = (ListView) findViewById(R.id.music_shop_list);
        listView.setAdapter(newSongsAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
