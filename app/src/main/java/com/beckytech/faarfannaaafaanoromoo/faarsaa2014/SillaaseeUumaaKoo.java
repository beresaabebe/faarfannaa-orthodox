package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SillaaseeUumaaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Sillaasee uumaa koo(3) Eyyee\n" +
            "Akka mana Abrahaam(2) \n" +
            "Eebbisi mana koo\n" +
            "\n\n" +
            "Giiftii maariyaam (3) Eyyee\n" +
            "Naa gargaarii Maaloo(2) \n" +
            "yaa haadha Garramii\n" +
            "\n\n" +
            "Haadha koo Arseemaa (3) Eyyee\n" +
            "Ati naf kadhadhu(2) \n" +
            "Maaloo yaa haadha koo\n";

    String title = "Sillaasee uumaa koo";

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