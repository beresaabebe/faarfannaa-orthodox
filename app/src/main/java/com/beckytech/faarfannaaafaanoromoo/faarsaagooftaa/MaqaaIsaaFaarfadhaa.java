package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MaqaaIsaaFaarfadhaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maqaa isaa faarfadhaa /2/ galata dhiyeessaa Gooftummaa isaatiif /2/\n" +
            "Waaqayyo keenyaan /2/ gochi kee guddaadha jedhaa /2/\n\n" +
            "ወዘምሩ ለስሙ/2/ ሀቡ አኰቴተ ለስብሐቲሁ/2/\n" +
            "በልዎ ለእግዚአብሔር ግሩም ግብርከ/2/ \n";

    String title = " Maqaa isaa faarfadhaa ";

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