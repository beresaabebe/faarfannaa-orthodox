package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MaariyaamiinGaddaLubbuu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maariyaamiin gadda lubbuu nama ni salphisitii/2/\n" +
            "Gadda lubbuu  keenya /4/ ni salphisti /2/ eyyee\n\n" +
            "ማርያም ኃዘነ ልቡና ታቀልል /2/\n" +
            "ኃዘነ ልቡና/4/ታቀልል  ኧኸ /2/\n";

    String title = "Maariyaamiin gadda lubbuu";

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