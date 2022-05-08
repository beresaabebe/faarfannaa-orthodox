package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class LakkiiGorfamiiGorfamii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Lakkii gorfamii gorfamii yaa namaa gorfamii(x2)\n" +
            "Aabaaboon har'aa bor biyyoo dhumaa(x2)\n\n" +
            "      kitaabni quulqulluun siif  barreeffameera\n" +
            "      Lubbuu kee fayyisi sitti himamee jiraa\n\n" +
            "Qabbannii fi abiddi si fuuldura jiraa\n" +
            "Mootummaan Waaqayyoo dhufee dhiyaateera\n\n" +
            "     Tolummaa keef mitii lubbunkee turunii\n" +
            "      Gaabbi akka galtuuf argattee umurii\n\n" +
            "Abidda osoo hin seenin sababa yakka keen\n" +
            "Maaloo jijjiramii sirreessi adeemsakee\n";

    String title = " Lakkii gorfamii gorfamii yaa namaa gorfamii ";

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