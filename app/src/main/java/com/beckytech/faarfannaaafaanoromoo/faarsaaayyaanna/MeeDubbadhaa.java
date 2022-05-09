package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MeeDubbadhaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Mee dubbadhaa ajaa’ibasaa himaa yeroo hundaa(2)\n" +
            "Raajii isaa addunyaaf dubbadhaa(2)ajaa’ibasaa jajadhaa(2) \n\n" +
            " ተናገሩ ድንቅ ሥራውንም መሥክሩ/2/\n" +
            " ተአምሩን ለአዓም ንገሩ ×2  ድንቅ ሥራውን መሥክሩ /2/\n";

    String title = "Mee dubbadhaa ajaa’ibasaa ተናገሩ ድንቅ ሥራውንም";

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