package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Lady Gaga",                          "Bad Romance"));
        songs.add(new Song("Lady Gaga",                         "Alejandro"));
        songs.add(new Song("Lady Gaga",                         "Monster"));
        songs.add(new Song("Lady Gaga",                        "Speechless"));
        songs.add(new Song("Lady Gaga",                         "Dance in the dark"));
        songs.add(new Song("Lady Gaga",                           "Telephone"));
        songs.add(new Song("Lady Gaga",                         "So happy I could die"));
        songs.add(new Song("Lady Gaga",                         "Teeth"));
        songs.add(new Song("Lady Gaga",                            "Just Dance"));
        songs.add(new Song("Lady Gaga",                        "LoveGame"));
        songs.add(new Song("Lady Gaga",                           "Paparazzi"));
        songs.add(new Song("Lady Gaga",                           "Poker Face"));
        songs.add(new Song("Lady Gaga",                         "I like it rough"));
        songs.add(new Song("Lady Gaga",                         "Eh, Eh"));
        songs.add(new Song("Lady Gaga",                           "Starstruck"));
        songs.add(new Song("Lady Gaga",                          "Beautiful, Dirty, Rich"));
        songs.add(new Song("Lady Gaga",                          "The Fame"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AlbumSongAdapter adapter = new AlbumSongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listout file.
        final ListView listView = (ListView) findViewById(R.id.album_layout);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Song song = (Song) listView.getItemAtPosition(position);
                Intent mainActivityIntent = new Intent(AlbumActivity.this, MainActivity.class);
                mainActivityIntent.putExtra("SONGARTIST", song.getArtist());
                mainActivityIntent.putExtra("SONGTITLE", song.getTitle());
                startActivity(mainActivityIntent);
            }});
    }
}
