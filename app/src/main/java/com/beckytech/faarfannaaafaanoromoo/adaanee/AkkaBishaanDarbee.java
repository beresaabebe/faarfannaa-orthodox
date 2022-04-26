package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AkkaBishaanDarbee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Akkaa Bishaan Darbee Rakkoo koon dagadhee\n" +
            "Waaqa Abbootii koo maqaa keetti hirkadhee\n" +
            "Meeqan Darbee meeqa Siin meeqa Abbaa koo\n" +
            "Har'aa kan miidhagee Sumaan jireenyi koo\n" +
            "...................................\n" +
            "Hin darbu fakkaate kan natti ulfaatee\n" +
            "Gooftaa Koo siin darbee  keessi koo hafuurfatee\n" +
            "Gaarri rakkinaa hundu jecha keen diriireera\n" +
            "Sammuun koo lapheen koos amma tasgaba’eera\n" +
            "...........................................\n" +
            "Imimmaan koo haqxee gadda koo cabsitee\n" +
            "Hir'uu koo naa guuttee guutuu na badhaastee\n" +
            "Galaana Abiddaa sana Gooftaa siin qaxxaamure\n" +
            "Har'acuu fayyu didee galata keef hiriiree\n" +
            "...........................................\n" +
            "Dukkana gidiraa lubbuu koo deebisii\n" +
            "Situ naaf qalamee irra na dabarsee\n" +
            "Riqichaa jabaa kiyyaa utubaa hin sochoone\n" +
            "Jireenyati ce'e malee teellaa Kee bu'ee banne\n" +
            "...........................................\n" +
            "Kiyyichi caccabee ka nyaphi qopheessee\n" +
            "Barruu isaa diriirsee waaqni na miliqsee\n" +
            "Gaadan koo nan argatu akka kaanetti kufeera\n" +
            "Inni na waliin jiru moo'annaa naaf laateera\n";

    String title = "Akkaa Bishaan Darbee";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbaaf_ilma);

        initUI(title);

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