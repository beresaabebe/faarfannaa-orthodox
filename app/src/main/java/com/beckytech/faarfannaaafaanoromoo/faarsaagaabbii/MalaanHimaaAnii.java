package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MalaanHimaaAnii  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Malaan himaa anii gaafa sanaa\n" +
            "Gooftanoo ni dhufaa tabba tsiyoonirra\n" +
            "Innihoo caalisuu murtihoo ni laata\n" +
            "Malaan himaa anii gaafa sanaa\n" +
            "\n\n" +
            "Umrii koo hundaa waaqaf hin bitamnee\n" +
            "Hawwi biyya lafaan keessi koo guutamee\n" +
            "Nagaa kan naaf ta'u galaa qopheeffannee\n" +
            "Guyyaa wamaamu koo malaan deebisaree\n" +
            "\n\n" +
            "Annoo akkasiin seenee yeroon joora turee\n" +
            "Utoon gooftaan bariin umriin koo dhumee\n" +
            "Maaloo haadha gooftaa atoo akkam naa goota\n" +
            "Karaa keen banamee balbaalli gannaata\n" +
            "\n\n" +
            "Guyyaa dhufaa gooftaa eenyuti beekaa laata\n" +
            "Ganamamoo guyyaa galgaaladha laata\n" +
            "Cubbuusaa badhatee hunduu ni watwata\n" +
            "Akkaa hojiisatti murtii ni argaata\n" +
            "\n\n" +
            "Maaloo yaa namoota warreen hin amannee\n" +
            "Maal deebisnaa laata gaaffii yoo gaafatamnee\n" +
            "Deebii kan nuuf ta'uu homaa qopheeffannee\n" +
            "Gidirfamuu keenyaa dukkaanan marfamnee\n";

    String title = " Malaan himaa anii gaafa sanaa ";

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