package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Arseemaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Arseemaa Wareegamtuu Arseemaa\n" +
            "Arseemaa qulqulleetti Arseemaa\n" +
            "Si waamannaa yeroo hundumaa(2)\n" +
            "\n" +
            "Arseemaa Dargagummaa keen\n" +
            "    \"\"     \"\"      filattee Dhiphinaa\n" +
            "    \"\"     \"\"     Dhugaa bahuudhaan\n" +
            "    \"\"     \"\"     fudhattee rakkinaa\n" +
            "    \"\"     \"\"     Si gannee Gooftaanis\n" +
            "    \"\"     \"\"     siif ta'ee gaachanaa\n\n" +
            "Arseemaa Dhalattu Roomaadha\n" +
            "    \"\"     \"\"     kan Baatee biyyaa\n" +
            "    \"\"     \"\"     Amantaa keetif\n" +
            "    \"\"     \"\"     Deemte  Armaaniyaa\n" +
            "    \"\"     \"\"    uffatte moo’annaa\n" +
            "    \"\"     \"\"     akkuma wayyaa\n\n" +
            "Arseemaa mootota biyya lafaa\n" +
            "    \"\"     \"\"     hundaasan moo’attee\n" +
            "    \"\"     \"\"     Amantaa Dhugaadhaf\n" +
            "    \"\"     \"\"     Foonin wareegamtee\n" +
            "    \"\"     \"\"     Afuura qulqulluun\n" +
            "    \"\"     \"\"     waadaa kan argattee\n\n" +
            "Arseemaa kakuun qabdu addaa\n" +
            "    \"\"     \"\"     gophaa qajeelchiitaa\n" +
            "    \"\"     \"\"     bishaan maqaa keeti\n" +
            "    \"\"     \"\"     Fayyinaa namaaf laata\n" +
            "    \"\"     \"\"     Dhaloonnii Eebbifamoo\n" +
            "    \"\"     \"\"     kanaaf si waammataa\n" +
            "    ========•|•=========\n" +
            "   F/taa Geetahun Shawaa (KOO'EL)\n";

    String title = "Arseemaa";

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