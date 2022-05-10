package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GalmaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galma koo galgala iddoo boqonnaa koo\n" +
            "Iyyesuus si waama abbaa gaafa rakkoo\n" +
            "Galana gargaar hirtee karaa keessa naa baaste\n" +
            "Iyya koo dhaggeeffatte eebba naratti harcaafttee\n" +
            "         Ceesisa\n" +
            "Karaa jireenya kooti bakka dhibaayyuu lubbuu\n" +
            "Humna kee narraa guuree danqaraaf tuulaa cubbuu\n" +
            "Si waaqessaa abbaa koo qulqulloota faana hiriiree\n" +
            "Dadhabaa harka ormaan cabee sito dhufe na furee\n" +
            "       Ceesisa\n" +
            "Konkolaataa koo si'idha kanan diina ittin loluu\n" +
            "Maqaa kee waamu malee adeemuun natti  tolu\n" +
            "Surraa kee uffadheen deema sila hin jiru mitiree\n" +
            "Bakka tikeerraa waamtee siti maqaa naaf jijjiiree\n" +
            "       Ceesisa\n" +
            "Duula narratti ka'ee walgahii warra gantuu\n" +
            "Eenyutu nati cufaree karra ati naaf bantuu\n" +
            "Dachaati sigigaata malee kattaatu tatarsa'a\n" +
            "Ati jennan iyyesuus ani galma koon ga'a\n" +
            "       Ceesisa\n" +
            "Ilaalchi nama cabsee biyyooti na dabaluu iyyuu\n" +
            "Jecha keen qajeelfamni gooftaa eenyun hin fayyuu\n" +
            "Boolla dinni naa qoote isumaaf taasisteeree\n" +
            "Mootummaa kee naaf qoddee situ funcha narra ciree\n";

    String title = "Galma koo galgala iddoo boqonnaa koo";

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