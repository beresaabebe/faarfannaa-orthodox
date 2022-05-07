package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DhaadannooKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Dhaadannoonkoo si'i yeroo hundaa\n" +
            "Naaf baasteetta beenyaa hundaa\n" +
            "Iyyesuus fayyisaa lubbuukoo\n" +
            "Dhiignikee balleesse abaarsakoo\n" +
            "      Ceesisa\n" +
            "Mootummaan samiirraa Kan ittiin dhaalamu\n" +
            "Boqonnaa haaraatti Kan ittiin ce'amu\n" +
            "Fooniif dhiigakeetu anaaf galaa ta'e\n" +
            "Abaarsi dhalootaa isaan qulqullaa'e\n" +
            "   Ceesisa\n" +
            "Afuurakeet jira keessa qaamakootii\n" +
            "Kanan siin walbare iyyaafannoon miti\n" +
            "Dhahannaan onneekoo si'iin to'atama\n" +
            "Waan hundumaa dhiisee siifan amanama\n" +
            "     Ceesisa\n" +
            "Calaqqisa musee ilaaluun hafeera\n" +
            "Handaqiin dukkanaa karaakee ifeera\n" +
            "Diinni kan facaase summii keessakootti\n" +
            "Nafayyiste Gooftaa olbaatee fannootti\n" +
            "    Ceesisa\n" +
            "Dhiigni abeeliidhaa inni dhangala'e\n" +
            "Har'as ni iyyata dhiibbaa irra ga'e\n" +
            "Ya iyyesuus kankee dhiifama dubbata\n" +
            "Fayisaa lubbuukoo hoo fudhu Galata\n";

    String title = "Dhaadannoo koo";

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