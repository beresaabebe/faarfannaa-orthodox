package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class JaalalliiSamirraa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Jaalallii samirraa harkisee si busee\n" +
            "Ilmaan addaam hunduu si gaddisisee\n" +
            "Hidha cubburattii dhigaa keen nu bittee\n" +
            "Dabarsitee of laatte ati nu fayyistee\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Bitaa fi mirgaattii kan daddarbatamtee\n" +
            "Isaa kufee kaasuf fannoo jiidhaa battee\n" +
            "Foon namaa uffattee gidiraa fudhattee\n" +
            "Waanjoo du'aa jalaa ati nu bafattee\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Essarra jalqabu olmaa nuf rawwattee\n" +
            "Maalinis goolabuu isa ati nuuf lattee\n" +
            "Ka'umsaf gahumsan katabame dhumu\n" +
            "Gatikee debisuun tasa hin danda'amuu\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Mo'aa wan hundumaa osoo tate jirtuu\n" +
            "Lubbuu namaa olchuf du'aa kan filattuu\n" +
            "Kakuun sin haromee ati waregamtee\n" +
            "Dhigaa ofii uffattee ifaa nuttii uwwistee\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Yakka nuti hojjannen ati fannifamtee\n" +
            "Fulakee midhaguun ancufaa simaattee\n" +
            "Garbomnee kan turree nu bilisomsitee\n" +
            "Ofii surraa dhabdee simboon nu golgite\n";

    String title = " Jaalallii samirraa harkisee si busee ";

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