package com.beckytech.faarfannaaafaanoromoo.lameen2011;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Sillaasee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Sillaasee uumaa koo(3) Eyyee\n" +
            "Akka mana Abrahaam(2) \n" +
            "Eebbisi mana koo\n" +
            "Giiftii Maariyaam (3) Eyyee\n" +
            "Na gargaarii Maaloo(2) \n" +
            "yaa haadha Garramii\n" +
            "Haadha koo Arseemaa (3) Eyyee\n" +
            "Ati naf kadhadhuu(2) \n" +
            "Maaloo yaa haadha koo     \n\n" +
            "F/taa Koo'el Shawaa (Geetahun)\n" +
            "F/taa Dn Abarraa Baqqalaa\n";

    String title = "Sillaasee";

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