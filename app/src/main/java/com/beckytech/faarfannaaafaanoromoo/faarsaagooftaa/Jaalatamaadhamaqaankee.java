package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Jaalatamaadhamaqaankee  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Jaalatamaadha maqaan kee\n" +
            "Eeyyeen hin argamne kan akka kee\n\n" +
            "     Fayyisaa lubbuu koo…….. Eeyyeen\n" +
            "     Si du’a na oolche……………“\n" +
            "     Jalqabaaf dhuma koo……..           “\n" +
            "     Situ anaaf tolchee jaalatamaadha mqaan kee\n\n" +
            "Furii dhala namaa………………Eeyyeen\n" +
            "Abdicha jaalalaa…………………“\n" +
            "Kan sitti amane………………….          “\n" +
            "Du’a jalaa galaa jaalatamaadha maqaan kee\n\n" +
            "      Jaalalaan beekamta……..eeyyeen\n" +
            "      Hundumaa biratti……….         “\n" +
            "      Anis sin caaffadha……….          “\n" +
            "      Onnee koo irrattii jaalatamaadha maqaan kee.\n\n" +
            "Galaana callisuu……………….eeyyeen\n" +
            "Siin jedhu iyyasuus……………“\n" +
            "Naafatu utaala……………………“\n" +
            "Si waamu kiristoos jaalatamaadha maqaan kee\n\n" +
            "       Haadhadhahoo maqaan kee….         “\n" +
            "       Isa hunda caalu……………………..        “\n" +
            "       Addunyaan kun martuu……………“\n" +
            "       Ajaja keen buluu jaalatamaadha maqaan kee.\n\n" +
            "Maqaa fayyinaati……………………………“\n" +
            "Hundaaf kan kenname……………………“\n" +
            "Takkaa bade hin hafu………………………“\n" +
            "Kan siitin waamamee jaalatamaadha maqaan kee.\n\n" +
            "     Duutee duuti hafe………….eeyyeen\n" +
            "     Bilisa nu baste………………..        “\n" +
            "     Mallattoo fayyinaa…………..         “\n" +
            "      Dhiiga kee nuuf laattee jaalatamaadha maqaan kee.\n";

    String title = " Jaalatamaadha maqaan kee ";

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