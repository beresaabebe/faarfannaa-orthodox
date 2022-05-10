package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AkkaBiyyaLafaaf extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Akka biyya lafaaf abdiinkoo dhumeera\n" +
            "Garuu yaa waaqayyoo hundi harka kee jiraa\n" +
            "Qawwaankoo baay'atee diinni na dorsiisuu\n" +
            "Abbaa koo samiirraa anoo faarsuu hin dhiisu\n\n" +
            "Jechi dubbatamuu baay'isee ulfaataadha\n" +
            "Gaddisa manakee maaltu naa fakkataa\n" +
            "Duukkanni koo har'aa ni bari'a boruuu\n" +
            "An kan waaqayyooti diinnis yoo na qoruu\n\n" +
            "Anaaf ta'uu dhiisuus haalli naaf mijaa'uu\n" +
            "Wanta darbu ilaalee gonkumaa hin rarra'uu\n" +
            "Yeroosaa eeggatee hundumtuu ni raawwataa\n" +
            "Harbuun ija dhabees deebisee naqataa\n\n" +
            "Isa gargar ba'ee walitti deebistaa\n" +
            "Isa gaddaa jiruu jabaadhu ittin jettaa\n" +
            "An sumaan waammadhaa hanga du'a kootti\n" +
            "Maaloo na waammadhu manakee jalatti\n\n" +
            "Diinni koo maal yaade maaliif na doorsisaa\n" +
            "Rakkoo koo isa xiqqoo guddistee muldhistaa\n" +
            "Dorsisa kee ilaalee an hin jijjiramuu\n" +
            "Qoruumsi natti cimuu yookiin gidirfamuu\n";

    String title = "Akka biyya lafaaf abdiinkoo dhumeera ";

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