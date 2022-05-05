package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class UraaeelErgamaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Uraa'eel Ergamaa koottu nu gargaarii\n" +
            "Rakkoo Addunyaarra maaloo nu baraarii(2)\n\n" +
            "Kennaa qabda ati akka nu gargartuu\n" +
            "Maaloo Uraa'eel dafiitii nuuf koottuu\n" +
            "Nuto oli jennee maqaa kee waammanna\n" +
            "Gocha kee hundumaaf si galateeffannaa\n\n" +
            "Xoofoon kee Uraa'eel  Beekumsa qabaa\n" +
            "Gochaan gargaarsa kees bayyee aja’ibaa\n" +
            "Dheebonneto jirra  Uraa'eel nu yaadadhuu\n" +
            "Xoofoo keetin koottu nutin nu Obaafadhu\n\n" +
            "Qulqullicha Izraa akkumaa gargaartee\n" +
            "Kadhannaa keetin nutis nuu yaadattee\n" +
            "Gara keetti iyyannee humna argannee\n" +
            "Angoo diinaatirraa jabiinaan ejjennee\n\n" +
            "Dhiigaa Gooftaa xoofoon ati qeensitee\n" +
            "Addunyaa guutuu ittiin qulqulleesitee\n" +
            "Hundii keenyaa  isaan Qulqulloofnee\n" +
            "koottu Uraa'eel jennee si waamannee\n" +
            "                      =•|•=             \n" +
            "           F/taa Geetahun Shawaa(KOO'EL)\n";

    String title = "Uraa'eel ergamaa";

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