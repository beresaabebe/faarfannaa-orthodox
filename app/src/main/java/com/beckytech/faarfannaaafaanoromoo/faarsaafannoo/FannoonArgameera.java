package com.beckytech.faarfannaaafaanoromoo.faarsaafannoo;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FannoonArgameera extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Fannoon argameera ililichaa yaa nama!\n" +
            "....................................................\n" +
            "Fannoon argameera(2)~ililichaa yaa nama\n" +
            "Kan ittiin fayyinee                   \"\"      \"\"\n" +
            "Mallattoon nageenya               \"\"      \"\"\n" +
            "Kan isaa nuuf kenne                \"\"      \"\"\n" +
            "Fayyisaa addunyaa                  \"\"      \"\"\n" +
            "Coba dhiiga saatu                     \"\"      \"\"\n" +
            "Fannicharra jira                       \"\"      \"\"\n" +
            "Nus ittiin fayyine                      \"\"      \"\"\n" +
            "Hamaa milqineerra                 \"\"      \"\"\n" +
            "   ....................................................\n" +
            "Baroota hedduudhaf                 \"\"      \"\"   \n" +
            "Dhofkamee kan ture                 \"\"      \"\"  \n" +
            "Mul'achuu isaatiin                    \"\"      \"\"   \n" +
            "Gammachuu nu hire               \"\"      \"\"\n" +
            "Ifni fannoo gooftaa                \"\"      \"\"\n" +
            "Diina rifaasise                         \"\"      \"\"\n" +
            "Warreen dhibamanis             \"\"      \"\"\n" +
            "Fannoon ni fayyise                 \"\"      \"\"\n" +
            "....................................................\n" +
            "Mootitti illeeniin                   \"\"      \"\"\n" +
            "Kadhannadhan kaate         \"\"      \"\"\n" +
            "Abbootiis gaafatte                 \"\"      \"\"\n" +
            "Fannoo ni argatte                 \"\"      \"\"\n" +
            "Mallattoon argamsaa           \"\"      \"\"   \n" +
            "Fannoorra qubatee              \"\"      \"\"   \n" +
            "Iddoo aarri taa'ee                 \"\"      \"\"   \n" +
            "Fannichiis mul'ate                \"\"      \"\"\n" +
            "....................................................\n" +
            "Kan ittiin beekkamnu             \"\"      \"\"\n" +
            "Faajjii nageenyaati                  \"\"      \"\"\n" +
            "Qabannee yoo baanu              \"\"      \"\"   \n" +
            "Dirree qabsoorratti                 \"\"      \"\"\n" +
            "Injifannoo keenyaa                 \"\"      \"\"\n" +
            "Hin moo'amnu nutii                \"\"      \"\"\n" +
            "Kan diigu hammeenya             \"\"      \"\"\n" +
            "Fannoon humna keenya          \"\"      \"\"\n" +
            "....................................................   \n" +
            "Fannoo qabannee-too              \"\"      \"\"   \n" +
            "Faachadhan garmaamna        \"\"      \"\"  \n" +
            "Waraana daabiloos               \"\"      \"\"   \n" +
            "Isaatiin moo'anna                 \"\"      \"\"\n" +
            "Isaan caccabeera                 \"\"      \"\"\n" +
            "Wanjichi garbummaa        \"\"      \"\"\n" +
            "Alaabaa keenyadha            \"\"      \"\"\n" +
            "Ifa bilisummaa                  \"\"      \"\"\n" +
            "        ==|==\n" +
            "F/taa koo'eel shawaa\n";

    String title = " Fannoon argameera ";

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