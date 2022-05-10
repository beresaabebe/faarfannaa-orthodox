package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class JaalatamaadhaMaqaanKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Jaalatamaadha maqaan kee\n" +
            "Eeyyeen hin argamne kan akka kee\n" +
            "Fayyisaa lubbuu koo…….. Eeyyeen\n" +
            "Si du’a na oolche……………“\n" +
            "Jalqabaaf dhuma koo……..           “\n\n" +
            "Situ anaaf tolchee jaalatamaadha mqaan kee\n" +
            "Furii dhala namaa………………Eeyyeen\n" +
            "Abdicha jaalalaa…………………“\n" +
            "Kan sitti amane………………….          “\n\n" +
            "Du’a jalaa galaa jaalatamaadha maqaan kee\n" +
            "Jaalalaan beekamta……..eeyyeen\n" +
            "Hundumaa biratti……….         “\n" +
            "Anis sin caaffadha……….          “\n\n" +
            "Onnee koo irrattii jaalatamaadha maqaan kee.\n" +
            "Galaana callisuu……………….eeyyeen\n" +
            "Siin jedhu iyyasuus……………“\n" +
            "Naafatu utaala……………………“\n\n" +
            "Si waamu kiristoos jaalatamaadha maqaan kee\n" +
            "Haadhadhahoo maqaan kee….         “\n" +
            "Isa hunda caalu……………………..        “\n" +
            "Addunyaan kun martuu……………“\n\n" +
            "Ajaja keen buluu jaalatamaadha maqaan kee.\n" +
            "Maqaa fayyinaati……………………………“\n" +
            "Hundaaf kan kenname……………………“\n" +
            "Takkaa bade hin hafu………………………“\n\n" +
            "Kan siitin waamamee jaalatamaadha maqaan kee.\n" +
            "Duutee duuti hafe………….eeyyeen\n" +
            "Bilisa nu baste………………..        “\n" +
            "Mallattoo fayyinaa…………..         “\n" +
            "Dhiiga kee nuuf laattee jaalatamaadha maqaan kee.\n";

    String title = "Jaalatamaadha maqaan kee";

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