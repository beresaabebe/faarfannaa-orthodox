package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NanDhibinLubbuuKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nan dhibin lubbuu koo mee narrakisiini/2/\n" +
            "Tokkicha sii uumee waaqayyooti aamani /2/\n\n" +
            "Deebi'i lubbuu koo dhugaa rabbii yaadi\n" +
            "Akka fayyituuf gooftaa kee barbaadi\n" +
            "Gooftaa nu kennuu isaa fanoora oluun isaa\n" +
            "Seexan haarka baase sitaasiissuuf kansaa \n\n" +
            "Daandi isaa daandi kee goodhiti qabadhu\n" +
            "Cubbuudabarsiteef  Gooftaati dhiyaadhu\n" +
            "Kan darbunke hin olee kan boru dabartuuf\n" +
            "Of beeki lubbuu koo hinbitamin cubbuuf\n\n" +
            "Gammachun kee haara'aa booru siboochistii\n" +
            "Mootummaa Waaqayyoo yaadi kan kee taatii\n" +
            "Mana kee ijaarradhuu lubbuu koo gorfamii\n" +
            "Ajajaa waaqayyoof jaalalan bitamii\n" +
            "Ajaja waaqayyoof jaalalan bitami \n";

    String title = "Nan dhibin lubbuu koo mee ";

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