package com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MisirroonBagaGeessanii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Misiroon baga geessanii ciidhaa gaa’ila (2)\n" +
            "Misiroon lamaan     >>          >>\n" +
            "Baga gammadanii    >>          >>\n" +
            "Gamada ililchaa        >>          >>\n" +
            "Hundumti keessanii >>          >>\n" +
            "Waaqayyoo Abbaanni Ciidhaa Gaa’iil\n" +
            "Ilaale Addaamiin             >>        >>\n" +
            "Gargartu akka taatuf        >>        >>\n" +
            "Ni kennef Heewwanin     >>        >>\n" +
            "Atti yaa obboleessa Ciidhaa Gaa’iil\n" +
            "Attis yaa obboleetti  >>        >>\n" +
            "Isin haa eebbisuu      >>       >>\n" +
            "Waaqayyooabbanni >>        >>\n" +
            "Gamadaa hunduumtu Ciidhaa Gaa’iil\n" +
            "Ciidhaa gaa’iilatti  >>         >>\n" +
            "Seexanni dinnichi   >>        >>\n" +
            "Daafee qaana’atti   >>         >>\n";

    String title = "Misiroon baga geessanii ciidhaa gaa’ila";

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