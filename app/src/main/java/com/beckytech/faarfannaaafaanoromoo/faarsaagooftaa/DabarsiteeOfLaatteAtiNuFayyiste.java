package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DabarsiteeOfLaatteAtiNuFayyiste extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Jaalalli Samiirraa Harkisee Si Buuse\n" +
            "Ilmaan Addaam Hunduu Si Gaddisiise\n" +
            "Hidhaa Cubbuurraatii Dhiigaa keen nu bitte\n" +
            "Dabarsitee Of Laatte  Ati  Nu Fayyiste \n                   \n" +
            "     Bitaaf Mirgatti Kan Daddarbatamte \n" +
            "     Isa Kufe Kaasuuf Fannoo Jiidhaa Baatte\n" +
            "     Foon Namaa Uffatteen Gidiiraa Fudhattee\n" +
            "     Waanjoo Du’aa Jalaa Ati Nu Baafatte \n          \n" +
            "Eessarraa Jalqabu Oolmaa Nuuf Raawwatte\n" +
            "Maalinis Goolabu Isa Ati Nuuf Taate\n" +
            "Ka’umsaaf Ga’umsaan Katabamee Hin Dhumu \n" +
            "Gatii Kee Deebisuun Tasa Hin Danda’aamu    \n         \n" +
            "     Mo’aa Waan Hundumaa Osoo Taatee Jirtu\n" +
            "     Lubbuu Namaa Oolchuuf Du’a kan filattu\n" +
            "     Kakuun Sin Haarome Ati Wareegamtee\n" +
            "     Dhiiga Ofii Uffattee Ifa Nutti Uffiste  \n          \n" +
            "Yakka Nuti Hojjeneen Ati Fannifamte\n" +
            "Fuulakee Miidhaguun Ancufa Simatte\n" +
            "Garboomnee Kan Turre Nu  Bilisoomsite\n" +
            "Ofii Surraa Dhabdee Simboon Nu Golgite\n\n" +
            "       F/taa D/n  Daawwit/Firiisaat Dirriba\n";

    String title = " Jaalalli Samiirraa Harkisee Si Buuse ";

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