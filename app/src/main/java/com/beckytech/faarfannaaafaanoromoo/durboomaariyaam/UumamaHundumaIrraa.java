package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class UumamaHundumaIrraa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = " Uumama hundumarraa qulqullummaa\n" +
            " Jechaan kan hin himamnee olaantumma\n" +
            " Yoomis kan hin dabarre dubrummaa\n\n" +
            "Kun hundumtu kan sii kenname ati\n" +
            "Ulfina kan qabdu Waaqayyoo biratti\n" +
            "Abdii Aaddaam taate lafa kana irratti\n" +
            "Araarsituun keenya Maariyaam qulqulleetti\n\n" +
            " Baha biiftudha ati iftuu kan ganamaa\n" +
            " Kan taatee argamtee burqituu jireenyaa\n" +
            " Nageenyaaf jaalalaan kan guutamtee ati\n" +
            " Eenyun fakkessamta yaa garaa laafeti\n\n" +
            "Kitaaba gaarumma nagaa lubbuu keenya\n" +
            "Haadha haadha caaltu Maariyaam Giiftii keenya\n" +
            "Abaaboo urgooftu biqiiltu jeennataa\n" +
            "Karaa keen dhiyaanne nuti gara Gooftaa\n\n" +
            " Qulqulloota caalaa quluqulluu kan taate\n" +
            " Haadha isaa akka taatuuf Gooftaan sii filate\n" +
            " Ifa ifa caaltu karaa kan jireenyaa\n" +
            " Siin hordofne gallaa gara biyya keenyaa\n";

    String title = "Uumama hunduma irraa";

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