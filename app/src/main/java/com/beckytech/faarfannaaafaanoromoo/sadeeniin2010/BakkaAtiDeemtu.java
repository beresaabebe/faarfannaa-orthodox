package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BakkaAtiDeemtu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Bakka atii deemtuu fagoodhaa \n" +
            "Galaa lubbuu qopheffadhuu \n" +
            "Jedhe ergamaan waaqayyoo \n" +
            "Isa ani heedduu jaalladhu  \n\n" +
            "Maaloo yaa lubbuu koo ati qalbeeffadhuu    \n" +
            "Qopha'a ta’uudhaaf waaqa kee kadhadhuu               \n" +
            "Wangelaasaa labsii mudhii kee hidhadhuu\n" +
            "Amantidhan cimii Waaqayyoon kadhadhuu\n\n" +
            "Lubbuu koo adaraa jabaadhu dhaabbadhuu \n" +
            "Gooftaan wajjiin ta’uuf cimsitii kadhadhui\n" +
            "Sagalee uumaa kee maaloo qalbeeffadhuu\n" +
            "Boqonnaa akka argattuf jabaadhu dhaabbadhuu\n   \n" +
            "Jireenyi lafaarraa hedduu sii dhiphisaa \n" +
            "Foon kee sii midhuufi baay’ee sii rakkisaa\n" +
            "Ati yoo jabaattee Addunyaa ni moo’ataa\n" +
            "Gonfoo bara baraa Gooftaa irraa argattaa\n";

    String title = "Bakka ati deemtu";

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