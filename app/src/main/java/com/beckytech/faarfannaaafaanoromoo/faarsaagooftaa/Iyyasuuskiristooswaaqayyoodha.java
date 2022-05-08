package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Iyyasuuskiristooswaaqayyoodha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Iyyasuus kiristoos waaqayyoodha jettee\n" +
            "Tewaahidoo wangeelaan nu barsiisaa turtee\n" +
            "Nutis dhugaa baanaa eeyyyee(3) waaqayyoodha\n" +
            "Barumsi Tewaahidoos kunoo kanadha \n\n" +
            "      Diinni maaf gungumaa sammuudha dhibamee\n" +
            "       Nutoo kan lallabnuu isa fannifamee\n" +
            "       Duubatti hin deebinuu fuulduratti malee\n" +
            "       Waaqa biraa hin qabnuu waaqayyootiin malee\n\n" +
            "Shakkii shakkitootan waan tokko hin raafamnu\n" +
            "Tewaahidoon dhugaadha Tewaahidoo hin gadhiifnuu\n" +
            "Wangeelaan ijaaramee hundeen bu’uurrisaa\n" +
            "Qilleensa isa kamtu mana keenya raasaa\n\n" +
            "      Waa’ee Qulqullootaa maaf dubbachuu dhiisnaa\n" +
            "      Jireenyasaaniitiin Gooftaatiin lallabnaa\n" +
            "      Dhugaatu nuuf galeera duubatti hin deebinu\n" +
            "      Dhugaadhaf hojjenna namni hundumtuu haa baruu\n";

    String title = " Iyyasuus kiristoos waaqayyoodha ";

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