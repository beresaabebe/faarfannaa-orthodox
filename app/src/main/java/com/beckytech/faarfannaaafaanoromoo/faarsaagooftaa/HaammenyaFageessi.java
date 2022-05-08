package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HaammenyaFageessi extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Haammenya fageessi /2/ nu irraa\n" +
            "Dhiifama nuufgodhi /3/ qulqullu abbaa keenya\n" +
            "Iyyesuus kiristoos /2/ mootii mootota\n" +
            "Yeroo rakkoo keenyaa yeroo dhiphinafi yeroo qoruumsatii\n" +
            "Kadhaa keenya dhagayi\n";

    String title = " Haammenya fageessi nu irraa ";

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