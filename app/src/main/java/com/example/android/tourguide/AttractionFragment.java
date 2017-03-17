package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AttractionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_attraction, container, false);
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_attraction);
        Button firstIntroButton = (Button) rootView.findViewById(R.id.firstAttractionButton_id);
        firstIntroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BeachActivity.class);
                startActivity(i);
            }
        });

        Button thusharagiriButton = (Button) rootView.findViewById(R.id.secondAttractionButton_id);
        thusharagiriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getActivity(), ThusharagiriActivity.class);
                startActivity(i);
            }
        });

        Button planetariumButton = (Button) rootView.findViewById(R.id.thirdAttractionButton_id);
        planetariumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getActivity(), PlanetariumActivity.class);
                startActivity(i);
            }
        });

        Button peruvannamozhiDamButton = (Button) rootView.findViewById(R.id.fourthAttractionButton_id);
        peruvannamozhiDamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getActivity(), PeruvannamozhiDamActivity.class);
                startActivity(i);
            }
        });
        return rootView;
    }

}
