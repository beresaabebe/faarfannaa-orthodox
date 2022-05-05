package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Itiyoophiyaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Itoophiyaa ol-kaasii harkaa kee \n" +
            "Waaqayyo ni qoorsaa imimmaan kee\n" +
            "Tawaahidoo ol-kaasii harkaa kee \n" +
            "Deebii siif laata waaqayyoon kee.\n" +
            "Ceesisa \n\n" +
            "Esawuu fi Yaa'iiqoob maaf maaf taane nutii \n" +
            "Wal haa jaallannu tokko taaneti\n" +
            "Rakkoon bayyate addaan fagannuus \n" +
            "Tokko nu godhe dhiigni Iyyesuus. \n" +
            "Ceesisa \n\n" +
            "Nagaa fi jaalalli tokkumman dhibe\n" +
            "Seenaa gurracha hunduu wal dibe \n" +
            "Waan nyaatu dhabe godaane Israa'el \n" +
            "Maariyaam nuuf kadhuu ilma kee Amaanu'el. \n" +
            "Ceesisa \n\n" +
            "Seenaa kee balleessuf maaf maraatuu \n" +
            "Daangaa kee hormatti gurguratu\n" +
            "Jiraaree Abbaan Pheexiroos kaleessa \n" +
            "Biyyaaf kan du'u dabarsee lubbuusa.\n" +
            "Ceesisa \n\n" +
            "Fara'oon hin jiru aangoo irraa bu'ee\n" +
            "Bilisa baane Kiristoos du'a mo'ee\n" +
            "Garboota miti taane ijoollee isaa\n" +
            "Dukkaanni darbee arganne ifa isaa.\n" +
            "Ceesisa \n\n" +
            "Kan Keefaa fi Appiloos jechuun wal qooduu\n" +
            "Obbolaan Yooseef ajjeessuuf gaadu \n" +
            "Ajjeessan kaleessa du'e argamee \n" +
            "Aangoon mo'iicha unuuf kennamee.\n";

    String title = "Itiyoophiyaa";

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