package com.beckytech.faarfannaaafaanoromoo.faarsaafannoo;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SabaKiristannaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Damaraa walitti qabaa muka bobeessaa\n" +
            "Aarrisaas  ni  ta’aa  mallattoosaa\n" +
            "Bakkicha gad fageessaatti qotaa\n" +
            "Achumaan argattuu fannoo gooftaa(2)\n\n" +
            "Birraan nuuf gahee…egaa kunoo\n" +
            "Booqaan masqalaa…nuu baar’ee\n" +
            "Dukkaanni aduunyaaf…rakkoon nama\n" +
            "Fannoo iyyaasuusin…isaan hafe\n\n" +
            "Bara dheeraadhaf…badee turuus\n" +
            "Dhokate hin hafne…ni argame\n" +
            "Dawwa dhukkubaa…nama  huundaa\n" +
            "Huumna  seexanaa…cabsee mo’ee\n\n" +
            "Kiriyaakosin…ni gorfamtee\n" +
            "Mootitti illenin…fannoo argatte\n" +
            "Qosxanxiinosis…fannoosaattin\n" +
            "Diinootasaa huunda…injifatee\n\n" +
            "Masqalii wagga…kabajamuuf\n" +
            "Dhaloota dhufuun…itti  fufaa\n" +
            "Dinni nurratti…humna hin qabu\n" +
            "Fannoosaa arginaan…nahee kufaa\n\n" +
            "Saba kiristaanaa hawwiin kee rawwatee\n" +
            "Kan goofta iyyaasuus  irraatti  dhiphaate\n" +
            "Bara dheeraadhaf badee dhookatee\n" +
            "Mottiti  illeeniitu  mul’ataan argatte\n";

    String title = " Damaraa walitti qabaa muka bobeessaa";

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