package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaMikaaeelHangafaErgamootaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa mikaa’eel hangafa ergamootaa\n" +
            "Cubbuu keenyaan kufnee akkaa hin duneef\n" +
            "Ati nuu gargaarii nu siwaammannee\n\n" +
            "Qomoo yaa’oqoob     . Mikaa’el\n" +
            "Israa’eeliif                      “\n" +
            "Sii eegduun saanii.         “\n" +
            "Kan gargaatedhaa           “\n" +
            "Jaalaala nuuf kennii nageenyaa\n" +
            "Yaa Mikaa’eelii Abbaa keenya\n\n" +
            "Wayyaan kee warqe... Mikaa’el\n" +
            "Fuulii kee ifaa               “\n" +
            "Aangoo qabeessaa.         “\n" +
            "Garaa laafessaa             “\n" +
            "Jaalaala nuuf kennii nageenyaa\n" +
            "Yaa mikaa’eelii abbaakeenya\n\n" +
            "Fakkiikee dura….. Mikaa’el\n" +
            "An nan dhaabbadhaa …. “\n" +
            "Rakkoo koo hundaa …. “\n" +
            "Sittaan himadha……. “\n" +
            "Jaalaala nuuf kennii nageenyaa\n" +
            "Yaa mikaa’eelii abbaa keenya\n\n" +
            " Na hin daagaatin jedhee............Mikaa’eel                                           \n" +
            "Ani siin dagadhu……’’                                  \n" +
            "Hangaafa ergamootaa’’…………….                            \n" +
            "Qulqulluu Mikaa’eel “                                            \n" +
            "Jaalaala nuuf kennii nageenyaa                         \n" +
            "Yaa Mikaa’eelii Abbaakeenya\n\n" +
            "Mikaa'eel ni bu'ee.            Mika'el\n" +
            "Koochoosaa rukkutaa(2)\n" +
            "Hangafni ergamoota\n" +
            "Qulqulluu Mika'el\n";

    String title = "Yaa mikaa’eel hangafa ergamootaa";

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