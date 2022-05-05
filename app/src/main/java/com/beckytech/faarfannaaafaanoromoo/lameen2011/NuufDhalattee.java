package com.beckytech.faarfannaaafaanoromoo.lameen2011;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NuufDhalattee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nuuf Dhalatee dhalateeraa inni nuuf dhalate(2)\n" +
            "Jaalalaa isaatiin Gooftaan  nuuf Dhalatee \n" +
            "         Ceesisa \n\n" +
            "Nuuf Dhalatee Mooraa horiititti\n" +
            "   \"\"        \"\"      Akka hiyyeessaatti\n" +
            "  \"\"        \"\"        mootiin moototaa\n" +
            "  \"\"        \"\"        inni dhalateeraa\n" +
            "  \"\"        \"\"        nagaaha namootaa\n" +
            "  \"\"        \"\"        isaatu nuuf laataa\n" +
            "         Ceesisa \n\n" +
            "Nuuf Dhalatee Gooftaan foon uffate\n" +
            "  \"\"        \"\"        inni nuu jaalate\n" +
            "  \"\"        \"\"        bilisa nu baasee\n" +
            "  \"\"        \"\"        Kiyyoo seexanarraa\n" +
            "  \"\"        \"\"        akka jirannuuf\n" +
            "  \"\"        \"\"       inni nu biteeraa\n" +
            "         Ceesisa \n\n" +
            "Nuuf Dhalatee Ibsaan jireenya koo\n" +
            "  \"\"        \"\"       mootiin nageenya koo\n" +
            "  \"\"        \"\"       Dukkanicha keessaa\n" +
            "  \"\"        \"\"       isaatu nu baasee\n" +
            "  \"\"        \"\"       seexanni haa fagatuu\n" +
            "  \"\"        \"\"        isaatu nu kaasee\n" +
            "         Ceesisa \n\n" +
            "Nuf Dhalate Garba cubbichaa\n" +
            "  \"\"        \"\"       nuti  kan turee\n" +
            "  \"\"        \"\"       Iyyesuus dhufeetoo\n" +
            "  \"\"        \"\"       irraa nuu furee\n" +
            "  \"\"        \"\"       dukkana fageessee\n" +
            "  \"\"        \"\"       ifaan nu geggeesee\n" +
            "         Ceesisa \n\n" +
            "Nuuf Dhalatee kootta ni gammannaa\n" +
            "  \"\"        \"\"        ifni nuuf baheeraa\n" +
            "  \"\"        \"\"        fayyisaan Addunyaa\n" +
            "  \"\"        \"\"      Iyyesuus Dhalatee\n" +
            "  \"\"        \"\"      Gammachuun kan guutee\n" +
            "  \"\"        \"\"      Jireenya nuuf laatee\n\n" +
            "                 F/taa Geetahun Shawaa(Koo'el)     \n";

    String title = "Nuuf dhalattee";

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