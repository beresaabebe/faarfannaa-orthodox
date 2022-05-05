package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HaadhaGaafaRakkoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Garaa laafetti Koo\n" +
            "Haadha gaafa rakkoo\n" +
            "Maariyaam si'iidha\n" +
            "Anis sin waammadha.\n\n" +
            "     Ofii keetii ari'amtee\n" +
            "     Biyyaa biyyatti godaantee\n" +
            "     Sareedhaafis ni gadditee\n" +
            "     Kophee warqeen dheebuu baaste.\n\n" +
            "Maariyaam(2) na dhibee wa'een kee\n" +
            "Baayyee Addaa arjummaan kee\n" +
            "Dachee gaariidha ati haadhakoo\n" +
            "Situ biqilchee Wayiniikoo.\n\n" +
            "      Si argeera Fannoo jalaatti\n" +
            "      Yeroo boossuu mucaa keetii\n" +
            "      Kanaafani si jaalladhee\n" +
            "      Laphee koorra si kaawwadhee.\n\n" +
            "Yohaanniis(2) kunoo haadha kee\n" +
            "Fudhuu galii ati  mana kee\n" +
            "Har'aa kaasee siif kenneera\n" +
            "Tajaajili sin jedheera.\n\n" +
            "     Tawufaniyaan foonkee gubuuf\n" +
            "     Yommuu yaade si balleessuuf\n" +
            "     Harki isaa ittii citee \n" +
            "     Humni Waaqa ni mul'attee.\n\n" +
            "Pheexiroos(2) deebiisif harkasaa\n" +
            "Hin fayyaduu du'uun isaa\n" +
            "Haa baratuu oolmaa haadhasa\n" +
            "Haa barsiisuu obbolootasa.\n\n" +
            "      Nama nyaataa bara hunda\n" +
            "      Bira hin darbuu xiqqaafi guddaa\n" +
            "      Nama malee nyaachuu didee\n" +
            "      Lubbuu namaa hedduu fixee.\n\n" +
            "Maariyaamiif (2) jedhi yaa namana\n" +
            "Anaaf kennii bishaan kana\n" +
            "Dheebuudhaani ani du'uufi\n" +
            "Durboon Maariyaam si fayyisti.";

    String title = "Haadha gaafa rakkoo";

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