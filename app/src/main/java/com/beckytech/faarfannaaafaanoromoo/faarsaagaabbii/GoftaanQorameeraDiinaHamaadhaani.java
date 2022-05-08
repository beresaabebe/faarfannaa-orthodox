package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GoftaanQorameeraDiinaHamaadhaani extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Gooftaan qorameera diina hamaadhaani\n" +
            "Sooma yoo hundeessu jireenya keenyaafi /2/\n\n" +
            "Jaalalaaf nageenya nuuf kenniti soomnii\n" +
            "Dhuma kan hinqabne baruma baraani /2/\n\n" +
            "Firii sooma kanaa nu hundumtuu beeknee \n" +
            "Dafnee haaqabannuu akka nu hin darbine /2/\n";

    String title = " Gooftaan qorameera diina hamaadhaani ";

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