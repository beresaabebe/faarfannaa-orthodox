package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AnSiinEebbifamee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "An siin eebbifamee\n" +
            "Sumaan kabajamee\n" +
            "Galatoomni jedhaa\n" +
            "Maqaa keen faarfadhaa\n\n" +
            "Seenaan koo haaromee\n" +
            "Sumaan jijjiiramee\n" +
            "Kuno ol jedheeraa\n" +
            "An keetii ta’eeraa\n\n" +
            "Jaalalaan na waamtee\n" +
            "Gooftaa na guddiftee\n" +
            "Si natti bareedee\n" +
            "Surraa kee uffadhee\n\n" +
            "Faarfataan jedhamee\n" +
            "An siin filatamee\n" +
            "Hojiin kee raajiidha\n" +
            "Gooftaa sin faarfadhaa\n\n" +
            "Nan faarsa gammachuun\n" +
            "Maqaa kee ol qabuun\n" +
            "Kunoo sin Sagadaa\n" +
            "Narratti maqaa qabdaa\n\n" +
            "Daandii kee qabadhee\n" +
            "An jireenya argadhee\n" +
            "Boodaatti in deebi’uu\n" +
            "Sirraa adda hin ba'uu.\n";

    String title = "An siin eebbifamee";

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