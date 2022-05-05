package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FannoonHumnaKeenya extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Fannon humna keenya\n" +
            "Ittin moona warra diina keenya\n" +
            "Ittin moona(2)warra diina Keenya   \n       \n" +
            "F.H.K nuyiif abdii keenyaa\n" +
            "mallattoo nageenyaa\n" +
            "Diinni nun argatuu\n" +
            "isa abdiin keenyaa\n\n" +
            "F.H.K Diinni haa qaana’uu\n" +
            "fannoon abdii keenyaa\n" +
            "isaan injifannaa\n" +
            "warra dina keenyaa\n\n" +
            "F.H.k furaa lubbuu keenyaa\n" +
            "fannoon humna keenyaa\n" +
            "jiraachisaa keenyaa\n" +
            "nuuf mallattoo keenyaa\n\n" +
            "F.H.K warra itti amanneef\n" +
            "fannoon fayyinadhaa\n" +
            "warra ittii hin amannneef \n" +
            "garuu gowwummaadhaa       \n";

    String title = "Fannoon humna keenya";

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