package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AgartuuKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Agartuu koo hin dukkaanoofnee\n" +
            "Gaggeessaa koo na hin nuffinee\n" +
            "Sin argaa laphee kootiini\n" +
            "Natti muldhattaa afuura keetiini/2/\n" +
            "⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼\n\n" +
            "Kaayyoo kee namni hin beeku\n" +
            "Hin jiru kan sitti akeekuu\n" +
            "Uumaa koo situ naaf yaadaa\n" +
            "Naaf qabdaa sagantaa addaa/2/\n" +
            "⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼\n\n" +
            "Situ bocee na uummatee\n" +
            "Harkaa keen babbareechitee\n" +
            "Tasa hojii keen hin mormuu\n" +
            "Si qofa kan anaaf dhimmu/2/\n" +
            "⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼\n\n" +
            "Maatiisaatu cubbuu hojjatee\n" +
            "Jedhee namni yeroo dubbatee\n" +
            "Afaansaanii qabaachiistee\n" +
            "Dandeettii keetu muldhatee/2/\n" +
            "⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼⁼\n\n" +
            "Hundumaasaa kan raawwattu\n" +
            "Raajiin kee akka muldhatu\n" +
            "Waan gooteef sababa qabdaa\n" +
            "Gammachuun koo sirraa maddaa/2/\n" +
            "▬▬▬▬▬▬▬▬▬▬▬▬▬\n";

    String title = "Agartuu koo";

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