package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HarmeeIyyesuus extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Harmee Iyyesuus haadha olmaa kootii\n" +
            "Sin faarsaa maariyaam ati kennaa kooti\n" +
            "Naaf kadhadhuu maaloo ilma kee irratii    \n                    \n" +
            "Hiddii qomoo keeti dursaa qulqulaa’a                        \n" +
            "Gadameessi Haanas ebbifamaa ta’aa                       \n" +
            "Qulqulleetii dhugaa addeessa nuf dessee                       \n" +
            "Addesichaa keessaas addun dhugaa baa’ee\n\n" +
            "Iyyaaqeemif haannaa kadhannan argatanii\n" +
            "Hundumaa caalchisee laateef Sillaaseen\n" +
            "Samiirraa gad bu’ee ishee keessa bulee\n" +
            "Raajiidha kan dubroo Gooftaan ishee file   \n  \n" +
            "Waammadhe hin qufu maqaa haadha kan koo         \n" +
            "Yeroo gammaachuttus ta’ee gaafa rakkoo          \n" +
            "Galataa maariyaamiif saaqame Afaan koo         \n" +
            "Wabii ishee dhugaa ishee gaafa rakkoo\n\n" +
            "Araarsiitu waaqa yaa haadha hundumaa\n" +
            "Maaltu sin qixxaata hin jiru gonkummaa\n" +
            "Kan kufee ni kaasta ni fayyista humdumaa\n" +
            "Ati kan baateedha Abiddaa waaqummaa \n";

    String title = "Harmee Iyyesuus";

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