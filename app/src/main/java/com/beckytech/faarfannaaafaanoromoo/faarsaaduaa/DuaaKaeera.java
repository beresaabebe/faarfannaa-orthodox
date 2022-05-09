package com.beckytech.faarfannaaafaanoromoo.faarsaaduaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DuaaKaeera extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Du'aa ka'eeraa ilmi maariyaamii\n" +
            "Du'aas mo'eera ilmi maariyaamii\n" +
            "Galataan bahee  gara  Aariyaamii\n" +
            "……………………..\n" +
            "Bannee kufneera yeroo jennetti\n" +
            "Abdii dhabeesa yeroo taneetti\n" +
            "Abdii nuuf ta'ee bakka hundumatti\n" +
            "…………………….\n" +
            "Gidiraa hedduun irraatti raawwatee\n" +
            "Kanaa hundumaa waa'ee koofi baatee\n" +
            "Gennaati galuunis carraa koo taatee\n" +
            "…………………..\n" +
            "Waadaa nuuf galee hunda rawwaatee\n" +
            "Fannoo jiidhaas Gooftaan ni baatee\n" +
            "Uffaata dhiigaan badee uffaatee\n" +
            "………………….\n" +
            "Waan hunda gochuu osoo danda'uu\n" +
            "Balleesaa keenyaaf kufee yoo ka'uu\n" +
            "Kansaa taneeraa hunduu haa dhaga'uu\n" +
            "………………………..\n" +
            "Eenyuut raawwatee isaa kana hunda\n" +
            "Jaalali abbaa koo hundumarraa adda\n" +
            "Ameen fayyinee hunduu gammada\n";

    String title = "Du'aa ka'eeraa ilmi maariyaamii";

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