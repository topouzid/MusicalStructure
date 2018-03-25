package com.example.android.musicalstructure;

import org.w3c.dom.Text;

/**
 * Created by dimitriostopouzidis on 25/03/2018.
 * {@link Song} represents a song that a user wants to play or buy
 * It contains the song Title, Singer or Band, Genre, Year, Price, Lyrics, Artwork
 */

public class Song {
    /** Song Title Name */
    private String mSongTitle;

    /** Song Singer or Band or original author */
    private String mSongAuthor;

    /** Song Genre */
    private String mSongGenre;

    /** Year the song released */
    private int mSongYear;

    /** Price of the song on the store */
    private double mSongPrice;

    /** Lyrics of the songs if available */
    private String mSongLyrics;

    /** Link to song artwork on Drawables */
    private int mSongArtworkId;

    /**
     * Constructor that has exactly the same name as the class
     * @param songTitle song title
     * @param songAuthor singer, band or creator
     * @param songGenre genre
     * @param songYear year
     * @param songPrice price
     * @param songLyrics lyrics
     * @param songArtworkId link to drawables
     */
    public Song (String songTitle, String songAuthor, String songGenre, int songYear, double songPrice, String songLyrics, int songArtworkId) {
        mSongTitle = songTitle;
        mSongAuthor = songAuthor;
        mSongGenre = songGenre;
        mSongYear = songYear;
        mSongPrice = songPrice;
        mSongLyrics = songLyrics;
        mSongArtworkId = songArtworkId;
    }

    /**
     * Method: Get the song title
     * @return
     */
    public String getSongTitle() {
        return mSongTitle;
    }
    /**
     * Method: Get the song band, singer or creator
     * @return
     */
    public String getSongAuthor() {
        return mSongAuthor;
    }
    /**
     * Method: Get the song genre
     * @return
     */
    public String getSongGenre() {
        return mSongGenre;
    }
    /**
     * Method: Get the song year
     * @return
     */
    public int getSongYear() {
        return mSongYear;
    }
    /**
     * Method: Get the song price
     * @return
     */
    public double getSongPrice() {
        return mSongPrice;
    }
    /**
     * Method: Get the song lyrics
     * @return
     */
    public String getSongLyrics() {
        return mSongLyrics;
    }
    /**
     * Method: Get the song artwork link on drawables
     * @return
     */
    public int getSongArtworkId() {
        return mSongArtworkId;
    }
}
