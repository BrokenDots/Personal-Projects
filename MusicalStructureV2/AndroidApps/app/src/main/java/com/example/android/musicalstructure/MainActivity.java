package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<SongClass> songs = new ArrayList<SongClass>();
        songs.add(new SongClass("Perfect"));
        songs.add(new SongClass("The sky is the limit"));
        songs.add(new SongClass("Saltwater Room"));
        songs.add(new SongClass("Give me fire"));
        songs.add(new SongClass("Sandcastles"));
        songs.add(new SongClass("Black and White"));
        songs.add(new SongClass("Mangled"));
        songs.add(new SongClass("The hero of our time"));
        songs.add(new SongClass("Vanilla Twilight"));
        songs.add(new SongClass("Bipolar Nightmare"));
        songs.add(new SongClass("Song of the Ancients"));
        songs.add(new SongClass("Adam and Eve"));

        SongAdapter songadapterobject = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(songadapterobject);

        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
  @Override
           public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(MainActivity.this, PlayingActivity.class );
            startActivity(intent);
           }
        });



    }
}
