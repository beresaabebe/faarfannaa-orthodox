package com.beckytech.faarfannaaafaanoromoo.faarsaaergamoota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NaannooWarraWaaqayyoon extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "(Naannoo warra Waaqayyoon sodaatanii\n" +
            "Ni buufatu ergamoonni Waaqayoo)(x2)\n" +
            "Isaaniin ni eegu ni oolchuu leeyyoo\n\n" +
            "     Ergamaan Waaqayyoo gaarummaa keen  koottuu\n" +
            "    Muddama keessatti kan namaaf birmattu\n" +
            "    Mikaa'eel(x2) jennee siin waammannaa\n" +
            "    Gaaddisa kochoo kee ofirraa qabaannaa\n\n" +
            "Gabri'eel dhufeeraa koochon balali'ee\n" +
            "Furmaata itti kennuuf rakkoo nurra ga'ee\n" +
            "Fuula Waaqayyooti kan inni dhaabbatu\n" +
            "Rakkoo dhala namaaf furmaata kan laatu\n\n" +
            "    Qulqulluu Uraa'el ati nu gargaari\n" +
            "    Akkuma Iziraa nuuf godhi waan gaarii\n" +
            "    Xoofootti qeensite dhiiga gooftaa keenyaa\n" +
            "    Isaan qulqulloofnee argannee nageenyaa\n\n" +
            "Suraafel Kiruubel raayyan ergamootaa\n" +
            "Sodaadhaan kan marsan teessoo Sillassota\n" +
            "Surraasan uffatan ni ifa akka urjootaa\n" +
            "Yoomuu nuuf kadhatu ergamoonni gooftaa\n";

    String title = "Naannoo warra Waaqayyoon";

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