package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HunduuKanDarbuu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Hunduu kan darbuu kan darbuu jireenyis qabeenyis kan darbuu /2/\n" +
            "Yaa Gooftaa nu eegi /2/ akka nu argineef duuni lubbuu /2/\n\n" +
            "ኩሉ ከንቱ ከንቱ ንብረቱ እስመ ኩሉ ኃላፊ ውእቱ/2/\n" +
            "መድኃኒዓለም/2/ አድኅነነ/2/ እሞተ ከንቱ/2\n";

    String title = " Hunduu kan darbuu kan darbuu jireenyis ";

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