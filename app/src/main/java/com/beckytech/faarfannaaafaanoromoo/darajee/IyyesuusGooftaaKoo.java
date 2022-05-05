package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IyyesuusGooftaaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Si'ii fayyisaan koo\n" +
            "Abdiin jireenya koo\n" +
            "Iyyesuus gooftaa koo.\n\n" +
            "Maariyaam qulqulleetti \n" +
            "Mirga isaa dhaabbattii \n" +
            "Gooftaa nuuf kadhattii.\n\n" +
            "Kan baastee Israa'el \n" +
            "Gargaaraa Daani'eel \n" +
            "Kottuu  Mikaa'el.\n\n" +
            "Gaabri'eel fuula gooftaa\n" +
            "Yeroo hundaa dhaabbata \n" +
            "Gooftaa nuuf kadhataa.\n\n" +
            "Giyoorgis jabaatee \n" +
            "Dudiyanoos mo'aate \n" +
            "Gonfoo isaa fudhatee.\n\n" +
            "Gooticha amantii \n" +
            "Taklahayimanoot \n" +
            "Nu jabeessi ati.\n\n" +
            "Arseemaan jabattee\n" +
            "Derxadees mo'atte \n" +
            "Gonfoo ishee fudhattee.\n\n" +
            "Galannii haa ta'uuf\n" +
            "Sillaasee uumaa koo\n" +
            "Bara jireenya koo\n\n" +
            "Situu naan na dhaabee\n" +
            "Kunoo faaruudhaani\n" +
            "Har'aas ililleeni.\n";

    String title = "Iyyesuus gooftaa koo";

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