package com.beckytech.faarfannaaafaanoromoo.faarsaaQulqulloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class QulqulloonniHinduunu  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Qulqulloonni hunduunu  gara waaqayyoo deemanii /2/\n" +
            "Biyya samii irrattii /4/ argachuufi waan fedhani /2/\n\n" +
            "ጻድቃንሰ ኢሞቱ ሀበ እግዚኦሙ ነገዱ /2/\n" +
            "በመንግስተ ሰማይ/4/ይሁቦሙ ዘፈቀዱ /2/\n";

    String title = "Qulqulloonni hunduunu  gara waaqayyoo deemanii";

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