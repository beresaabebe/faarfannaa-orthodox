package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FoonsaaMuree extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Foonsaa muree dhiigasaa lolaasee\n" +
            "Fannifamee du'ee kan na fayyisee\n" +
            "Ilma Waaqayyooti Iyyesuusidha\n" +
            "Ilma Maariyaamiti Kiristoosidha\n\n" +
            "Gatii Dhiigan na bitatee\n" +
            "Kufaa ka'aa naaf baate Fannoo\n" +
            "Dubbadhee hin fixu an olmasaa\n" +
            "Waa'ee Gooftaa kootii jaalalasaa\n\n" +
            "Hamma du'ati dhugaan na jaalate\n" +
            "Iddoo kan koo heddu dhiphatee\n" +
            "Hadha’a liqimsee anaaf jechaa\n" +
            "Galanni baayyeedha kan tokkicha\n\n" +
            "Dhiigni isaa akka bishaaniitti\n" +
            "Ni lola’e qaraniyoo irratti\n" +
            "Na Qulqulleessera cubbuu koorraa\n" +
            "Kan akka iyyesuus koo eessa jiraa?\n\n" +
            "Mootiidha inni Mootii jaalatamee\n" +
            "Saba isaatiif kan wareegamee\n" +
            "Adda kophaattidha koo jaalallisaa\n" +
            "Lapheen koo dagatu gaarummaasaa\n\n" +
            "";

    String title = "Foonsaa muree";

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