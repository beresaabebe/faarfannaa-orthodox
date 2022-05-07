package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NiDandeessaaYaaGooftaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ni dandeessaa ati yaa Gooftaa ni dandeessa x2\n" +
            "Sin argee hundaa keessaa\n" +
            "\n\n" +
            "Aangoo keetin waan dubbatte ni raawwattaa\n" +
            "Harka keetin waan eegalte ni xumurtaa\n" +
            "Galata kee Gooftaa\n" +
            "\n\n" +
            "Waan dubbatte yeroo keetin miidhagsitaa\n" +
            "Booda dhuftee gargaarsa keen hunda caaltaa\n" +
            "Situ na jaalataa\n" +
            "\n\n" +
            "Qilleensaa fi bishaan gidduu daandii qabdaa\n" +
            "Qofaa koo miti hin sodaadhu situ naaf yaadaa\n" +
            "Naaf galteetta waadaa\n" +
            "\n\n" +
            "Na dhaabeera fuuldura isaa galataafii\n" +
            "Kennaan isaa isuma harka isumaafii\n" +
            "Galannii haa ta’uufii\n";

    String title = "Ni dandeessa yaa gooftaa";

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