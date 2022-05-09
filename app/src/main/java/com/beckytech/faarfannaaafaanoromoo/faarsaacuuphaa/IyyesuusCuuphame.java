package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IyyesuusCuuphame extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Iyyesuus Cuuphame nutis fayyinee\n" +
            "Garbummaarraa bilisa baane\n" +
            "........................\n" +
            "Hojiin Seexanaa - Bilisa Baane\n" +
            "Karaa dhiphinaa \n" +
            "Nurraa ka'eeraa\n" +
            "Gooftaan moo'eraa\n" +
            "Cuuphamu isaatiin nutis carroomnee\n" +
            "Galata waaqaa bilisa baanee\n" +
            ".........................\n" +
            "Yee cuuphame - Bilisa Baane\n" +
            "Gooftaa iyyesuusi \n" +
            "Tokko taasise\n" +
            "Yooriif Daanosi \n" +
            "Bara hedduudhaf addaan bahanii\n" +
            "Gooftaan cuuphamnaan tokko ta'anii\n" +
            "......................\n" +
            "Gaarreen gammadan - Bilisa Baane\n" +
            "Tulluun utaalaan\n" +
            "Cuuphamu isaatiin\n" +
            "Samiim banaman\n" +
            "Sanyii Addaamiig ta'e Gammachuun\n" +
            "Nurraa darbeera baraan gubachuun\n" +
            "........................\n" +
            "Galanni Yordaanos - Bilisa Baane\n" +
            "Sodaan baqatte\n" +
            "Fuula kiristoos\n" +
            "Hin laalu jettee\n" +
            "Yordaanos dhaaphuu hin baqatinii\n" +
            "Ba'aan kee in bu'aa Aangoo waaqanii\n" +
            ".............................\n" +
            "Boojiin hafeeraa - Bilisa baane\n" +
            "Kansaa taanerra\n" +
            "Cuuphaas cuuphamne\n" +
            "Kiristoos uffannee\n" +
            "Diini haa gubatu nuti kansaati\n" +
            "Nu bitateera jaalala isaatiin\n\n" +
            "F/taa Naatii (Akliiluu)\n";

    String title = "Iyyesuus Cuuphame nutis fayyinee";

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