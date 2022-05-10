package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SiifanDhiiseYaaHaadhaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Siifan dhiise yaa haadhakoo jireenya koo\n" +
            "Yoon gammadee yoon gaddeesi umuriikoo\n" +
            "Hin tuffatiini ol naaf baasi kadhannaakoo\n\n" +
            "Guutees guutuu baates bakki hir'ina koo\n" +
            "An of hin dhiphisu jirti haati koo\n" +
            "Manasheeti ba'ee an eessan adeemaa\n" +
            "Mana galgalaakoo jedheetan si waama\n\n" +
            "Haadha fi abbaa koorra yeroon adda bahee\n" +
            "Biyya ormaa keessa yemmuun boo'u taa'ee\n" +
            "Ani hin irraanfanne haadha koo oolmaa kee\n" +
            "Bakka haadha fi abbaa koo ati naaf buute\n\n" +
            "Ni beeka ilmi kee sammuun koo kan yaadu\n" +
            "Foonii fi lubbuu koonis maal akkan barbaadu\n" +
            "Kadhuu naa laachisii ilma kee furmaata\n" +
            "Yaaddoon ani qabu yoos natti salphataa\n\n" +
            "Qormaanni koo ta'us kan namaarra adda\n" +
            "Nan fudha hin gungumuu gammachuu fi gadda\n" +
            "Foon koo qofaaf mitii si tajaajiluun koo\n" +
            "Lubbuu koof adaraa naaf kadhu harmee koo\n";

    String title = "Siifan dhiise yaa haadhakoo jireenya Koo ";

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