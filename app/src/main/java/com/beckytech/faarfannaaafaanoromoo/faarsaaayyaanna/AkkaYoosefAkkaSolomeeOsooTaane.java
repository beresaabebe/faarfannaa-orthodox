package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AkkaYoosefAkkaSolomeeOsooTaane extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Akka yoosef akka solomee osoo taane(2)\n" +
            "Iyyarusaalemi(3)jiraannee dhalachuu gooftaa argine(2)\n" +
            "Akka tiksootaa akka hayyota osoo taane(2)\n" +
            "Iyyarusaalemi(3)jiraannee dhalachuu gooftaa argine(2)\n";

    String title = "Akka yoosef akka solomee osoo taane";

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