package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Araarsituudha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Araarsituudha haati waaqa keenyaa (2)\n" +
            "Durboo Maariyaam isheen abdii keenyaa           \n      \n" +
            "Araarsituudhaa yeero gaddaa keenya\n" +
            "          “                kan nuuyif birmattu\n" +
            "           “               Maariyaam si waamnaa\n" +
            "            “              harmee koo nuuf koottuu\n\n" +
            "Araarsituudha akkaa Dookimaasii\n" +
            "        “                    ati nu mil’adhuu\n" +
            "      “                     nutis si waammanna\n" +
            "      “                    ammallee nuuf koottuu    \n      \n" +
            "Araarsituudha akka Balaayiseeb\n" +
            "         “                  maaloo nu fayyisii\n" +
            "         “                 dheekkamsa barichaa\n" +
            "         “                jalaa nu hambisii\n\n" +
            "Araarsituudhaa kennaa Fannoo jalaa \n" +
            "      “                 yaa haadha jaalalaa\n" +
            "     “               sanyii Addaam martuu\n" +
            "     “              maqaa kee ni waamaa\n";

    String title = "Araarsituudhaa";

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