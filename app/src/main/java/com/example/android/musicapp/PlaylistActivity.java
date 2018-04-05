package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Ed Sheeran",                    "Perfect"));
        songs.add(new Song("Luis Fonsi  & Demi Lovato",     "Echame la Culpa"));
        songs.add(new Song("Bausa",                         "Was Du Liebe nennst "));
        songs.add(new Song("Camila Cabello",               "Never Be the Same"));
        songs.add(new Song("Selena Gomez feat. Marshmello", "Wolves"));
        songs.add(new Song("Big Shaq",                      "Man's Not Hot "));
        songs.add(new Song("Craig David feat. Bastille", "I Know You"));
        songs.add(new Song("Michael Patrick Kelly",        "Roundabouts"));
        songs.add(new Song("The Night Game",                "Once in a Lifetime"));
        songs.add(new Song("Maitre Gims",                   "Cameleon"));
        songs.add(new Song("Rin",                           "Data Love"));
        songs.add(new Song("Eno",                           "Wäwä"));
        songs.add(new Song("Leland",                        "Mattress"));
        songs.add(new Song("Hugo Helmig ",                   "Please Don't Lie"));
        songs.add(new Song("Dua Lipa",                     "IDGAF"));
        songs.add(new Song("Nano",                          "Hold On"));
        songs.add(new Song("P!nk",                          "Beautiful Trauma "));


        // Create a PlaylistSongAdapter, whose data source is a list of songs. The
        // adapter knows how to create list items for each item in the list.
        PlaylistSongAdapter adapter = new PlaylistSongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // playlist_layout file.
        final ListView listView = (ListView) findViewById(R.id.playlist_layout);

        // Make the listview use the PlaylistSongAdapter we created above, so that the
        // {@link ListView} will display list items for each song in the list.
        listView.setAdapter(adapter);

        // Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Song song = (Song) listView.getItemAtPosition(position);
                Intent mainActivityIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                mainActivityIntent.putExtra("SONGARTIST", song.getArtist());
                mainActivityIntent.putExtra("SONGTITLE", song.getTitle());
                startActivity(mainActivityIntent);
            }});

    }
}
