package com.beckytech.faarfannaaafaanoromoo.faarsaaQulqulloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KanIsaRukkutaniif extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kan isa rukkutaniif kadhate Isxiifaanoos Qulqulluni /2/\n" +
            "Gooftaa dhiisiif cubbuu isaanii Jechuudhaani /4/\n\n" +
            "ሰአለ ሥርየተ ኃጢአት ለእለ ወገርዎ/2/\n" +
            "ወይቤ ሥረይሎሙ ዘንተ ኃጢአቶሙ/4/\n";

    String title = "Kan isa rukkutaniif kadhate Isxiifaanoos Qulqulluni";

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