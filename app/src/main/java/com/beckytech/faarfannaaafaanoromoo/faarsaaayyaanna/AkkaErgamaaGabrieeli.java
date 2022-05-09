package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AkkaErgamaaGabrieeli extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Akka ergamaa gabri’eelii \n" +
            "Nagaa sigaafanna giitii keenya(2)\n" +
            "Inni ati nuuf deesse fayyisankeenya \n" +
            "Addunyaa hundumaaf ta’e beenya(2)\n" +
            "Maariyaam(2)yammuu jennu (2)\n" +
            "Warri sijaalatan siin gammadu \n" +
            "Warri situffatan sitti gaddu \n" +
            "Warra sijaalannuuf nuuf kadhadhu\n";

    String title = "Akka ergamaa gabri’eelii";

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