package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaWaaqayyoosiyaagalatu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa Waaqayyoo si yaa galatu \n" +
            "yaa Waaqayyoo maqaan kee haa’ulfaatu /2/\n" +
            "Lafa jalas taanan sami irras kan balali’u \n" +
            "yoo barbaadne hin jiru kan amma Waaqa keenya ga’u \n" +
            "inni hundumarra caala galanni isa haaga’u /2/\n";

    String title = " Yaa Waaqayyoo si yaa galatu ";

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