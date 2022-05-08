package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Galannigalannihaataufsillaaseef  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galanni galanni haa ta’uf sillaaseef\n" +
            "Akka isaa jajannuuf waaqa nuuf eeyyameef\n" +
            "Rehobot jechuudha galata galchina\n\n" +
            "Jaalala isaatiin hundaa kan raawwatuu\n" +
            "Rakkoo dhala nama furmaata kan laatu\n" +
            "Kunoo babaldhannee sagalee isaatini\n" +
            "Sichi ni baay'annaa eebba waaqayyoonii (2)\n\n" +
            "Xiqqoo yoo ta’e iyyu jalqabani keenyasi\n" +
            "Abdii keenya nuufii waaqni amananuusi\n" +
            "Turee fakkaatu iyyuu gooftaa uummaan keenya\n" +
            "Tasaa isaa hin dursuu fiigee dinni keenya(2)\n\n" +
            "Ni galateeffatu surafeel kirubeel\n" +
            "Qulqulluu qulqulluu qulqulluu israa'eel\n" +
            "Osso hin jijjiramiin waaqummaa isaattin\n" +
            "Mo’ee kan jiraatuu barumaa baranii(2)\n";

    String title = " Galanni galanni haa ta’uf sillaaseef ";

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