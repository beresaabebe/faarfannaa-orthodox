package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Kanakkakoohinjiru extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kan akka koo hin jiru kan akka koo cubbuu kan hojjate hin jiru/2/\n" +
            "Hin jiru kan akka kee /3/ yaa Waaqayyoo obsaani/2/Eyyee\n" +
            "Aduunya hunda kan uumte fayisaa aduunyaa kiristoosii /2/\n" +
            "Dhiiga cinaacha keetiin/3/ cubbu keenya hunda nuuhaqi/2/Eyyee\n\n" +
            "አልቦ ዘከማየ/2/ አበሳ ኃጢአት ገባሬ/2/\n" +
            "አልቦ ዘከማከ/3/ እግዚአብሔር መሐሪ/2/ ኧኸ\n" +
            "መድኃኔዓለም ክርስቶስ ዓለማተ ኲሉ ፈጣሪ /2/\n" +
            "በደመ ገቦከ/3/ ኃጢያትዬ አስተስሪ /2/ ኧኸ\n";

    String title = " Kan akka koo hin jiru kan akka koo cubbuu kan hojjate hin jiru ";

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