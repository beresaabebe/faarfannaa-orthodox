package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GochiGooftaaKeenyaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Gochi Gooftaa keenyaa nu baay’ata jira \n" +
            "Tolumma isaa hundaaf galata galchina\n" +
            "\n\n" +
            "Yeroo rakkoo keenya dhiphinaa nu baasa\n" +
            "Yakkaan yoo kufnelle jaalalan nu kaasa\n" +
            "Cubbuu keenya baay’ee gonkummaa ballessee\n" +
            "Mo’annaa nuuf kennee bilisa nu baasee\n" +
            "\n\n" +
            "Jibba keenya dhiisee inni nu jaalate\n" +
            "Balleessuma keenyaaf beela’ee dheebote\n" +
            "Hammeenya namoota hunduma isaa obse\n" +
            "Icciti jaalala isaa fannoodhaan mul’ise\n" +
            "\n\n" +
            "Ka’aa yaa namootaa gara isaattii deebina\n" +
            "Cubbuu irraa fagaanne seera isaa rawwanna\n" +
            "Uffata salphina ofii irra mulqinee\n" +
            "Haa taanu qulqulloota qalbii jijjiirranne\n";

    String title = " Gochi Gooftaa keenyaa nu baay’ata jira ";

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