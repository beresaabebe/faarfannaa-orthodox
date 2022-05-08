package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MuseenKanArgee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Museen kan arge /2/ Gaara Siinarratti /2/\n" +
            "Biqiltu lalistudha ati /4/\n\n" +
            "ሙሴ ዘርእየ/2/በደብረ ሲና/2/\n" +
            "ሐመልማላዊት እጽ ሐመልማላዊት/4/\n";

    String title = "Museen kan argee";

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