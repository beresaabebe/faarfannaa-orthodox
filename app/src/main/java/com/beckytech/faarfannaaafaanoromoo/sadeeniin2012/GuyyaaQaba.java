package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GuyyaaQaba extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Guyyaa qaba kan kee guyyaa san alatti maaltu ta'a\n" +
            "Yeroo qaba Gooftaa yeroo keen alatti maaltu ta'a\n" +
            "Barruu keerraa kan dhufee guutee irraa hafaa\n" +
            "Galanni koo kanaaf hundumaaf hangafaa\n\n" +
            "Guyyaa qaba kan kee  Galmeen jireenyaa koo\n" +
            "        \"\"            \"\"              si'in haareeffame\n" +
            "        \"\"            \"\"              Duuti koo haqame\n" +
            "        \"\"            \"\"              jireenyaf waamame\n" +
            "       Jaalala kan keen jiruu koo booji'ite\n" +
            "       Mana kee keessatti oli na fudhatte\n\n" +
            "Guyyaa qaba kan kee Tiksee hoolotaa dha \n" +
            "        \"\"            \"\"              bakkee keessan joraa \n" +
            "        \"\"            \"\"              ati naa tuffanne\n" +
            "        \"\"            \"\"              akka nama taate\n" +
            "       laphee gaddi guutee gammachuti jijjiirta\n" +
            "       isaa cabee Dhufee barruu keen faayyista\n\n" +
            "Guyyaa qaba kan kee Ati Turtee hin haftuu\n" +
            "        \"\"            \"\"              Gonka nama gattuu\n" +
            "        \"\"            \"\"              Yeroo kee eeggatteeti\n" +
            "        \"\"            \"\"              Gooftaa kan naaf dhuftu\n" +
            "       kattaa laphee Koo jechaa keen cabsite\n" +
            "       Sagaleen kee guddaan naa jajjabeessite\n\n" +
            "               F/taa Geetahun Shawaa (KOO'EL)";

    String title = "Guyyaa qaba";

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