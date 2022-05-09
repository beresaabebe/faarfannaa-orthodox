package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GannaSoddomatti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yoordaanositti cuuphamee ganna soddomatti\n" +
            "Yoordaasottii/2/yoordaanos /2/\n" +
            "Cuuphamee harka yohaannisiin \n\n" +
            "በሰላሳ ክረምት በዮርዳኖስ ተጠምቄ\n" +
            "በዮርዳኖስ /2/ ዮርዳኖስ /2\n" +
            "ተጠምቄ በዮሃንስ\n";

    String title = "Ganna soddomatti";

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