package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IshooIshooNuuDhalatee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ishoo ishoo nuu dhalatee(2)\n" +
            "Samii samiiwwanirraa ni bu’e\n" +
            "Dubroo maaramiirraa nuuf dhalate\n" +
            "Osoo inni hin dhalanne………….ishoo gammanne\n" +
            "Arjaan waaqni keenyaa  …..\n" +
            "Yoom argamti turte………..\n" +
            "Jannanni jireenyaa……..\n\n" +
            "Ifni baheerafi…..ishoo gammanne\n" +
            "Sabasaa hundumaaf…\n" +
            "Akka hin nuffisiifnef…….\n" +
            "Gooftan nidhalatee…..\n" +
            "Dubroo maamiirraa……\n" +
            "Sabasaa fayyisuuf…………\n" +
            "Hidhaa seexanaarraa……\n" +
            "Waaqayyo abbaan ergee…..\n" +
            "Tokkicha ilmasaa…..\n" +
            "Inni jaalateera……….\n" +
            "Addunyaa bilisaan……..ey\n";

    String title = "Ishoo ishoo nuu dhalatee";

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