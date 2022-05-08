package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HaadhaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Haadhakoo maal jedheen si faarsa\n" +
            "Haadhakoo maal jedheen si leellisaa (x2)\n" +
            "Lubbuu koof riqaa ce'umsaa tateettaa\n" +
            "Maal jedheetan garaa si ciibsaa\n\n" +
            "      Halkan tuqee na kaase hirriban rafu keessa \n" +
            "      Guyyas yaadakoo hin badduu maqaakeeman laallisaa\n" +
            "      Yaa haadha baalayiseeb maqaakee isa jaallatuu\n" +
            "       Bishaan cuba tokkooni jannatatti kan galchituu\n\n" +
            "Hundarraa adda na baase bultoosaa si godhatee\n" +
            "Firiin garaa keetiwoo du'a hundaa balleessee\n" +
            "Kanaafan si jaalladha an lapheekoo guutuudhaan\n" +
            "An si faarsaatan jiraadha galata keen dubbadha\n\n" +
            "          Riqaan yaaqob arge ergamoonni yaabbatanii\n" +
            "           Utuu ati sanyiin nu hin hafnee taaneerra akka saadoomii\n" +
            "           Ati balbala bahaa surraadhaan kan guutamte\n" +
            "            Lapheen koo gaarii baase galata kee dubbatee \n\n" +
            "Kan namatti na dabalee kadhannaa keeti giiftii koo \n" +
            "Ijoolummaa koo ilaaltee na hin tuffanne harmee koo\n" +
            "Har'as dafii naaf kottuu naaf mul'adhu Maariyaamii\n" +
            "Yaa badhaasa addunyaa ati fayyina addamii\n";

    String title = "Haadha koo";

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