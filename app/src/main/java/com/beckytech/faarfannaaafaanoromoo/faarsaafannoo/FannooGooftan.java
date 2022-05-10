package com.beckytech.faarfannaaafaanoromoo.faarsaafannoo;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FannooGooftan extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Fannoo Goofta ifaa argannee\n" +
            "Jaalala isaan bilisoomne\n" +
            "Giddiraa keenyaa irranfanne\n\n" +
            "Fannoon human keenya ta’uu isaa huubane\n" +
            "Qaraniyyoo irraatti bilisuma argaane\n" +
            "Jaalali ijooleessa Goofta injifatteerra\n" +
            "Saanyii Adam huundi ifaati baherra\n\n" +
            "Dhuugaadhaf Amantin oonerra yoo ta’ee\n" +
            "Gidiraaf dhiiphin hamama osoo gaahe\n" +
            "Hara galiif keenya fannoo Iyyassusin\n" +
            "Duwwadha mannii isaa kan Goofta hin qabnesi\n\n" +
            "Bolla fannoo Goofta illenin argaattee\n" +
            "Iccitti fannoon isaa isheetin mul’ate\n" +
            "Dinnoota ishee gante amantan dhabbate\n" +
            "Fannoo Iyyasuusin booqonna argaatte\n\n" +
            "Du’aa kan nuu kaasee fannoodha Gooftan\n" +
            "Moorman dinna keenya hundumtu baddanii\n" +
            "Humna arganneerra fannoo kiristoosin\n" +
            "Isaan injifanna dinnaa dabiloosi\n";

    String title = " Fannoo Goofta ifaa argannee ";

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