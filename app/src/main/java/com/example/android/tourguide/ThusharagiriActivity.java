package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ThusharagiriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<ContentClass> datas = new ArrayList<ContentClass>();
        String text1 =" Thusharagiri Falls is a waterfall in Chembukadavu Thusharagiri offers endless scope for trekking, rock climbing and wildlife sanctuary visits. It is around 50 kilometres (31 mi) from Kozhikode. The nearest town Kodencherry is around 11 kilometres (6.8 mi) from Thusharagiri. The other main towns situated here are Thiruvambady and Thamarassery.";
        datas.add(new ContentClass(text1, R.drawable.thusharagiri));
        String text2 =" Thusharagiri offers endless scope for trekking, rock climbing and wild life sanctuary visits. It is around 50 kilometres (31 mi) from Kozhikode. The nearest town Kodancherry is around 11 kilometres (6.8 mi) from Thusharagiri. The other main towns situated here are Thiruvambady which is 18 km away and Thamarassery which is 17 km away. One has to purchase all necessary things for trekking from here.";
        datas.add(new ContentClass(text2));

        ContentAdapter adapter = new ContentAdapter(this, datas);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
