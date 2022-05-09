package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BeenaaNiDeemna extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Beenaa ni deemna Yordaanoosi(2)\n\n" +
            "Yordaanoosi (2)......Eeyyee\n" +
            "Gooftaan keenya...\n" +
            "Iyyesuus.....\n" +
            "Cuuphameera.....\n" +
            "Yohaannisin......\n" +
            "Haa cuuphamnu....\n" +
            "Haa taanusi.....\n" +
            "\n\n" +
            "Yordaanoosi (2).....Eeyyee\n" +
            "Cubbuu keenyas.....\n" +
            "Haa dhiqannu.....\n" +
            "Yordaanoositti......\n" +
            "Nut hundinuu.....\n" +
            "Gammachuudha.....\n" +
            "Hin gaddinu....\n" +
            "\n\n" +
            "Yordaanoosi (2)......Eeyyee\n" +
            "Gooftaan keenya...\n" +
            "Iyyesuus.....\n" +
            "Cuuphameera.....\n" +
            "Yohaannisin......\n" +
            "Haa cuuphamnu....\n" +
            "Haa taanusi.....\n" +
            "Beenaa ni deemna Yordaanoosi(2)\n" +
            "Yordaanoosi (4) Eeyyee\n";

    String title = "Beenaa ni deemna Yordaanoosi ";

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