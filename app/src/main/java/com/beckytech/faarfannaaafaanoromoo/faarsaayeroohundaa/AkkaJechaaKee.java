package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AkkaJechaaKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Egaa yoomiree yoomiree gooftaakoo\n" +
            "Akka jecha kee kan ta’u deemsi koo\n\n" +
            "Hin barannee jechuuf ati na barsiistertaa(2x)\n" +
            "Jechakee akka Aannanii ati na obaastertaa(2x)\n\n" +
            "Jechaa kee dhaga’ee gooftaa si beekkuyyuu(2x)\n" +
            "Daandii laphee koorraa naa hin ifne ammayyuu(2x)\n\n" +
            "Arraba kootiini jechakeen dubbadha(2x)\n" +
            "Laphee kootin garuu an sirraan fagaadhaa(2x)\n\n" +
            "Barsiisa naaf ta’e gooftaa deddebi’uun koo(2x)\n" +
            "Harka koo na qabi fayyisii lubbuu koo(2x)\n";

    String title = "Akka Jechaa Kee";

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