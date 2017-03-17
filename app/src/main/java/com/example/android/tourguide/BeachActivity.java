package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<ContentClass> datas = new ArrayList<ContentClass>();
        String text1 = "    The beach is the most popular retreat for locals. In spite of beautification works and lax coastal management, it remains unexploited and visually pleasing. This shore has been a witness to many historic events, including pitched naval battles and the arrival of ships from distant lands. Uddanda, a Sanskrit poet in Zamorin's court, wrote in his Kokila Sandeśa: \"The ocean, the father of the goddess of riches [Indira is a synonym of Lakshmi] seeing that his daughter has settled down in Kukkatakroda [Sanskrit for Kozhikode], is embracing the place, presenting it with shipful of jewels\".[1] Several national leaders like Mahatma Gandhi, Khan Abdul Ghaffar Khan, Indira Gandhi and Krishna Menon have addressed people here. The 'Beach Road' was renamed Gandhi Road from Evan's Road after Mahatma Gandhi's visit in January 1934. Two dilapidated piers can be seen extending into the sea. The 'Iron Screw-pile' pier to the north was built in 1871, 400 ft long (120 m) with a 'T' end. Numerous cranes on these piers once loaded spices and other goods destined to foreign ports like Aden, Genoa, Oslo, London, Bremen, Hamburg, New York City etc.";
        datas.add(new ContentClass(text1, R.drawable.beachh));
        String text2 = "    Near the northern pier is a park maintained by the Lions club, a children's park, the lighthouse with a seafarer's memorial and a marine aquarium. Further north to the Lions' Park is a dirty fishing area where once was located a French loge with factories and French settlements. Near the south pier is a place called 'Horse's Jumping Point' where horses brought from Gujarat and Arabia were made to jump into the water, swim and would gallop along the shore and be displayed for sale. The beach offers a pleasant view at times of fishermen entering the sea with their tiny boats, fighting the waves and returning with their catch.";
        datas.add(new ContentClass(text2, R.drawable.beachhh));

        ContentAdapter adapter = new ContentAdapter(this, datas);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
