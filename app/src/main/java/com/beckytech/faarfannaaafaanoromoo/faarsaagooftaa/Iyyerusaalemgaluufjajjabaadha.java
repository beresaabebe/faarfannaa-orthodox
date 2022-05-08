package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Iyyerusaalemgaluufjajjabaadha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Jaalalli Waaqayyoo guyyaa jimaataa fannoorratti mul’ateera /2/\n" +
            "Iyyerusaalem nugalchuudhaaf biyya haaraa/4/\n" +
            "Iyyerusaalem galuuf jajjabaadha yeroo hundaa yaanamoota/2/\n" +
            "Dhiyaateera dhufaatiin Gooftaa dha/4/\n" +
            "Eenyu kan qophaa’e iyyerusaalem ishee haaraa galuudhaafi/2/\n" +
            "Qulqulloota wajjiin mirga isaa dhaabbachuufi/2/\n";

    String title = " Iyyerusaalem nugalchuudhaaf biyya haaraa";

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