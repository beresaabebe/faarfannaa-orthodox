package com.beckytech.faarfannaaafaanoromoo.faarsaaergamoota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AkkaNuuEebbistuuf extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Akka nu eebbistuuf  warqee fannootiin /3/\n" +
            "Deddebi’ii nuuf kadhuu /4/ Mika’eelii/Gabri’eelii  lalisa warqee /2/\n\n" +
            "ከመ ትባርከነ በመስቀልከ ዘወርቅ /2/\n" +
            "ተዋነይ በጽድቅ/4/ገብርኤል ሐመልማለ ወርቅ /2/\n";

    String title = "Akka nu eebbistuuf ";

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