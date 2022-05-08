package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class TokkummaaNuufKenniYaaGooftaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Tokkummaa nuuf kenni  yaa Gooftaa yaadan tokko taanaa (2)\n" +
            "Akka Duuka bu'oota keetii sii wajjin jiraanna\n" +
            "Akka duuka bu'oota keeti Afuura keen jabaannaa\n\n" +
            "    Akka Duungoo baquun Addunyaaf ifanii\n" +
            "    Dadhaaba fakkatan osoo humna qabanii \n" +
            "    Iyyasuus Gooftaani Mootii moototaati\n" +
            "    Jechuun Dhugaa bahan hanga du'anitti\n\n" +
            "Qilleensa jabaadhaaf Abidda keessaanii\n" +
            "Lallaaban Wangeela obsaan dhabbatanii\n" +
            "Hojiin biyya lafaa darbuusaa hubatanii\n" +
            "Foonin midhaamanii lubbu jabeessanii\n\n" +
            "        Afuura Gooftaani mudhiin isaani cimee \n" +
            "        Beelaaf rakkinnisi homaa itti hin fakkanne\n" +
            "       Dhugaaf wareegaman osoo sodaatinii\n" +
            "       Jabiina akka kanaa yaa Goofta nuuf kennii\n\n" +
            "Nuti dadhabootaa homaa warra hin beeknee\n" +
            "Maqaa keetti amaanne waliitti qabaamnee\n" +
            "Yaada mamiif shaakki nurratii fageessi\n" +
            "Jecha sagaale keen nuu dhaabii nu ciimsii\n";

    String title = " Tokkummaa nuuf kenni  yaa Gooftaa ";

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