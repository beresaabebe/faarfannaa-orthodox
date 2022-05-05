package com.beckytech.faarfannaaafaanoromoo.lameen2011;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SiMalee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Si malee maalan qaba maariyaam giiftii koo\n" +
            "Harmee Iyyeesusii yaa haadha olmaa koo\n" +
            "Sitti himadhee hedduu darbeeraa\n" +
            "Ammas naaf koottu ani sitti of laadheraa         \n        \n" +
            "Ano balleesseraa biyya lafarratti\n" +
            "Ajaja uumaa koo hin eegne takkitti\n" +
            "Maariyaam haadha koo na dagatiin ati\n" +
            "Eessayyuu hin deemu ani ilma keeti\n\n" +
            "Sanyii hunda keessa ati nuuf hafte\n" +
            "Gonka qulqullofte Gooftaan filtamtee\n" +
            "Balleesuma keenyaf wabii nuuf taatettaa\n" +
            "Qoricha Addunyaa Gooftaa nuuf laatettaa\n\n" +
            "Maariyaam giiftii koo ati naaf jiraadhu\n" +
            "Cubbuu kootifis Gooftaa na kadhadhu\n" +
            "Ani cubbamaadha yoomiyyuu tananii\n" +
            "Adaraa haadha koo narra hin fagaatinii\n\n" +
            "Galaa godhadhera maqaa kee Maaramii\n" +
            "Ati na dagatiin yaa haadha garraamii\n" +
            "Ani sii qapheera tasumaa hin yaada'u\n" +
            "kan siiti Abdatu eenyumtuu hin qana'u\n\n" +
            "         F/taa Geetahun Shawaa(Koo'el)\n";

    String title = "Si malee";

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