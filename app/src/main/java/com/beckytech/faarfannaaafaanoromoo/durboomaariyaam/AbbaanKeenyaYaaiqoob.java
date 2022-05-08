package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AbbaanKeenyaYaaiqoob extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Dubroo Maariyaami kortoo warqeedha ati\n" +
            "Kortoo warqee kortoo warqeedha ati\n" +
            "Namaa fi Waaqayyoon araarsite \n" +
            "Abbaan keenya Yaa’iqoob kara Loozaa irratti /2/\n\n" +
            "Hiirribni fudhatee ciise lafa irratti \n" +
            "Kortoo lafaa hanga samitti dhaqabdu \n" +
            "Fakkeenya kee argee yaa dubroo Maariyamii\n" +
            "Ergamoonni  yeroo yaabatani  fi bu’an /2/\n\n" +
            "\tKan arge Yaa’iqob karaa irraa ciisuun\n" +
            "\tAbdii goodhachudhaan bara kan nageenya\n" +
            "\tKunoo raawwatame sumaan giifti keenya\n" +
            "Sumaa fi Ilma keen nuf ta’ee nageenyi /2/\n\n" +
            "Abjuun Yaa’iqoob sumaan rawwaatamnaan \n" +
            "Namoonni fi ergamoonni adda adda kan turani\n" +
            "Dhaloota Ilma keetiin  tokkummaan faarsani\n";

    String title = "Abbaan keenyaa yaa'iqoob";

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