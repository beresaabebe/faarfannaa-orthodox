package com.beckytech.faarfannaaafaanoromoo.faarsaaduaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IsinGaruuTuraa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Isin garuu turaa biyya Iyyarusaleem keessa /2/\n" +
            "Hanga argatanitti humna samirra /4/Eyyee\n\n" +
            "አንትሙሰ ንበሩ ሀገረ ኢየሩሳሌም /2/\n" +
            "እስከትለብሱ ኃይለ እምአርያም /4/ኧኸ\n";

    String title = "Isin Garuu Turaa";

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