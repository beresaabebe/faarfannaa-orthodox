package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KunooDhalateeraFayyisaanAddunyaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kunoo dhalateera fayyisaan addunyaa(3)\n" +
            "Ishoo dhalateera fayyisaan addunyaa(3)\n" +
            "Raajonnonni hundinuu raajii dubbatanii(3)\n" +
            "Tokkichi ilma waaqaa nii bu’a jechuudhan(3)\n" +
            "\n\n" +
            "Hayyoonni dhufanii hundinuu sagaduuf(3)\n" +
            "Mootin israa’elii dhalate jechuudhan(3)\n" +
            "Hayyoonni dhufanii kennaa qabatanii(3)\n\n" +
            "Warqee ixaanaf karbee dhiiyessan sagadan(3)\n" +
            "Ijoolle haa deemnu gara betelemii(3)  \n" +
            "Bishaan ta’ee jira dammaa fi aannanii(3)  \n";

    String title = "Kunoo dhalateera fayyisaan addunyaa";

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