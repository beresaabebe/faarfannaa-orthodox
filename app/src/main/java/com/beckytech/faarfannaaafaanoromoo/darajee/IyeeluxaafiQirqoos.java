package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IyeeluxaafiQirqoos extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Iyyeluuxaaf Qirqoos(2*)\n" +
            "Gaabri'eel ergamee du'arra fayyiise.\n" +
            "\n\n" +
            "Amantiidhani - Mucaan waggaa sadii-- afaansaa saaqqatee\n" +
            "      >> - Waa'ee Waaqasaa-- mootiitti dubbatee\n" +
            "      >> - Waaqni Daani'eel-- har'aas jira innoo\n" +
            "      >> - Dabarsee nu hin laatuu-- nu fayyiisa kunoo.\n" +
            "\n\n" +
            "Amantiidhani - Waa'ee Waaqa keenyaa-- jabeessinee beekna\n" +
            "     >> - Waaqa tolfaamadhaf-- akkamiin sagannaa\n" +
            "     >> - Jabaadhuuu harmeekoo-- tasa hin raafamiinii\n" +
            "     >> - Ergamaasaa ergee-- nu baasa Gooftaani.\n" +
            "\n\n" +
            "Amantiidhani - Aniis hin raafamuu-- Amma jabaadheera\n" +
            "     >> - Quxusuukoo aangafaa-- Gooftaan naaf godheera\n" +
            "     >> - Ijoollee sadanii-- Waaqni abiddaa baasee\n" +
            "     >> - Gaabri'eel nuuf ergee-- nu oolcha jabessee.\n" +
            "\n\n" +
            "Amantiidhani - Danfatti darbamnee-- qabbana nuuf ta'e\n" +
            "     >> - Otuu nu hin gubini-- Gaabri'eel nuuf ga'e\n" +
            "     >> - Iyyeluuxaaf Qirqoos-- galata galchaani\n" +
            "     >> - Gooftaa hundaa caaltuu-- galatoom jedhaani.";

    String title = "Iyeeluxaafi Qirqoos";

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