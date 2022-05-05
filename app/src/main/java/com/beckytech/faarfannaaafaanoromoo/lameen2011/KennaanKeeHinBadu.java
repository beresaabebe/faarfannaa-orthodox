package com.beckytech.faarfannaaafaanoromoo.lameen2011;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KennaanKeeHinBadu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kennaan kee hin badu Qulqulluu Giyoorgisii\n" +
            "Ati nu milladhuu koottuu nu Eebisii\n" +
            "Waaqayyoon filamtee akka nuu gargaartuuf(2)        \n        \n" +
            "Daabiloos nuu bituuf karoorasaa baasee\n" +
            "Inni naa qabaachuuf kiyyoosaa dirirsee\n" +
            "Farda kee qabadhu koottu na bafaadhu\n" +
            "Qulqulluu Giyoorgis Ati naaf kadhadhuu        \n      \n" +
            "Karoori diina koo si'in barbaada'a\n" +
            "Sodaan keessa kootis si'in bittiina'aa\n" +
            "Iyyesuus kiristoosiirraa waadaa kan Argatte\n" +
            "Waaqayyoon filatamtee ati kan Eebbifaamte         \n       \n" +
            "Diinni si kufisuuf qoricha siif kennee\n" +
            "Bayyeesi socha'ee akka ati hin milkoofnee\n" +
            "Ati isa moote waaqayyoon qabattee\n" +
            "Dhugumaa Giyoorgis kan Eebbifamte\n\n" +
            "               F/taa Dn Abarraa Baqqalaa\n";

    String title = "Kennaan kee hin badu";

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