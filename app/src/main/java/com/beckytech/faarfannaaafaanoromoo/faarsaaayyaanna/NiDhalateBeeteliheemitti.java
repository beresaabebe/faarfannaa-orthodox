package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NiDhalateBeeteliheemitti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ni dhalate beeteliheemitti\n" +
            "Ni dhalate biyya israelitti\n" +
            "Qorrichi addunyaa goofta iyyasuus\n" +
            "Ni dhalate beeteliheemitti\n\n" +
            "Ni dhalate   yeroonis waan ga'ef\n" +
            ">>        raajjiin dubbatame\n" +
            ">>        dukkana balleesuuf\n" +
            ">>        iffa isaa nu ibsuuf\n\n" +
            ">>        dubree maariyaamira\n" +
            ">>         sanyi addaam ta'e\n" +
            ">>         gooftaan amanu'eel\n" +
            ">>         foon keenya uffate\n\n" +
            ">>          dallaa keessa ciise\n" +
            ">>          moofadhaan marame\n" +
            ">>          qorichi addunyaa\n" +
            ">>          mootichi moototaa\n\n" +
            ">>         ifatu muul'ate\n" +
            ">>         araaratu bu'e\n" +
            ">>         adunyaa hundaafi\n" +
            ">>         nagaatu laatame ";

    String title = "Ni Dhalate Beeteliheemitti";

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