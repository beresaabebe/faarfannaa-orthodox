package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GalataKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galata keex2 Yaa WAAQAYYO galatakee!\n" +
            "Yaa WAAQAYYO- yaa WAAQAYYO,\n" +
            "Oolmaa kee hundumaaf\n" +
            "Gochaa kee hundumaaf\n" +
            "Nut homaa hin qabnuu\n" +
            "Wanta siif laatamuu\n" +
            "Iliil jedhaax2 mee WAAQAYYOOf iliil jedhaa\n" +
            "mee WAAQAYYOOf\n" +
            "mee WAAQAYYOOf\n" +
            "Waaqummaasaatiifi\n" +
            "Gooftummaasaatiifi\n" +
            "Isa nu jaallateef\n" +
            "Du'a nu oolchateef\n" +
            "Bittaa diinaa jalaa\n" +
            "Isa nu baafateef\n" +
            "Gara mana isaatti\n" +
            "Isa nu waammateef\n" +
            "Nu eebbisiix2 yaa WAAQAYYO nu eebbisi.\n" +
            "Yaa WAAQAYYO\n" +
            "Yaa WAAQAYYO\n" +
            "Ijoollee kee taanee\n" +
            "Dhufneerra gara kee\n" +
            "Guyyaa 40f\n" +
            "Guyyaa 80\n" +
            "Maqaa keen cuuphamnee\n" +
            "Mucummaa kee arganne\n" +
            "\n" +
            "\n" +
            "Akkam bareeddi Tawaahidoon-\n" +
            "Akkas bareeddi Tawaahidoon\n" +
            "Iyyasuusiin- Eeyyee\n" +
            "Yommuu lallabduu\n" +
            "Gooftummaasaaf-......\n" +
            "Yommuu sagaddu\n" +
            "Haadha Gooftaa....\n" +
            "Yommuu kabajjuu\n" +
            "Ergamootaa.....\n" +
            "Yommuu abdattu\n" +
            "Qulqulloota...\n" +
            "Wanta jaallattuuf \n" +
            "\n" +
            "Phaaphaasotaan...\n" +
            "Waan hogganamtuuf\n" +
            "Lubootasheen...\n" +
            "Yommuu eebbistu\n" +
            "Diyaaqonootan...\n" +
            "Kan tajaajiltuu\n" +
            "Ayyaanoota...\n" +
            "Yommuu kabajju\n" +
            "Faarfattootaan....\n" +
            "Yommuu faarfattu\n" +
            "\n" +
            "\n" +
            "Uummata ishee....\n" +
            "Yommuu barsiiftuu\n" +
            "Balee uffattee... \n" +
            "Yommuu galatoo\n" +
            "Fannoo hidhattee...\n" +
            "Yommuu adeemtuu\n" +
            "Tokkummaadhaan....\n" +
            "Yoo waaqeffattuu\n" +
            "Waloomatti...\n" +
            "Yommuu waamamtuu -\n" +
            "akkas bareeddi Tawaahidoon\n";

    String title = "Galata kee";

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