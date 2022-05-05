package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FayyisuuKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Fayyisuu kee ija koon argeeraa\n" +
            "Dandeettii kee Gooftaa hubadheeraa\n" +
            "Du'aa kaaste jiraataa taasistaa\n" +
            "Yaa iyyesuus maaltu sin qixxaataa?\n" +
            "..........\n\n" +
            "Ni Dhaabbatuu qilleensaaf galaannii\n" +
            "Maqaa keetin Gooftaa Aangoo keenii\n" +
            "Kan raafamu bidiruun lixudhaaf\n" +
            "Abboomamee dhaabbatee Gooftaaf\n" +
            "..........\n\n" +
            "Awwallamee guyyaa afur bulus\n" +
            "Reeffi isaa baayyee foolli qabus\n" +
            "Atoo kaastee Alzaar du'atii\n" +
            "ati Iyyesuus qoricha hundatii\n" +
            "..........\n\n" +
            "Iyyaariyoos mootiin Qirfinayoo qifraaniyoo\n" +
            "Dhukkubsanan muchaansaa xabitaan\n" +
            "Hin sodaatin jette jabeessitee\n" +
            "Du'a irraa lubbuu ishee hambiste\n" +
            "..........\n\n" +
            "Ani argeeraa fayyisuu kee Gooftaa\n" +
            "Ilma waaqaa Iyyesuus jiraataa\n" +
            "Siif kenneraa umuriin koo kan keetii\n" +
            "Wangeeladhaaf harka koo kaaseetii \n";

    String title = "Fayyisuu kee";

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