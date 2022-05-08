package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KottaaYaaNamootaa  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kottaa yaa namootaa ni deebinaa\n" +
            "Biyya lafaa kanaa ni tuffannaa\n" +
            "Guyyaan dhufa gooftaa nutti dhiyaateera\n" +
            "Waan raajootan dubbatame hunduu raawwateera\n\n" +
            "          Biyyi lafaa kunii maalii bu'aan isaa \n" +
            "          Sobee nu goyyomsaa hundumtisaa\n" +
            "          Har'aaf nutti tolaa jireenyisaa \n" +
            "          Guyyaa dhufa gooftaa nu salphisaa\n\n" +
            "Hawwiidhaaf kajeellaan biyya lafaa\n" +
            "Mee  hubadhaa ilaalaa innoo ni hafaa\n" +
            "Sagaleen waaqayyoo yeroo hundaa\n" +
            "Bara baraan darbee jiraatadha\n\n" +
            "         Wayyaan biyya lafaa walaalchisee\n" +
            "         Namoota baay'ees ni raatesse\n" +
            "         Fedha foonii duuka maraachisee\n" +
            "         Ulfina waaqayyoo walalchisee\n\n" +
            "Amantoonni hundinuu mee hubadhaa\n" +
            "Wal fakkeessuu dhiisa amanadhaa\n" +
            "Dammaqaa dhaabbadha amantaadhaan\n" +
            "Dafnee akka galluu biyya abdiidha\n";

    String title = "Kottaa yaa namootaa ni deebinaa";

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