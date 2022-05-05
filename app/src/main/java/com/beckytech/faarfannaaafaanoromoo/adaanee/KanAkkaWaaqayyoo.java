package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KanAkkaWaaqayyoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kan akka waaqayyoo Eessatti argamaa(2)\n" +
            "Ililleef gammachuun faarsina yaa nama\n\n" +
            "Galaana Eertiraa kan kutee\n" +
            "Mormitoota isaa kan fixee\n" +
            "Ceesiseera inno ijoolleessa\n" +
            "Haa kabaju malee maqaasaa\n\n" +
            "Iyyaasuudhaaf Aduu kan dhaabee\n" +
            "Gabaa oolirratti abboomee\n" +
            "Imimmaan ijooleesaa kan laaluu\n" +
            "Waaqa keenya hundaa kan caalu\n\n" +
            "Dallaa iyyaarikoo kuffisee\n" +
            "Waaqota tolfamoo bitimsee\n" +
            "Yordannoosin dhaabeera harkisaa\n" +
            "Ceesiseera inno saba saa        \n\n" +
            "Hojiin Gooftaa keenya Raajiidhaa\n" +
            "Mee qalbiin ilaalaa hubaadhaa\n" +
            "Kan akkkasa hin jiru tasumaa\n" +
            "Isan yaa jiraanu yaa namaa\n";

    String title = "Kan akka waaqayyoo";

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