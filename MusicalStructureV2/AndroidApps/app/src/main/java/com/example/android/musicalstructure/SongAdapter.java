package com.example.android.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<SongClass> {

    public SongAdapter(Activity context, ArrayList<SongClass> songs){
        super(context, 0 , songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem, parent, false);
        }

        SongClass currentSong = getItem(position);
        TextView songnameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songnameTextView.setText(currentSong.getmSongName());
        return listItemView;
    }
}
