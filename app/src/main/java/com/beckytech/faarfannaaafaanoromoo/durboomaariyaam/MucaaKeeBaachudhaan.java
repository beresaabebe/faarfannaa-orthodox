package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MucaaKeeBaachudhaan extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yeroo tokko dugdaa keetii yeroo tokko cinaacha keettii /2/\n" +
            "Mucaa kee baachudhaani /2/ baay’ee dadhabdee ati /4/\n\n" +
            "ምዕረ በዘባንኪ ወምዕረ በገቦኪ /2/\n" +
            "በሀዚለ ሕጻን/2/ እፎ ደከምኪ /4/\n";

    String title = "Mucaaa kee baachudhaan";

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