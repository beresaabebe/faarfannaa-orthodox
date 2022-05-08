package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class QaraaniyooIrratti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Qaraaniyoo irratti kan nuuf fannifamee\n" +
            "Madaa qaama isaatiin kan nuti fayyinee\n" +
            "Ijoollee addaam hundaaf kan jireenya ta’ee\n\n" +
            "       Qaraaniyoo irratti gidiraa kan argee\n" +
            "       Yemmuu garafamuu kan dirrisaa dhiigee\n" +
            "       Gindillaa baachisuun kan itti qoosanii\n" +
            "      Balleessaa raawwanneef nu fayyisuuf innii\n\n" +
            "Yihuudoonni fannisanii ittis murteessanii\n" +
            "Guyyaa gaaf jimaataa fannoorra oolchanii\n" +
            "Dheebodhe inni jennaan hadha’aa obaasanii\n" +
            "Leenginoos waamanii eeboon waraananii\n\n" +
            "        Bilisa nu baasee bittaa seexanaarraa\n" +
            "       Gooftaan nuuf dhiphatee nuyi biyya lafarraa\n" +
            "       Dhiphinasaa ilaaluun laphee haa \tjijjiirrannuu\n" +
            "      Yeroo bara dhumaa jireenya akka argannuu\n";

    String title = " Qaraaniyoo irratti kan nuuf fannifamee ";

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