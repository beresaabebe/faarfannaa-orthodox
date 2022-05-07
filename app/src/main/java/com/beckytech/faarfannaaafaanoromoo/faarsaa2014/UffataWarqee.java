package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class UffataWarqee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Uffata warqee uffattee\n" +
            "Gonfoo ulfinaan faayamte\n" +
            "Mirga ilmashee Kan jirtu\n" +
            "Haadha Gooftaa jaallatamtu\n" +
            "     Ceesisa\n" +
            "Ifaan guutamte biiftuu jireenyaan golgamte\n" +
            "Ulfinaan mul'atti urjii samiirraan marfamte\n" +
            "Jawwichi hindandeenye balleessuudhaafi dhama'e\n" +
            "Humna waaqayyootu ayyaana isheedhaaf ta'e\n" +
            "      Ceesisa\n" +
            "Ilmishee tokkichi jaalalaan hunduma bite\n" +
            "Bittaa diinaa jalaa bojuudhaan kan booji'ate\n" +
            "Deessee badhaasteetti ijoollee addaamiin hunda\n" +
            "Dubartoota keessaa dhugumatti maariyaam Adda\n" +
            "         Ceesisa\n" +
            "Siiqqee sibiilaatin hoolota isaa Kan tiksu\n" +
            "Yeeyyiin akka hinyaanneef da'oo ta'ee Kan miliqsu\n" +
            "Isheerraa dhalate addunyaa inni fayyise\n" +
            "Warra amananiif boqonnaa gaarii qopheesse\n";

    String title = "Uffata warqee";

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