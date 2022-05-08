package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Namatuhinbeeknemalee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Namatu hin beekne malee jaalallikee addaa\n" +
            "Jaalallikee addaa\n" +
            "Fakkenyaas hin qabdu gaarummaan kees guddaa\n" +
            "Gaarummaan kees guddaa \n" +
            "An siin galateeffadhaa x2       \n           \n" +
            "Anaan olchuudhaf waraanamtee\n" +
            "Qullaakee tatee natti uffistee\n" +
            "Olmaakee kanaaf hin daagadhuu\n" +
            "Kanaaf fannookee kanan baadhuu    \n      \n" +
            "Maqankee maqaarra nicaalaa\n" +
            "Dabarsee waamuun nattii tolaa\n" +
            "Siinaan miliqee gaachanakoo\n" +
            "Galatefamii yaa gooftaakoo          \n        \n" +
            "Jalalaa malee jibbaa hin beektuu\n" +
            "Qaabesas dhabas kan simattuu\n" +
            "Rakkina irrati  naa ceesisitee\n" +
            "Nyaataa barruukee naa nyaachiftee     \n        \n" +
            "Hin jijiramuu ammallikee\n" +
            "Mii'effadheraa abbumaakee\n" +
            "Naa ceesiftetaa galaniichaa\n" +
            "Ani olmaakeetif nani ililchaa\n";

    String title = "Namatu hin beekne malee jaalallikee ";

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