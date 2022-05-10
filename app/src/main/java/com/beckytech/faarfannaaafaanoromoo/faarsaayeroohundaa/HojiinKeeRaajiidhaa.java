package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HojiinKeeRaajiidhaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Hojiin kee raajii dhaa bahaa hamma lixaatti\n" +
            "Aduun galgalooftee darbees ganamatti\n" +
            "Bilqiloonni hundinuu daraaraan dhaabbatuu\n" +
            "Si’iin waljijjiiraa gooftaa si haagalatuu\n\n" +
            "Kan balali’uu samii gubbaa si’ii\n" +
            "Suma eegataa kan lafarraasii\n" +
            "Sinbirrota ilaalii hin makaranii\n" +
            "Jireenya isaanif soora hin dhabanii\n\n" +
            "Laggeen guutaaniiruu addunyaa mararraa\n" +
            "Gooftaan kan abboomu bubbee galaanarraa\n" +
            "Kanaafuu na dhibaa hojiin kee waaqa koo\n" +
            "Na uumtee nan gatiin miiladhu gara koo\n\n" +
            "Dacheen bareedinaan magariisa uffatee\n" +
            "Lalisaan hundinuu waaqayyoon dhaabbataa\n" +
            "Qilleensi lafarraa uuwwisuun marsanii\n" +
            "Arjumaa isaatinii taa’uu qabaananii\n\n" +
            "Tasa hin yaadinaa jireenya foonitti\n" +
            "Uumaa kee kadhadhu sinbirroo ni caaltatii\n" +
            "Abrahaam qulqulluu fakkeenya hin fudhatuu\n" +
            "Ilma isaa tokkicha waaqayyoof kan laatuu\n";

    String title = "Hojiin kee raajii dhaa bahaa hamma lixaatti";

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