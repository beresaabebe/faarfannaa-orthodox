package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NagaadhaanNuKottuu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nagaadhaan nuukottu/2/ Maariyaami/2/\n" +
            "Sitti himanna /2/ gadda lubbu keenyaa\n" +
            " Nagadhaan nuukoottuu……………\n" +
            "Mika’eeliif/2/ Gabri’eeli wajjiin\n" +
            "Nagadhaan nukottuu……………\n" +
            "Suraafeeliif/2/ kirubeelii wajjiin\n" +
            "Nagadhaan nukottuu……………\n" +
            "Uraa’eeliif /2/ Ruufa’eeli wajjiin\n" +
            "Nagadhaan nukottuu……………\n" +
            "Qulqulloota /2/ Hunduma wajjiin\n" +
            "Ilmakee wajjiin/2/ Amanu’eelii\n" +
            "Nagadhaan nukottuu……………\n" +
            "በሰላም ንዒ/2/ ማርያም/2/\n" +
            "ትናዝዘኒ/2/ ኃዘነ ልብየ\n" +
            " አዝ….\n" +
            "ምስለ ሚካኤል/2/ ወገብርኤል\n" +
            "አዝ…\n" +
            "ምስለ ሱራፌል/2/ ወኪሩቤል\n" +
            "አዝ…\n" +
            "ምስለ ኡራኤል/2/ወሩፋኤል\n" +
            "አዝ…\n" +
            "ምስለ ኩሎሙ/2/ ቅዱሳን\n" +
            "አዝ….\n" +
            "ምስለ ወልድኪ/2/ አማኑኤል\n" +
            "አዝ….\n";

    String title = "Nagaadhaan nu kottuu";

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