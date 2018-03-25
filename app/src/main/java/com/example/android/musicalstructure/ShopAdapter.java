package com.example.android.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by dimitriostopouzidis on 26/03/2018.
 */

public class ShopAdapter extends ArrayAdapter<Song> {
    public ShopAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /** Check if the existing view is being reused, otherwise inflate the view */
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.shop_item, parent, false);
        }
        /** Get the {@link Song} object located at this position in the list */
        Song currentSong = getItem(position);

        /** Find the TextView in the shop_item.xml layout with the ID song_title */
        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.song_title);
        /** Get the song title from the current Song object and
         * set this text on the TextView
         */
        songTitleTextView.setText(currentSong.getSongTitle());

        /** Find the TextView in the shop_item.xml layout with the ID song_author */
        TextView songAuthorTextView = (TextView) listItemView.findViewById(R.id.song_author);
        /** Get the singer or band name from the current Song object and
         * set this text on the TextView
         */
        songAuthorTextView.setText(currentSong.getSongAuthor());

        /** Find the TextView in the shop_item.xml layout with the ID song_genre */
        TextView songGenreTextView = (TextView) listItemView.findViewById(R.id.song_genre);
        /** Get the song genre from the current Song object and
         * set this text on the TextView
         */
        songGenreTextView.setText(currentSong.getSongGenre());

        /** Find the TextView in the shop_item.xml layout with the ID song_year */
        TextView songYearTextView = (TextView) listItemView.findViewById(R.id.song_year);
        /** Get the song year from the current Song object and
         * set this text on the TextView
         */
        songYearTextView.setText(String.valueOf(currentSong.getSongYear()));

        /** Find the ImageView in the shop_item.xml layout with the ID song_artwork */
        ImageView songArtworkImageView = (ImageView) listItemView.findViewById(R.id.song_artwork);
        /** Get the song artwork id from the current Song object and
         * set this artwork id on the ImageView
         */
        songArtworkImageView.setImageResource(currentSong.getSongArtworkId());

        /** Find the TextView in the shop_item.xml layout with the ID song_price */
        TextView songPriceTextView = (TextView) listItemView.findViewById(R.id.song_price);
        /** Get the song price from the current Song object and
         * set this the price as Free if price is 0, or as a local currency price on the ImageView
         */
        if (currentSong.getSongPrice() == 0) {
            songPriceTextView.setText("Free");
        } else {
            songPriceTextView.setText(NumberFormat.getCurrencyInstance().format(currentSong.getSongPrice()));
        }
        return listItemView;
    }
}
