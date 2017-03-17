package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
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


        ContentAdapter adapter = new ContentAdapter(getActivity(), datas);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
