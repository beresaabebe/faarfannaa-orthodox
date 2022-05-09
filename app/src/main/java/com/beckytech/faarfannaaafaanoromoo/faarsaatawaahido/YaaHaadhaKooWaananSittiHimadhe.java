package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaHaadhaKooWaananSittiHimadhe extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa Haadha koo waanan sitti himadhe adaraa jedhe\n" +
            "Waanan sitti himadhaa(2) Adaraa jedhe\n" +
            "Baranallee hin hafuu\"\"\"\"\"\"\n" +
            "Nan dhufa gisheen\"\"\"\"\"\"\n" +
            "Mana kee ol seenaa\"\"\"\"\"\"\n" +
            "Siinan haasofsiisaa\"\"\"\"\"\"\n\n" +
            "Tabbi gaara gishee Adaraa jedhe\n" +
            "Yoo na dadhabsiise\"\"\"\"\"\"\n" +
            "Hin hafuu Dhugaa\"\"\"\"\"\"\n" +
            "Waadaa narra jiraa\"\"\"\"\"\"\n\n" +
            "Addunyaaf na laatin Adaraa jedhe\n" +
            "Anoosin Amanaa\"\"\"\"\"\"\n" +
            "Si wajjin jireenyi\"\"\"\"\"\"\n" +
            "Garana naa koottu\"\"\"\"\"\"\n\n" +
            "Adaraa Haadha koo Adaraa jedhe\n" +
            "Aannan jireenya koo \"\"\"\"\"\"\n" +
            "Siin naaf mi’aawaa \"\"\"\"\"\"\n" +
            "Maariyaam(2) jedhe \"\"\"\"\"\"\n" +
            "Seenaan jiijjiirama\"\"\"\"\"\"\n";

    String title = "Yaa Haadha koo waanan sitti himadhe";

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