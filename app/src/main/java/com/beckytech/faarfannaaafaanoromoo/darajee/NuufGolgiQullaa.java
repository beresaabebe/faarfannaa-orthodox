package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NuufGolgiQullaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nuuf golgi qullaa keenyaa gooftaa \n" +
            "Nuuf dhoksii qullaa keenyaa gooftaa \n" +
            "Re'oota miti nu taasisi hoolotaa \n" +
            "Nuuf agugi qullaa keenyaa gooftaa \n" +
            "Si'ooliin miti nuuf kenni gannataa. \n" +
            "Ceesisa \n\n" +
            "Seeraa Lee cabsinee mana keetii baanee\n" +
            "Cubbuu hojjennee qullaa yeroo taanee\n" +
            "Ati nuuf kennitee uffata hin dhumnee \n" +
            "Har'a uffachu didnee qullaa taanee.\n" +
            "Ceesisa \n\n" +
            "Huuba ija keenya osoo hin qulleessinii\n" +
            "Obboloota keenyatti quba qabnee nuunii \n" +
            "Qullaa waliif haa agugnu akka Yaafeeti\n" +
            "Itti kolfinan ni abaramnaa akka Kaamitti.\n" +
            "Ceesisa \n\n" +
            "Osoo ifa bahee yakkii fi cubbuun keenyaa \n" +
            "Mirga hin argannuu silaa bitaa teenyaa \n" +
            "Addaatti osoo barraa'ee akka himattootaa\n" +
            "Qaanofnee turree nuuf dhoksite gooftaa. \n" +
            "Ceesisa \n\n" +
            "Maaliif qullaa taaneree dhaloonni har'aa\n" +
            "Fayyinaa fi du'aaf qopha'aa jirraa\n" +
            "Nuti horii miti uumama kabajamee\n" +
            "Nu gargaarii waaqayyo mo'amuuf jennee.\n";

    String title = "Nuuf golgi qullaa";

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