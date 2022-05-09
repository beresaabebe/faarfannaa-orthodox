package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class CuuphaamuusanYoordaanositti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Cuuphaamuusan Yoordaanositti\n" +
            "Iyyesuusiin bane ifatti (2)\n" +
            "\n" +
            "Abbaan isaa... Yord\n" +
            "Akkas jedhe....\n" +
            "Sagaleedhan...\n" +
            "Kan dubbate....\n" +
            "Kunoo ilmikoo....\n" +
            "Kanan jaaladhu....\n" +
            "Afuurrisi....\n" +
            "Bifa gugeen....\n\n" +
            "Iyyesuus Kiristoos moo'era\n" +
            "Olaantummaan diinaa hafeera\n\n" +
            "Ilmaan namaaf... Yord\n" +
            "Fedhasaatin...\n" +
            "Iyyesuusi....\n" +
            "Kan cuuphame....\n" +
            "Gad of qabee....\n" +
            "Ol nu qabee.....\n" +
            "Xalayichaa...\n" +
            "Irra ejjete....\n\n" +
            "Du'a ijjifannee kaanerra\n" +
            "Wanjoon garbummaadha cabeera\n\n" +
            "Waaqummaasaa.... Yord\n" +
            "Kan mul'isee....\n" +
            "Bishaan illee....\n" +
            "In sodaatte....\n" +
            "Teellaasheetti....\n" +
            "Kan baqatte....\n" +
            "Raajiin daawwit....\n" +
            "Kan raawwate....\n\n" +
            "Barri dukkanicha darbeera\n" +
            "Harka diina jalaa baneerra\n\n" +
            "Ilmi namaa .... Yord\n" +
            "Kan cuuphame....\n" +
            "Duuti keenya......\n" +
            "Addaan cite....\n" +
            "Mirgi keenya.....\n" +
            "Kan deebite....\n" +
            "Galaannillee.....\n" +
            "Tokko taate ...\n\n" +
            "Barri garbummaadha hafeera\n" +
            "Abdiin keenya goge lateera\n\n" +
            "Cuuphamusan yordaanositti\n" +
            "Iyyesuusiin baane ifatti (2)\n\n" +
            "F.Dn Jaalal Nagaasaa\n";

    String title = "Cuuphaamuusan Yoordaanositti";

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