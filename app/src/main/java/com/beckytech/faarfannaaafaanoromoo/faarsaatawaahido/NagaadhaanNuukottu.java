package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NagaadhaanNuukottu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nagaadhaan nuukottu/2/ maariyaami/2/\n" +
            "Sitti himanna /2/ gadda lubbu keenyaa\n" +
            " Nagadhaan nuukoottuu……………\n" +
            "Mika’eeliif/2/ gabri’eeli wajjiin\n" +
            "Nagadhaan nukottuu……………\n" +
            "Suraafeeliif/2/ kirubeelii wajjiin\n" +
            "Nagadhaan nukottuu……………\n" +
            "Uraa’eeliif /2/ ruufa’eeli wajjiin\n" +
            "Nagadhaan nukottuu……………\n" +
            "Qulqulloota /2/ hunduma wajjiin\n" +
            "Ilmakee wajjiin/2/ amanu’eelii\n" +
            "Nagadhaan nukottuu……………\n";

    String title = "Nagaadhaan nuukottu";

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