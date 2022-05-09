package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YordaanosGammaddee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yordaanos gammaddee hedduus ni carroomtee }×2\n" +
            "Gooftaa ishee simaattee kabaja argattee }×2\n\n" +
            "Dhufee samii irraa  Gammaddee H. ni c/tee ×2  \n" +
            "Laga Yordaanositti       ▸▸                  ▸▸  \n" +
            "Kiristoos Cuuphamee  ▸▸                  ▸▸  \n" +
            "Harkaa Yohaannisitti  ▸▸                  ▸▸\n" +
            "Addaamin debbisuuf iddoo jalqabatti\n" +
            "Iyyasuus Cuuphamee Yordaanos keessatti\n" +
            "\n\n" +
            "Abbaan samii irraa   Gammaddee H. ni c/tee ×2\n" +
            "Akkas yeroo jedhu      ▸▸                     ▸▸\n" +
            "Ilmii koo isaadha        ▸▸                     ▸▸\n" +
            "Innin ani jaaladhu      ▸▸                      ▸▸\n" +
            "Tokkummaa fi sadumma kunno ifa godhee\n" +
            "Iyyasuus cuuphamee ilmaan isaaf jedhee\n" +
            "   \n\n" +
            "Kabajaa Gooftaatif  Gammaddee H. ni c/tee ×2    \n" +
            "Yordaanos baqattee     ▸▸              ▸▸    \n" +
            "Waaqa uumaa ta'uu      ▸▸              ▸▸    \n" +
            "Isaas ni hubattee          ▸▸               ▸▸    \n" +
            "Biqiltuu fi garreen hunduu ni utaalu      \n" +
            "Mootiittu cuuphamee isa hunda caalu\n" +
            "\n\n" +
            "Egaa kana booda   Gammaddee H. ni c/tee ×2\n" +
            "Garbummaan hafeerra    ▸▸               ▸▸\n" +
            "Gammachuun faarsiina   ▸▸              ▸▸\n" +
            "Nu hundii fayyineerra       ▸▸              ▸▸\n" +
            "Xalayaan garbummaa nuyif barreffamee\n" +
            "Nurra barbaadeese Gooftaan nuf cuuphamee\n";

    String title = "Yordaanos gammaddee hedduus ni carroomtee";

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