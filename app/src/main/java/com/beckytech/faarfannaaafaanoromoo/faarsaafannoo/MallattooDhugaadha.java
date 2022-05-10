package com.beckytech.faarfannaaafaanoromoo.faarsaafannoo;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MallattooDhugaadha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Mallattoo dhugaadha mallattoo fayyinaa,\n" +
            "Fannoo kiristoosiin fayyina arganneerra!\n" +
            "\n" +
            "Fannoon kiristoosii\n" +
            "Ni jiraam har'asii\n" +
            "Tulluu Giisheenirra\n" +
            "Gar-tokkeensaa jira\n" +
            "Nuuf qabeenya keenya\n" +
            "Kan amantaa keenya\n" +
            "\n" +
            "Ceesisa\n" +
            "\n" +
            "Inni nuti hidhannu\n" +
            "Baattannee adeemnu\n" +
            "Morma keenya irratti\n" +
            "Kan amane marti\n" +
            "Luboonnis baatanii\n" +
            "Kan nuun eebbisanii\n" +
            "\n" +
            "Ceesisa\n" +
            "\n" +
            "Manni kiristiyaanaa\n" +
            "Kan qabdu ofirraa\n" +
            "Kan waloomaa tahu\n" +
            "Yommuu arginu beekna\n" +
            "Ilmaan kiristiyaanaa\n" +
            "Kanaan tokko taana\n" +
            "\n" +
            "Ceesisa\n" +
            "\n" +
            "Kan diinni hin jaallanne\n" +
            "Ilaaluu hin dandeenye\n" +
            "Humni Fannoo gubbaa\n" +
            "Diinoota ni guba\n" +
            "Yoommuttii ol kaafuu\n" +
            "Kanaaf hin jaallatu\n" +
            "\n" +
            "Ceesisa\n" +
            "\n" +
            "Hundi Fannoo miti\n" +
            "Kan arginu marti\n" +
            "Fannoon gosa lama\n" +
            "Kan Gooftaaf hattoota\n" +
            "Har'as wal fakkeessuun\n" +
            "Kan jeequ amantoota \n" +
            "\n" +
            "Ceesisa\n" +
            "\n" +
            "Lubni yoo hin eebbifne\n" +
            "Inni keenya miti\n" +
            "Kanaaf haa hubannu\n" +
            "Abboota haa gaafannu\n" +
            "Luboota eebbisiifnee\n" +
            "Mormat haa hidhannu\n\n" +
            "F/taa Dn Jaalal Naggasaa\n";

    String title = " Mallattoo dhugaadha ";

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