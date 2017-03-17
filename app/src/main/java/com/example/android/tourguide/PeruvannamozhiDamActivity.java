package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PeruvannamozhiDamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<ContentClass> datas = new ArrayList<ContentClass>();
        String text1 = "    Kuttiady Peruvannamuzhi Dam is one of the most beautiful dams in Kerala. Being situated in a small village, its beauty gets added up. It is approximately 60 km from Kozhikode. You could reach by a two-hour journey. It is situated in the north- East direction of Calicut city. There are many private bus services to this place. There is an artificial lake in Peruvannamuzhi. You can enjoy boating in Peruvannamuzhi artificial lake. While riding through the artificial lake, there you can see 'Smaraka Thottam', a garden made in the memory of great leaders of freedom struggle. The garden also offers a great enjoyment to you. It also gives you happiness, joy and refreshment.";
        text1+="There is also a crocodile farm and a bird sanctuary situated here at Peruvannamuzhi. There are more than twenty crocodiles here in different pools. The bird sanctuary also offers you with birds of varieties more than 90 species. The Peacocks of Peruvannamuzhi is famous. But it is now considered as vulnerable species. The Peruvannamuzhi dam belongs to the Kuttiady irrigation project. The water stored here is used for the production of electricity as well as for irrigation. This Peruvannamuzhi Dam is used for providing water to three main districts- Kozhikode, Malapuram and Kannur.";
        datas.add(new ContentClass(text1, R.drawable.dam));
        String text2 = "    Peruvannamuzhi Dam also serves water for the famous Japan Govt. Aided Drinking Water Project. Long tunnels runs from here for the purpose of provide drinking water to secluded villages of Kozhikode district.";
        text2+="There is also an institution running here Indian Institution for Spice Research. They were responsible for the production of varies varieties of seeds and saplings here. Kuttiady Agricultural farm is also located at Peruvannamuzhi. The tourists can also visit one of the old churches of Kozhikode district, Fathima Matha Catholic Church. The headquarters of Shalom, a popular television channel is also located at Peruvannamuzhi. Location of Peruvannamuzhi Dam-The Peruvannamuzhi Dam is 60 km from the Kozhikode city. You could reach here by private bus or by taxi.";
        datas.add(new ContentClass(text2, R.drawable.dammm));

        ContentAdapter adapter = new ContentAdapter(this, datas);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
