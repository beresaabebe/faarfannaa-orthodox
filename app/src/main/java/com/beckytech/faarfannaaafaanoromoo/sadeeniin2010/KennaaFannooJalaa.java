package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KennaaFannooJalaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kennaa fannoo jalaa maariyaam haadha koo\n" +
            "Kan koo ta’u keetif gammadee keessi koo\n" +
            "Sirraa addan ba’uu  ani yaa haadha koo\n" +
            "Ati naaf baareechii dhuma jireenya koo             \n           \n" +
            "Kalee si faarsanii warrii si gananii                        \n" +
            "Sobduu baay’ee jiraa maaloo yaa maariyaam                       \n" +
            "Anaaf baarechimee dhuma jireenya koo                       \n" +
            "Akka si faarfadhuu maaloo yaa hadhaa koo\n\n" +
            "Jiruu koo hundatu ani sii waamadhaa\n" +
            "Maariyaam naaf koottu maqaa kee jajadhaa\n" +
            "Naaf seenii manaa koo ati naaf eebbisii\n" +
            "Amantii naa cimsii kan kee na taasisi       \n              \n" +
            "Ulfinni kee addaa yommillee hin caalisuu                     \n" +
            "Jecha dhabee harmee ani maalumaan ibsuu                     \n" +
            "Simboo kee addaadha ni caltaa hundumaa\t      \n" +
            "Durbee maariyaam abdii kan koo sumaa\n";

    String title = "Kennaa fannoo jalaa";

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