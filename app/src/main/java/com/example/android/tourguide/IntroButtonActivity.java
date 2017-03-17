package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class IntroButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final ArrayList <ContentClass> datas = new ArrayList<ContentClass>();
        datas.add(new ContentClass("Testing testing testing", R.drawable.beachh));
    }
}
