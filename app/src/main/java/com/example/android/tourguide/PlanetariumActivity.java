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
        String text1 = "";
        datas.add(new ContentClass(text1, R.drawable.planetariummmm));
        String text2 = "";
        datas.add(new ContentClass(text2, R.drawable.planetariumaaaa));

        ContentAdapter adapter = new ContentAdapter(this, datas);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
