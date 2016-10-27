package com.soft.volks.nanotour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View.OnClickListener mainPageListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case (R.id.palo_alto_button):
                        Intent intent = new Intent(MainActivity.this, AttractionActivityList.class);
                        startActivity(intent);
                        break;
                }
            }
        };

        setListener(mainPageListener);
    }

    private void setListener(View.OnClickListener listner){
        Button palo_alto = (Button) findViewById(R.id.palo_alto_button);

        palo_alto.setOnClickListener(listner);
    }
}
