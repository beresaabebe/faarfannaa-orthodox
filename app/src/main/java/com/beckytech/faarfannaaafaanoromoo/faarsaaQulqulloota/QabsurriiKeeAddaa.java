package com.beckytech.faarfannaaafaanoromoo.faarsaaQulqulloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class QabsurriiKeeAddaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Qabsurrii kee addaa dubbanne hin fixnuu \n" +
            "Diinni ni rifataa maqaa kee yoo waamnuu \n" +
            "Meexxii kee qabadhuu nuuf koottu arseemaa \n" +
            "Abdiin sii eeggannaa nut yeroo hundumaa\n" +
            "Ceesisa\n" +
            "Sinboo foonis qabdaa turtee \n" +
            "Miidhagina kees ni tufattee \n" +
            "Qerrummaa keeti ni jirattee \n" +
            "Waaqayyoo keetif amanamtee \n" +
            "Eegaa maal jennaa kasoominaa kee \n" +
            "Sirraa barannee obsaaf amantii kee×2\n" +
            "   Ceesisa\n" +
            "Teediroosif axnasiyaanii \n" +
            "Wareegan kan sii argatanii \n" +
            "Ijoolummaa keen waaqa bartee \n" +
            "Misirroo ta'uf wareegamtee\n" +
            "Eegaa maal jennaa kasoominaa kee \n" +
            "Sirraa barannee obsaaf amantii kee×2.\n" +
            "   Ceesisa\n" +
            "Mootichi dirxaadis dhaadatee \n" +
            "Si baleesuudhaaf karoorfatee \n" +
            "Garaansaa kan sitti jabaatee\n" +
            "Gidiraa guddan daraaramtee\n" +
            "Eegaa maal jennaa kasoominaa kee \n" +
            "Sirraa barannee obsaaf amantii kee×2.\n" +
            "Ceesisa \n" +
            "Eebba kan keerrati nuf hirii \n" +
            "Haareessii seenaa nuf jijjirii \n" +
            "Bishaan eebbifame mana keeti\n" +
            "Dhugnee fayyinaa dhibeerraati\n" +
            "Eegaa maal jennaa kasoominaa kee \n" +
            "Sirraa barannee obsaaf amantii kee×2.\n";

    String title = "Qabsurrii kee addaa dubbanne hin fixnuu";

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