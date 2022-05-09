package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DhufeJechi extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Dhuufe jechi duumessa irraa akkas kan jedhu /2/\n" +
            "Kan jaalladhuufi kan kabaju Ilmii koo Isadhaa /4/\n\n" +
            "መጽአ ቃል እምደመና ዘይብል /2/  \n" +
            "ዝንቱ ውዕቱ ወልድየ ዘአፈቅር /4/\n";

    String title = "Dhuufe jechi";

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