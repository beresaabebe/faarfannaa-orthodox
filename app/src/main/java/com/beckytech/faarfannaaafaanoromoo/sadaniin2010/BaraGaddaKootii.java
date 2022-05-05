package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BaraGaddaKootii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Bara gadda kootii siinan irranfadhee\n" +
            "Jecha kee isa dhugaan boqonnaa argadhee\n" +
            "Waqaa Abbooti kootii Olmaa keef si faarsaa \n" +
            "Situ naan na baasee abiddicha keessaa             \n                             \n" +
            "Koottu ba’ii jedhee misirii na baasee                                          \n" +
            "Qulqulloota isaa fuulaa koo dabarsee                                            \n" +
            "Warra diinota koo galaana nyaachisee                                          \n" +
            "Bakka naaf qophaa’ee anaan na geessise \n\n" +
            "Abbaa jalaalaa koo kan hin geddarameenne\n" +
            "Dhiifamni kee baay’een kan garaa jabaanne\n" +
            "Badii koo  ilaaltee ati natti qabamnee\n" +
            "Iddoo dhiphinaattis calliftee nan laallee  \n     \n" +
            "Yooseefiin kan eegdee biyya misiriitti             \n" +
            "Anaanis na eegdee biyya ormootaattii                  \n" +
            "Gadda koo geeddartee seenaa koo jijjirtee                     \n" +
            "Galataaf nan dhaaphaa anis fuuldura kee\n";

    String title = "Bara gaddaa kootii";

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