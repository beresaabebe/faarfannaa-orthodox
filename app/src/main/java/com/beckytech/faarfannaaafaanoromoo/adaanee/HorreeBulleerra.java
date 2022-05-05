package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HorreeBulleerra extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Deebannne Horree Bulleerra\n" +
            "Waaqayyoon nu eebbiseera\n" +
            "Bachanee akka urjiif mansaa\n" +
            "Fedhasaan akka jechasaa\n\n" +
            "Galanni Uumaa ummamaf\n" +
            "Haa ta'u waaqa jiraataaf\n" +
            "Abboome roobsise bokkaa\n" +
            "Galataan guutee malakaa\n\n" +
            "Uumamanis ba'e waaqeessa\n" +
            "Qulqulluu bu'a waaqasaa\n" +
            "Tokkicha maqaa dhibbatiif\n" +
            "Sagadee ulfina isaatiif\n\n" +
            "Kan turee Addunyaa duraa\n" +
            "Jalqabaaf Mootii xumuraa\n" +
            "Ababoof marga biqilchee\n" +
            "Yeroo sat bareeche dachee\n" +
            "Qabatee marga lalisaa\n" +
            "Hundumtu isa weeddisa\n" +
            "Gurraacha garaa garbaatiif\n" +
            "Sagadee waaqumaa isaatiif\n\n" +
            "Jiraata Abbaa barootaa\n" +
            "Qindeessa ji'af guyyootaa\n" +
            "Waktii saat goga jiisee\n" +
            "Uumama hunda gammachiise\n" +
            "Qabatee marga lalisaa\n" +
            "Hundumtu isa weeddisa\n" +
            "Tokkicha maqaa dhibbatiif\n" +
            "Sagadee ulfina isaatiif\n\n" +
            "Ol-aanaa jirma jireenyaa\n" +
            "Hangafaa bokkuu nageenyaa\n" +
            "Qabannee isatti amannee\n" +
            "Nageenni badhaadha jennee\n" +
            "Bobbaane ardaa nagayaati\n" +
            "Gaaddisaaf iddoo ulfinaati\n" +
            "Badhaanee hunda rabbirraa\n" +
            "Uumaa lafaaf samiirraa\n\n";

    String title = "Horree bulleerra";

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