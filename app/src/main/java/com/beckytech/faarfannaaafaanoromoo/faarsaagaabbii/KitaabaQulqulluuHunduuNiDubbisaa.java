package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KitaabaQulqulluuHunduuNiDubbisaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kitaaba qulqulluu hunduu nidubbisaa\n" +
            "Boqonnaa fi lakkoofsa hundu ni caqasa\n" +
            "Kana qofa mitii haa beeknu iccitii isaa /2/\n" +
            "Akka fedhii keenyatti yoo dubbisnee hiikne /2/\n" +
            "Dogoggora baay’een boodatti deebine /2/\n" +
            "Raajiin fedhii namaan goonkumaa hin dhufne /2/\n" +
            "Nugorsa kitaabni akka seera keessaa hin baane /2/\n" +
            "Gaafannee haa barannu haayyoota amantii /2/\n" +
            "Kitaaba haa dubbisnu ragaa akka nuu ta’uu /2/\n";

    String title = "Kitaaba qulqulluu hunduu nidubbisaa";

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