package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class LubbuuSiifAbbomamu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Lubbuu siif abbomamu yaa Waaqayyo ati nu kenni\n" +
            "Gurra qalbii keenyas atii nuu bani\n" +
            "\n\n" +
            "Dhugadhaan kadhate kan si dhageessisu\n" +
            "Yakka irraa fagaate kan si gammachiisu\n" +
            "Nuu kenni yaa Gooftaa lubbuu qulqulla’e\n" +
            "Waan gaarii hojjechuuf kan dafee qophaa’e\n" +
            "\n\n" +
            "Gaarummadhaan deemuuf akka jecha keetti\n" +
            "Beenyaa nuu ta’uu kee hubanne sirriitti\n" +
            "Nuti akka jiraannuuf suga kee argannee\n" +
            "Nu gargaarii Gooftaa yeroo si kadhanne\n" +
            "\n\n" +
            "Gaddaaf dhiphina nu biraa baleessi\n" +
            "Deemsa keenya hunda ati nu sirreessi\n" +
            "Jaalala kee guddaa jabeenya godhanne\n" +
            "Gara kee haa dhufnu cubbuu irraa deebine\n" +
            "\n\n" +
            "Akka nurra buluuf jaalalli mana kee\n" +
            "Waaqayyo nuu kenni hubanno jecha kee\n" +
            "Humni kee olaanaan biyyoo irraa nu kaasee\n" +
            "Nu haa qulqulleessu diina keenya cabsee\n";

    String title = "  Lubbuu siif abbomamu yaa Waaqayyo ati ";

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