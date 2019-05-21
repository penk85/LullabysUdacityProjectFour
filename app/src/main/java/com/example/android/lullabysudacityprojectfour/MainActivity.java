package com.example.android.lullabysudacityprojectfour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView songLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songLV = findViewById(R.id.music_list);
        //get the list of songs from the SongData class. The list is stored in a different class
        // so it can be easily accessed by the song activity screen.
        ArrayList<Song> songs = SongData.getSongList();
        //set adapter to display custom view
        LullabyAdapter adapter = new LullabyAdapter(this, songs);

        songLV.setAdapter(adapter);
        //Listener so when item is clicked from the list of songs, you get taken to the song
        // display page.
        songLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), SongActivity.class);
                //Storing the index number as an intent extra so it could be passed to the next
                // activity and the correct song will be displayed.
                intent.putExtra("index", i);
                startActivity(intent);
            }
        });
    }
}
