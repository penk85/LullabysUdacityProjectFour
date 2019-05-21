package com.example.android.lullabysudacityprojectfour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    //declaring dynamic views
    private ImageView songImageIV;
    private TextView songTitleTV;
    private ImageView playPauseButton;

    //check whether song is playing
    private boolean isSongPlaying = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        //connecting views
        songImageIV = findViewById(R.id.song_image_iv);
        songTitleTV = findViewById(R.id.song_title_tv);
        playPauseButton = findViewById(R.id.play_pause_button);

        //get list item number from intent extra
        Intent intent = getIntent();
        int songIndex = intent.getIntExtra("index", 1);

        //Find selected song from arraylist with index extracted from intent extra
        Song currentSong = SongData.getSongList().get(songIndex);

        //Set display to reflect current song
        songTitleTV.setText(currentSong.getSongTitle());
        songImageIV.setImageResource(currentSong.getSongImage());

        //"activate" play button. This doesn't play the music, but mimics buttom behavior if it would.
        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSongPlaying) {
                    playPauseButton.setImageResource(R.drawable.sharp_pause_circle_outline_black_18dp);
                    isSongPlaying = false;
                } else {
                    playPauseButton.setImageResource(R.drawable.sharp_play_circle_outline_black_18dp);
                    isSongPlaying = true;
                }
            }
        });


    }
}
