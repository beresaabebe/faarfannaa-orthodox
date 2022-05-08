package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AraarsituMaariyaam extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Araarsituu Maariyaam Araarsituu/2/ \n" +
            "Araarsituu Maariyaam Araarsituu/2/                  \n" +
            "Araarsituu yaa haadha garramii\n" +
            "Araarsituu Maariyaam Araarsituu\n" +
            "’’            ’’          Durbee Maariyamii\n" +
            "Araarsituu Maariyaam Araarsituu\n" +
            "’’            ’’        Yaa garalaafetti \n" +
            "Araarsituu Maariyaam Araarsituu/2/\n\n" +
            " Eenyu jedheen waama maaqa kee \n" +
            "Maariyaam natti ulfaatte oolman kee/2/   \n                \n" +
            "Araarsituu   Yaa haadha jaalala \n" +
            "‘’              ‘’        Simattu naf caalaa \n" +
            "‘’            ‘’         Yeroon waa qabnetti \n" +
            "‘’               ‘’      Qabees na gootetti                  \n" +
            "Yaa garalaffetti\n" +
            "Diinaa naf faalmii ati\n\n" +
            "Araarsituu Kottumee garakoo  \n" +
            "   ’’               ’’     Yaa hadhaa Gooftaa koo   \n" +
            " ’’                ’’     Laali hir’ina Koo   \n" +
            " ’’               ’’     Guutii hir’ina koo                     \n\n" +
            "Araarsituu    Baay’inni yakka kootii\n" +
            "’’              ’’      Gooftaatti nan buuttuti\n" +
            "’’                ’’      Kadhanna koo fuute\n" +
            "’’               ’’     Gooftaa gurraa buufte\n";

    String title = "Araarsitu Maariyaam araarsitu";

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