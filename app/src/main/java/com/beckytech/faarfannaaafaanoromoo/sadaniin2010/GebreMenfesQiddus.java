package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GebreMenfesQiddus extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kan waaqayyoo kabajee ni kabajna\n" +
            "Kan waaqayyoo filate ni kabjnaa\n" +
            "Gebremenfes qiddus maqaa ke wamanaa\n" +
            "Abbaa sabaa hundumaa maaloo nuuf koottu      \n        \n" +
            "Abuyee Abbaa koo ati nuuf dhaabbadhuu               \n" +
            "Araaraa kaa keetin maaloo nuu milladhuu               \n" +
            "Dhiifamaf nageenyaa Gooftaarra nuuf kadhuu         \n" +
            "Kuno si waammanna Ammallee nuuf koottuu\n\n" +
            "Galaanicha keessaa bara hedduf dhaabbattee\n" +
            "Sabaa Itiyoophiyaaf Araaraa kadhattee\n" +
            "Gabramenfes qiddus yaa Abbaa hundumaa\n" +
            "Atii nuu araarsii Yaa abdii keenya sumaa   \n                              \n" +
            "Gooftaatu filatee nutis ni kabajnaa   \n" +
            "Kabajaa Aabuyeef kootta ni dhaabbannaa               \n" +
            "Kan waaqnii filatee eenyumtuu hin salphisu   \n" +
            "Abuyee Faarfannaa inni nuu haa Eebbisu\n";

    String title = "Gabre menfes qiddus";

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