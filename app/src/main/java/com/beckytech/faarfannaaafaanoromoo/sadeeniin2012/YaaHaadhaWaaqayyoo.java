package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaHaadhaWaaqayyoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa Haadha waaqayyoo \n" +
            "Yaa Haadha Amaanu'el yaa haadha waaqayyoo\n" +
            "Yaa Haadha waaqayyoo Yaa Haadha Amaanu'el\n" +
            "Maariyaam yaa Abdii namootii.   Eyyee\n\n" +
            "Kan taatee filamtee mootummaa samitti     \n" +
            "Kan taatee biqiltee       \n" +
            "Jiraadhu maariyaam Gannatii. Eyyee(3)\n" +
            "              ====•|•=====\n" +
            "   F/taa Dn Mankir Girmaa\n";

    String title = "Yaa haadha waaqayyoo";

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