package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<ContentClass> datas = new ArrayList<ContentClass>();
        String text1 = "PARAGON";
        datas.add(new ContentClass(text1));
        String text2 = "Chinese, Indian, Seafood, Asian, Vegetarian Friendly, Vegan Options, Halal";
        datas.add(new ContentClass(text2, R.drawable.paragon));
        String text3 = "M-GRILL";
        datas.add(new ContentClass(text3));
        String text4 = "Indian, Asian, Halal, Vegetarian Friendly";
        datas.add(new ContentClass(text4, R.drawable.mgrill));
        String text5 = "RAHMATH";
        datas.add(new ContentClass(text5));
        String text6 = "Indian, Asian, Halal";
        datas.add(new ContentClass(text6, R.drawable.rahmat));


        ContentAdapter adapter = new ContentAdapter(this, datas);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
