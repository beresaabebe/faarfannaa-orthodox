package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GuddinaaKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Guddina kee ulfina keen odeessa\n" +
            "Jaalala kee argee akkamit caalisaa?\n" +
            "Wangeela kee Addunyaafan labsaa\n" +
            "Waan dhagahee akkamittin dhoksaa\n\n" +
            "Xibraadositti raajin at hojjetee\n" +
            "Iyyarikoot inni ati raawwattee\n" +
            "Ajaa’ibam sammuu naman olii\n" +
            "Siif haa ta’u galataf ulfinni\n\n" +
            "Kee hin dhumuu himamee\n" +
            "Kee hin dhumuu lallabamee\n" +
            "Hamma hadara biyya lafaa\n" +
            "Wangeelli kee itti fufa\n\n" +
            "Situ dhabee humna Leegiyoonii\n" +
            "Balli keetin Gooftaa abboomunii\n" +
            "Maal dadhabdaa? hunduma dandeessaa\n" +
            "Martu harka kee barruu kan kee keessaa\n\n" +
            "Waggaa dheeraaf Dhiigni shee lola’ee\n" +
            "Kophaa taate namni irraa adda ba'ee\n" +
            "Dhuftee xuqxee uffata kee Gooftaa\n" +
            "Ni dhaabbate dhiphun shee barootaa\n\n" +
            "Beetesayidaat Matsaguu Fayyistee\n" +
            "Damasqottis phawoos boojitee\n" +
            "Humnan miti Jaalalan weerartaa\n" +
            "Mootii iyyesuus hundumayyu caalta\n";

    String title = "Guddinaa kee";

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