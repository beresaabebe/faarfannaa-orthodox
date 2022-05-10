package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MaalooYaaWaaqakoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maaloo yaa waaqa koo narraa hin fagatanii\n" +
            "Cubbu koo ilaaltee garaa hin jabaatinii\n" +
            "Si duwwaadhan qaba gulantaa lubbuukoo\n" +
            "Hidhadhaa na baastee sumadha wabiinkoo\n\n" +
            "Yoon taa'ee ilaaluu hojiikoo kaleessaa\n" +
            "Waan gaarii tokkolle hin qabu of keessa\n" +
            "Addunyaan bitamee daandii keen dagadhe\n" +
            "Oolmaakee waaqakoo ani nan irraanfadhe\n\n" +
            "Akka hojii koofo anoo yoona hin jiruu\n" +
            "Si qofa uumaakoo kan seena jijjiruu\n" +
            "Wayyaa kee yoon tuqe dhiignikoo dhaabbata\n" +
            "Si anaaf waaqakoo eenyuu na yaadataa\n\n" +
            "Imimmaan koos ilaaleen namaan jibbamu koos\n" +
            "Fayyina keen kottu mil'adhu mana koos\n" +
            "Harki kee qoricha anaaf bar waaqa koo\n" +
            "Maaloo naaf qabadhu madaadha qaamni koo\n\n" +
            "Ammas yaa waaqakoo sirreessi deemsakoo\n" +
            "Akkan siin jiraadhuuf bara jireenyakoo\n" +
            "Abdiin koo isa dhugaan mannikoo galgalaa\n" +
            "Jireenyi koo gooftaa si waliin naaf tola\n";

    String title = "Maaloo yaa waaqa koo narraa hin fagatanii";

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