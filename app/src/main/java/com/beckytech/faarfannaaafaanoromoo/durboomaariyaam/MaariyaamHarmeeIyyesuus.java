package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MaariyaamHarmeeIyyesuus extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maariyaamii harme iyyesuusii\n" +
            "Adaraa kee maaloo ati nu ararsii (2)\n\n" +
            "Dubartonni jiru  haatii qulqulloota \n" +
            "Hundasani keessa eenyu sii qixata \n" +
            "Harmee iyyesuus hundumarra caalta \n" +
            "Cubbamaf ilma ke nu walitti araarsita \n\n" +
            "Dhiphina namoota dursitee kan beektu \n" +
            "Sanyii fuula nama kan nama olchituu \n" +
            "Nuu yaadadhu ati  gaafa dhufatisaa\n" +
            "Sin abdii godhanna maaltu nu yaddeessa  \n\n" +
            "Cubbuu hojjedheraa lakkofsa hin qabu \n" +
            "Jirenya addunyaarra tasa mudaa dhabu \n" +
            "Naa aja’ibsiisa yemmun ta'ee yaadu \n" +
            "Isaa hunda danda'uu ilma kee naaf kadhu \n\n" +
            "Warri sii tuffatan danuu ta'aniru\n" +
            "Hoolonni liyyudhan dhufanii hiriru \n" +
            "Gammadi haadha kooo kan akka kee hin jiruu \n" +
            "Ulfina ati argatee eenyuulee jijjiruu \n";

    String title = "Maariyaam harmee Iyyesuus";

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