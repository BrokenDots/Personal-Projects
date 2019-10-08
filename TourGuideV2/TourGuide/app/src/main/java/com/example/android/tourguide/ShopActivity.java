package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        ArrayList<ListItemView> shopList = new ArrayList<ListItemView>();
        shopList.add(new ListItemView("Manipal Stores", "This departmental store tops the list for variety", R.drawable.campusstores));
        shopList.add(new ListItemView("Campus Stores", "It caters to the needs of budding architects and the eternally hungry alike", R.drawable.manipalstores));

        ItemAdapter itemAdapter = new ItemAdapter(this, shopList);

        ListView listView = (ListView) findViewById(R.id.shop_listview);
        listView.setAdapter(itemAdapter);

    }
}
