package com.beckytech.faarfannaaafaanoromoo.faarsaaQulqulloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class UrjiiIfaanQulqulluu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Urjii ifaan qulqulluu Maarqoos \n" +
            "kan argame Iskindiriiyaarraa \n" +
            "Bataskaanaf abbaa ta’eera /2/\n" +
            "Ta’eera abbaa warra Gibxii fi Itiyoophiyaafis \n" +
            "akka qulqulluu Phaawuloos ta’eera /2/\n\n" +
            "ኮከብ ብሩህ ቅዱስ ማርቆስ ዘሰረቀ \n" +
            "እምእስክንድርያ ቤተክርስትያን ዘንሰምያ/2/\n" +
            "ኮኖሙ አበ ለሰብአ ግብጽ \n" +
            "ወኢትዮጵያ በከመ ጳውሎስ ሐዋርያ/2/\n";

    String title = "Urjii ifaan qulqulluu Maarqoos";

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