package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class QulqulluuMikaaeel extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Qulqulluu Mikaa'el 2* ergamaa Ifaa\n" +
            "Hidhaa irraa hiktee kan baastee Keefaa\n" +
            "Gargaarsaa kee hawwiitee biyyi lafaa.\n" +
            "Ceesisa \n\n" +
            "Daani'eel kan baastee afaan leencaa keessaa\n" +
            "Samii gad darbitee seexanicha hadheessaa\n" +
            "Albee kee qabadhuu nuuf kottuu jennaa\n" +
            "Kunoo si waammattii har'aas lubbuun keenya. \n" +
            "Ceesisa \n\n" +
            "Maanuheef kan fiddee ergaa gammachiisa\n" +
            "Baahiraniif jijjiirtee xalayaa du'a isaa\n" +
            "Ergamaa isaa ergee har'aas waaqni keenyaa \n" +
            "Du'a nu irraa kaasee nuuf kenna jireenyaa.  \n" +
            "Ceesisa \n\n" +
            "Wanta gootuu dhabdee lubbuun dhiphattee\n" +
            "Seexannii na mormuuf dura koo dhaabbate\n" +
            "Afoomiyaaf kan geesse ergamaa Mikaa'el \n" +
            "Kottuuti nu baasii akka saba Israa'el. \n" +
            "Ceesisa \n\n" +
            "Barrii dhumaa sunii hedduu sodachiisa\n" +
            "Abiddii Si'ool bayyee nu yaaddeessaa\n" +
            "Wabii dhala namaa guyyaa dhuma sanaa\n" +
            "Qulqulluu Mikaa'el nu gargaarii jennaa.\n";

    String title = "Qulqulluu mikaa'eel";

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