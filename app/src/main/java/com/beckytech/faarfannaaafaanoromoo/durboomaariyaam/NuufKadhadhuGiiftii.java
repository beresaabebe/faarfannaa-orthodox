package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NuufKadhadhuGiiftii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nuuf kadhadhu Giiftii jennee sikadhanna /2/\n" +
            "Akka Efrem akka abbaa keenyaa \n" +
            "Nuuf kadhadhu nuufis Giftii keenya /2/\n\n" +
            "Uumama hundumaaf abdii isaaniidha ati\n" +
            "Hanga barabaraa dhaadannosaniti\n" +
            "Cubbuun isaanii isaaniif haqamee\n" +
            "Kadhanna keen lubbuun isaani fayyee    /2/\n\n" +
            "Fulduraa Waaqayyoottii maqaan kee ulfatadhaa\n" +
            "Addunyaa fayyisuuf waada siif galeera\n" +
            "Kadhanna keen abdii nigodhatu\n" +
            "Yeroo hundaa qulqulleetti jedhu      /2/\n\n" +
            "Addunyaan nuqoorte fedhi foon kenyaani\n" +
            "Dadhabdee lubbuunii cubbuun itti ulfaatu\n" +
            "Dukana’ee bitaa yoo nugalu\n\n" +
            "Ifti keenya kottuu haati keenya    /2/\n" +
            "Gaddi lubbuu keenyaa nutti ulfaateeraa\n" +
            "Cubbuun nuuti baayyate nudadhabsiiseera\n" +
            "Akka Elsabeex akka fira keetii \n" +
            "Nugammachisii nuunis jecha keetiin     /2/\n";

    String title = "Nuuf kadhadhu giiftii";

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