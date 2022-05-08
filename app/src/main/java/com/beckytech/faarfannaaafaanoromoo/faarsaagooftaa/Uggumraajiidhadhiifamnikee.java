package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Uggumraajiidhadhiifamnikee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Uggum raajiidha dhiifamni kee\n" +
            "Na booji'eeraa jaalalli kee\n" +
            "Eelshaadayidha ati gooftaa hundaa dandeessaa\n" +
            "Kan ati naa goote adduunyaattin labsaa\n\n" +
            "     Guyyaa baay'ee yaadee'e dhiphachuun\n" +
            "     Jiraachuu hin dandeenye boqonnaa argachuun\n" +
            "     Har'a nan jabaadha kan darbee hubadhee\n" +
            "    Wanta bor ta'uufi abdi si godhadhee (2)\n\n" +
            "Rawwatameef jedhee dinnikoo gammadee\n" +
            "Karaattin dhabaadhe wanta baay'ee yaadee\n" +
            "Humni kee naa dhufnaan aangoo naan argadhee\n" +
            "Du'a jala ba'een olkaa'en dhaabbadhee (x2)\n\n" +
            "      Gatameetan ture kan irraanfatamee\n" +
            "      Akka yaada namatti du'eera jedhamee\n" +
            "       Isaa dagatamee ni yaadattaa ati\n" +
            "       An sittan gammadaa barakoo hundaatti (x2)\n\n" +
            "Madaa baay'een qabaa keessa kooti\n" +
            "Kan namni naa hin beekne muldhaate bakkeetti\n" +
            "Tolaa naaf laatame fayyinni sirkaati\n" +
            "Bara hamma baraatti galanni kan keeti (x2)\n";

    String title = " Uggum raajiidha dhiifamni kee ";

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