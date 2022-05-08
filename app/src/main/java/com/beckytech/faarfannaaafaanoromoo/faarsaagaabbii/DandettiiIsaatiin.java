package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DandettiiIsaatiin extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Dandettii isaatiin Waaquma isaatiini /2/\n" +
            "Cubbuu nuuf dhiisaa baay’ee nu eegaa/2/ arjummaa isaatiin\n\n" +
            "            Maaltu kennamaafi gatiin isaas maalidha\n" +
            "            Waaqa nu uumeefi kan nu jiraachisuuf\n" +
            "            Yeroo kan nu kenne qalbi jijjirrachuuf\n" +
            "            Akka jala hin badnef du’aa irraa nu oolchuuf \n" +
            "            Cubbuu nuuf dhisaa baay’ee nu egaa/2/ arjummaa isaatiin\n\n" +
            "Namni badisaa irraa hanga deebi’uuf\n" +
            "Ni obsa Waaqayyoon waan hamaa fiduufi\n" +
            "Obsi isaa bal’aadha guddaadha gochisaa\n" +
            "Kennee jalaa hin dhumuu baay’ee dha arjummaansaa\n";

    String title = "Dandettii isaatiin Waaquma isaatiini";

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