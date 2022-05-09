package com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class QaanaaGalilaatti extends OptionsMenuActivity {

    TextView textTitle, textContent;
    String content = "Qaanaa galilaatti (2x) mana ciidhaa sanatti\n" +
            "Argamteetta Durbe Ilma kee wajjin\n" +
            "Argamteetta Gooftaa Haadha kee wajjin\n\n" +
            "Kan waamaman guutan warri afeerraman\n" +
            "Nyaatanni dhugaani wayiniin jalaa dhumnaanii\n" +
            "Durbee Haadha keenyaa fayyina adduunyaa\n" +
            "Atti nuu biraa geese taatee human keenyaa\n\n" +
            "Utuu ati jirtu leeyya’uu hin qabni\n" +
            "Hunduma dandeessa wayinii isaani guutti\n" +
            "Gaanichi duwwaadha jettee kan dubbattee\n" +
            "Giiftin keenya sii Gooftatti nuf hiimate\n\n" +
            "Waaqumman Gooftadha iddotti muldhate\n" +
            "Manni Dookimaasfaa akkam eebbifamee\n" +
            "Eebbi dhangala’ee kuno guyyaa har’aa\n" +
            "Aaraari Waaqayyoo mana warra ciidhaa\n\n" +
            "Biishaan jijjiramee gara daadhi wayiniitti\n" +
            "Agarre ija keenya qaanaa galiilaatti\n" +
            "Ammas nuuf kennama kan kana fakkaatu\n" +
            "Gidduu keenya kanatti Waaqayyoo haa ulfaatu\n";

    String title = "Qaanaa galilaatti";

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