package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Waannaafgootehundaafgooftaagalatoomii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Waan naaf goote hundaaf gooftaa galatoomii\n" +
            "Waanaan godhe hin qabuu an ofii kootinii\n" +
            "Kan naaf raawwatamee hunduu ochaakeetii\n" +
            "Kanaaf sin farfaadhaa baraa amma baraatti\n\n" +
            "    Yoommuun kufee turee fira of biraa dhabee\n" +
            "    Abdiinkoo hudinuu natti dukkanaa'ee\n" +
            "    Yaadaan oolee bulee waa'ee jireenyakoo\n" +
            "    Yaaddoodhaan qabamee tureeraa keessiikoo\n\n" +
            "Yeroon fira dhabee qofaakoo wawwaadhu\n" +
            "Bakkan dhaqu  dhabee yommuun abdii kutuu\n" +
            "Gooftaankoo na waamee gara manasaatti\n" +
            "Abdiidhaanguutameeyaaddoonkeessakooti\n\n" +
            "       Qabeenyi hunda caaluu faayyaa jiraachuudhaa\n" +
            "        Waa'ee jireenyakoof maalifan dhiphadhaa\n" +
            "        Seenaakoo jijjiiruuf atoo qabdaa\n" +
            "        Tureen si eeggadhaa maafan ariiifadha(2)\n";

    String title = " Waan naaf goote hundaaf gooftaa galatoomii ";

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