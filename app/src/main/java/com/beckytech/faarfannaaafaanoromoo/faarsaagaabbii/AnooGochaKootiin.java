package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AnooGochaKootiin extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ishoo /5/\n" +
            "Waaqnii nawajjin jiraa ishoo /2/ \n" +
            "Hiyyeessa fakkaadhus ishoo /2/\n" +
            "Qabeenya yoon dhabes ishoo /2/\n" +
            "Jaalalli Waaqayyoo   ishoo /2/\n" +
            "Nadhiisee hin beekuu ishoo /2/\n\n" +
            "Hiyyuummaan jiraachaa  ishoo /2/\n" +
            "Qullaa koo yoon deemes ishoo /2/\n" +
            "Gammadeen jiraadha  ishoo /2/\n" +
            "Qalbiin koo boqotee ishoo /2/\n\n" +
            "Waaqni waan na waameef ishoo /2/\n" +
            "Gammachu guddadhaaf ishoo /2/\n" +
            "Fuulli koo ifaa dha ishoo /2/\n" +
            "Ganamaaf galgalaa ishoo /2/\n\n" +
            "              Sinbirroota illee ishoo /2/\n" +
            "              Kan hin dhiisnee Gooftaan ishoo /2/\n" +
            "              Haagalateffamu ishoo /2/\n" +
            "              Ganamaaf galgala ishoo /2/\n\n" +
            "Eebba hojii kootiif ishoo /2/\n" +
            "Yeroo hundaa hin dhabu ishoo /2/\n" +
            "Waaqni haagalatoomuu ishoo /2/\n" +
            "Kan na hin qaanessiinee ishoo /2/\n";

    String title = "Ishoo ishoo  ";

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