package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GabrieelSadaan extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Misiraachoo baatee dhufe samii gubbaa\n" +
            "Dursaa ergamootaati innoo angoo qabaa\n" +
            "Maqaasaa Faarfannaa galataf dhaabbannaa\n" +
            "Gabri’eel(2)maaloo nuuf koottu ammaa\n\n" +
            "Fuuldura waaqayyoo yeroo hunda dhaabbataa\n" +
            "Dhiifama Gooftaarraa Dhalootaaf kadhataa\n" +
            "Eegumsisaa yoomuu nurraa addaa hin bahuu\n" +
            "Qulqulluu Gabri'eel eebbisaa nu haa gahuu\n\n" +
            "Haadha Gooftaa keenyaa fuuldura dhaabbatee\n" +
            "Oduu gammachiisaa isheetti dubbatee \n" +
            "Ilma deessa ati innis waaqayyoodhaa \n" +
            "Gammadi Maariyaam ati kennaa addaadha    \n                            \n" +
            "Qirqoosiif harmeesaa Abiddaa kan baastee\n" +
            "Bishaan danfaa jalaa isaaniin oolchitee\n" +
            "Akkuma qirqoosittii koottu gara keenyaa\n" +
            "Nuti si farfaannaa maaloo abbaa keenyaa\n\n" +
            "Naabukedenetsoor kunoo labsii baasee\n" +
            "Ijoollee sadeenis abiddatti buusee \n" +
            "Samiirraa ergamtee ati ni baafattee\n" +
            "Gabri’eel eegaakoo nunis yoom nu gattee\n";

    String title = "Gabri'eel";

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