package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KanLapheeKiyyaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kan laphee kiyyaa Eenyuttan himaa\n" +
            "Haadha waaqayyoo sumatti malee\n" +
            "Kanan gammaduus maqaa keetinii\n" +
            "Haadha koo si haa gahu galanni\n\n" +
            "Qulqulloonni ishee kan Abdatanii(2)\n" +
            "Addunyaa gubaa jala bahanii\n" +
            "Maqaa keen fayyaa kan dhukkubsatee(2)\n" +
            "Hedduu rajjinbkee nama hubatee\n\n" +
            "kanan beela koo sitti irraanfadhuu(2)\n" +
            "Sin qabaafanii kanan dhaabbadhuu\n" +
            "Si kadee dhabuu waan fedhii kiyyaa(2)\n" +
            "Gara keen iyyaa yaa harmee tiyyaa\n\n" +
            "Cubbuun koo hedduun narra tullame(2)\n" +
            "Akkan hin bannee kanan waammamee\n" +
            "Mana keen yaade na ilaalchisii(3)\n" +
            "Biyya jannata san na dhaalchisii\n\n" +
            "Ergana qaba mee ati naa dhaqii(2)\n" +
            "Ilma kee biraa yakka koo haqii\n" +
            "Dandiin waaqayyoo na harkaa badee(2)\n" +
            "Akkan hin kufne achumaan badee\n\n" +
            "F/ttuu Faantuu Waldee(Amaariffan)\n";

    String title = "Kan laphee kiyyaa Eenyuttan himaa";

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