package com.beckytech.faarfannaaafaanoromoo.lameen2011;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AmaanueelAbbaaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Amaanu'eel Abbaa koo Obsaa cubbuu kan koo\n" +
            "Ana waliin taatee bara jireenya koo               \n\n" +
            "Baayyina cubbu koof dhiiga kee lolastee\n" +
            "Garbummaa Seexanaa jala na baraartee\n" +
            "Gooftaa na  jaallattee ol fuute na baatee\n" +
            "Si'ool furtuun cuftee lubbuu koo ati baastee   \n           \n" +
            "Wanta hunda laalee hundumaas madaalee\n" +
            "Gochan kee uumaa koo hundaa naaf caalee\n" +
            "Situ naf rawwatee ati ni dandeessaa\n" +
            "Ati naa gargaari ani sitaan dheessaa     \n     \n" +
            "Ijoollee saaf jedhee waan hedduu ta'eeraa\n" +
            "Dhiphina fannoosaan dhiphuu nuu baasera\n" +
            "Kansaa dagatamuu Gooftaan yaa galatuu\n" +
            "Dhaloonni hundumtuu isa haa faarfatuu\n\n" +
            "          F/taa Dn Abeara Baqqalaa                           \n";

    String title = "Amaanu'eel abbaa koo";

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