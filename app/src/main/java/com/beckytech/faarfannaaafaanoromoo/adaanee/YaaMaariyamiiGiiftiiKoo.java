package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaMaariyamiiGiiftiiKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa Maariyaamii giiftii koo yaa Maariyamii /2/\n" +
            "Kan sirraa dhalate fayyisaa namootaa \n" +
            "Nagaan siif haa ta'u yaa giiftii tolootaa/2/\n" +
            "............................................\n\n" +
            "Dubartoota keessaa ati kan filatamtee\n" +
            "Yaada Waaqayyootiin dura jaalatamtee\n" +
            "Aduun karaa bahaa dhalootaaf mul'atee\n" +
            "Kristoos Iyyesuus dubree irraa dhalatee /2/\n" +
            "............................................\n\n" +
            "Ergamaa Gabri’eel gara keetti ergamee\n" +
            "Yaa dubree dubrummaan Ilma deessa jedhee\n" +
            "Ergaa Gooftaa keenyaa kan dhufee sitti ime\n" +
            "Qulqulluu Gabri'eel Waaqa irraa ergamee /2/\n" +
            "............................................\n\n" +
            "Ergamoonni Waaqaa siin ni kabajatuu\n" +
            "Sabni biyya lafaas maqaa kee waammatuu\n" +
            "Kan mucaa kee ta'ee ilma Waaqayyootii\n" +
            "Ulfina argatte gammadi Maariyaam atii /2/\n";

    String title = "Yaa maariyaamii giiftii koo";

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