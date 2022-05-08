package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Yaanamadafitiideebiigarawaaqatti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa nama dafitii  deebi’i gara waaqatti\n" +
            "Gooftaan osoo hin dhufin   maaloo yaa nama\n" +
            "Qalbii jijjiiradhuu\n" +
            "Badiidhaf dhufeera\n" +
            "Dafiiti baqadhuu\n" +
            "Biyyi lafaa kuni\n" +
            "Sobe si goyyomsaa\n" +
            "Yeroof sitti tolaa\n" +
            "Boddee si balleessa\n" +
            "Yakka dhiisitii\n" +
            "Waaqayyoo kadhadhu\n" +
            "Akka fayyituufi\n" +
            "Cubbuurraa fagaadhu\n" +
            "Fedhii fooniif jettee\n" +
            "Waaqa irra fagattee\n" +
            "Harkuma keetiin\n" +
            "Abidda of keechee\n";

    String title = " Yaa nama dafitii  deebi’i gara waaqatti ";

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