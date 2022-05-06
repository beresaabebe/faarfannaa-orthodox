package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AmaanueelUumaaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Amanu’eel uumaa koo eenyuut madaalaa\n" +
            "Mootii moototati hundumaa caalaa\n" +
            "Isaa Abbaan nagaa Abbaan jaalalaa\n" +
            "Ija Gaarummaanii isaa nuu ilaalaa         \n                               \n" +
            "Ilma waaqayyoodha jiraata baranii                                        \n" +
            "Daandiin qulqullumma isuma karaanii                                      \n" +
            "Hoolaa qaraniyoo qorichaa Addunyaa                                      \n" +
            "Isatu qalamee bakka cubbuu keenyaa\n\n" +
            "Du’a bara baraa nu irraa fudhatee\n" +
            "Ofiisaa reebame jireenya nuuf laate\n" +
            "Olmaan isaa baay’eedha nurraa qaba gatii     \n" +
            "Mee galateeffadhaa dammaqaa ka’aatti  \n \n" +
            "Gooftaan hundaa beeka hundumaa madaale\n" +
            "Takka nu hin ifannee cubbuu keenya ilaalee   \n" +
            "Badii keenyaaf jedhee nuuf ka’eerra gaabbii                                   \n" +
            "Cufameera kunoo eega manni adabbii\n\n" +
            "Tollii isaa baay’atee laphee kiyya cabsee\n" +
            "Kanafan waa’ee isaa addunyaadhaf labsee\n" +
            "Galata galchinaaf fuulasaa duraatti\n" +
            "Ulfaata Teessoosaa ariyaamii irraatti\n";

    String title = "Amaanu'eel uumaa koo";

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