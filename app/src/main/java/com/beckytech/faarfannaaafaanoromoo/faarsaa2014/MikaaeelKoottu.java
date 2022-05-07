package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MikaaeelKoottu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Koottu Mikaa’eel koottu/2/ \n" +
            "Gadda balleessitee nagaa kan laattu \n" +
            "Koottu Mikaa’eel koottu \n" +
            "\n\n" +
            "Gargaaraa Afoomiyaa….Mikaa’el koottu\n" +
            "Hojii seexana irraa…..\n" +
            "Sidha kan fayyise……\n" +
            "Baahiraan du’a irraa….\n" +
            "Nuuniis nu gargaarii…….\n" +
            "Akkuma isaanii………\n" +
            "Mikaa’eel nu dhaabii…\n" +
            "Amantaa keenyani…….\n" +
            "Oduu gammchisaa hundatti kan himtu \n" +
            "Koottu Gabri’eel koottu \n" +
            "\n\n" +
            "Koottu Gabri’eel koottu/2/\n" +
            "Oduu gammachiisa hundatti kan himtu \n" +
            "Koottu Gabri’eel koottu \n" +
            "\n\n" +
            "Barri yoo raawwatu…..Gabri’eel kottu\n" +
            "Waaqni nama ta’uuf…\n" +
            "Kan ergame sidha……\n" +
            "Missiraachoo himuuf…\n" +
            "Uumaa keenya biraa…..\n" +
            "Nuuf kadhu araaraa…..\n" +
            "Gabri’eelii qulqulluu…\n" +
            "Sooraa kakuu haaraa….\n" +
            "Xoofoosa qulqulluu namaaf kan hirtu\n" +
            "Koottu Uraa’eel koottu \n" +
            "\n\n" +
            "Koottu Uraa’eel koottu /2/ \n" +
            "Xoofoosa quqlulluu namaaf kan hirtu\n" +
            "Koottu Uraa’eel koottu \n" +
            "\n\n" +
            "Situ xoofoo laateef…..Uraa’el kottu\n" +
            "Izraa suutu’eeliif……….\n" +
            "Ogummaa barsiiste…..\n" +
            "Beekumsa kan hirteef…\n" +
            "Ergamaa Uraa’eel…….\n" +
            "Mul’ate aangoon kee….\n" +
            "Kennaa keetin fayyee…..\n" +
            "Himee kabaja kee…….\n" +
            "Waadaa siif galameen nagaa kan buustu \n" +
            "Koottu Takliyyee koottu \n" +
            "\n\n" +
            "Koottu Takliyyee koottu(2)\n" +
            "Waadaa siif galameen nagaa kan buustu\n" +
            "Koottu Takliyyee koottu \n" +
            "\n\n" +
            "Yohaannis lammaffaa….Takliyyee koottu\n" +
            "Gooticha wangeelaa……\n" +
            "Kan nutti argisiistee………\n" +
            "Karaa isa qajeelaa………..\n" +
            "Kawaala kee irratti…\n" +
            "Ifa kee ibsitee…………….\n" +
            "Takliyyee qulqulluu……..\n" +
            "Nageenya labsitee………..\n" +
            "Waadaa siif galameen nagaa kan buustu\n" +
            "Koottu Takliyyee koottu\n";

    String title = "Mikaa'eel koottu";

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