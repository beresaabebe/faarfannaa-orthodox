package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaWaaqayyoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa Waaqayyoo koo ati Fayyisaaf jaalala\n" +
            "Jaalala kan kee maaltu madaalaa?\n\n" +
            "Yaa Waaqayyoo koo jireenyi Addunyaa\n" +
            "     \"\"'        '\"\"      \"\"        simalee naaf hin ta'u\n" +
            "     \"\"'        '\"\"      \"\"        dhiphina sammu koos\n" +
            "     \"\"'        '\"\"      \"\"        si malee na ba'u\n" +
            "     \"\"'        '\"\"      \"\"        karoorri jireenyas\n" +
            "     \"\"'        '\"\"      \"\"        simalee milkaa’uu\n" +
            "Mana kee keessatti ati na tikfadhu\n" +
            "Akka ani badnee ati na baafadhu\n\n" +
            "Yaa Waaqayyoo koo Sammuun koo jeeqamnan\n" +
            "     \"\"'        '\"\"      \"\"        Gooftaa sinan gammadda\n" +
            "     \"\"'        '\"\"      \"\"        ifa jireenya koo\n" +
            "     \"\"'        '\"\"      \"\"        sinan argadhee\n" +
            "     \"\"'        '\"\"      \"\"        gammaden jiraadha\n" +
            "     \"\"'        '\"\"      \"\"        maqaa kee waamadhee\n" +
            "Mana kee keessatti ati na gorfadhuu\n" +
            "Akka Ani badneef ati na baafadhuu\n\n" +
            "Yaa Waaqayyoo koo humna dhabee kufnan\n" +
            "     \"\"'        '\"\"      \"\"        si'inan ol jedhee\n" +
            "     \"\"'        '\"\"      \"\"        anis siif jira jettee\n" +
            "     \"\"'        '\"\"      \"\"        ato ol na dhaabdee\n" +
            "     \"\"'        '\"\"      \"\"        mana kee keessattis\n" +
            "     \"\"'        '\"\"      \"\"        kuno nan faarfadhee\n" +
            "Mana keessatti ati na tikfadhuu\n" +
            "Akkan ani badneef ati na gorfadhuu\n";

    String title = "Yaa waaqayyoo";

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