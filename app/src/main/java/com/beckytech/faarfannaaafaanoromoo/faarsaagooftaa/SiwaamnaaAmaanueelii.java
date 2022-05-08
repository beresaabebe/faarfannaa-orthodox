package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SiwaamnaaAmaanueelii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Amaanu’eelii /2/…………Si waamnaa amaanu’eelii \n" +
            "Abbaa arjaa hundaa olii…si waamnaa amaanu’eelii \n" +
            "Guyyaan waadaa yeroon geenyan……Si waamnaa amaanu’eelii \n\n" +
            "Nuyiif kaffalame beenyaan \n" +
            "Fannifamuu waaqa keenyaan \n" +
            "Oljenneerra nus kabajaan \n" +
            "Bilisoomnee diinni hidhame \n" +
            "Nageenyi addunyaaf labsame \n\n" +
            "Rukutamaa fannoo baattee \n" +
            "Gara qaraaniyoo deemtee \n" +
            "Cubbuu keenyaaf fannifamtee \n" +
            "Saamtuu wajjiin lakkaawwamtee \n" +
            "Nutis jaalala kee kana  \n" +
            "Hin callisnu ragaa baana \n" +
            "Dhaloota dhalootatti himna \n" +
            "Raajii hojii kee lallabna \n";

    String title = " Si waamnaa amaanu’eelii ";

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