package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class UrjiidhaanDhufan extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Warri haayyoota dhufan/2/Urjii hordofani /2/\n" +
            "Amaanu’eeliifi /4/ sagaduuf Amaanu’eeliifi /2/ eyyee/3/\n\n" +
            "በኮከብ መጽኡ /2/ ሰብአ ሰገል /2/\n" +
            "ለአማኑኤል /4/ ይስግዱ ለአማኑኤል /2/ ኧኸ/3/\n";

    String title = "Warri haayyoota dhufan Urjii hordofani";

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