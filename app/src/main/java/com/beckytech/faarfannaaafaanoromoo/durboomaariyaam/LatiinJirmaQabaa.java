package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class LatiinJirmaQabaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Latiin jirma qabaa kan irraa dhalatee,\n" +
            "Jirmis ni jiraataa hundee jabeeffatee,\n" +
            "Latiin bara kanaa haadha isaa ganeeraa,\n" +
            "Haadha waaqa uuma baay'een dhagateera \n" +
            "~~~~~~~~~\n" +
            "Qomoon Haadha beekne ilma akkamin beekaa\n" +
            "Dogoggorsuuf dhufee ilaalaati beekaa\n" +
            "Waaqayyoo jaalala isheen haadha jaalalaa}×2\n" +
            "Ijji koo yeroo hundaa gara ishee ilaalaa}×2\n" +
            "~~~~~~~~\n" +
            "  Kabajni kan ta'uuf nuti ni kabajna \n" +
            "   Haadha iyyasuusin akkamiin salphiifna\n" +
            "  Dubartoota keessa isheen adda taate }×2\n" +
            "  Fayyisa addunyaa garaa isheetti baatte}×2\n" +
            "~~~~~~~~~\n" +
            "  Gabri'el ergamaan ergamoota keessaa\n" +
            "  Misiraachoo fidee gammadi ilma deessa\n" +
            "  Cubbuun karaa hewaan gara keenya dhufee}×2\n" +
            "  Dubroo maariyaamiin kunoo nurra kufee}×2\n" +
            "~~~~~~~~~~\n" +
            "  Kennaa fannoo jalaa kan guyyaa jimaata\n" +
            "  Karaa yohannis at nuuf kennamteetta\n" +
            "  Nuufis haadha keenya haadha bara baraa}×2\n" +
            "  Ilma kee nuuf kadhuu yeroo hunda araara}×2\n";

    String title = "Latiin jirma qaba";

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