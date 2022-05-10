package com.beckytech.faarfannaaafaanoromoo.faarsaafannoo;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AniyyuuGaabberraa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Aniyyuu Gaabbeerraa Dammaqii  Isa Raftuu(2)\n" +
            "Waa’ee Biyya Lafaa Homaa Maahii Hin Baaftuu(4)\n" +
            "Waa’ee Sirbaaf Machii Akka Biraa Haaftuu(2)\n" +
            "Abboommii  Waaqayyoo Akka Fixaan Baaftuu(4)\n" +
            "Dukkana  Hin Sodaannuu  Ibsaa Qabanneerraa(2)\n" +
            "Daabiloosiin Lollaa  Fannoo  Hiidhanneerraa(4)\n" +
            "Meeshaan  Daabiloosis  Irraa  Harca’eeraa(2)\n" +
            "Ijoollee  Waaqayyoof Faruu Kennameeraa(4)\n";

    String title = " Aniyyuu Gaabbeerraa Dammaqii ";

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