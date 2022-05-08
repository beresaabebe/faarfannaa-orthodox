package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Kankaleessadarbe extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kan kaleessa darbe isa har'a dhufu beeka waaqni keenya\n" +
            "Koottaa hin kabajanna waaqayyoo abbaa keenya×2\n\n" +
            "     Kan darbeef kan dhufu isaaf beekamaadha\n" +
            "    Yoo inni godhe malee hundumtuu duwwaadha\n" +
            "     Hunduu isaaf salphaadhaa waa jalaa hin dhokatu\n" +
            "     Lafaaf sami irraatti maqaan isaa haa ulfaatu\n\n" +
            "Wagoota waggaadhaan kan wal jijjiirsisuu\n" +
            "Waggaadhaa waggaatti kan nun nu dabarsu\n" +
            "Akkaa fedha keenyaatti hunda kan nuuf kennu\n" +
            "Waaqayyoo gooftaadhaaf galanni haa ta'u\n\n" +
            "    Otoo of sodaannuu bara darbe keessaa\n" +
            "    Jaalalaan nu marsee nu dabarse keessaa\n" +
            "    Kan akka isaa hin jiruu kan nama jaalatu\n" +
            "    Sabni biyya lafaa hunduu haa faarffatu\n\n" +
            "Kan darbe nu gaha hamaa raawwachuuni\n" +
            "Wal irratti ka'uu fi diinaaf wal laachuuni\n" +
            "Kan darbe darbeeraa koottaa ni deebinaa\n" +
            "Waggaa haaraa wajjin nutis haaraa taana\n";

    String title = "Kan kaleessa darbe isa har'a dhufu beeka";

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