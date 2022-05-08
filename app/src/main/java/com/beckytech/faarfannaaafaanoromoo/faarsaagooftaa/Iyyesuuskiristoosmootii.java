package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Iyyesuuskiristoosmootii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Iyyesuus kiristoos mootii jireenya koo\n" +
            "Iyyesuus kiristoos hidda jireenya koo\n" +
            "Iyyesuus kiristoos abbaa koo\n" +
            "Iyyesuus kiristoos waaqa koo(2)\n\n" +
            "Hidda jireenya koo odaa mana kootii\n" +
            "Kiristoosiyyesuus gooftaa gooftoliitii\n" +
            "Ano nan faarfadha kabajaan maqaasaa\n" +
            "Du'e waan na kaaseef galatanan faarsaa\n\n" +
            "Nama ta'u isaatin dadhabaa hin see'inaa\n" +
            "Kan du'a ajjeesse isadha abbaan humnaa\n" +
            "Humnoonni lafarraa warreen dhaadatanii\n" +
            "Wal haa ajjeesan malee du'a hin ajjeesanii\n\n" +
            "Urjii mana yaa'iqoob leenca yihudaadhaa\n" +
            "Iyyesuus gooftaan koo anaf abbaaf haadha\n" +
            "Rakkoo na moo'atee isaan injifadhee\n" +
            "Kuno nan gammada jireenya argadhe\n";

    String title = " Iyyesuus kiristoos mootii jireenya koo ";

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