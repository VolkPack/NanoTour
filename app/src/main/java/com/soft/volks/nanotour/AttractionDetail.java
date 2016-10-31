package com.soft.volks.nanotour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AttractionDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_detail_layout);

        Intent intent = getIntent();
        Attraction attraction = (Attraction)intent.getSerializableExtra("ATTRACTION");
        TextView name = (TextView) findViewById(R.id.attraction_detail_name);
        name.setText(attraction.getmName());
    }
}
