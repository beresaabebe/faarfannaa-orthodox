package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AtiAtiBeteliheem extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ati ati Beteliheem lafa Yihudaa\n" +
            "Sirraatii dhalatee fayyisaan addunyaa\n\n" +
            "Ulfina Addaamiifi   Beteliheemii\n" +
            "Nagaa hundumaafi          \"\n" +
            "Har’a ni dhalate               \"\n" +
            "Dubroo Maariyamiirraa    \"\n\n" +
            "Harka fuudhii kennan     Beteliheemii\n" +
            "Moototni Bahaa                    \"\n" +
            "Dallaa Horii keessatti            \"\n" +
            "Achitti arganii                       \"\n\n" +
            "Saba kee Israa’eel  Beteliheemii\n" +
            "Kan isaan eegu            \"\n" +
            "Sirraa baha jedhanii     \"\n" +
            "Akka dubbatan          \"\n";

    String title = "Ati ati Beteliheem lafa Yihudaa";

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