package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HaadhummaaKeenHima extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Haadhummaa keen hima yaa haadha koo\n" +
            "Yaa fakkaattu gugee garraami koo \n" +
            "\n\n" +
            "Abjuu koo dagadhe dhugaarra hin ijaajju\n" +
            "Kan koo Kan hin taane sobni nan ajajuu\n" +
            "Dhugaan sirraa argamee jaalala Kan deesse\n" +
            "Maariyaam sin waamaa maqaa kee olkaase \n" +
            "\n\n" +
            "Jireenya Isa latu barruu kee irratti baatte\n" +
            "Ilma kee Iyyesuus duuka Kan godaante\n" +
            "Keessi koo amanee waa'e kee nii faarsa \n" +
            "Anis dhaloota dha sichan si leellisaa \n" +
            "\n\n" +
            "Akka Abba Eefreemi galata keen hima\n" +
            "Jaalala keef durbee an nan wareegama\n" +
            "Oduu diinaa ilaale duubatti hin deebi'u \n" +
            "Tokkicha jedheera sirraa addaan hin ba'uu\n";

    String title = "Haadhummaa keen hima";

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