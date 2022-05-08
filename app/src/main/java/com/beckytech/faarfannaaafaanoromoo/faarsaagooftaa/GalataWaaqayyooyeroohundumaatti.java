package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GalataWaaqayyooyeroohundumaatti  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galata Waaqayyoo yeroo hundumaatti/2/\n" +
            "Akka Daawiit anoo garbicha isaati /4/Eyyee\n" +
            "Gooftaan koo Amaanu’eel baay’ee najaalate/2/\n" +
            "Seexana harkaa dhiiga isaan na bitate/4/Eyyee\n" +
            "Seexanni haa leeyaatu mormituun dinnikoo/2/\n" +
            "Humna Gooftaan mo’achuun yoomis kan koo/4/Eyyee\n";

    String title = " Galata Waaqayyoo yeroo hundumaatti";

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