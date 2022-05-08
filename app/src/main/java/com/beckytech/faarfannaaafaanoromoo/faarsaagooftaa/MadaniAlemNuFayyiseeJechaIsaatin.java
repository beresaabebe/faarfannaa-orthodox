package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MadaniAlemNuFayyiseeJechaIsaatin  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Madani Alem nu Fayyisee jecha isaatin (2)\n" +
            "Ittiin haa gammannu(2) ilil jedhaa(2)  \n" +
            "Nu Fayyisee isaatini\n" +
            "Waaqayyoon\n" +
            "Waaqayyoon nu fayyisee jecha hin haqamneen\n";

    String title = " Haa galateeffanu Waaqayyoni ";

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