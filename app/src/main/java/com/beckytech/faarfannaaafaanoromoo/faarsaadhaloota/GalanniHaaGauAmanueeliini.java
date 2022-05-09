package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GalanniHaaGauAmanueeliini extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galanni haa ga'u Amanu'eeliini\n" +
            "Ifa arganneerra darbeera duukkanni\n" +
            "Magaala Daawwit keessatti dhalatee\n" +
            "Iyyeesuus Kiristoos jireenya nuuf laate\n\n" +
            "Fayyisaan dhalatee beeteliyeem keessatti\n" +
            "Raajiin rawwatamee magaala Dawwititti\n" +
            "(Galanni Waaqayyoof samirraatti haa ga'uu\n" +
            "Nagaan dhala namaaf lafarraatti haa ta'uu) (x2)\n\n" +
            "Kakuutu raawwatamee yeroonsa geenyaanii\n" +
            "Fayyisa nuuf deesse durbeen durbummaanii\n" +
            "(Leenca qaraniyoo mootichi moototaa\n" +
            "Aarsa isaaf laanna huqubaa fi galataa) (x2)\n\n" +
            "Tiksee gaariidha inni guyyaaf halkan guutuu\n" +
            "Kan afuura qabu waaqasaa haa jajatu\n" +
            "(Aalfaa fi Oomegaadha bara baraaniyyuu\n" +
            "Galannisaa ganaa itti fufa ammayyuu) (x2)\n\n" +
            "Samii samirraa nuuf jedhee gad dhufee\n" +
            "Fannifamuu isaatiin duuti keenya hafee\n" +
            "(Halkan sodaachisaa duukkanni darbeeraa\n" +
            "Gonfoo ifa raabsu Amanu'el dhufeeraa) (x2)\n";

    String title = "Galanni haa ga'u Amanu'eeliin";

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