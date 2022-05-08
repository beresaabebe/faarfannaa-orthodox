package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GalatakeeWaaqakoo  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galata Kee (2)Waaqa Koo\n" +
            "Galata Kee(2) Uumaa Koo\n" +
            "Na Bitatte Lubbuu Koo\n\n" +
            "Galaatakee… Fooniif Lubbuudhaan Badee\n" +
            "                         Dandii Kees Irraanfadhee\n" +
            "                         Akkan Deebi'u Na Gootee\n" +
            "                         Sagalee Kee Hubadhee\n" +
            "                         Ulfaadhu Kaa Mootii Koo\n" +
            "                       Jaalalaan Na Mo’atte\n" +
            "Ba’aa Koo Isa Cimaa\n\n" +
            "Fannoo Irratti Naa Baattee\n" +
            "Diina Koo Seexanichaa\n" +
            "Situ Narraa Ifatee\n" +
            "Galatoomi Waaqa Koo\n" +
            "Kan Nama Na Godhattee\n\n" +
            "Galatakee…Akkan Ani Hin Beelofneef\n" +
            "                     Foonuma Kee Naaf Laattee\n" +
            "                     Akkan Ani Hin Dheebonnees\n" +
            "                     Dhiiga Kee Na Obaastee\n" +
            "                    Maqaan Kee Haa Ulfaatuu\n" +
            "                     Gocha Ati Naaf Gooteef\n";

    String title = "Galata Kee Waaqa Koo ";

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