package com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class RaajiidhaDinqiidha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Raajiidha dinqiidha hojiin Waaqadha (2)\n" +
            "Misirroonnis ta’an Abirihaamiifi saaraadha(2)\n\n" +
            "Akkas caraaqamuun Waaqayyoon filamuun\n" +
            "Jireenya manasaan qorumsarraa ooluun\n" +
            "Gooftaan yoo eeyyamee hunduun raawwataa\n" +
            "Gooftaan yooe eyyamee gaa’ellis toleeraa\n\n" +
            "Sirriitti ni kabajanna waa’ee amantiishee\n" +
            "Gaarii wanta  ta’eef seerrishee qajeelaa\n" +
            "Abirhaamiin fakkaattee yommuu ishee waammattu\n" +
            "Attam hawwisiisaa jireenyi misirrootaa\n\n" +
            "Isheen akka Saaraa gad of qabuu uffattee\n" +
            "Maqaas yommuu kaastu Gooftaa koo ittiin jette\n" +
            "Jireenyasaaniis ijaan raajeffatanii\n" +
            "Waaqa qabaatanii jaalalaan jiraatanii\n";

    String title = "Raajiidha dinqiidha hojiin Waaqadha ";

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