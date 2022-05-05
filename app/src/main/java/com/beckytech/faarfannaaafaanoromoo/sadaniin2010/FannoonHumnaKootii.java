package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FannoonHumnaKootii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ani hin kutuu fannoo fannoon humna kootii\n" +
            "Kan irratti bu’ee dhiiga hoolichaatii\n" +
            "Tasuma hin kutuu dhaadannoon koo isaa\n" +
            "Fannoo isaa qabadheen diina koo qaanessaa(2)    \n                            \n" +
            "Fannoo isaa qabannee Gooftaa duuka buunaa                                \n" +
            "Nutis ilmaan isaa akka qulqulloota                                 \n" +
            "Meeshaa injifannoo nuuf taa’e fannoonii                                \n" +
            "Nutis ni kabajna baruma baraanii (2\n\n" +
            "Yommuu manaa baa’uu akeekaa karaa koo\n" +
            "Mallattoo naaf ta’ee beekamtii eenyummaa koo\n" +
            "Si’iin kudhammadhaa maalifan si kutaa\n" +
            "Daandii jireenya koo fannoosaan mijataa(2)\n\n" +
            "Warrii shakkitootaa fannoo qaaneeffatuu\n" +
            "Hin fayyisuu jechuun ammas ni dubbatuu\n" +
            "Lakkii qalbeeffadhaa fannoon ni fayyisaa\n" +
            "Irraa bule jiraa humnii waaqummaasaa(2)\n\n" +
            "Mallattoo keenyadhaa kanitti fayyinuu\n" +
            "Fannoon nuuf humnadhaa kan itti jiraannu\n" +
            "Dandii abbootiidhaa nuti homaa  hin dagannuu\n" +
            "Fannoosaa qabanne diinota hin  sodaanuu(2)                            \n";

    String title = "Fannoon humna kootii";

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