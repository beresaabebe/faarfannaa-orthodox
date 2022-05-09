package com.beckytech.faarfannaaafaanoromoo.faarsaaduaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KiristoosKaeera extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kiristoos ka’eera du’aatii\n" +
            "Humnaa fi aangoo guddaanii\n" +
            "Seexana hidhee bilisa baase Addaaminii\n" +
            "Nagaani (3×)kana booda haa ta’u nagaanii\n";

    String title = "Kiristoos ka’eera du’aatii";

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