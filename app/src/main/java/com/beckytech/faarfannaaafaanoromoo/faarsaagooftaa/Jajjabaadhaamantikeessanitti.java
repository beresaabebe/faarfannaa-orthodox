package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Jajjabaadhaamantikeessanitti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Jajjabaadha /2/ amanti keessanitti jabaadha /2/   \n" +
            "Sobaan dhugaa bahuun hin danda'amu /4/ eyyee\n" +
            "\n\n" +
            "Ni amanna niabdanna ergamoota waaqaattis imanna /2/\n" +
            "Yeroo rakkiinaafi yeroo gidiiraa yeroo dhiphiinaafis abdii nuuta’u /2/ eyyee\n" +
            "\n\n" +
            "Yaa Maaraamii yaahaadhaakoo dhaabbadhu mirgakoo /2/\n" +
            "Ilmakee naaf kadhuu waa’ee cubuukoo /4/eyyee\n";

    String title = " Jajjabaadha amanti keessanitti ";

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