package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Hoosainaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Hoosa'inaa jeennee farfaannaa ×2\n" +
            "Hoosa'inaa jeennee farfaannaa ×2\n" +
            "………………..\n\n" +
            "Suraafeli kirubel kan siin baatan\n" +
            "Hoosa'inaa/×2 jeenne farfaana×2\n" +
            "Karaa keenyaa dhufte hareera ta'uun\n" +
            "Hoosa'inaa/×2 jeenne farfaana/×2\n" +
            "Gad of qaabumas nun nuu barsistee\n" +
            "Hoosa'inaa/×2 jeenne farfaana/×2\n" +
            "Waaqayyo ta'uu kes addunyaf ibsite\n" +
            "Hoosa'inaa/×jeenne farfaanna/×2\n" +
            "………………..\n\n" +
            "Ayuddoon hundùu amma leyya'annii\n" +
            "Hoosa'inaa jeennee farfaanna×2\n" +
            "Waaqayyoo ta'uu kee hubanera nuni\n" +
            "Hoosa'inaa jeennee farfaanna/×2\n" +
            "Oto ijaan si argaani nutti si farsinee\n" +
            "Hoosa'inaa jeenne farfaannaa/×2\n" +
            "Hosaa'innaa jennee maqa kee jajana\n" +
            "Hoosa'inaa jeennee farfaannaa/×2\n" +
            "……………………….\n\n" +
            "Ariyammi teesse ati kan farfaatamtuu\n" +
            "Hoosa'inaa jeenne farfaanaa/×2\n" +
            "Foon addam ufaate enyu sin qixaata\n" +
            "Hoosa'inaa jeenne farfaannaa/×2\n" +
            "Afaan raajjotan of wama kan turtee\n" +
            "Hoosa'inaa jeenne farfaannaa /×2\n" +
            "Wadda galtee hundaa ati ni rawatee\n" +
            "Hoosa'inaa jeennee farfaanna/×2\n" +
            "…………………\n\n" +
            "Maaqa waaqan kan dhufu hundumtu\n" +
            "Hoosa'inaa jennee farfaannaa/×2\n" +
            "Ebifaamun issa dhugumaa hin haafu\n" +
            "Hoosa'inaa jeennee farfaanna/×2\n" +
            "Meexii harkaa keenyati qabane kane\n" +
            "Hoosa'inaa jeenne faarfannaa/×2\n" +
            "Wa'ee gochaa ketti adunyaaf labsine\n" +
            "Hoosa'inaa jeennee faarfannaa/×2\n" +
            "……………………\n\n" +
            "Hoosa'inaa jeenne faarfannaa /×2\n" +
            "Amaanu'eel jeenee si wamnaa/×2\n" +
            "Ilmaa maariyaam ulfaadhu jeena/×2\n" +
            "Maaqa keetti dhalootati himnaa/×2\n" +
            "Maaranataa jeennee farfaanna/×2\n";

    String title = "Hoosa'inaa jeennee farfaannaa ";

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