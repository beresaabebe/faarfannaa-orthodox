package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BiyyaKooIrraanfadhee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Biyya koo irraanfadhee naan filadhe biyyaa lafaa*2.   \n" +
            "Deebi’uun naaf ta'a guyyichisoo ammaa\n" +
            "Biyya koo irraanfadhee biyya aannaniif damma\n\n" +
            "Surraa afuura kee duraan kan uffadhe.\n" +
            "Diinni narraa baase qullaatan salphadhe.\n" +
            "Bineensonni caakkaa kan naaf abboomaman.\n" +
            "Isaan na didanii salphachuu koo arganii.   \n\n" +
            "Seexanaa abboomamuun bo’icha imimmaanii.\n" +
            "Yeroo koon dabarsee reebichaa qullaanii.\n" +
            "Yammuun itti yaade iddoo koo duraanii.\n" +
            "Wantaan baasuun dhabe nan cobse imimmaanii.\n\n" +
            "Coqqolloo seexanaa reebicha yaaddoonnii.\n" +
            "Yemmuu ati dhufte rakkoo gurguddaanii.\n" +
            "Biyya koon yaadadhe janata eedanii.\n" +
            "Raafamtee garaan koo yaaddee biyya aannanii.   \n\n" +
            "Waggaa dhibba tokko dhiiga bo'uudhaanii.\n" +
            "Furmaatan argadhe karaa biyya eedanii.\n" +
            "Fayyisaan waaqaaf lafaa na yaadatee ananii.\n" +
            "Na fayyisuuf dhufe abdii na kenneenii\n";

    String title = "Biyya koo irraanfadhee";

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