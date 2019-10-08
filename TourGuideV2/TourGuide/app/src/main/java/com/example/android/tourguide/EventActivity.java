package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        ArrayList<ListItemView> eventList = new ArrayList<ListItemView>();
        eventList.add(new ListItemView("Manipal Run 2018", "RaceXcasia", R.drawable.event_run));
        eventList.add(new ListItemView("Techtatwa", "MIT", R.drawable.techtatwa));

        ItemAdapter itemAdapter= new ItemAdapter(this, eventList);

        ListView listView = (ListView) findViewById(R.id.event_listview);
        listView.setAdapter(itemAdapter);
    }
}
