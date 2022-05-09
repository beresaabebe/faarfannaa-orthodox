package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KasoomniKeeDinqiiGarraammummaanKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kasoomni Kee Dinqii Garraammummaan Kee*2\n" +
            "Haadhasaa taateettaa fayyisaa addunyaaf*2\n\n" +
            "Ququlleettiidha atii .........yaa giiftii koo yaa giiftii koo\n" +
            "Gita Kan hin qabnee....................\n" +
            "Gooftaa uumamootaa..................\n" +
            "Si’i irraatii argannee...................\n" +
            "Filatamuun dubroo....................\n" +
            "Anaan Na ajaa'ibee.......................\n" +
            "Ibiddicha haammattee................\n" +
            "Kan hin danda'amnee..................\n\n" +
            "Kasoomni kee dinqii garraammummaan kee\n" +
            "Haadhasaa taatteettaa fayyisaa addunyaaf*2\n" +
            "Hirkoo koon siin jedhaa.........\n" +
            "Eegduu fi Gaaddisa Koo.........\n" +
            "Gaachana kooti atii.....................\n" +
            "Ittisaa fi abdii Koo.......................\n" +
            "Addunyatti akka hin badnee.........\n" +
            "Jireenyi Koo hadhaa'ee..................\n" +
            "Akka wayinii mi'eessi....................\n" +
            "Maariyaam Na qaqqabii................\n\n" +
            "Ati balbala bahaa.........\n" +
            "Gammachuu hunda keenyaa.........\n" +
            "Haadha biiftuu dhugaa.........\n" +
            "Wabii Nama hundaa.........\n" +
            "Gonfoo moo'ichaatii.........\n" +
            "Hojii qulqullummaa.........\n" +
            "Yaabannoo warqeetii.........\n" +
            "Abdiin keenya sumaa.........\n";

    String title = "Kasoomni Kee Dinqii Garraammummaan Kee";

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