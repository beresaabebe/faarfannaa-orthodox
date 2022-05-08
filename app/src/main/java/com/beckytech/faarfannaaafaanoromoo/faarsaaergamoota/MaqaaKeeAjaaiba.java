package com.beckytech.faarfannaaafaanoromoo.faarsaaergamoota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MaqaaKeeAjaaiba extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maqaa kee aja'iba maqaa waaqa qabaa\n" +
            "Ergamaa Mikaa'eel siif galatan qabaa\n" +
            "Na guddisteetta atii hamarra na eegdee\n" +
            "Warra si hin qabneefii garaankoo na gadde\n\n" +
            "       Jawwichi hin dandeenye surraa ketu caale\n" +
            "        Darbatamee kufee fuulakee ilaalee\n" +
            "        Kanaafan si waama ati mirga kooti\n" +
            "        Simboo argadheera atoo gartuu kooti\n\n" +
            "Gargaarakoodha ati akka Daani'eelii\n" +
            "Qoruumsa keessatti gara koo ilaalii\n" +
            "Maqaankee waamamnaan diinni ni rifataa\n" +
            "Anis bilisoome qabaadhe galataa\n\n" +
            "        Libaana manakeen urgaa'ee keessikoo\n" +
            "        Harka keerra jira kadhaafi galatni koo \n" +
            "        Mirga Waaqa jirtaa mirgaaf na jaallatte\n" +
            "        Halkanii fi guyyaa kanaaf naaf dhaabbattee \n";

    String title = "\"Maqaa kee ajaa'iba";

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