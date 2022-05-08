package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MaaramiinQubeedha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maaraamiin Qubeedha Barumsaa hundumaa\n" +
            "Qulqullummaan (2) kan barreeffamtedhaa(2)           \n\n" +
            "ማርያምፍዳልየሁሉመማራ (Maariyaam fidali yehullu memaara)\n" +
            "በንፁህና(2)  ተፆፋለቺና (be nitsinnaa(2) tetsifalechinnaa(2)\n";

    String title = "Maaramiin qubeedha";

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