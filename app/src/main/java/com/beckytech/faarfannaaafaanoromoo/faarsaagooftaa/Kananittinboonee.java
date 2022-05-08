package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Kananittinboonee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kanan ittin boonee eenyuree Gooftaa koo malee\n" +
            "Isa cubbuu kootif jedhee fannoo gubbaa oolee\n" +
            "Jireenya koo na booji’e guddaa jaalalli isaa\n" +
            "Gammade isa faarfasudhaan galatan dhiyeessaa\n" +
            "        Ceesisa\n" +
            "Takka kufee takka ka'ee gindillaa naaf baate\n" +
            "Imimmaan isa dhangalaase na jedhee dhiphatee\n" +
            "Garaa kootu naa raafama waa'ee jaalala isaa\n" +
            "Anaf jedhetu dhangalaase qulqulluu dhiiga isaa\n" +
            "       Ceesisa\n" +
            "Qaraniyoo irraatti Gooftaa qullaa fannisanii\n" +
            "Cinaacha isaa waraanun itti gaa'isaanii\n" +
            "Jechumaati natti hira'ata waa'ee isaa ibsuus\n" +
            "Jaalala akkam naaf qaba Gooftaa koo Iyyesuus\n" +
            "             Ceesisa\n" +
            "Isa malee maalan qaba furii lubbuu kooti\n" +
            "Anaf jedhee dhiphatee akka cubbamaati\n" +
            "Jaalala isa muldhisuudhaf fannoo irraatti ol ba'ee\n" +
            "Mootichi hundumaa danda'u waa'ee kootif du'ee\n" +
            "         Ceesisa\n" +
            "Gooftaan koo du'a jalati naa baase bilisaa\n" +
            "Si'ichi gammadden faarfadhaa qulqulluu maqaasaa\n" +
            "Doorsisni kee karaati hafee eega yaa diina koo\n" +
            "Qabeenya isa na godhate fayyisee lubbuu koo\n";

    String title = " Kanan ittin boonee eenyuree Gooftaa koo malee ";

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