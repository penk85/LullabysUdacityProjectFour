package com.example.android.lullabysudacityprojectfour;

import java.util.ArrayList;

public final class SongData {
    private SongData() {
    }

    //Arraylist to contain songs. Would contain audio res if played audio.
    public static ArrayList<Song> getSongList() {
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(R.string.goodnight, R.drawable.baby_feet));
        songs.add(new Song(R.string.hush_little, R.drawable.adorable_baby));
        songs.add(new Song(R.string.rock_a_by, R.drawable.baby_born));
        songs.add(new Song(R.string.pretty_horses, R.drawable.baby_bed));
        songs.add(new Song(R.string.twinkle, R.drawable.bed_blue));
        return songs;
    }
}
