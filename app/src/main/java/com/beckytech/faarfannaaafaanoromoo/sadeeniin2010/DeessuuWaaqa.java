package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DeessuuWaaqa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Deessuu waaqa durbee bara baraa(2)\n" +
            "Ayyaana qabeetti yaa haadha araara (2x\n\n" +
            "Dunkaana Abraaham giiftii qulqulleetti    \n" +
            "Uumaama kam caalaa galanni kan keetti  \n" +
            "Gonfoo salamoon nagaa situ busee    \n" +
            "Kan ittin jiraanuu galaa situu kusee\n\n" +
            "Dubartoota keessaa ati kan filaatamtee\n" +
            "Haadha bara baras kanaaf kan jedhamte\n" +
            "Ilme kee hin argadhu karaa keetin malee\n" +
            "Kanaafan sii faarsaa mana keetti galee  \n\n" +
            "Dumeessa Eeliyaas ati naf dhagahii  \n" +
            "Kadhannaa koo fudhi Gooftaa biran gahi \n" +
            "Araarsummaa keetin dhaabbadhuu nu gidduu \n" +
            "Situ nuuf owwaataa nama jalaa diduu\n\n" +
            "Fannoo Ilma kee keetti jala jilbifatte\n" +
            "Imimmaan lolaaste gaafa gidiraamtee\n" +
            "Haadha akka taatuf nufiis nuuf kennaamte\n" +
            "Dhala Addaam hundaaf haadhumman dhaabbatte \n\n" +
            "Daandii badii irraa ofitti nuu qabi\n" +
            "Hin shakku haadha koo naaf ni taata wabii  \n" +
            "Cubbamaaf kadhachuu yoomiyyuu hin dadhabdu  \n" +
            "Kennaan kan guutamtee muuda tokko hin qabdu    \n";

    String title = "Deessuu waaqa";

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