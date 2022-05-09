package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AmantiifCuuphaadhaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kan fayyu barbaadu amantiif cuuphaadhaa \n" +
            "Eyyeen dhugaadha\n" +
            "Dhiigaan kan nubite kiristoos qofaadha \n" +
            "Eeyyeen dhugaadha\n" +
            "\n\n" +
            "Sanyii namaa hundaaf samiirraa kan buutee\n" +
            "Duutee du'a mootee jireenya nuuf laattee\n" +
            "Gooftaan sumadha\n" +
            "\n\n" +
            "Harka yohaannisitti yoo cuuphamtes atii\n" +
            "Fakkeenyi kee hunduu madda jaalalaati \n" +
            "Fayyisaadha ati\n" +
            "\n\n" +
            "Yohaannis yoo cuuphes bishaanidhaan inni\n" +
            "Kan na boodde dhufuu sin cuupha abiddaani\n" +
            "Inni afuuraani\n" +
            "\n\n" +
            "Lubbuu badee ture fayyinatti baastee\n" +
            "Waaqummaa keetiini jireenya nuuf laattee\n" +
            "Du'a nu oolchite\n" +
            "\n\n" +
            "Xalayaan garbummaa yoordaanosiin turee\n" +
            "Xoofoo du'aa kutee jireenyatti jijjiiree\n" +
            "Du'aa nu furee\n" +
            "\n\n" +
            "Fayyinni amantaa cuuphaadhaan argamaa\n" +
            "Addunyaan hundumtuu isaan baraaramaa\n" +
            "Gooftaan furamaa\n" +
            "\n\n" +
            "Fakkeenya gugeetiin ni bu'e afuurri\n" +
            "Gara keenya dhufee gooftaan jaalalaani\n" +
            "Isaan biraani\n" +
            "\n\n" +
            "Fakkeessudhaaf malee addunyaan sobadhaa\n" +
            "Abbaan qulqullummaa Amaanu'eel qofaadha\n" +
            "Inni Gooftaadha\n";

    String title = "Amantiif Cuuphaadhaa";

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