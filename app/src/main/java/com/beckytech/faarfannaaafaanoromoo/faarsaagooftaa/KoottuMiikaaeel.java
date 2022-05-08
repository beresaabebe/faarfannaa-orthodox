package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KoottuMiikaaeel extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Koottu Miikaa’eel koottu/2/\n" +
            "Gadda balleessitee nagaa kan laattu                                                                                                                                       \n" +
            "Koottu Miikaa’eel koottu \n" +
            "Gargaaraa Afoomiyaa..          ….mikaa’el koottu                                                                                                                                                                                                             \n" +
            "Hojii seexanarraa                        \n" +
            "Sidha kan fayyise          \n" +
            "Baahiraan du’arraa      \n" +
            "Anas na gargaari\n" +
            "Akkuma isaanii                                                                                                                                                                                                                                           \n" +
            "Miikaa’eel na dhaabi                                                                                                                                                                                                                               \n" +
            "Amantaa kiyyaani…………\n" +
            "Miikaa’eel koottu  gadda balleessitee nagaa kan laattu \n" +
            "Koottu Miikaa’eel koottu \n                                                                                                                     \n" +
            "Koottu Gabri’eel koottu/2\n" +
            "Gadda balleesssitee nagaa kan laattu \n" +
            "Koottu Gabri’eel koottu \n" +
            "Barri yoo raawwatu ………………….Gabri’eel koottuu                                                                                                                                                                                                                    \n" +
            "Waaqni nama ta`uf                                                                                                                                                                                                                         \n" +
            "Kan ergame sidha                                                                                                                                                                                                          \n" +
            "Missiraachoo  himuuf                                                                                                                                                                                                   \n" +
            "Uumaa kiyya biraa                                                                                                                                                                                                                            \n" +
            "Naaf kadhu araaraa                                                                                                                                                                                                          \n" +
            "Gabri’eelii eegaakoo                                                                                                                                                                                                                                     \n" +
            "Sooraa kakuu haaraa………\n" +
            "Gabri’eel koottu gadda balleesssitee nagaa kan laattu \n" +
            "Koottu Gabri’eel koottu  \n\n" +
            "Koottu Uraa’eel koottu /2/ \n" +
            "Gadda balleesssitee nagaa kan laattu \n" +
            "Koottu Uraa’eel koottu \n" +
            "Situtsiwwaabaateef….. ……………Uraa’eel koottu                                                                                                                                                                                         \n" +
            "Izraasutu’eeliif…….                                                                                                                                                                                                                         \n" +
            "Ogummaabarsiistee                                                                                                                                                                                                              \n" +
            "Beekumsakanhirteef           \n" +
            "Ergamaauraa’eel                                  \n" +
            "Mul’ateaangoonkee                                                               \n" +
            "Tsabalakeenfayyee                                                                            \n" +
            "Himee kabaja kee……….. \n" +
            "Uraa’eel koottu /2/ \n" +
            "Gadda balleesssitee nagaa kan laattu\n" +
            " Koottu Uraa’eel koottu  \n                                                                                        \n" +
            "Koottu takliyyee koottu/2/\n" +
            " Gadda balleesssitee nagaa kan laattu \n" +
            "Koottu takliyyee koottu \n" +
            "Yohaannislammaffaa  …………Takliyyee koottu                                                                                                                                                                    Gootichawangeelaa \n" +
            "Kannuttiargisiistee                                                                                                                                                                                                                               \n" +
            "Karaisaqajeelaa                                                                                                                                                                                                       \n" +
            "Gadaamiwwankeerratti  \n" +
            "Ifakeeibsitee                                                                                 \n" +
            "Takliyyeeabbaakoo                                                                                                    \n" +
            "Nageenya labsitee………. \n" +
            "Takliyyee koottu gadda balleesssitee nagaa kan laattu\n" +
            " Koottu takliyyee koottu     \n";

    String title = " Koottu Miikaa’eel koottu ";

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