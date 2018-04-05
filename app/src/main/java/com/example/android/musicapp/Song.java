package com.example.android.musicapp;

/**
 * Created by rosalieblomeier on 30.03.18.
 */

public class Song {

    /** Artis of the song */
    private String mArtist;

    /** Title of the song */
    private String mTitle;

    /**
     * Create a new com.example.android.musicapp.Song object.
     *
     * @param Artist is the Singer/Band of the song
     * @param Title is the Name of the song.
     */
    public Song(String Artist, String Title) {
        mArtist = Artist;
        mTitle = Title;
    }

    /**
     * Get the Artist of the song.
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the title of the song.
     */
    public String getTitle() {
        return mTitle;
    }
}
