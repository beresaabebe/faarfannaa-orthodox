package com.beckytech.faarfannaaafaanoromoo.faarsaafannoo;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class JaalalliWaaqayyoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Jaalalli waaqayyoo guyyaa jimaata fannoorratti mul’aterra(2)\n" +
            "Iyyerusaalem nu galchuudhaaf biyya haaraa(4)\n" +
            "Iyyerusaalem  galuuf  jajjabaadha yeroo hundaa  yaa namoota(2)\n" +
            "Dhiyaateeraa dhufatiin gooftaadha(4)\n" +
            "Eenyu  kan qophaa’ee  iyyerusaalem  biyyaa haaraa galuudhaafii(2)\n" +
            "Qulqulloota wajjiin miirgassaa dhabbachuuf(4)\n";

    String title = "Jaalalli waaqayyoo guyyaa jimaata fannoorratti ";

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