package com.beckytech.faarfannaaafaanoromoo.faarsaaergamoota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DandeetiiWaanDhabdeef extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Dandeetii waan dhabdeef ergamoota ilaaluuf\n" +
            "Koopha kan taatee yoo namatti fakkateef\n" +
            "Kan sii wajjiin jiran baay’eedha isaani\n\n" +
            "       Dadhabbii fi koophumaa looltoonni Sooriyaan\n" +
            "       Eeboosaa luqqisee roorrisullee rakkoon\n" +
            "       Naa dhumeera jettee lubbu koo hin soodaatiin\n" +
            "       Qulqullootni Ergamoonni jiruutii sii wajjiin \n\n" +
            "Gara Baabiloonittigoodaantee deemtullee\n" +
            "Jireenyii hadhaayee angoon kee kufullee\n" +
            "Tsiiyooninii yaadachaa Boo’an liqimfamtee\n" +
            "Naannookee qubatan sitasgabbessuf ergamooni\n\n" +
            "Iyyariikoo addunyaan dalla torba ijaarte \n" +
            "Cubbuun yoo qophooftu xiyyaashee cimsitee\n" +
            "Kan moo’atamtee fi siidhuume yoo siitti fakkate\n" +
            "Ergaamoonni Waaqa simarsaanii jiru\n";

    String title = "Dandeetii waan dhabdeef";

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