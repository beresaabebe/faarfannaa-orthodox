package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SinDagadhuu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Sin dagadhuu na gudistee tawaahidoo\n" +
            "Sinaan ce'ee sinaan darbee gaddaaf yaaddoo\n" +
            "Dhaaltummaadhan naaf keennamte kan abbaa koo\n" +
            "Sin gurguruu sin jijjiiruu amantaa koo\n\n" +
            "Mana abbaa Koo keessaa bahee Mana namaa\n" +
            "Hin jiraadhu mataa buusee Mana ormaa\n" +
            "Dhiisee hin deemu hin jiraadhu Mana namaa\n" +
            "Sinaan qabaa tiksee gaariif amanamaa\n\n" +
            "Waadan qabaa jalqabumaa mucummaatti\n" +
            "Jireenyi koo gutummaansa kan gooftaati\n" +
            "Hin leeyya'uu dhugaan baha baroota koo\n" +
            "Naaf taateettaa na gudistee ati abbaa koo\n\n" +
            "Har'as ta'ee borus ta'ee kana caalaa\n" +
            "Sin dagadhuu amantaa Koo sit naaf caalaa\n" +
            "Jireenya koo kansaa godhee jiradheraa\n" +
            "Sin dagadhuu amaantaa koo sit naaf caalaa(*2)\n";

    String title = "Sin dagadhuu na gudistee tawaahidoo";

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