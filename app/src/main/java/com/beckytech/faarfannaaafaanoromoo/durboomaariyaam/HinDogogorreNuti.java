package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HinDogogorreNuti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Hin dogogorre nuti hin dogoggorre/2/  \n" +
            "Waaqayyoon ni bu’e teessoo isaa samiirraa   \n" +
            "Kunoo ni dhalate dubroo Maariyaamirraa        \n" +
            "Kan hin qoratamne iccitii waloomaan                 \n" +
            "Addunyaa fayyisuuf nama ta’e gooftaan  \n\n" +
            " Miti nuu hin kadhatu inni murteessaadha          \n" +
            "Jennee yoo dubbannee ilmi Maariyaamiidha                                                         \n" +
            "Nuti hin dogoggorre dhugaan isaa kanadha                                                        \n" +
            " Gooftaan nuf kadhata kan jedhe eenyudhaa\n\n" +
            "Taabota waaqayyoo kabajaan hordofnee          \n" +
            "Mallattoo fayyinaa fannoo isaa qabannee       \n" +
            "Karaa ishee qajeeltuu daandii ishee ganamaa                                                          \n" +
            "Akka abbootii keenyaa ishumarra deemnaa  \n\n" +
            "Seenaa addunyaa kanaan warreen beekamani                                                  \n" +
            "Amanuu dhabuudhaan du’anii hafani              \n" +
            "Gooftaan keenya iyyasuus kan nu waaqeffannu                                                  \n" +
            " Inni jiraatadha baruma baraanuu  \n";

    String title = "Hin dogoggorre nuti";

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