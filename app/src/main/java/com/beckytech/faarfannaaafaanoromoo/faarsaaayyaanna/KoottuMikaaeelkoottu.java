package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KoottuMikaaeelkoottu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Koottu mikaa’eel koottu/2/ \n" +
            "Gadda balleessitee nagaa kan laattu \n" +
            "Koottu Mikaa’eel koottu \n" +
            "Gargaaraa afoomiyaa..\n" +
            "Hojii seexanarraa \n" +
            "Sidha kan fayyise  \n" +
            "Baahiraan du’arraa \n" +
            "Anas na gargaari \n" +
            "Akkuma isaanii \n" +
            "Mikaa’eel na dhaabi \n" +
            "Amantaa kiyyaani…………Mikaa’eel koottu  \n" +
            "Gadda balleessitee nagaa kan laattu \n" +
            "Koottu Miikaa’eel koottu \n\n" +
            "Koottu Gabri’eel koottu/2/\n" +
            "Gadda balleesssitee nagaa kan laattu \n" +
            "Koottu Gabri’eel koottu \n" +
            "Barri yoo raawwatu \n" +
            "Waaqni nama ta’uuf \n" +
            "Kan ergame sidha \n" +
            "Missiraachoo himuuf \n" +
            "Uumaa kiyya biraa  \n" +
            "Naaf kadhu araaraa  \n" +
            "Gabri’eelii eegaakoo \n" +
            "Sooraa kakuu haaraa……… Gabri’eel koottu gadda balleesssitee nagaa kan laattu \n" +
            "Koottu Gabri’eel koottu \n\n" +
            "Koottu Uraa’eel koottu /2/ \n" +
            "Gadda balleesssitee nagaa kan laattu \n" +
            "Koottu Uraa’eel koottu \n" +
            "Situ tsiwwaa baateef….. \n" +
            "Izraa sutu’eeliif……. \n" +
            "Ogummaa barsiistee \n" +
            "Beekumsa kan hirteef \n" +
            "Ergamaa uraa’eel \n" +
            "Mul’ate aangoon kee \n" +
            "Tsabala keen fayyee \n" +
            "Himee kabaja kee……….. Uraa’eel koottu /2/ \n" +
            "Gadda balleesssitee nagaa kan laattu \n" +
            "Koottu Uraa’eel koottu \n\n" +
            "Koottu Takliyyee koottu/2/ \n" +
            "Gadda balleesssitee nagaa kan laattu \n" +
            "Koottu takliyyee koottu \n" +
            "Yohaannis lammaffaa \n" +
            "Gooticha wangeelaa \n" +
            "Kan nutti argisiistee \n" +
            "Karaa isa qajeelaa \n" +
            "Gadaamiiwwan keerratti  \n" +
            "Ifa kee ibsitee \n" +
            "Takliyyee abbaakoo \n" +
            "Nageenya labsitee………. Takliyyee koottu \n" +
            "Gadda balleesssitee nagaa kan laattu \n" +
            "Koottu takliyyee koottu  \n";

    String title = "Koottu mikaa’eel koottu";

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