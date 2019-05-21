package com.example.android.lullabysudacityprojectfour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LullabyAdapter extends ArrayAdapter<Song> {

    public LullabyAdapter(Context context, ArrayList<Song> lullabys) {
        super(context, 0, lullabys);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list_item, parent, false);
        }

        // Get the song located at this position in the list
        Song currentSong = getItem(position);

        ImageView songImage = listItemView.findViewById(R.id.music_list_image);

        songImage.setImageResource(currentSong.getSongImage());

        TextView songTitle = listItemView.findViewById(R.id.music_list_title);

        songTitle.setText(currentSong.getSongTitle());

        return listItemView;

    }

}
