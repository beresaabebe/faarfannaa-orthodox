package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IlilJedhaafiFaarfaadha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ilil jedhaafi farfaadhaafi(2*) Maariyaamiidhasfi.\n" +
            "Ilil jedhaafii - Maariyaam haadha koo -- yaa deessuu uumaakoo\n" +
            "     >> - Addunyaan dukkanaa -- naa qabi harkakoo\n" +
            "     >> - Sumatu naaf ta'ee -- da'oof jireenyaakoo.\n" +
            "    Balayisabif gaaddisaa Kan taatee\n" +
            "    Haadha Koo koottuu akkani hin gubannee.\n\n" +
            "Ilil jedhaafii - Biyyaa lafarratti -- Abdii kanaan dhabee\n" +
            "     >> - Dhukkubsadhee kufee -- firaa tokko dhabee\n" +
            "     >> - Maariyaam naaf dhufnaan --boquun koo ol-jedhe\n" +
            "     Ulfinaa haadhakoof gad-jedhati\n" +
            "     Maqaashee faarsaa ol-jedhaati\n\n" +
            "Ilil jedhaafii - Wanta kennuu dhabee -- Dookimaasi dhiphaatee\n" +
            "     >> - Maariyaam haati koo -- hir'uusa argitee\n" +
            "     >>  - Ilmasheetti himtee -- qaanii isaa oolchitee\n" +
            "    Osoo si hinqabnee yoona hin geenyuu\n" +
            "    Kadhanna keetiin kan jiraannuu.\n\n" +
            "Ilil jedhaafii - Baayyinni cubbukoo -- madaalarra darbaa\n" +
            "    >> - Gaddidduu haadhakoo -- salphateetu argamaa\n" +
            "    >> - Kadhannaa Maariyaamiin -- Gannataaa Nan gala\n" +
            "      Balballi cufamee siin banamee\n" +
            "      Dhiifamni addunya siin argamee.\n\n" +
            "Ilil jedhaafii - Yaa haadha Gooftaakoo -- sumaadha hirkoonkoo\n" +
            "    >> - Yeroon dhiphadhutti -- Waaqa Mannaa roobsu\n" +
            "    >> - Karaa keen argamee -- Bishaan kattaa baasuu\n" +
            "    Waan nyaadhu hin qabuu yaa haadha Koo\n" +
            "    Otoo ati hin deenyee buddeena koo.";

    String title = "Ilil jedhaafi faarfaadhaafi";

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