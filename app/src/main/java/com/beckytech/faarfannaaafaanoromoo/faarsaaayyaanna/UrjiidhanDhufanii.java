package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class UrjiidhanDhufanii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Warri hayyootaa dhufanii(2) urjii hordofanii(2)\n" +
            "Amaanu’eelifii(4) sagaduuf Amaanu’eelifi(2)eyyeen(3)\n\n" +
            "በኮከብ መጽኡ /2/ ሰብአ ሰገል /2/\n" +
            "ለአማኑኤል /4/ ይስግዱ ለአማኑኤል /2/ ኧኸ/3\nn";

    String title = "Urjiidhan dhufanii";

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