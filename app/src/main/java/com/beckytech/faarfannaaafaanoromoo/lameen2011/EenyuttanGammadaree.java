package com.beckytech.faarfannaaafaanoromoo.lameen2011;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class EenyuttanGammadaree extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Eenyutan gammadaree Gooftaa kooti malee\n" +
            "Isaa anaf jedhee Fannoo Gubaa olee\n" +
            "Olmaa narraa qaba yoomuu dagatamuu(2)  \n       \n" +
            "Qaraniyoorratti Gooftaa Fannisanii\n" +
            "Cinaacha isa Eebbon waraanaanii\n" +
            "Hunda kan Obsee cubbuu koof jedheeti\n" +
            "Isa malee hin  qabuu firaa lubbuu kooti       \n          \n" +
            "Anaf jedhetii hedduu kan dhiphatee\n" +
            "Jaalalaa isaa fannorratti Ibsatee\n" +
            "Mootii moototatii kan danda'u hundumaa\n" +
            "Lubbuu koo bitatee hamma bara dhumaa      \n      \n" +
            "Yeroo hundatti kan na waammatee\n" +
            "Fayyi naan jedhee anaani Filaatee\n" +
            "Ani hooma qabu kanaan isa dhiheessu\n" +
            "Galataa isaatiif inni naa haa kaasuu\n" +
            "Egaa lapheen koo isa filateeraa\n\n" +
            "Kan bara bara isa qabadheeraa\n" +
            "Ani kana booda Iyyesuus Filadhe\n" +
            "Nan galateeffadhaa halleeluya jedhe \n\n" +
            "           Dn Abarraa Baqqalaa            \n";

    String title = "Eenyuttan gammadaree";

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