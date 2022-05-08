package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Nanbeekaiddookookaleessaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nan beeka iddoo koo kaleessaa\n" +
            "Bakka ati nafiddee dachee hona kesssaa\n" +
            "Garaa kotti yannee tasa yadatamuu\n" +
            "Arraba koo kessaa galannii kee dhumuu\n\n" +
            "Hammattee na quftuu ofin na dawwattaa\n" +
            "Rakkinaa koo hundaaf sumatuu furmataa\n" +
            "Tarkanfi millaa koo madalli qamaa koo\n" +
            "Situu naaf to'ataa ulfadhuu abbaa koo\n\n" +
            "Abdin koo siqofaa manaa koo galagalaa\n" +
            "Ofittii nawamtee nafiddee haalalaa\n" +
            "Barruu kerraa nyadheen qufeen si ebbesaa\n" +
            "Da'oo koo isa dhugaa mannii kee gaddisaa\n\n" +
            "Waa hundumaa dhisee sirrattii of gateera\n" +
            "Hundee manaa kootis harkaa kerraa jiraa\n" +
            "An yoomu callisuu olmaa keefan mallee\n" +
            "Garaa koo sin qufuu galataf ilillee\n\n" +
            "Ta'ee yommun ka'uu gochan kee nadhibaa\n" +
            "Arjummaan kee goftaa cabaa koo dhidhibaa\n" +
            "Atis nabarsifnee harkaa ormaa ilaalu\n" +
            "Hundaa madaleraa homtinuu sin caalu\n";

    String title = " Nan beeka iddoo koo kaleessaa ";

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