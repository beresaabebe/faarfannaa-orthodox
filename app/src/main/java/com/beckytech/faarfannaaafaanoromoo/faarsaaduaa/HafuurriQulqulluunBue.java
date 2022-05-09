package com.beckytech.faarfannaaafaanoromoo.faarsaaduaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HafuurriQulqulluunBue extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Haafurri Qulqulluun ni bu’e duuka bu’oota irratti /2/\n" +
            "Fakkeessame /5/ labooba ibidaatiin /2/\n\n" +
            "መንፈስ ቅዱስ ወረደ ላዕለ ሐዋርያት /2/\n" +
            "ተመሲሎ/5/ በነደ እሳት /2/\n";

    String title = "Hafuurri Qulqulluun Bu’e";

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