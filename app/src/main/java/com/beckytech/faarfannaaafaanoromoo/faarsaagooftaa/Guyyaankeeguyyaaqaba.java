package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Guyyaankeeguyyaaqaba  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Guyyaan kee guyyaa qaba an maafan ariifadhaa(2)\n" +
            "Kan na uumeetu si'i ani maafan dhiphaadha\n\n" +
            "Guyaan kee Guyyaaqaba Abdii koo tasaa kutuu\n" +
            "\"\"\"\"\"\"       Dhaabbadhees hin yaada'uu\n" +
            "\"\"\"\"\"\"       Rakkinni koo yeroodhaa\n" +
            "\"\"\"\"\"\"       Hin daangessuu gochaa kee\n\n" +
            "Guyyana kee Guyyaa qaba Hiriyoota koo keessaa\n" +
            "\"\"\"\"\"\"       Yeroof booddee hafullee\n" +
            "\"\"\"\"\"\"       Si qabadhee darbeeraa\n" +
            "\"\"\"\"\"\"       Dhiphuu keen boqodheeraa\n\n" +
            "Guyyana kee Guyyaa qaba olmaan kee anaaf addaa\n" +
            "\"\"\"\"\"\"Kanaaf diinni koo gaddaa\n" +
            "\"\"\"\"\"\"Siin gammadeen burraaqaa\n" +
            "\"\"\"\"\"\"Na gargaaruun kee haqaa\n\n" +
            "Guyyana kee Guyyaa qaba dhabbadhees fuula namaa\n" +
            "\"\"\"\"\"\"Hin arganneem akka kee\n" +
            "\"\"\"\"\"\"Ce'eera galaannichaa\n" +
            "\"\"\"\"\"\"Kan si qabuu moo'ichaa\n";

    String title = " Guyyaan kee guyyaa qaba an maafan ariifadhaa ";

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