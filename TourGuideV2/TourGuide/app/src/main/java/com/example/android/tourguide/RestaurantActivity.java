package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);


        ArrayList<ListItemView> restList = new ArrayList<ListItemView>();
        restList.add(new ListItemView("Egg Factory", "Behind TMA Pai institute", R.drawable.eggfactory));
        restList.add(new ListItemView("Dollups", "Tiger Circle", R.drawable.dollups));
        restList.add(new ListItemView("KFC", "Kentucky Fried Chicken", R.drawable.kfc));

        ItemAdapter itemAdapter = new ItemAdapter(this, restList);

        ListView listView = (ListView) findViewById(R.id.rest_listview);
        listView.setAdapter(itemAdapter);

    }
}