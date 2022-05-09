package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IsheenNuufKadhatti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Isheen nuuf kadhatti isheen nuuf kadhatti/2/ \n" +
            "Maariyaamii/2/ Giiftii qulqulleettii/4/ \n\n" +
            "Qulqulluu Miikaa’eel angafa ergamootaa \n" +
            "Si waammanna x2 nuuf kadhadhu Gooftaa x4\n\n" +
            "Gabri’eel ergamaa missiraachoo himaa/2/ \n" +
            "Missiraachoo himte itti Dubroo Maariyaamiitti/4/\n \n" +
            "Ergamaa Rufaa’eel angafa ergamootaa/2/ \n" +
            "Situ baneef/2/ ijasaa Xoobitiif \n\n" +
            "Ergamaa Uraa’eel angafa nageenyaa/2/ \n" +
            "Si waammannaa/2/koottu gara keenyaa/4/ \n\n" +
            "Dubroo Maariyaamii yaa gugee garraamii/2/ Qulqulleettii /2/Giiftii lafaaf samii/4/\n" +
            "Dursee siif faarfatee mootichi abbaan kee/2/\n \n" +
            "Damee wayinii/2/ mi’aawaa firiin kee \n" +
            "Solomoon siin jedhe/4/ \n" +
            "Urgooftuu koo /2/ koottu misirrookoo\n\n" +
            "Abuyee abbaakoo kennaa Aqleesiyaa/2/  \n" +
            "Duuka bu’aa(2)isa iskindiriyaa(4)\n\n" +
            "Taklahaaymaanoti(4)\n" +
            "duuka bu’aa(2) kan Itiyoophiyaa(4)\n\n" +
            "Ifa addun  addunyaadha phexiroosif phaawuloosii(2)\n" +
            "Utuubaadha(2)mana kiristaanaf(4)\n";

    String title = "Isheen nuuf kadhatti isheen nuuf kadhatti";

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