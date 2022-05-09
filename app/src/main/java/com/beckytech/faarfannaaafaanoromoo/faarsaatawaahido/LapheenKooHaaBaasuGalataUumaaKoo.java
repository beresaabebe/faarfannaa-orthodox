package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class LapheenKooHaaBaasuGalataUumaaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Lapheen koo haa baasu galata uumaa koo\n" +
            "Ija koon argeeraa Fayyisuu waaqa koo\n" +
            "Dirree gabaa’ootti Biiftuu naaf dhaabeeti\n" +
            "Hara’as na dawwata irra deddeebitti\n" +
            "Ceesisa\n" +
            "Kiyyoo ni ciccite anis jalaan ba’ee\n" +
            "Kiyyoo cubbuu jalaa du’araas nan ba’ee\n" +
            "Kan afaan leencootaa humna isaatin cufe\n" +
            "Waaqni Daani’eel na faana ture\n" +
            "Ceesisa\n" +
            "Baganaa daawiti faarfannaa Yaaredii\n" +
            "Qulqulloota wajjin nan faarfadha ani\n" +
            "Ulfina waaqa koo yoo kolfite Meekool\n" +
            "Anis nan faarfadha ulfina waaqa koo\n" +
            "Ceesisa\n" +
            "Abiddi boba’ee sodaachisa sunii\n" +
            "Sagada Xawootif labsii yoo baasanii\n" +
            "Hunduu yoo na dhiise addunyaan na gattee\n" +
            "Gooftaan koo uumaan koo cimina naaf ta’ee\n";

    String title = "Lapheen Koo Haa Baasu Galata Uumaa Koo";

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