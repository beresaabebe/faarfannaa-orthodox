package com.beckytech.faarfannaaafaanoromoo.lameen2011;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MaalooHinGoyyominaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maaloo hin goyyomina yaa dhala nama \n" +
            "Gooftaan ni dhufa hin rafin Gonkumaa\n" +
            "Iyyesuus ni dhufa hin rafin Gonkumaa\n\n" +
            "Gooftaan Dhufaatisaa inni mulliseeraa\n" +
            "Rajjisaa hedduunis kuno xummureeraa\n" +
            "Kootta hin dhiphannuu dammaqne kadhannaa \n" +
            "Dhufaatii Gooftaasii qophoofnee jiraannaa \n\n" +
            "Guyyaansaa gaheera dhufaatiin Iyyesuus\n" +
            "Maaloo hin rafinaa ka'aa dammaqaasii\n" +
            "Bayyee dhiyaateera guyyaan sodaachisaa\n" +
            "Yeroodhaan qopha'a kadhaadha fayyisaa       \n     \n" +
            "Yaa saba waaqayyoo maaliif wal jibbinaa\n" +
            "Guyyaan murtee gahee Maaloo wal jaalanna\n" +
            "Seera isaas raawwanna nuto wal simannaa\n" +
            "Yoo Gaarii hojjenne mirgasaa dhaabbannaa       \n    \n" +
            "Dhufaticha labsuuf karaatti yoo gufanne\n" +
            "Innoo ol nu qabaa  nuti yoo jabaannee\n" +
            "Haala nuuf mijeessa iddoo boqonnaa keenyaa\n" +
            "Iyyesuus nu cimsaa akka taanuf fakkeenya       \n      \n" +
            "Namoota ni kanaa halkaniif guyyaattii\n" +
            "Gooftaanis ni dhufaa yeroo nuti beeknetti\n" +
            "Qalbii jijjirannaa gaafa hundumaatti\n" +
            "Qophoofnee eganna barichi ni dhufati\n\n" +
            "            F/taa Geetahun Shawaa(Koo'el)\n";

    String title = "Maaloo hin goyyominaa";

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