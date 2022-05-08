package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AnisDhallootadha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Anis dhalootadha sin faarsa dirqama\n" +
            "Araarsummaa keetiin hunduu ni raawwatama\n" +
            "Si'irraa argamee nyaatni lubbuu kankoo\n" +
            "Samii ishee lammataa ati da'oo lubbuukoo\n\n" +
            "     Adduunyaan yoo dhiisees faarfachuu maqaa kee\n" +
            "     Dandeenyee hin obsinu nutoo ijoollotni kee\n" +
            "    Yeroo hundaa dubbisna galataa fi raajii kee\n" +
            "    Haadha gooftaa keenya hin jiru gitni kee\n\n" +
            "Hin dagannuu yoomuu waan ati nuuf taatee\n" +
            "Bara Heroodisitti rakkoo hedduu simattee\n" +
            "Ilmakee wajjin godaansaaf baateettaa\n" +
            "Kennaa fannoo jalaa nuuf kennamtee jirtaa\n\n" +
            "    Haqamuu hin dandeessuu galmee ulfinaarraa\n" +
            "      Kanaaf si faarfannaa jennee haadha araaraa\n" +
            "      Gonfamtee dhaabbatta mirga ilmakeeti\n" +
            "       Yaa Maariyaam yoomiyyuu galatni kan keeti\n";

    String title = "Anis dhalootadha";

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