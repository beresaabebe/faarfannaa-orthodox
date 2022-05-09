package com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MiidhaganiiBareedu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Miidhaganii bareedu misiroon keenya bareedu (2)\n\n" +
            "Akka Abramiif Saaraa      >>       >>             >>\n" +
            "Isiin haa Eebbisuu           >>       >>           >>\n" +
            "Dhala gaarii godha         >>        >>           >>\n" +
            "Bara dheeraf tura            >>        >>           >>\n\n" +
            "Inni gifti jedhee               >>        >>           >>\n" +
            "Isheen Goofta jette          >>         >>          >>\n" +
            "Mana gaarii ijaara            >>         >>         >>\n" +
            "Wajjiin in jiraadha            >>         >>         >>\n\n" +
            "Misiroonii miidhaganii\n" +
            "Minzoolinii dhabatanii\n" +
            "Farfaatonni maarsuudhanii\n\n" +
            "Isaan lamaa mitti misiroon keenya bareedu\n" +
            "Foon tokko ta’anii           >>        >>     >>\n" +
            "Eebba Waaqayyoottin    >>        >>     >>\n" +
            "Har’aa ni murta’anii         >>       >>     >>\n" +
            "Fooniif dhiiga Gooftan    >>       >>     >>\n" +
            "Tokko kan ta’anii         >>       >>       >>\n\n" +
            "Dibata Qulqulluu misiroon keenya bareedu\n" +
            "Gooftaan ni eebbisaa  >>      >>        >>\n" +
            "Mariyaamii  wajjin         >>      >>      >>\n" +
            "Ilmaa ishee wajjin         >>      >>      >>\n" +
            "Mikaa’el wajjin              >>      >>      >>\n" +
            "Gabr’eel wajjiin            >>         >>     >>\n" +
            "Eebbaa  goonfatanii      >>       >>       >>\n" +
            "Ergamonni marsanii      >>       >>     >>\n";

    String title = "Miidhaganii Bareedu ";

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