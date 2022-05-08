package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HaaGalateeffamuWaaqni  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Haa galateeffamu waaqni har’aan nu ga’ee\n" +
            "Bara keenya guutuu isa nu danda’ee\n" +
            "Har’aa gahuu keenyaaf galata galchina\n" +
            "Hundumtuu walgeenyee kottu ni ililchina\n\n" +
            "     Warra diina keenyaa yaaddon watwachisaa\n" +
            "     Summii daawwaa hin qabnee isaanii nyaachisee\n" +
            "     Waaqni waqeessinuu waaqa salphaa  miti\n" +
            "    Kanaafuu guyyaan har’aa guyyaa galataati\n\n" +
            "Har’aaf yoo nu miidhee irreen diina keeya\n" +
            "Dabareedhaa nuufis moo’ichi kan keenyaa\n" +
            "Humna waaqayyootiin aangoon diina cabee\n" +
            "Gammadaa amantoota gadduun keenya ni hafe\n\n" +
            "    Ibsaan keenya hin dhaamuu sichi ni boba'aa\n" +
            "    Gurri keenya duudees waan gaarii dhaga’a\n" +
            "    Amantii meeshaadha gachana waranaa\n" +
            "    Kan ittin mo’atan mootummaa seexanaa\n";

    String title = " Haa galateeffamu waaqni har’aan nu ga’ee ";

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