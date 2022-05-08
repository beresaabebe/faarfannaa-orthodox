package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WaaqayyooQulqulluuUumaaUumamtootaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Waaqayyoo qulqulluu /3/ uumaa uumamtootaa\n" +
            "Sigalateeffannaa yaa mootii moototaa /2/\n" +
            "Gooftaa gooftotaa fi abboomaa hundumaa\n" +
            "Uumamtoota keetin kan taate beekamaa\n" +
            "Fayyisaan keenyaaf eegaan keenya suma\n\n" +
            "         Jaalalli nuuf qabdu hammana hin jedhamu\n" +
            "         Kan namoota wajjiin wal hin madaallamu\n" +
            "         Kan kee ol aanadha eessattuu hin argamu\n\n" +
            "Yoo dadhabnee kufnees harka keen nu kaasta\n" +
            "Hidhaa cubbuu keessaa humna keen nu baafta\n" +
            "Gara jireenyaatiis jaalalaan nu waamtaa\n\n" +
            "        Ijoollee kee taane akka hin garboofnee\n" +
            "        Addunya kanaafis akka hin bitamne\n" +
            "        Yaa gooftaa nu eegi human kee abdane\n";

    String title = "Waaqayyoo qulqulluu uumaa uumamtootaa";

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