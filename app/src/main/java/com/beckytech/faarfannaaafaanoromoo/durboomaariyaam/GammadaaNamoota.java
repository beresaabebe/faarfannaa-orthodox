package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GammadaaNamoota extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yeroo isin dhuftani /2/ mana Waaqa keenyaa /2/\n" +
            "Gammadaa namoota sin simatti Maariyaam haati Keenya /4/eyyee\n" +
            "Eegaa yaa namoota lubbuu keessan /2/ Waaqayyoodhaaf kennaa /2/\n" +
            "Maariyaam haati keenya nugoorsiti kaane dhageeffanna /4/eyyee\n" +
            "Hammeenya dhiisati koottaamee /3/ yaanamaa\n" +
            "Waaqayyoon haa kadhannu galgalas /2/ ganama /4/ eyyee\n";

    String title = "Gammadaa namoota";

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