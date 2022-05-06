package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YooTureeyyuu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yoo tureeyyuu fagatee guyyaansaa\n" +
            "Abdiin koo si'i  Situ naaf dabarsaa\n" +
            "Sin eeggaadha Obsaan Imimmaan koo roobsaa(2)     \n         \n" +
            "Yoo tureeyyuu Gooftaa kan dursu jiru               \n" +
            "Kiyyoo diina kootis isaa  narra ciruu              \n" +
            "Harka kee galfadhuu jireenya koo keessa               \n" +
            "Eelshaadayiidha ati hundaa ni dandeessa\n\n" +
            "Nan dhufa mana kee dandii kee qabadhee\n" +
            "Cubbuu koo duranii hundaasaa dagadhee\n" +
            "Jecha kee dhaagaheen dhisee waan jallinaa\n" +
            "Tolummaa keef jettee dhaabbatte na cinaa \n\n" +
            "Gaaffiin deebii dhabee yoo turees barrisaa\n" +
            "Si malee yaa Gooftaa eenyuu naa deebisaa?\n" +
            "Yakka koo ilaaltee natti hin baatu haaloo \n" +
            "Haadha keeti jeedhi naa yaadhu maaloo      \n";

    String title = "Yoo turee iyyuu";

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