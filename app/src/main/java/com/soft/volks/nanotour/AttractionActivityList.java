package com.soft.volks.nanotour;

import android.content.Intent;
import android.support.annotation.ArrayRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionActivityList extends AppCompatActivity {
    public ArrayList<Attraction> attractions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_list);

        fillArray();


        AttractionAdapter listAdapter = new AttractionAdapter(this, attractions);
        ListView list = (ListView) findViewById(R.id.activity_attraction_list);
        list.setAdapter(listAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(AttractionActivityList.this, AttractionDetail.class);
                intent.putExtra("ATTRACTION", attractions.get(position));
                startActivity(intent);
            }
        });



    }

    private void fillArray(){
        int len;
        String[] names = getResources().getStringArray(R.array.attraction_names_PA);
        String[] address = getResources().getStringArray(R.array.attraction_address_PA);

        if(names.length == address.length){
            len = names.length;
        }else{
            if(names.length > address.length){
                len = names.length;
            }else{
                len = address.length;
            }

        }

        for(int i = 0; i < len; i++)
        {
            Attraction attraction = new Attraction();
            attraction.setmName(names[i]);
            attraction.setmAddress(address[i]);
            attraction.setmImgId(R.drawable.temp_img); //TODO Add Images IDs
            attractions.add(attraction);

        }
    }
}
