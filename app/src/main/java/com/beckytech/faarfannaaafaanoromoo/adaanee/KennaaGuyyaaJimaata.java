package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KennaaGuyyaaJimaata extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content ="Kennaa guyyaa jimaataa\n" +
            "Maariyaam badhaasa geoftaa\n" +
            "Garaaf akkaam si ganaa\n" +
            "Durbee haadha ulfinaa   \n\n" +
            "Ilmi kee fannoorrattii    \n" +
            "Nan jedhe tun harmee keeti   \n" +
            "Fudhadhee anis kennaa koo    \n" +
            "Maariyaam hadhaa uumaa koo\n" +
            "Ani ilmashee isheenis  Haadha koo\n" +
            "Hin dagadhuu hin ganu Aayyoo koo×2 \n\n" +
            "Waaqayyoon filatamtee    \n" +
            "Ayyaanaan kan guutamtee     \n" +
            "Dubaraa kessaa adda taate \n" +
            "Maariyaam kan eebbifamtee\n" +
            "Hin dhokfamuu dhugaan macafarraa\n" +
            "Haati Gooftaa ni caaltii hundarraa×2    \n\n" +
            "Gooftaanoo si wajjinii    \n" +
            "Yaa durbee hin sodaatinii  \n" +
            "Sin jedhee ergamaan Gooftaa    \n" +
            "Ni deessaa Mootii moototaa\n" +
            "Ani ilmashee isheenis haadha koo\n" +
            "Hin dagadhu hin ganu Aayyoo koo×2     \n\n" +
            "Dhaabbattee mirga Gooftaa     \n" +
            "Adunyaaf ni kadhattaa     \n" +
            "Urgooftuu foolii naardoosii     \n" +
            "Maariyaam haadha iyyesuusii\n" +
            "Hin dhokfamuu dhugaan macafarraa\n" +
            "Haati Gooftaa ni caalti hundarraa\n" +
            "Haati Iyyesuus ni caalti hundarraa\n\n";

    String title = "Kennaa guyyaa jimaata";

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