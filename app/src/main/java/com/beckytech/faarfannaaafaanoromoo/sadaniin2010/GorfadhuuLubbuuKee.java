package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GorfadhuuLubbuuKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Abdadhu waaqa kee Gorfadhu lubbuu kee\n" +
            "Amantiin jabaadhuu bitamiif waaqa kee\n" +
            "Fayyinaaf nageenyaa isatu nuuf kennee\n" +
            "Silaa nu kan duunu bakka keenya du'ee         \n       \n" +
            "Abboommii waaqayyoo hundasaa dagannee \n" +
            "Jireenya gadi dhiisaa jiraachuu filannee \n" +
            "Kanarraa nu gahaa inni bara darbee      \n" +
            "Koottaa ni qophoofnaa qalbii jijjiranne\n\n" +
            "Amantiin bu'uura waanuma hundaafii\n" +
            "Mee hubadhaa ilaalaa ijjoollee sadanii\n" +
            "Mootii baabil'oon Abiddaa buufnanii\n" +
            "Ergaamasaa ergeefi waaqayyo Gooftaanii  \n\n" +
            "Abdii guddaa qabnaa waaqa keenya biraa                                                 \n" +
            "Isatti of laannaan Dhiifama argannaa   \n" +
            "Fayyina nuuf ta'ee mallattoon fannoosaa\n" +
            "Abdii biraa hin qabnuu isa abdiin keenya \n\n" +
            "Lakkii yaa lubbuu koo jabbadhuu dhaabbadhuu\n" +
            "Obsineet egannaa waaqayyoo kadhadhuu\n" +
            "Mootummaa waaqayyoo abdii kee godhadhuu\n" +
            "Jannata galudhaaf mudhii kee hidhadhuu\n";

    String title = "Gorfadhuu lubbuu kee ";

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