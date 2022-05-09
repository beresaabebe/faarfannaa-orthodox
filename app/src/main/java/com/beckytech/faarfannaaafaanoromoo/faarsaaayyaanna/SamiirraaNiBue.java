package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SamiirraaNiBue extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Samiii irraa ni bu’e \n" +
            "Dhalate dubroo maaiyaamirraa(2)\n" +
            "Foon dubroo Maariyaamii(4) \n" +
            "uffate addunyaa fayyisuf(2)eyyeen(3)\n\n" +
            "እምሰማያት ወረደ ወእማርያም ተወልደ /2/ /2/\n" +
            "ከመ ይኩን ቤዛ /2/ ለኲሉ ዓለም ወለብሰ ሥጋ ማርያም/2/ ኧኸ/3/\n";

    String title = "Samiii irraa ni bu’e";

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