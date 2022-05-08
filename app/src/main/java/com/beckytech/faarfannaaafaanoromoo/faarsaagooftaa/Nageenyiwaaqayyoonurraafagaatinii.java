package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Nageenyiwaaqayyoonurraafagaatinii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nageenyi waaqayyoo nurraa fagaatinii(2)\n" +
            "Abbaa keenya(2) ati nu gatinii(4) eyyee\n" +
            "Kadhanna Maariyaam nurraa fagaatinii(2)\n\n" +
            "Haadha teenya(2)ati nu gatinii(4) eyyee\n" +
            "Eegumsi Ergamoota nurraa fagaatinii(2)\n\n" +
            "Mika'eel ati nu gatinii\n" +
            "Gabri'eel ati nu gatinii(2) Eyyee\n\n" +
            "Kadhaan qulqulloota nurraa fagaatinii(2)\n" +
            "Abbaa keenya(2) Taklahaymanaootii(4) eyyee\n";

    String title = " Nageenyi waaqayyoo nurraa fagaatinii";

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