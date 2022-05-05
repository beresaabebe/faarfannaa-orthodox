package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Qaraniyoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Eyyee Qaraniyoo irra inni oolee(2)\n" +
            "............................................\n\n" +
            "Qaraniyoo irraa inni oolee\n" +
            "Madaa lubbuu keenyasa ilaalee\n" +
            "Ni raawwate Innoo Waadaa galee\n" +
            "Qaraniyoo irra inni oolee\n\n" +
            "Diina Daabiloos kan awwalamee\n" +
            "Xalayaan du'a gargalfamee\n" +
            "Ilma waaqayyoo kiristoosini\n" +
            "Birmaduu bahe Addunyaanii\n" +
            "............................................\n\n" +
            "Jaalala keenyaf baate Fannoo\n" +
            "Golgootaa deeme Qaraniyoo\n" +
            "Sarbii ol bahee kufee gad bu'ee\n" +
            "Nu fayyifatee hunda danda’ee\n" +
            "............................................\n\n" +
            "Hundaafu du'e tokko ta'e\n" +
            "Samii samii irraa gad bu'e\n" +
            "Sababa malee nu jaallate\n" +
            "Hoolota isaatiif lubbuu laate\n" +
            "............................................\n\n" +
            "Seera Abaarsaa jalaa nu fureera\n" +
            "Waanjoo garbummaas caccabsera\n" +
            "Galma Si'ool barbadeessee\n" +
            "Sanyii Addam hunda bilisoomse\n\n" +
            "Qaraniyoo irra inni oolee\n" +
            "Madaa lubbuu keenya laalee\n" +
            "Ni raawwate Innoo Waadaa galee\n" +
            "Qaraniyoo irra inni oolee\n" +
            "Funca jaalalaatiin ofitti nu hidhatee\n" +
            "Gatii Dhiiga baasee kansaa nu godhate\n" +
            "Abbaa Abbaa jennee baallee ittin yaabnu\n" +
            "Nuuf laate kiristoos garbummaa hin qabnu\n" +
            "";

    String title = "Qaraniyoo";

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