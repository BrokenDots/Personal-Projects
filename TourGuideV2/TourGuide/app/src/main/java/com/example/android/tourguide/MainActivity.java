package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mEvents =(TextView)findViewById(R.id.event_textview);
        mEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openEvent = new Intent(MainActivity.this, EventActivity.class);
                startActivity(openEvent);
            }
        });


        TextView mRestaurant =(TextView)findViewById(R.id.restaurant_textview);
        mRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openRest = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(openRest);
            }
        });


        TextView mAttractions =(TextView)findViewById(R.id.attractions_textview);
        mAttractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAtt = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(openAtt);
            }
        });

        TextView mShops =(TextView)findViewById(R.id.shop_textview);
        mShops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openShop = new Intent(MainActivity.this, ShopActivity.class);
                startActivity(openShop);
            }
        });

    }
}
