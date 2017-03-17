package com.example.android.tourguide;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
//        TextView introductionTextView = (TextView) findViewById(R.id.introduction_id);
//        introductionTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent introIntent = new Intent(MainActivity.this, IntroActivity.class);
//                startActivity(introIntent);
//            }
//        });
//
//        TextView attractionTextView = (TextView) findViewById(R.id.attraction_id);
//        attractionTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent attractionIntent = new Intent(MainActivity.this, AttractionActivity.class);
//                startActivity(attractionIntent);
//            }
//        });
//
//        TextView restaurantTextView = (TextView) findViewById(R.id.restaurant_id);
//        restaurantTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);
//                startActivity(restaurantIntent);
//            }
//        });
//
//        TextView transportationTextView = (TextView) findViewById(R.id.transportation_id);
//        transportationTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent transportaionIntent = new Intent(MainActivity.this, TransportationActivity.class);
//                startActivity(transportaionIntent);
//            }
//        });
    }
}
