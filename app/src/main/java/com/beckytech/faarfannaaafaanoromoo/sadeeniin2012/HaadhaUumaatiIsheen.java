package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HaadhaUumaatiIsheen extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ni galateeffannaa Haadha uumaati isheen\n" +
            "Nutis argannee fayyina sababa isheen\n" +
            "Gooftaan si filate ijoolleesaa baasuuf\n\n" +
            "Karoora diina keenyaa kan jala jigsee\n" +
            "Iddoo nuti yaadnee kan nu geessisee\n" +
            "Isheetu nuuf dahee akkamin dagannaa\n" +
            "Kabaja kennaa  Maariyaam kabajnaa\n\n" +
            "Isheetu nu nyaachisee soorata harkasaa\n" +
            "Kun waadaadhaa hin taanee akka tasaa\n" +
            "Isaatu nun jedhee dhaladheetan dhufaa\n" +
            "Harka diinarraa Dhufeetiin siin baaffaa\n\n" +
            "Durbeerraa arginee ifichaa isa guddaa\n" +
            "Akkamin callisnaa kan shee kun addaa\n" +
            "Hundinuu ka'aa mee ni galateeffannaa\n" +
            "Waa'ee gochaa ishees nuti ni dubbannaa\n\n" +
            "Dubreen kan kadhateef hunduu ni guutamaa\n" +
            "Jireenyi dukkanaas ifaa guddaan jijjiiramaa\n" +
            "Kan dagatuu eenyuu Kennaa Gooftaatii\n" +
            "Gola mana keenyaa seentee nuuf ilaaltii\n" +
            "         =====•|•=====\n" +
            "       F/taa Abarraa Baqqalaa\n";

    String title = "Haadha uumaati isheen";

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