package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Maariyaamiidhaafi extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maariyaamiidhaafi (2×)\n" +
            "ni farfannaafii bara\n" +
            "Balbala cufame      bara baraanii\n" +
            "Hiizqi’eel jedhe            \"\n" +
            "Qulqulleettii dhugaa     \"\n" +
            "Gonkumaa durboodha  \"\n" +
            "Fakkeenya godhanne    \"\n" +
            "Nutis isuma                 \"\n\n" +
            "Jaalala dhugaan ni faarfannaafi (2×)\n" +
            "Gugee garraamiidha\n" +
            "Labsituu nageenyaa\n" +
            "Jireenya dukkanaaf\n" +
            "Ifa kee nuuf ibsi\n" +
            "Ani sin kadhadhaa\n" +
            "Dubroo lubbuu kootiif\n\n" +
            "Yaa Qulqulleetii suma wabiin koo2×)\n" +
            "Baay’ee baay’ateeraa\n" +
            "Jaalalli nuf qabdu\n" +
            "Daangaa hin qabdu\n" +
            "Hin dubbatamu\n" +
            "Isheen nan gammadaa\n\n" +
            "Maqaa ishee nan faarfadhaaafii (2×)\n" +
            "Koottu koottu yoon jedhu\n" +
            "Guyyaa fi halkanii\n" +
            "Narraa adda hin bahinii\n" +
            "Naafis dhiyoodha isheen\n" +
            "Raajii raajii jechuun\n" +
            "Ni galateeffatu\n" +
            "Jaalala ishee ibsuuf jechatu hanqate (2×)\n";

    String title = "Nan carromee nan duromee";

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