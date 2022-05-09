package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KunooDhalatera extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kunoo dhalatera fayyisaan addunyaa/3/\n" +
            "Ishoo dhalatera fayyisaan addunyaa/3/\n\n" +
            "Raajjooni hundinu Raajii dubbatanii/3/\n" +
            "Tokkichi Ilma Waaqa  nii bu’a jeedhani/3/\n\n" +
            "[Haayyoonni dhufanii hundinuu sagaduuf/3/\n" +
            "Mootiin Israa’elii dhalate jechuudhaan/3/\n\n" +
            "Haayyooni dhufanii kennaa qabatanii/3/\n" +
            "Warqee ixxaana fi karbee dhiyeessani sagadan/3/\n\n" +
            "Ijoollee haa deemnu gara Beetalihemii\n" +
            "Bishaan ta’eera dammaa fi aannanii\n";

    String title = "Kunoo dhalatera fayyisaan addunyaa";

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