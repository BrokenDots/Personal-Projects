package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyActivity extends AppCompatActivity {

    Button backtosong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        backtosong = findViewById(R.id.back_to_songlist);
        backtosong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backintent = new Intent(BuyActivity.this, MainActivity.class);
                startActivity(backintent);
            }
        });
    }
}
