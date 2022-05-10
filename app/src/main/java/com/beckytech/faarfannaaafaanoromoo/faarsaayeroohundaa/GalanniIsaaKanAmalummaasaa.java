package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GalanniIsaaKanAmalummaasaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galanni isaa kan amalummaasaa (x2)\n" +
            "Eenyutu hir'isaa guutummaasaa (x2)\n\n" +
            "Yoo iliilchinee yoo faarfaannee\n" +
            "Amantaadhaan yoo cimnee dhabbannee\n" +
            "Seerota hundaas yoo raawwannee\n" +
            "Hundaasaatiif ofiif kabajamnee (x2)\n\n" +
            "Baabiloon gamoo hammenyaa ijaartus\n" +
            "Siin morkachuudhaaf baay'ee dhamaatus\n" +
            "Ofumasheetiif kuftee salphattee\n" +
            "Ati yoomuu kunoo ni kabajamtee(x2)\n\n" +
            "Warreen humna isaanitti abdatani\n" +
            "Waaqummaa kee kanneen dagatani\n" +
            "Akka gooliyaad kufanii hafani\n" +
            "Kan si waliini kunoo mo'anii (x2)\n";

    String title = "Galanni isaa kan amalummaasaa";

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