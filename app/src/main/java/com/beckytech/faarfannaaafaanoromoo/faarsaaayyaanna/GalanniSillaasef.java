package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GalanniSillaasef extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galanni sillaasef kan addunyaa hundaa uumeefi(2)\n" +
            "Ni galateeffama ergamootan baraa baraafii(2)\n\n" +
            "ስብሐት ለሥላሴ ለፈጣሬ ኲሉ ዓለም /2/\n" +
            "በመላእክቲሁ ስቡህ ዘለዓለም በመላእክቲሁ እኩት ዘለዓለም/4/\n";

    String title = "Galanni sillaasef በመላእክቲሁ ስቡህ ዘለዓለም";

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