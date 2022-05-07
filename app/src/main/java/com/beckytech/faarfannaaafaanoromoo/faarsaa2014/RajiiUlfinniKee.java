package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class RajiiUlfinniKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Raaji ulfinni kee \n" +
            "Humni waaqayyo si golboobe\n" +
            "Dhugaadha ergamoonni sitti marsanii \n" +
            "\n\n" +
            "Yaa miidhagduu akka aduu \n" +
            "Anoo siqabaa homaa hin barbaaduu\n" +
            "Hunduu yeroofi qabeenyi addunyaa\n" +
            "Jaalalli kee haa mo'u maariyaam laphee keenya \n" +
            "\n\n" +
            "Siinan jedhaa qulqulleettii \n" +
            "An jaalala keen booji'ameeti\n" +
            "Osoo eeganii baay'een baduukoo\n" +
            "Na gorfatteettaa nawaamte haadhakoo \n" +
            "\n\n" +
            "Balbalitti ishee cufamtuu \n" +
            "Jedhee dubbataa raajicha hisqeeltu\n" +
            "Waaqni itti seenee ittiin baheera\n" +
            "Gonka itti hin seenne namni kan biraa \n" +
            "\n\n" +
            "Yaa fakkaattuu ulee leemmanii\n" +
            "Abdii hin qabu an sidhiisnaani\n" +
            "Kennaa ebbaati at badhaasa addaa\n" +
            "Gonka si hin dhiisu Maariyaam sin jaalladhaa \n" +
            "\n\n" +
            "Menkire girmaa hayle li'uuli tsellelaa/2/\n" +
            "Amaani melaa'ikti yikelleliwwa /4/\n";

    String title = "Raajii ulfinni kee";

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