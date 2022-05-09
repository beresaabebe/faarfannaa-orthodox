package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IshooIshooNuuDhalate extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ishoo ishoo nuu dhalate (2×)\n" +
            "Samii samiirraatii gadbu’e\n" +
            "Dubroo Maariyaamiirraa nuuf dhalate\n\n" +
            "Osoo inni hindhalanne ishoka ishoo\n" +
            "Arjaan waaqni keenya                \"\n" +
            "Yoom argamti turte                    \"\n" +
            "Jannat galmi keenyaa                 \"\n\n" +
            "Ifni ba’eeraafii   ishoka ishoo\n" +
            "Sabasaa hundumaaf      \"\n" +
            "Adeemsi dukkanaa        \"\n" +
            "Akka hin nuffisiifneef     \"\n\n" +
            "Akkasitti bu’e     ishoka ishoo\n" +
            "Samii gara keenyaa      \"\n" +
            "Saba isaa fayyisuuf       \"\n" +
            "Hidhaa seexanaarraa    \"\n\n" +
            "Waaqayyo Abbaan erge   Ishoka ishoo\n" +
            "Tokkicha ilmasaa                  \".\n" +
            "Inni jaalateeraa                     \"\n" +
            "Addunyaa bilisaan                 \"\n";

    String title = "Ishoo ishoo nuu dhalate";

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