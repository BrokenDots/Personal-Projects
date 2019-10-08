package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        ArrayList<ListItemView> attList = new ArrayList<ListItemView>();
        attList.add(new ListItemView("Malpe Beach", "It is around 10 km from Manipal. The beach is clean, peaceful and beautiful. There is a famous beach resort which serves delicious food.", R.drawable.malpe));
        attList.add(new ListItemView("Kapu Beach", "The lighthouse at this beach is famous and is not very crowded. At a distance of 15 kilometres from Manipal, it is a very popular destination for the students of Manipal University to spend weekends.", R.drawable.kapu));
        attList.add(new ListItemView("Turtle Bay", "Located at Kundapura in Karnataka, Turtle Bay Beach Resort offers you the luxury of lounging on pristine golden sands, amidst swaying coconut palms. The resort gets its name from the sea turtles that inhabit the beach during the nesting season from October to December every year.", R.drawable.turtlebay));

        ItemAdapter itemAdapter= new ItemAdapter(this, attList);

        ListView listView = (ListView) findViewById(R.id.att_listview);
        listView.setAdapter(itemAdapter);
    }
}
