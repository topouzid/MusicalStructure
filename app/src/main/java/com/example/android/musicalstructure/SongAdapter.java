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

import java.util.ArrayList;

/**
 * Created by dimitriostopouzidis on 25/03/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        /** Check if the existing view is being reused, otherwise inflate the view */
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);
        }
        Song currentSong = getItem(position);

        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.song_title);
        songTitleTextView.setText(currentSong.getSongTitle());

        TextView songAuthorTextView = (TextView) listItemView.findViewById(R.id.song_author);
        songAuthorTextView.setText(currentSong.getSongAuthor());

        TextView songGenreTextView = (TextView) listItemView.findViewById(R.id.song_genre);
        songGenreTextView.setText(currentSong.getSongGenre());

        TextView songYearTextView = (TextView) listItemView.findViewById(R.id.song_year);
        songYearTextView.setText(String.valueOf(currentSong.getSongYear()));

        ImageView songArtworkImageView = (ImageView) listItemView.findViewById(R.id.song_artwork);
        songArtworkImageView.setImageResource(currentSong.getSongArtworkId());
        return listItemView;
//        return super.getView(position, convertView, parent);
    }
}
