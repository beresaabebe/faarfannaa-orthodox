package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class OrtodooksiiDhugaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Dhaala Amantaa koo hin kennuu yoomiyyuu\n" +
            "Ortodooksii malee hin jiru kamiiyyuu\n" +
            "Suma kanan waamu waregama Abbootii\n" +
            "Yaabbannoo dhugaadha hin dagatamtuu atii    \n   \n" +
            "Jaarraa heddudhaf biyya samii turtee\n" +
            "Fayyisan addunyaa si'i namaf laatee\n" +
            "Yaa karaa Fayyinaa jireenyaa buustee\n" +
            "Dhiiga kiristoosiin ati kan hundooftee\n\n" +
            "            Amantaa Abbaa koo hin kennu dabarsee\n" +
            "            Du'a Addunyaarraa situ na Ceesisee    \n  \n" +
            "Daandii ishee dhugaa yaa nama hubadhuu\n" +
            "Ortodooksii dhugaa isheedhaan jiraadhuu\n" +
            "Dhaalli Abbaa koo Waaqarraa kennamee\n" +
            "Iyyesuusiin kennaamtee isa fannifamee\n\n" +
            "Na baraari Gooftaa du'a si'oolirraa\n" +
            "            Ati na deefadhu harka seexanarraa\n\n" +
            "Tasaa goyyooffamuu meetiif Warqeedhan\n" +
            "Amantii Abbaa koo hin kennu garaadhan\n" +
            "Qabeenya lafarraa naaf wayya Nageenyaa\n" +
            "Manasaa jiraachun ogummaaf qabeenyaa\n\n" +
            "          Yoomiyyuu jijjiiruu amantii isaa dhugaa\n" +
            "          Amantaa jalqabaa nan buu'a si duukaa     \n     \n" +
            "         F/taa Dn Mankir Girmaa\n";

    String title = "Ortodooksii dhugaa";

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