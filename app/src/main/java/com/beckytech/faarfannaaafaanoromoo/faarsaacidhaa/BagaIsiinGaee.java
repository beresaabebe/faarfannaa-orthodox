package com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BagaIsiinGaee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Baga isin ga’e gammachuu kanaanii (3x)\n" +
            "Walin murtooftanii foonsaaf dhiigasaanii (3x)\n\n" +
            "Eega walaman waadichassa yaadadha (3x)\n" +
            "Kan tokko isin godhe Afuura Waaqadha (3x)\n\n" +
            "Abboommi isaa eega waadaasaa yaadadha (3x)\n" +
            "Wanta cubbuu ta’e irraatti fagaadhaa (3x)\n\n" +
            "Walitti eebbifama suurraasaa uffadhaa (3x)\n" +
            "Amanta keessanis jabbeessa qabadhaa (3x)\n\n" +
            "Raajoota sobduuttiin akkaa hin dogongorree (3x)\n" +
            "Qiilleensa baraattin akkaa hin gitintirree (3x)\n\n" +
            "Yaa saba Waaqayyo akka warra kanaa (3x)\n" +
            "Atis wali gali gochaa kana goonaa (3x)\n\n" +
            "Misirroon lamaanuu egaa wal jaalladhaa (3x)\n" +
            "Kadhannaa fi laguudhaanWaaqayyoon kadhadhaa (3x)\n";

    String title = "Baga isin ga’e gammachuu kanaanii ";

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