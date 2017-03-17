package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        String text = " Kozhikode, also known as Calicut, is a city in the state of Kerala in southern India on the Malabar Coast. Kozhikode is the largest urban area in the state and 195th largest urban area in the world. During classical antiquity and the Middle Ages, Kozhikode was dubbed the \"City of Spices\" for its role as the major trading point of eastern spices.[10] It was the capital of an independent kingdom ruled by the Samoothiris (Zamorins) in the Middle Ages and later of the erstwhile Malabar District under British rule. Arab merchants traded with the region as early as 7th century, and Portuguese explorer Vasco da Gama landed at Kozhikode on 20 May 1498, thus opening a trade route between Europe and Malabar. A Portuguese factory and fort was intact in Kozhikode for short period (1511–1525, until the Fall of Calicut), the English landed in 1615 (constructing a trading post in 1665), followed by the French (1698) and the Dutch (1752). In 1765, Mysore captured Kozhikode as part of its occupation of the Malabar Coast. Kozhikode, once a famous cotton-weaving centre, gave its name to the Calico cloth. On 7 June 2012, Kozhikode was given the tag of \"City of Sculptures\" (Shilpa Nagaram) because of the architectural sculptures located in various parts of the city.";
        TextView textView = (TextView) findViewById(R.id.introTextId);
        textView.setText(text);

    }
}
