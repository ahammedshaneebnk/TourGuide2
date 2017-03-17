package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AttractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);
        Button firstIntroButton = (Button) findViewById(R.id.firstAttractionButton_id);
        firstIntroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AttractionActivity.this, BeachActivity.class);
                startActivity(i);
            }
        });

        Button thusharagiriButton = (Button) findViewById(R.id.secondAttractionButton_id);
        thusharagiriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (AttractionActivity.this, ThusharagiriActivity.class);
                startActivity(i);
            }
        });

        Button planetariumButton = (Button) findViewById(R.id.thirdAttractionButton_id);
        planetariumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (AttractionActivity.this, PlanetariumActivity.class);
                startActivity(i);
            }
        });

        Button peruvannamozhiDamButton = (Button) findViewById(R.id.fourthAttractionButton_id);
        peruvannamozhiDamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (AttractionActivity.this, PeruvannamozhiDamActivity.class);
                startActivity(i);
            }
        });
    }
}
