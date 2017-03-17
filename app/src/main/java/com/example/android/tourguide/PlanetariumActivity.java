package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlanetariumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<ContentClass> datas = new ArrayList<ContentClass>();
        String text1 = "    The Regional Science Centre and Planetarium functioning under NCSM (Govt.of India) shoulders the leading role in propelling science dissemination activities in Kerala, especially in the Malabar region. Kozhikode, the capital of Malabar right from the time of the Zamorin’s dynasty is now a fascinating place with unparalleled attractions including historic monuments, works of art and cultural contributions. The city attracts and accommodates visitors by outstretched red carpet of its enticing natural beauty. ";
        datas.add(new ContentClass(text1, R.drawable.planetariummmm));
        String text2 = "    Situated in this land of distinct heritage RSC & Planetarium engages itself in dissemination of science through interactive exhibitions. The centre provides a perfect ambiance for exploring science through hands-on expositions, planetarium, 3D theatre, etc. It presents a plethora of facilities to inculcate scientific attitude in society.";
        datas.add(new ContentClass(text2, R.drawable.planetariumaaaa));

        ContentAdapter adapter = new ContentAdapter(this, datas);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
