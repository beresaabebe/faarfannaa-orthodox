package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MootichiYihudaaIyyesuus  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Mootichi Yihudaa Iyyesuus Gooftaadha\n" +
            "Anis jedha waaqa koo\n" +
            "Iyyesuus seeni mana koo\n" +
            "Giiftii koo misirroo Solomon siin jedhe\n" +
            "Anis nan haadha koo\n" +
            "Maariyaam seeni koo\n" +
            "Hangaafni ergamoota Mika'el sumaadha\n" +
            "Anis nan jedha eega koo\n" +
            "Mika'eel seeni mana koo\n" +
            "Ijoollee sadanii abiddaa kan baastee\n" +
            "Anis nan jedha eega koo\n" +
            "Gabri'eel seeni mana koo\n" +
            "Gootichi Amantii Takiliyyee sumadha\n" +
            "Anis nan jedha Abbaa koo\n" +
            "Takiliyyee seeni mana koo\n" +
            "Gootichi Zuuqalaa Abuyee sumaadha\n" +
            "Anis nan jedha Abbaa koo\n" +
            "Abuyee seeni mana koo\n" +
            "Koottu duumessaanii(4)\n" +
            "Fayyisa keenya Araara keetinii\n" +
            "Koottu Duumessaanii(4)\n" +
            "Durbee maariyaam kadhanna keetiinii\n" +
            "Koottu Duumessaanii(4)\n" +
            "Ergamaa Mika'el eegumsa keetinii\n" +
            "Ergamaa Gabri'eel Egumsaa keetinii\n" +
            "Ergamaa Rufaa'eel Egumsaa keetinii\n" +
            "Ergamaa Uraa'eel Egumsaa keetinii\n" +
            "Ergamaa Raagu'eel Egumsaa keetinii\n" +
            "Ergamaa Faanu'eel Egumsaa keetinii\n" +
            "Ergamaa Saaqu'eel Egumsaa keetinii\n";

    String title = "Mootichi Yihudaa Iyyesuus Gooftaadha";

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