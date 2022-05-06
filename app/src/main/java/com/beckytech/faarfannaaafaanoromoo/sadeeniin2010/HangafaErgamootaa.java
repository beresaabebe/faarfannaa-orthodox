package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HangafaErgamootaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Angafaa Ergamoota ergamicha rsamaa(2)\n" +
            "Gabri’eel eegaa koo maqaa kee nan wamaa                        \n\n" +
            "Hangafaa Ergamoota ijoolee sadanii                        \n" +
            "             “                       Abiddaa kan baaste                         \n" +
            "              “                     nutis sii waammannaa                            \n" +
            "             “                      har’as yoom nu gatte\n\n" +
            "Hngafaa Ergamoota iyyeluxaaf qirqoosii\n" +
            "            “                         daftee kan qaqabdee\n" +
            "           “                        abiddicha jalaa\n" +
            "          “                        isaaniin ni baaste    \n          \n" +
            "Hangafaa Ergamoota abiddichii kalee                      \n" +
            "        “                    har’as baayyateera                 \n" +
            "         “                    Gabri’eel nuuf koottu                    \n" +
            "          “                  maqaa kee waameera\n";

    String title = "Hangafa Ergamootaa";

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