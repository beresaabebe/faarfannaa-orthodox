package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class EegaaAfoomiyaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Eegaa  Afoomiyaa eegaa Daani’eel\n" +
            "Geggeessaa kan turtee saba israa’eel\n" +
            "Maqaa kee waamaannaa koottu Mikaa'eel(2)                  \n\n" +
            "Koottu mikaa’eel akka Afoomiyaa\t             \n" +
            "      \"                 gara keenya koottu\t\n" +
            "              “          Diinni ni qana’aa               \n" +
            "                “         yommuu ati dhuftuu\n\n" +
            "Koottu mikaa’eel maqaa kee wamaannaa\n" +
            "              “                  koottu gara keenyaa\n" +
            "              “                mika’eel mikaa’el \n" +
            "              “               ergaama nageenyaa           \n        \n" +
            "Koottu Mikaa'eel akkuma daani’eel                 \n" +
            "              “                 koottu nuu baafadhu                   \n" +
            "            “                  nuti dhiphaneeraa                   \n" +
            "            “                  Maaloo nu milladhuu\n\n" +
            "Koottu mikaa’el  kabajni Aangoo kee \n" +
            "                “                  Hundumarra caalaa\n" +
            "               “                  Kanaaf si faarsinaa\n" +
            "                 “                Eega amanamaa   \n";

    String title = "Eegaa Afoomiyaa";

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