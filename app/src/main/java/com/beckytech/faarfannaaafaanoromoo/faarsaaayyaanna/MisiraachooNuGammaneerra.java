package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MisiraachooNuGammaneerra extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Misiraachoo nu gammaneerra(2)\n" +
            "Fayisaan addunyaa nuyiif dhalateera(2)\n\n" +
            "Misiraachoo nugammaneerraa(2)\n" +
            "Dhalachuu gooftadhaa arginee dhufneera(2)\n\n" +
            "Mootiin heeroods jedhe dhageenyanii(2)\n" +
            "Barbaadatii fidaa guyyaa fi halkanii(2)\n\n" +
            "Ogeessonni akka ajajamanii(2)\n" +
            "Urjiin durfamanii mucicha arganii(2)\n\n" +
            "Sagadaniif lafatti kufanii(2)\n" +
            "Warqee fi ixaana karbees kennanii(2)\n";

    String title = "Misiraachoo nu gammaneerra";

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