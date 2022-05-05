package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class JawwichiNaNyaachuuf extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Siin waamaa dhaga'ii \n" +
            "Dafii na bira ga'ii \n" +
            "Jawwichi na nyaachuuf \n" +
            "Daandii na kaahisuuf. \n\n" +
            "Xaxee diinnii karaa koo\n" +
            "Boolla qotee durakoo \n" +
            "Na hambisuuf karaatti \n" +
            "Naan kaachisuuf waaqarrati.\n\n" +
            "Har'aas kottuu Giyoorgis \n" +
            "Ati kan Moore Dudiyanoos \n" +
            "Kan barsiistee Soosinnas\n" +
            "Waaqa waliin na araarsi \n\n" +
            "Biriktaayit kan baastee\n" +
            "Giyoorgis argamtee\n" +
            "Nas oolchitee nyaatamuu koo\n" +
            "Galatoomi Abbaa koo \n\n" +
            "Ati waaqayyoof jettee \n" +
            "Addunyaatti dhugaa baatee\n" +
            "Ni dhabdee simannaa \n" +
            "Waan mormiteef seexanaa. \n\n" +
            "Soosinnaa kan barsiiste\n" +
            "Diinaa harkaa ishee baastee\n" +
            "Waaqa ishee amantee \n" +
            "Wareegummaa fudhattee. \n";

    String title = "Jawwichi na nyaachuuf";

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