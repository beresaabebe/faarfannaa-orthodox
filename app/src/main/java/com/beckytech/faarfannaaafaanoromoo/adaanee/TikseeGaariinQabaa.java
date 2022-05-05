package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class TikseeGaariinQabaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Tiksee gaariin qabaa\n" +
            "Abbaan gaariin qabaa\n" +
            "Waa’eesaan odeessaa\n" +
            "Jireenyi koo isaa\n\n" +
            "Bittaan saa jaalalaa\n" +
            "Haadhaf Abbaa caalaa\n" +
            "Ano hubadheeraa\n" +
            "Harka koo ol kaaseera\n\n" +
            "Tiksee amanamaa    \n" +
            "Abbaa jaalatamaa    \n" +
            "Iddoo boqonnaa koo    \n" +
            "Iyyesuus nagaa koo\n\n" +
            "Waa’ee koof dhanamee\n" +
            "Eebboon waranamee\n" +
            "Naaf kenne lubbuusaa\n" +
            "Eenyuu kan akka saa\n\n" +
            "Naaf yaada hundarra\n" +
            "Addaan ba'usaa rraa\n" +
            "Moo’eraa onnee koo\n" +
            "Iyyesuus mootiin koo\n\n" +
            "Michuu tokkon qaba\n" +
            "Gocha saa lallabaa\n" +
            "Iyyesuus jedhamaa\n" +
            "Fayyisaa hundumaa\n";

    String title = "Tiksee gaariin qabaa";

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