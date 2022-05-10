package com.beckytech.faarfannaaafaanoromoo.faarsaafannoo;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ArgaameeFannoonGooftaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Argaamee Fannoon Gooftaa \n" +
            "Gammadaa yaa namootaa\n" +
            "Ceesisa\n" +
            "Tullu lama gidduutti inni awwaalame,\n" +
            "Balfi irra tuulamee,\n" +
            "Waggaa dhibba sadiif kan dhakate ture,\n" +
            "Awwaalamee hin hafne,\n" +
            "Diinni dhoksuuf yaaluus inaaffaan guutamee,\n" +
            "Garuu hin dandeenye!\n" +
            "Ceesisa\n" +
            "Mootittiin Illeenii hedduu kan dhamaate,\n" +
            "Amantiin jabaatte,\n" +
            "Namoota biyyaa walitti qabattee,\n" +
            "Maanguddoota waamte,\n" +
            "Waggaa hedduuf turuu itti dubbatanii,\n" +
            "Bakkicha shakkiini!\n" +
            "Ceesisa\n" +
            "Mijirri dhaabbatee kadhannaan godhamee,\n" +
            "Libaannis haarfamee,\n" +
            "Haarri isaas ol ka'ee ol samiitti bahee,\n" +
            "Boca fannoo tahe,\n" +
            "Achii gadi jechuun tullicharra buhe\n" +
            "Bakki isaas baramee!\n" +
            "Ceesisa\n" +
            "Ji'oota ja'aafii itti dhamahaanii,\n" +
            "Fannoocha baasanii,\n" +
            "Yommuu ijaan arganii baay'ee gammadanii,\n" +
            "Ililleen faarsanii,\n" +
            "Kabaja guddaadhaan fuudhanii deemanii,\n" +
            "Namootat labsanii!\n\n" +
            "F/taa Dn Jaalal Naggasaa.\n";

    String title = " Argaamee Fannoon Gooftaa ";

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