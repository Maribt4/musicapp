package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;


public class AlbumSongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = PlaylistSongAdapter.class.getSimpleName();

    public AlbumSongAdapter(Activity context, ArrayList<Song> songs) {
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

        // Get the  object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.list_item_title);
        // Get the title from the current song object and
        // set this text on the number TextView
        titleTextView.setText(currentSong.getTitle());

        // Return only the title of the song so that it can be shown in the ListView.
        // The artist is not needed to be displayed here, as all songs are by the same artist.
        return listItemView;
    }}