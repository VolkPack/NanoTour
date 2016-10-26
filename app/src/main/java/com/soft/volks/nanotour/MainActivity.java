package com.soft.volks.nanotour;

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
                        //TODO LINK TO NEXT ACTIVITY
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
