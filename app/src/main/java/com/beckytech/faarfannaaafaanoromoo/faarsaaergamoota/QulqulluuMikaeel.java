package com.beckytech.faarfannaaafaanoromoo.faarsaaergamoota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class QulqulluuMikaeel  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Qulqulluu Mika'el Hangafa Ergamoota(2)\n" +
            "Nu ijoollee kee hundaaf dhiifama nuuf kadhuu(2)\n\n" +
            "Waa'ee jaalala kee ta'ee yemmuun yaadu\n" +
            "Bara hamaa sanat na dhiisne akkan baduu\n" +
            "Tolumma kee hundaaf aarsaan koo galata\n" +
            "Waaqa si nuuf kenneef galanni hin xiqqataa\n\n" +
            "Saba kee isra’eelin hamaarra baraartee\n" +
            "Du'a baahiraanis jireenyaan jijjiirtee\n" +
            "Warra si waammannuuf jaalala kee beeknuf\n" +
            "Araara nuuf kadhu mirgasaa akka teenyuuf\n\n" +
            "Jaalala Afoomiyaan si qabdu balleessuuf\n" +
            "Amanamummaa shee boddeetu deebisuuf\n" +
            "Diinni yoo shee marsee lubbuu shee dabarsuuf\n" +
            "Dursitee argamtee jireenyatti jijjiirteef\n\n" +
            "Qulqulluu Mika'el nu marsi nu Tiksii\n" +
            "Garbumma seexana jala ati nu baasii\n" +
            "Warra si waammannuuf jaalala kee beeknuf\n" +
            "Araara nuuf kadhu mirgasa akka teenyuuf\n";

    String title = "Qulqulluu Mika'el Hangafa ";

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