package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class QulqullootaIrraQulqulluu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Qulqullootarra qulqulleettiikan taate akka taabota Siinaa  \n" +
            "Mana Waaqa keessa kanjiraatte dubrummaadhaan jiraatte   /2/\n" +
            "Nyaanni ishee nyaata samiitii dhugaatiin ishees jecha Waaqati /2/\n\n" +
            "ንጽሕተ ንጹሐን ከዊና ከመታቦት ዘዶር ዘሲና \n" +
            "ውስተ ቤተ መቅደስ ነበረት በድንግልና   }2\n" +
            "ሲሳያ ኀብስተ መና ወስቴሃኒ ስቴ ጽሙና/2/\n";

    String title = "Qulqulloota irra qulqulluu";

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