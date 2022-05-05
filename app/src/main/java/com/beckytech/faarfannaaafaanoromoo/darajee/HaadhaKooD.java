package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HaadhaKooD extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Haadhakoo (4*2)\n" +
            "Maariyaam (2*) kottumee garakoo\n" +
            "         Ceesisa\n\n" +
            "Gaabri'eel ergaman gara keetti ergame\n" +
            "Ilma deessa jedhee sagadee siif hime\n" +
            "Qulqulleetti Elsabexi afuuraan guutamte\n" +
            "Ulfii gadameessa maariyaamiif sagadee.\n" +
            "         Ceesisa\n\n" +
            "Hewaaniin cufamnaan balballii gannataa\n" +
            "Dubroo maariyaamiin baaname lammataa\n" +
            "Xalayaan gabrummaa nurratti barra'ee\n" +
            "Ilma maariyaamiin nurraa barbadaa'ee.\n" +
            "         Ceesisa\n\n" +
            "Haadha Fannoo jalaa kan guyyaa jimaata\n" +
            "Maqaashee yoon waamuu keessikoo boqota\n" +
            "Anaaf kennamtertti karaa Yohanniis\n" +
            "Aniis naan fudhadhee haafha Iyyesuus.\n" +
            "         Ceesisa\n\n" +
            "Maal taatee dhiphatee ati Dokimaasi\n" +
            "Mana kee kan jirtuu haadha Iyyesuus\n" +
            "Amanii himadhuu dhiphuu keessa keeti\n" +
            "Ooltee osoo hin buliin furmaata argataati.\n" +
            "         Ceesisa\n\n" +
            "Dammarra mi'awwa maqaan kee Maariyaami\n" +
            "Urgaanshee ni caalaa urgooftu Naardoos\n" +
            "Keessi godoo kooti maariyaamiin miidhagee\n" +
            "Salphiinaaf hir'uukoo isheetu naaf agugee.\n";

    String title = "Haadha koo";

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