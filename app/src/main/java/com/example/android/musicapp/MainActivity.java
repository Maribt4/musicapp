package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Albums category
        ImageButton album = findViewById(R.id.albums_button);

        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }});

        // Find the View that shows the playlist category
        ImageButton playlist = findViewById(R.id.playlist_button);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }});

        // Get the data from previous activity (selected song in the playlist or album) and display it
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView songTextView = (TextView)findViewById(R.id.song_artist);
            TextView artistTextView = (TextView)findViewById(R.id.song_title);
            songTextView.setText(extras.getString("SONGARTIST"));
            artistTextView.setText(extras.getString("SONGTITLE"));
        }

        // Find the View that shows the Albums category
        ImageButton play = findViewById(R.id.play_button);

        play.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Function not implemented. Sorry.";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();}
            });

        // Find the View that shows the skip button
        ImageButton skip = findViewById(R.id.skip_button);

        skip.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Function not implemented. Sorry.";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();}
        });

        // Find the View that shows the previous button
        ImageButton previous = findViewById(R.id.previous_button);

        previous.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Function not implemented. Sorry.";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();}
        });
    }
}
