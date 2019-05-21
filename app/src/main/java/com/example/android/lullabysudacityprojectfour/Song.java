package com.example.android.lullabysudacityprojectfour;


public class Song {

    private int mSongTitle;

    private int mSongImage;



    public Song(int songTitle, int songImage) {
        mSongTitle = songTitle;
        mSongImage = songImage;
    }

    public int getSongImage() {
        return mSongImage;
    }

    public void setSongImage(int songImage) {
        mSongImage = songImage;
    }

    public int getSongTitle() {
        return mSongTitle;
    }

    public void setSongTitle(int songTitle) {
        mSongTitle = songTitle;
    }

}
