package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class EenyumtuuHinJiru extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Eenyumtuu hin jiru kan akka kee(2)\n" +
            "Hundumtuu ni ilaalaa garakee(2)\n" +
            "ወመኑ መሐሪ ዘከማከ /2/\n" +
            "ወኲሉ ይሴፎ ኪያከ /4/\n";

    String title = "Eenyumtuu Hin Jiru (ወመኑ መሐሪ ዘከማከ)";

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