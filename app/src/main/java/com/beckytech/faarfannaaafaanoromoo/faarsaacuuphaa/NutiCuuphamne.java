package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NutiCuuphamne extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nutii cuuphamnee gooftaa uffannee \n" +
            "Jireenyaaf taanee isaan gammannee(2)\n" +
            " \n\n" +
            "Goftaan cuuphameetii\n" +
            "Kan nuttii agarsisee\n" +
            "Fayyinaa argannuu \n" +
            "Gochaan nuu barsiisee\n" +
            "Inni nuu dhageenyee\n" +
            "Sagaleen Afuuraa\n" +
            "Cuphaadhaan argamaa \n" +
            "Jiruun bara baraa\n" +
            "\n\n" +
            "Goftaan yoo cuphamuu \n" +
            "Samiin ni banamee \n" +
            "Ilmii koo an jaaladhuu\n" +
            "Isaa dhagahaa mee\n" +
            "Cuphaan yaa namootaa \n" +
            "Madaa nii fayyisaa \n" +
            "Warra amananii \n" +
            "Arginee hundasaa\n" +
            "\n\n" +
            "Goftaashee argannaan \n" +
            "Gammaddee yordaanos \n" +
            "Xalayaa dinaasan \n" +
            "Kessaa basee iyyasuus \n" +
            "Iccitiin waaqummaa \n" +
            "Kan itti mul'atee \n" +
            "Laggeen bayyee keessaa \n" +
            "Atii kan carroomtee \n" +
            "\n\n" +
            "Goftaa kan uffattan \n" +
            "Cuphaa warri argattan\n" +
            "Maqaa Sillaaseetiin\n" +
            "isin Kan himamtan \n" +
            "Dhiigaaf foon goftaatin \n" +
            "Kan of qopheessitan\n" +
            "Mootummaa Waaqayyoo\n" +
            "Gaabbiidhaan argattan\n";

    String title = "Nutii cuuphamnee gooftaa uffannee";

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