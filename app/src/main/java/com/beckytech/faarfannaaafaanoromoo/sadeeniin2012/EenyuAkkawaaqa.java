package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class EenyuAkkawaaqa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Eenyu Akka Waaqa jedha maqaan kee\n" +
            "Hundaa kan gahu gargarsii kan kee\n" +
            "Ergamaa mikaa'eel dursa ergamootaa\n" +
            "Maqaa kee waamnan dinni koo rifataa\n\n" +
            "Boollatti gatamee kan dagatamee\n" +
            "Leencii haa nyaatuuf isa yaadamee\n" +
            "Situ baase daani'eel gargaaree\n" +
            "Dhiphina isaa situ isaaf furee\n\n" +
            "Xalayaa du'aa baate isaa kaatuu\n" +
            "Jireenyatti jijirte ati nama dagatu\n" +
            "Baahiraan mucciichaa jiraachiftee\n" +
            "Seenaasaa jijjiruun ati boqachistee\n\n" +
            "Gargaarsi kee adda isa amanuuf\n" +
            "Nageenya buusta namoota hedduf\n" +
            "Gaaddisa Addaati kochoon kan kee\n" +
            "Addunyaa eegaa eeguumsi kan kee\n\n" +
            "     F/taa Abarraa Baqqalaa\n";

    String title = "Eenyuu akka waaqa";

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