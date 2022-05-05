package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AfaanKeenyaaHinQabu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Haareessi nuun jedhuu maaliif nu sossobuu\n" +
            "Warqeef Meetiinsaani afaan keenya hin qabu.\n" +
            "\n\n" +
            "Amantii ishee dhugaa daandii ishee ganamaa\n" +
            "Sirraa nuu kaachiisuuf diinni maaf nuu mormaa\n" +
            "Tawaahidoo si'iidha amantii ishee sirrii\n" +
            "Garaa keenyaaf jennee tasa hin kunnuu kirrii.\n" +
            "\n\n" +
            "Hundeen kee Kiristoos seera kamtu haarooma\n" +
            "Xurooftee hin moofomnee maaltuu jijjiirama\n" +
            "Humnoonnii Si'oolii si diiguu hin danda'uu\n" +
            "Addunyaan hunduu waa'ee kee haa dhaga'uu.\n" +
            "\n\n" +
            "Karaa keetu dhiphoodha kanaaf sirraa fiiguu\n" +
            "Seera kee dadhabee kanaaf fedha diiguu\n" +
            "Yoomuu ni jiraatta digaamuus hin taatuu\n" +
            "Yoo si dhiisne abbootiin darbaan nu komatu.\n" +
            "\n\n" +
            "Bartoonniif qulqulloonni wareegamtoonni Gooftaa\n" +
            "Tawaahidoo labsaa turan dhaga'aa obboloota\n" +
            "Darboon diina keenyaa nurra darbee kufaa\n" +
            "Cufamtees hun badduu baraan itti fufaa.\n" +
            "\n\n" +
            "Iyyasuus Kiristoos fayyisaa addunyaati\n" +
            "Ni dhalatee malee inni uumamaa miti\n" +
            "Ilma kan argetu beeka Abbaasaas\n" +
            "Murteessuuf kan dhufu Gooftaa Iyyasuus.";

    String title = "Afaan keenyaa hin qabu";

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