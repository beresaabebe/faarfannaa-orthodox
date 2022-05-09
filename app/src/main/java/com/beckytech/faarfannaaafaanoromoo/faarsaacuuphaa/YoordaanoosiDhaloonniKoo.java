package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YoordaanoosiDhaloonniKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yordaanosi dhaloonni koo\n" +
            "Naaf cuuphameera waaqnikoo\n" +
            " \n\n" +
            "Samii gubbaa taa’uun sagaleen dubbatee\n" +
            "Icciitiin sillaasee ni mul’ate achittii\n" +
            "Bifa gugeen dhufee afuurrii qulqulluun\n" +
            "Abbaas ta’ee ilmii afuurri qulqulluu\n" +
            " \n\n" +
            "Yoor fi daanosii moggaasa argattee\n" +
            "Addam ni argatee uffannaa kabajaa\n" +
            "Xalayichi sunis salphatee argamee\n" +
            "Yoordaanoos ni taate miiccituu addunyaa\n" +
            " \n\n" +
            "Tewaahidoo jechuuni waloomaan ta’eeraa\n" +
            "Waaqni nama ta’ee ni argame achitti\n" +
            "Afaan baasuudhanii yoordaanoos dubbatte\n" +
            "Yohaannistu argee afuura qulqulluun\n" +
            " \n\n" +
            "Yohaannisiin cuuphamee abiddichi sunii\n" +
            "Inni natti ulfaatuu isaaf salphaadha innii\n" +
            "Koottaati ilaalaa raajii yoordaanosiin\n" +
            "Lagni tokko ta’e lama kan turesii\n";

    String title = "Yordaanosi dhaloonni koo";

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