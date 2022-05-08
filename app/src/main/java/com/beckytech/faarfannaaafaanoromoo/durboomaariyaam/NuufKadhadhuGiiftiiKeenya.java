package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NuufKadhadhuGiiftiiKeenya extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nuuf kadhadhu giiftii keenyaa/2/ \n" +
            "Maariyaamii yaa haadha nageenyaa \n\n" +
            "Osoo waaqni sanyii ….\n" +
            "Sin hambisuu baatee ……\n" +
            "Silaa dhalli namaa ……\n" +
            "Ibiddaan gubatee …….\n\n" +
            "Waaqayyoo abbaani  …….\n" +
            "Samiirraa ilaalee …..\n\n" +
            "Uumamtoota keessaa …..\n" +
            "Fayyinaaf si filee ……\n" +
            "Afuurri qulqulluun …….. \n" +
            "Giiftii sirra bulee \n" +
            "Ilmi waaqayyo Abbaa \n" +
            "Sirraa nama ta’ee \n\n" +
            "Qulqulleettii Maariyaam………\n" +
            "Maaliin fakkeeffamtaa ….\n" +
            "Uumamtoota hundaa ………\n" +
            "Kabajaan ni caaltaa……. \n" +
            "Kan akka kee hin jiru …..\n" +
            "Uumamtoota keessaa …..\n" +
            "Kabajaaf ulfinaan  ……\n" +
            "Mirga ilma kee teessaa……\n\n" +
            "Karaa dhugaarratti …..\n" +
            "Amantaan nu dhaabi ……….\n" +
            "Kennaa fannoo jalaa .....\n" +
            "Haadha balaaysabii ………..\n" +
            "Waadaan siif galame….. \n" +
            "Bara hanga baraatti ……..\n" +
            "Giiftii nu araarsi ……….\n" +
            "Waaqayyoo keenyatti  \n";

    String title = "Nuuf kadhadhu giiftii keenyaa";

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