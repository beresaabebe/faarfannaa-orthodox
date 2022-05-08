package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class JechaKeessaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Jecha keessaa jecha ilaalee\n" +
            "Jecha siif ta'u filee\n" +
            "Siin faarfadha yaa Giiftii koo\n" +
            "Maariyaamii icciitii sammuu koo\n\n" +
            "Waa'ee kee barreessuuf yommuun ta’ee yaaduu\n" +
            "Tasuma na dhufuu jecha an barbaaduu\n" +
            "Gad of deebisuudhan waaqni siif argamee\n" +
            "Kanaaf jechi ga'aan waa'ee keef dhabamee(2)\n\n" +
            "Ergamtoonni Gooftaa kan si faarfatanii\n" +
            "Ayyaana qabeettii gammadii jedhanii\n" +
            "Sammuu koon ol ta'e jechan siif dubbadhu\n" +
            "Giiftii koo hin qufuu yeroon si faarfadhuu(2)\n\n" +
            "Akkamin jiraatuu sirraa addan ba'aanii\n" +
            "Gammadii yaa durbee si jechuu dhiisanii\n" +
            "Boqoonnaa laphee koo tasgabbii sammuu koo\n" +
            "Maariyaam (2) mallattoo eenyummaa koo(2)\n\n" +
            "Gooftaan kan siin jedhe jaalala haadha koo\n" +
            "Waanan jedhu dhabeen tuffadhe ofii koo\n" +
            "Giiftii koo si malee maalii nan jiraadhaa\n" +
            "Fakkii kee xuqeenoo dhiifama argadhaa(2)\n";

    String title = "Jecha keessaa";

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