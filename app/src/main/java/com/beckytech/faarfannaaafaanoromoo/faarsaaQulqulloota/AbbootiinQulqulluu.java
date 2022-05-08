package com.beckytech.faarfannaaafaanoromoo.faarsaaQulqulloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AbbootiinQulqulluu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Abbootiin qulqulluu amantiin ta’anii\n" +
            "         Gargaarsa waaqayyoon raajii hojjetani\n\n" +
            "Abrahaam barbaade waaqa isaa argate\n" +
            "Tokkicha ilma isaa aarsaaf dhiyeeffate\n" +
            "Waaqayyoo aamantii isaa fedhii isaa hubatee\n" +
            "Bakka mucaa isaa hoola isaaf laate\n\n" +
            "        Museen amantiidhaan ulee isaa qabate\n" +
            "        Galaana eertiraa bal’icha addaan kute\n" +
            "        Ummata isra’eeliif raajii guddaa hojate\n" +
            "        Ililleef gammachuun waaqa waaqeffatee\n\n" +
            "Sabni israa’eli yeroo waaqa yakke\n" +
            "Eliyaas amantiin bokkaa samii dhorkee\n" +
            "Fuldura diina isaa ciminaan dhaabbate\n" +
            "Waaqa isaatifis aarsa dhiyeeffate\n\n" +
            "        Phexiroos maqaa waaqaan naafa lafaa kaase\n" +
            "       Phawuloos huccusaatiin dhibama fayyise\n" +
            "       Namoonni waaqayyoo amantiin taa’ani\n" +
            "       Gooftaa isaanii irraa waan baay’ee argatani\n";

    String title = "Abbootiin qulqulluu amantiin ta’anii";

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