package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DubartootaKeessaaFilatamtee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Dubartoota keessaa filatamtee \n" +
            "kennaa waqarraa kan argatee(2)\n" +
            "gammadii yoroo hundumaa(2) yaa maariyaamii yaa giiftikoo abdiin keenya suma(2)\n" +
            "ከሴቶች ሀሉ ተለይተሽ ፀጋ እግዚአብሔር የደረበሽ/2/\n" +
            "ደስ ይበልሽ ማሪያም ሁልጊዜ /2/  አንቺ ነሽ እና  እረዳት ምርኩዜ /2/\n";

    String title = "Dubartoota keessaa filatamtee";

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