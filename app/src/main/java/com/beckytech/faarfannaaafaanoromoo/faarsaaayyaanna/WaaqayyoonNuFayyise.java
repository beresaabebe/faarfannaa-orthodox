package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WaaqayyoonNuFayyise extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Waaqayyoon nu fayyise jechasaa hindabarreen x2 Koottaa haa gammadnuu (2*) ilil jedhaa(2*) namoota Waaqayyoof faarfadhaa\n" +
            " \nመድኃኔዓለም አዳነን  በማይሻር ቃሉ/2/\n" +
            " ደስ  ይበለን  /2/ እልል በሉ /2/ አዳነን  በማይሻር ቃሉ \n";

    String title = "Waaqayyoon nu fayyise (መዳኒዓለምአዳነን)";

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