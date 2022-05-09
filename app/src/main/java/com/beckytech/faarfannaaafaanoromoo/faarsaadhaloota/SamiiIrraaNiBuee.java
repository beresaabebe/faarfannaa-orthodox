package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SamiiIrraaNiBuee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Samii irraa ni bu’ee dhalate\n" +
            "dubroo Maraamii irraa /2/\n" +
            "Foon dubroo Maraami /2\n" +
            "uffatee addunyaa fayyisuuf /2/ eyyee/3/\n\n" +
            "እም ሰማያት ወረደ\n" +
            "እም ሰማያት ወረደ\n" +
            "ወእማርያም ተወልደ /2/\n" +
            "ከመይኩን ቤዛ /2/\n" +
            "ለኲሉ ዓለም ወለብሰ ሥጋ ማርያም/2/ ኧኸ/3/\n";

    String title = "Beeteliyeemitti raajiin raawwateera";

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