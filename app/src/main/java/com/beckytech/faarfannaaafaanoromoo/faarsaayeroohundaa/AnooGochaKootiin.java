package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AnooGochaKootiin extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Anoo gocha kootiin dadhabaa ta'eeraa (x2)\n" +
            "Narraa hin fagaatiin haadhakoo adaaraa(x2)\n\n" +
            "Garba abiddaa sana akkan hin agarree\n" +
            "Anoo sin waammadha naaf dhaga'ii durbee (x2)\n\n" +
            "Kan taatee abbootiif masanqoof soorata\n" +
            "Kan si abdate hunduu ni dhaala jannataa (x2)\n\n" +
            "Kan taate qulqulluu foon keetinis yaadanis\n" +
            "Fayyinni hin argamuu sirraa fagaatanii (x2)\n\n" +
            "Dhiphinni baay'atee imimmaan nu boossisaa\n" +
            "Dhiifama nuuf kadhuunu galchi daandiisaa (x2)\n";

    String title = "Anoo gocha kootiin dadhabaa ta'eeraa";

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