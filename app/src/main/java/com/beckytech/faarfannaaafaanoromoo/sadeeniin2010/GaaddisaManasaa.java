package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GaaddisaManasaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Gaaddisa manasaa Iddoo Gammachisaa\n" +
            "Kabajni manichaa baayyeedha ifnisaa \n" +
            "Nama hawwisiisaa baayyee jireenyisaa(2)      \n                      \n" +
            "Kiristoos nuuf dhufee kuno nuu fayyise          \n" +
            "Jaalala Bayyisee cubbu nama dhisee                \n" +
            "Sillaasee qulqulluun dhufee nuu eebisee             \n" +
            "yakkarra nuu olchee daandii nuu qabsiise\n\n" +
            "Maal jedhen dubbadha jecha waaqummaasaa\n" +
            "Danda'ee dubbadhuu ani maal jedheen ibsaa\n" +
            "Hunduu jijjirame kallattin qaamasaa\n" +
            "Akkamiinan ibsaa gochaa waaqummasaa       \n                    \n" +
            "Yeroo dhiyaateraa Ganuu Addunyaatti                          \n" +
            "Iddoon  jireenyaadha gara Gannatittii                                            \n" +
            "Nama Gammachiisaa jireenyi achiitti                                \n" +
            "Gaarii yaa hojjennu nuti hangaa dhumatti\n";

    String title = "Gaaddisa manasaa";

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