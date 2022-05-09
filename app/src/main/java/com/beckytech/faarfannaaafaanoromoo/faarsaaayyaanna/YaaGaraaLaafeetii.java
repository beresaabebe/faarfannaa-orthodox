package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaGaraaLaafeetii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa garaa laafeetii kan nama hundaa jaalattu /2/\n" +
            "Yeroo hunduma /3/ fakkaati /2/ biiftu kan ganama /2/\n\n" +
            "ኦ ርኀርኀተ ህሊና አፈቅሮተ ሰብእ ልማዳ /2/\n" +
            "ለእለጌሰሙ/4/ትመስል/3/ እንግዳ /2/\n";

    String title = "Yaa Garaa Laafeetii ኦ ርኀርኀተ ህሊና";

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