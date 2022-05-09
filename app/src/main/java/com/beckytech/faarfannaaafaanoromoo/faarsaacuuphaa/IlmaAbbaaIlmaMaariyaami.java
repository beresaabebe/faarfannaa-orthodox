package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IlmaAbbaaIlmaMaariyaami extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yoordaanositti kan cuuphame \n" +
            "Ilma abba Ilma Maariyaami\n" +
            "Yohaannisiin inni cuuphame \n" +
            "Ilma abba Ilma Maariyaami\n" +
            "\n\n" +
            "Mootichi nageenya jabinni addunyaa\n" +
            "Cuuphamuudhaaf jedhee dachiin ni dhiphatte\n" +
            "Yoordaanos sodaatte abiddaan guutamte\n" +
            "Uumaan ifa hundaa isheedhaaf mul'ate\n" +
            "\n\n" +
            "Dhuguma dubbate daawit raajiisaani\n" +
            "Ragaa nuuf ta'uufi yaadanno cuuphaani\n" +
            "Tulloonni gaaronni baayee gammadani\n" +
            "Akka waatiif jabbi ta'uu barbaadanii\n" +
            "\n\n" +
            "iccitiin dhagahame duumessa keessaanii\n" +
            "Waa'ee ilma tokkichaa dhugaa bahe abbaani\n" +
            "Bifa gugeen bu'ee afuurri qulqulluu\n" +
            "Hamma baraabaraatti jiraata baraani\n" +
            "\n\n" +
            "Harka yohaannisitti gooftaan nii cuuphamee\n" +
            "Mucummaa nuuf kennee yakki keenya haqamee\n" +
            "Maal akkamiin jiraa kasoominni kuni\n" +
            "Gammachuun dhagahame cuuphamu gooftaani\n\"" +
            "\n\n"+
            "Cuuphaasaan ifa haa bahu uffanni ogummaasaa\n" +
            "Taabota marsinee ni deemna ayyaanasaa\n" +
            "Dachiin qulqullooftee seexanni haa leeyyaatu\n" +
            "Sabni Itoophiyaa waaqa haa faarfatu\n";

    String title = "Ilma Abbaa Ilma Maariyaami";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbaaf_ilma);

        initUI(title);

        MobileAds.initialize(this, initializationStatus -> {
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textTitle = findViewById(R.id.textTitle);
        textTitle.setText(title);

        textContent = findViewById(R.id.textview);
        textContent.setText(content);

    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}