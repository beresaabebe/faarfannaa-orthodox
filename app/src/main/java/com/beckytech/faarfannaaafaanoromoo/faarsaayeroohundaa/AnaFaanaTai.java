package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AnaFaanaTai extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ana faana ta'i yaa gooftaa abbaa koo\n" +
            "Simalee hin qabuu suma abdiin  kan koo\n" +
            "Mootii fannoo irraa amaanu'eel waaqaa koo\n" +
            "Mootii qarani'oo amaanu'eel waaqaa koo\n" +
            ";;;;;;;;;;;;ceesisaa;;;;;;;;;;;;;;;\n" +
            "Kaleessaas si'iidhaa lubbuu kootif hiikaa\n" +
            "Naaf jettee madooftee naaf lolaastee dhigaa\n" +
            "Yaa waaqaa araaraa abbaa bara baraa\n" +
            "\"Ameen\"\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;ceesisaa;;;;;;;;;;;;;\n" +
            "Qaraaniyoorrattii hojii kee argeeraa\n" +
            "Fannifaamuu keetin an kabajameeraa\n" +
            "Yaa fayyisaa kootii lubbuun koo siin jettii\n" +
            "      !!!!!Ameen!!!!\n" +
            ";;;;;;;;;;;;;;;;;;;ceesisaa;;;;;;;;;;;;;;;;\n" +
            "Harka keerran argem mallattoo bareedaa\n" +
            "Waaqolii ormarraa kan sii godhuu addaa\n" +
            "Yaa maddaa jaalalaa kan harkistuu halaalaa\n" +
            "          !!!!!!Ameen!!!!\n" +
            ";;;;;;;;;;;;;;;;;;;;;;ceesisaa;;;;;;;;;;;;;;;;;;;;\n" +
            "Hin qabu hin qabuu jiruu si'iin alaa\n" +
            "Ilmaa durbee maariyaam hundee koo walii galaa\n" +
            "Yaa shittoo nardoosi kiristoos iyyasuus\n" +
            "            !!!!!!!Ameen!!!!!!!!\n";

    String title = "Ana faana ta'i yaa gooftaa abbaa koo";

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