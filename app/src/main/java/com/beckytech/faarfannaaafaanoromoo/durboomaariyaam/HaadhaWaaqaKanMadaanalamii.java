package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HaadhaWaaqaKanMadaanalamii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Hadhaa waqaa kan Madaanalami koottu mariyaami (×2) \n" +
            "Kani madanalimi (×2) kottuu Mariyaami    \n" +
            "Maddaa qulqulleetii             \"\n" +
            "Taalilaa hin borofne            \"\n" +
            "Hadhaa gafaa Raakkoo       \"\n" +
            "Kan hin sisinnofne              \"\n\n" +
            "       Abdii si godhaane  kottu  mariyaami \n" +
            "       Kan hin dukkaanofne        \"\n" +
            "       Maqaa kee waamanne       \"\n" +
            "        Koyyaa mogaa Dhufeene          \"\n\n" +
            " Nuuf kadhaatti Durbee Qulquulletin Iddoo Raakkotii (×2) \n" +
            "Durbee Qulqulleti Iddo Rakkotii (×2) \n" +
            "Ilmaa koo naani jechaa   iddoo rakkoti \n" +
            "Sagaal naa mil'ate                     \"\n" +
            " Garaa Lafettikoo                      \"\n" +
            "Yomfaa na  dagaate                  \"\n\n" +
            " Nuuf kadhatti Durbee qulquulletin  iddoo Raakkootii (×2)  \n" +
            "   Durbee qulquulletin Iddoo Raakkoti (×2) \n" +
            "   Garaa ishee Deebinan               \"\n" +
            "    Rakkoo oddefaachuu               \"\n" +
            "    Kan keessa kof ta'u                  \"\n" +
            "    Argaadhee Gamaachuu            \"\n\n" +
            "Nuu  aararsi yaa wadaa fayyinnaa Nuu si farsinaa (×2)\n" +
            " Yaa wadaa Faayyiinaa Nuu sii Farsinaa (×2) \n" +
            "Yoon farse maqaa kee nuu si farsinaa \n" +
            "Me maalin sodaadhaa         \"\n" +
            "Abdii gaafaa Raakkoo        \"\n" +
            "Siilaa Sin Abdaadhaa          \"\n\n" +
            "Nuu  Aararasi Yaa wadaa Faayyinaa nuu sii Faarsinaa (×2)  \n" +
            "Yaa waadaa Faayyinaa Nuu si faarsina (2) \n" +
            "           Waabii qulquullotaa  nuu si farsina \n" +
            "           Yaa Abdii jireenyaa             \"\n" +
            "           Durbee mariyamaa               \"\n" +
            "           Koottuu gara keenyaa           \"\n" +
            "           Nuu Aararsisi Yaa waadaa faayyinaa nuu si farsinaa (×2)\n";

    String title = "Haadha waaqa kan madaanalamii";

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