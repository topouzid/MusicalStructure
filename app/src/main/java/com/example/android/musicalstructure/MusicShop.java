package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicShop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_shop);

        Intent startupIntent = getIntent();

        //Songs from the shop are stored in an ArrayList
        ArrayList<String> musicShop = new ArrayList<String>();
        musicShop.add("New Song 1");
        musicShop.add("New Song 2");
        musicShop.add("New Song 3");
        musicShop.add("New Song 4");
        musicShop.add("New Song 5");
        musicShop.add("New Song 6");
        musicShop.add("New Song 7");
        musicShop.add("New Song 8");
        musicShop.add("New Song 9");

        /**
         * Create an ArrayAdapter to show a list to a ListView in XML
         * @type simple_list_item_1
         * @input songs ArrayList
         */
        ArrayAdapter<String> newSongsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, musicShop);
        ListView listView = (ListView) findViewById(R.id.music_shop_list);
        listView.setAdapter(newSongsAdapter);

    }
}
