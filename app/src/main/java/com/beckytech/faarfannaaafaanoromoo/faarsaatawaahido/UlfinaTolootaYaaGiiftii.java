package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class UlfinaTolootaYaaGiiftii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ulfina toloota yaa giiftii (2) ulfina tolootaa\n" +
            "Leemmaatii nyaataa raajii dha leemmaatii nyaataa (2)\n\n" +
            "Kabaja isaanii kan qulquullootaa\n" +
            "Sin faarsa anii faarsaa galataa\n" +
            "Kan ati nuuf deessee buddeena jireenyaa\n" +
            "Bokkaa kan qabduu dumeessa xiqqoo\n\n" +
            "Huccuu gaarummaa miidhaginni ishee\n" +
            "Ulfa sochoosaa qooqni afaan ishee\n" +
            "Abidda deessee abidda haammattee\n" +
            "Osoo si hin faarsiin aduun yoom dhiitee\n\n" +
            "Yaa bahaa biiftuu baha nuuf taatee\n" +
            "Ificha guddaa kan nuu mul’istee\n" +
            "Hin dukkanooftuu jireenyi keenyaa\n" +
            "Ilmi kee jiraa ifichi keenyaa\n\n" +
            "Nagaan siif haa ta’u nuti si kadhannaa\n" +
            "Ati nuuf kadhadhuu nuti sitti boonyaa\n" +
            "Koottuu gugee koo fakkaattuu ilma kee\n" +
            "Samiif lafatu himaa waa’ee kee\n";

    String title = "Ulfina toloota yaa giiftii";

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