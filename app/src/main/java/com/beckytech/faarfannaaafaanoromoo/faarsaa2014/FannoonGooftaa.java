package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FannoonGooftaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Fannoon Gooftaa Argamee\n" +
            "Yihuudotaan Inni Awwaalamee(2)\n" +
            "Eeyyee\n" +
            "Faajjiin Nageenyaa Kunoo Lallabamee(2)\n" +
            "Fannoodhaan Diinni Ni Moo'amee\n" +
            "Eyyee(3)\n" +
            "         \uD83C\uDF39✝\uD83C\uDF39\n" +
            "Waggaa Hedduuf Dhoksamee\n" +
            "Akka hin baaneef Fannoon Awwaalamee\n" +
            "Aarri Ixaanaa Gomboobee\n" +
            "Illeeniidhaaf Fanoo Argamsiisee\n" +
            "Eyyee\n" +
            "Eyyee(3)\n" +
            "       \uD83C\uDF39✝\uD83C\uDF39\n" +
            "Raajii Hedduu Hojjetee\n" +
            "Humni Fannoo Diina Injifatee\n" +
            "Dhukkubsataa Fayyisee\n" +
            "Warra Jaames Ija Isaaniif Ibsee\n" +
            "Eyyee\n" +
            "Eyyee(3)\n" +
            "       \uD83C\uDF39✝\uD83C\uDF39\n" +
            "Morma keenyatti hidhannee\n" +
            "Kan nu morman afuura hamaa moonee\n" +
            "Fannoof Galanni ta'aa\n" +
            "Warri hin beekne mee maaloo dhaga'aa\n" +
            "Eeyyee\n" +
            "Eeyyee(3)\n";

    String title = "Fannoon gooftaa";

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