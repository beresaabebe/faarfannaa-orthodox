package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AmmaReefuTolee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Amma/2/reef  tolee eeyyee amma reef tolee\n" +
            "Amma /2/ reef tolee eeyyee\n" +
            "Waaqayyootu nuu lole eeyyee amma reef\n" +
            "Amma/2/reef tolee amma reef tolee\n" +
            "Maariyaamiitu nuuf tolee  eeyyee\n" +
            "\n\n" +
            "Amma/2/reef tolee eeyyee …ammaa reef tolee\n" +
            "Mikaa’eeltu nuuf lole eeyyee.    “\n" +
            "Gabri’eeltu nuuf lolee      “\n" +
            "Uraa’eeltu nuuf lolee     “\n" +
            "Uraa’eeltu nuuf lolee     “\n" +
            "Raagu’eeltu nuuf lolee   “\n" +
            "Ergamoota nuuf lole\n" +
            "Ijoollee isaatti tolee\n" +
            "Diina keenyaa  wallolee\n" +
            "Seexaanootatu  wallolee\n" +
            "\n\n" +
            "Amma(2)gaariidhaa eeyyee… ammaa gaariidhaa\n" +
            "Ijoollee  isaaf gaariidha\n" +
            "Garee keenyaaf gaariidha\n" +
            "Diina keenyaaf aariidhaa\n" +
            "Warra hin beekneef aariidhaa\n" +
            "Seexaanootaaf aariidhaa.\n" +
            "\n\n" +
            "Amma(2) bareedee eeyyee… amma bareedee\n" +
            "Ijoollee isaatu bareedee\n" +
            "Diina keenyaatu wallolee\n" +
            "Iyyasuusiin qabannee\n" +
            "Maariyaamiin qabannee\n" +
            "Qulqullootaas  qabannee\n" +
            "\n\n" +
            "Qabna(2)…Amantii eeyyee qabna amantii\n" +
            "Tewaahidoo jedhamtii eeyyee\n" +
            "Qabna(2)…haadhasii eyyee qabna haadhasii\n" +
            "Haadha Gooftaa Iyyasuusii\n" +
            "Qulqulleettiis haadhasii\n" +
            "Haadha Gooftaa jedhamtii\n";

    String title = "Amma reefu tolee eeyyee amma reef tolee";

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