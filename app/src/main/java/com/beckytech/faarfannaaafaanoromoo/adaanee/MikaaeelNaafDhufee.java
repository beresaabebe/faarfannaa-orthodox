package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MikaaeelNaafDhufee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Mikaa'eel naaf dhufee gadduun ni hafee\n" +
            "Naannoo kan koo(3) Buufatee eegan koo\n" +
            ".......\n\n" +
            "Hangafni Ergamoota tajaajilan Gooftaa\n" +
            "Moo'annan dhaabbatee moo'ate diinotaa\n" +
            "Gartuu isaan olee Hiriiratti duulee\n" +
            "Gareen Saaxeenaa'el si’oolitti galee\n" +
            ".......\n\n" +
            "Gabri'eel naaf dhufee dinni koo ni kufee\n" +
            "Jijjiirrame(3) Duuti koo labssme\n" +
            ".......\n\n" +
            "Karoora diinota karaatti hanbisee\n" +
            "Waaqarraa ergamee Abiddichas dhaamsee\n" +
            "Naabukadanatsor mootiin baabiloonii\n" +
            "Kaayyoonsaa digamee maqaa Gabri'eelitin\n" +
            ".......\n\n" +
            "Dhufee Ruufa'eelin Raamarraa ariitiin\n" +
            "Dhiphina koo(3) furuudhaf rakkoo koo\n" +
            ".......\n\n" +
            "Dhukkuboota hamoorraa akka fayyisuuf\n" +
            "Gadameessa haadhole nagaadhan akka hiikuf\n" +
            "Aboon kennameeraaf waaqayyoo biraatii\n" +
            "Qulqulluu Rufaa'eel nuuf koottu har'as ati\n" +
            "......\n\n" +
            "Waaqayyoo qulqulluu warra sodatanii\n" +
            "Ni fayyisuu(3) ni eeguu ergamoonnii\n";

    String title = "Mikaa'el naaf dhufee'";

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