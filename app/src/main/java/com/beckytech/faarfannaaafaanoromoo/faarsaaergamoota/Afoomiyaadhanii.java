package com.beckytech.faarfannaaafaanoromoo.faarsaaergamoota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Afoomiyaadhanii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Afoomuyaadhanii akkuma bastee nu baasii nu baasii\n" +
            "Nuunis nu baasi(4)nu baasii Harka daabiloosii\n\n" +
            "Garbummaa Sexanaarraa\n" +
            "Akka nuyiin bastuu suma qabanneerraa\n" +
            "Eyyee \n" +
            "Mika'el maaloo koottu(2)\n" +
            "Hundu si waammatuu\n" +
            "Daani'eelin baastee\n" +
            "Afaan leencaa cufteeAti taphachiistee\n" +
            "Eyyee \n" +
            "Mika'el maaloo koottu(2)\n" +
            "Hundu si waammatuu\n" +
            "Xalayaa du'a cirtee\n" +
            "Akka inniduuneef ati Wabii taatee\n" +
            "Eyyee\n" +
            "Maqaa Gargaara keenya(2)\n" +
            "Mika'el sin jennaa\n" +
            "Saba Israa’el baastee\n" +
            "Manna Samii bustee hunda kan nyaachistee\n" +
            "Eyyee\n" +
            "Maqaa Gargaara keenyaa(2)\n" +
            "Mikaa'eel siin jenna\n";

    String title = "Afoomuyaadhanii akkuma bastee";

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