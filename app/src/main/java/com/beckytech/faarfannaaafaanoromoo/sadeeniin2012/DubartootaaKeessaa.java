package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DubartootaaKeessaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Dubartootaa keessaa filataamtee\n" +
            "Kennaa waaqayyoo kan argattee\n\n" +
            "Gammadi yeroo hundumaa(2)\n" +
            "Yaa Maariyaam Yaa Giiftii koo \n" +
            "Abdiin Keenya Sumaa\n\n" +
            "Fannoo jalatti nuuf kennamtee\n" +
            "Haadha hundaf taatee argamtee\n" +
            "Waaqa uuman kan Eebbifamtee(2)\n" +
            "Yaa Durboo Iyyesuus nuuf laattee  \n     \n" +
            "Sanyii qulqulluu irraa Dhalattee\n" +
            "Uumamaa hundarraa filatamtee\n" +
            "Maariyaamii yaa haadha Gooftaa(2)\n" +
            "Cubbuu keenyaf situ nuf kadhataa   \n  \n" +
            "Gadamessi kee qulqulluudhaa\n" +
            "Kan Ati Deessee Fayyisaadhaa\n" +
            "Gooftaa Adoonaay Abidda baattee(2)\n" +
            "Ifa Addunyaa nutin nu badhaastee    \n   \n" +
            "           F/taa Geetahun Shawaa(KOO'EL)\n";

    String title = "Dubartootaa keessaa";

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