package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rosalieblomeier on 30.03.18.
 */

public class PlaylistSongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = PlaylistSongAdapter.class.getSimpleName();

    public PlaylistSongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.list_item_artist);
        // Get the artist from the current song object and
        // set this text on the name TextView
        artistTextView.setText(currentSong.getArtist());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.list_item_title);
        // Get the title from the current currentSong object and
        // set this text on the title TextView
        titleTextView.setText(currentSong.getTitle());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }}