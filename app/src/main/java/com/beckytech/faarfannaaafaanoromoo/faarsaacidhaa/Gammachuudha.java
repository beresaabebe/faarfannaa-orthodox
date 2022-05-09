package com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Gammachuudha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Gammachuudha (3x) kan amantii keenyaa\n" +
            "Kan Ortoodoksi Tawaahidoo kan misirroo kan gaa,ila keenyaa\n" +
            "Ni raawwatee (3x) har’a ciidhi keenyaa\n" +
            "Galanni haa ta’uuf ittiin jennaa (2x)\n" +
            "Arjaa Waaqa keenyaa\n";

    String title = "Gammachuudha kan amantii keenyaa";

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