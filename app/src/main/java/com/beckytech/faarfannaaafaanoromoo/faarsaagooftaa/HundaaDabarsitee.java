package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HundaaDabarsitee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Hundaa dabarsitee Kan yoonan nu geessee (2)\n" +
            "Galanni siif haa ta’uu ulfaadhu sillaasee (2)\n" +
            "Abrahaamif Kan laattee amantii ishee duraa\n" +
            "Iyyoobif Kan laattee obsa kee isa gaarii\n" +
            "Si wajjiin adeemnaa ati nu gargaarii (2)\n";

    String title = " Hundaa dabarsitee Kan yoonan nu geessee ";

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