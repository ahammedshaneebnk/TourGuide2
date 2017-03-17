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


public class TransportationFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<ContentClass> datas = new ArrayList<ContentClass>();
        String text1 = "INTERNATIONAL AIRPORT";
        datas.add(new ContentClass(text1));
        String text2 = "Calicut International Airport is 26 kilometres (16 mi) from the city at Karipur . Regular domestic services are operated to major Indian cities. There are frequent international flights to the Middle eastern air hubs like Dubai, Abu Dhabi, Salalah, Muscat, Dammam, Riyadh, Jeddah, Sharjah, Bahrain, Doha and to domestic hubs Chennai, Bangalore, Mumbai and New Delhi.";
        datas.add(new ContentClass(text2, R.drawable.airport));
        String text3 = "RAILWAY STATION";
        datas.add(new ContentClass(text3));
        String text4 = "Kozhikode railway station is the only A1 railway station in Palakkad railway division and it is situated in the Shoranur-Mangalore section. Today, Kozhikode is well connected by rail to cities like Thiruvananthapuram, Kochi, Kannur, Mangalore, Kollam, Palakkad, Coimbatore, Katpadi, Vellore, Chennai, Bangalore, Mumbai, New Delhi, Vijayawada, Visakhapatnam, and Hyderabad.";
        datas.add(new ContentClass(text4, R.drawable.railway));
        String text5 = "KSRTC BUS STATION";
        datas.add(new ContentClass(text5));
        String text6 = "City buses are painted green. Kerala State Road Transport Corporation (KSRTC) runs regular services to many destinations in the state and to the neighbouring states. The city has three bus stands. All private buses to the suburban and nearby towns ply from the Palayam Bus Stand. Private buses to adjoining districts start from the Mofussil Bus Stand (also called New Bus Stand, one of the largest bus stands in Kerala) on Indira Gandhi Road (Mavoor Road). Buses operated by the KSRTC drive from the KSRTC bus stand on Indira Gandhi Road. KSRTC Bus Stand Kozhikode is the biggest bus stand in Kerala having a size of 36,036.47-meter square. There are also KSRTC depots in Thamarassery, Thottilpalam, Thiruvambady and Vatakara in the district.";
        datas.add(new ContentClass(text6, R.drawable.ksrtc));


        ContentAdapter adapter = new ContentAdapter(getActivity(), datas);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
