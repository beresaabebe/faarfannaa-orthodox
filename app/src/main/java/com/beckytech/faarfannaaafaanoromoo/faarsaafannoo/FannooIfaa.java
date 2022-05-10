package com.beckytech.faarfannaaafaanoromoo.faarsaafannoo;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FannooIfaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Fannoo  ifaa  addunyaa  hundaafi(2)\n" +
            "Bu’uuradha (3) mana kiristaanaafii(2)\n\n" +
            "Nageenya kennadha fayyisaadha addunyaa\n" +
            "Fannoon fayyisadhaa namoota amannuf(2)" +
            "መስቀል ብርሃን ለኩሉ  ዓለም (2)\n" +
            "መሰረት (3) ቤት ክርስትያን(2)\n" +
            "ወሃቤ ሰላም መድኃንዓልም መስቀል መድህን ለዕለነዓምን(2)\n";

    String title = " Fannoo ifaa addunyaa hundaafi ";

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