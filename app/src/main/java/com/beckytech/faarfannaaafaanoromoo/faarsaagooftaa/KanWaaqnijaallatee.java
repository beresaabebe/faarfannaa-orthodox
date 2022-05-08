package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KanWaaqnijaallatee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kan waaqni jaallatee  jaalal yaa namaa\n" +
            "Balballii jireenyaa isaan nuuf banamaa(x2)\n\n" +
            "        Afaan ergaamoota     kan waaqi jaallatuu\n" +
            "        Yennaallee dubbattee         \"\n" +
            "        Tsoomiif sagadanii             \"\n" +
            "        Yollee of dhiphiftee           \"\n" +
            "        Jaalala maleessa ofiif rakkattee (x2)\n\n" +
            "Raajllee dubbachuu   kan waaqi jaallatuu\n" +
            "Ennuma dandeessee              \"\n" +
            "Beekuumsa hundumaan        \"\n" +
            " Ennaallee of geesse              \"\n" +
            "Kan jaalala caaluu maalfaa dhageessee (x2)\n\n" +
            "         Wanta qabdu keessa kan waaqi jaallatuu\n" +
            "          Rakkata dhaaf laatte            \"\n" +
            "          Amantii guutusi                   \"\n" +
            "          Ennullee qabatte                 \"\n" +
            "          Jaalala maleessa maalumaa abdattee\n\n" +
            "Jaalalli danda'adha  kan waaqi jaallatuu\n" +
            "Qaba gaarummaasi               \"\n" +
            "Namarratti hin yaadu            \"\n" +
            "Waanuma hamaasi                \"\n" +
            "Of hin bubbukooksu hin beeku hinaaffaas (x2)\n";

    String title = " Kan waaqni jaallatee  ilaala yaa namaa ";

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