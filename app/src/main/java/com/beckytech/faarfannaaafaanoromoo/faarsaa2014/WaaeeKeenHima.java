package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WaaeeKeenHima extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Waa'ee keen hima \n" +
            "Gocha keen hima \n" +
            "Garrummaa keen hima\n\n" +
            "Yaa iyyesuus isa jaalatamaa\n" +
            "Amaanu'eel Fayyisaa ilmaan namaa\n\n" +
            "waa’ee sheen hima (3)\n" +
            "Maariyaamiin giiftii kabajamtu(2)\n\n" +
            "Raajiisaan hima (3)\n" +
            "Giyoorgisiin wareegama cimaa(2)\n";

    String title = "Waa'ee keen hima";

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