package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WaaqayyooGooftaaKoo  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Waaqayyoo gooftaa koo siin ayyaaneeffadha\n" +
            "Waan ati naa taateef siin galaateeffadha  /2/\n\n" +
            "Nafayyisuuf  jettee waaqa irraa gad-buutee\n" +
            "Uumaa waaqaaf lafaa duurba irraa dhalattee\n" +
            "Anumaaf jeetteti rebamuun keetisi\n" +
            "Siif maal kennu laata gooftaa koo Iyyesusi\n\n" +
            "Naaf jettee gooftaa koo rakkattee dhiphattee\n" +
            "Akka ani hin duuneef Waaqa irraa gad-buutee\n" +
            "Maalin kenna laata ani Waaqayyoo kootiifi\n" +
            "Inni naa rakkatee nafayyisuudhaafi\n\n" +
            "Ani homaa hinqabu waanan Waaqaa kennu\n" +
            "Galata duwwaadha wantan isaaf galchu\n" +
            "Galata kee haata’u yaa Waaqayyoo gooftaa\n" +
            "Waan hundumaa caala galata jaallatta\n";

    String title = " Waaqayyoo gooftaa koo ";

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