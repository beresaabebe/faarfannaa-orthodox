package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaNamaaDeebii  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa namaa deebi’ii gara Waaqa keetti\n" +
            "Maaliif irranffatte waa’e lubbu keeti\n" +
            "Fedha fooniis dhiisi soobe sii goyyomsa\n" +
            "Isatti dhaabuun kee abidatti bulta\n" +
            " Kanaaf yaa namoota jedhe yaadachisa\n" +
            " Jiraachuun qophaa’a fedha fooniin dhiisa\n" +
            "Yaa nama qophaa’I dhufa Goofta keeti\n" +
            "Mirgasaa dhaabbate akka gammaduuf\n" +
            "Cubbuurraa deebi’i qalbi jijjirradhu\n" +
            "Balleessa kee dhiisi Waaqa kee kadhadhu\n";

    String title = " Yaa namaa deebi’ii gara Waaqa keetti ";

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