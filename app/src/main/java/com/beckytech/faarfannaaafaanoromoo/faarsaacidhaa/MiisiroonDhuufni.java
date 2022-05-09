package com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MiisiroonDhuufni extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Misiroon dhufni gammachuu huunda keenya (2)\n" +
            "Nagaadhani bahaatti simmaadha (2)\n\n" +
            "መጽአ መርዓዊ ፍሥሐ ለኩሉ (2)\n" +
            "በሰላም ጻኡ ተቀበሉ (2)\n" +
            "ትርጉም፤ መጣ ሙሽራው ደስታ ለሁሉ (2)\n" +
            "በሰላም ውጡ  ተቀበሉ (2)\n";

    String title = "Miisiroon Dhuufni (መጽአ መርዓዊ)";

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