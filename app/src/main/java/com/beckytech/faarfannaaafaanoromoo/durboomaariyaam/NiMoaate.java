package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NiMoaate extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "(Na moo’te jireenyi koo\n" +
            "Na jabeessi Giiftii koo) (2)\n" +
            "Wabii ta’ii dhaabbadhuu lubbuu koof (2)\n\n" +
            "      Ati taabota Muusee ulee Aaroonidha\n" +
            "      Sanyii Addaam hundaaf ati araarsituu dha\n" +
            "     Yaa’iqoob kan argee finootolozaatti\n" +
            "      Kadhaa keenya kan ol baaftuu yaabannoo warqiitii\n\n" +
            "Baganaa Daawwit yaa biiftuu ganamaa\n" +
            "Ifa keetiin baddee dhiphuun dhala namaa\n" +
            "Haadha Qulqullootaa gonfoo ulfinasaanii\n" +
            "Lubbuun cubbamootaa fayyee Ilma keet iinii\n\n" +
            "    Gammadi yaa durbee deessuuwaaqayyoodha\n" +
            "     Sanyii ijoollee Addaamiif ati  araarsituudha\n" +
            "     Cubbuun koo nan dhaabuu fuula Ilma keetii\n" +
            "     Guyyaa mutii sanaa wabii naaf ta’i atii\n\n" +
            "Na gargaari Maariyaamii an waan tokko hin qabu\n" +
            "Fayyisaan ilmi kee homaa hin dadhabu\n" +
            "Cubbuuf na qopheessee dadhabbinni foon koo\n" +
            "Kadhannaa keetiin na jabeessi giiftii koo\n";

    String title = "Ni moo'ate";

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