package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AkkaMikaaelaaErgamaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Akka Mikaa'elaa ergamaa akka Gabri'eeli /2/                               \n" +
            "Nagadhan nuukoottu /4/ yaa mariyaami  nagaadhan nuukoottu /2/ eyyee\n\n" +
            "ምስለ ሚካኤል ወገብርኤል ንዒ ሠናይትየ ማርያም/2/\n" +
            "ንዒ ድንግል ንዒ/2/ ድንግል ምስለ ሚካኤል/2/ኧኸ\n";

    String title = "Akka mikaa'elaa ergamaa";

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