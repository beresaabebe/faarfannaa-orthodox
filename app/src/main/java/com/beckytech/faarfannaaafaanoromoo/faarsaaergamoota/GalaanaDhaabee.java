package com.beckytech.faarfannaaafaanoromoo.faarsaaergamoota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GalaanaDhaabee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galaana dhaabee sagaleen kee/2/\n" +
            "Ergamaa Mikaa’el guddaadha aangoon kee\n\n" +
            "    Galaana dhaabee Biyya Gitsii keessaa\n" +
            "               “          “        Israa’eliin baasee\n" +
            "                “          “        Loltoota fari’oon            \n" +
            "                “         “         Galaanan dabarsee\n" +
            "                “         “         Mannaa kan nu sooru\n" +
            "                “         “         Bishaan kattaa yaasee\n" +
            "                “         “         Iyyaasuuf kaaleebin\n" +
            "                “         “         Kana’aanin galchee\n\n" +
            "Dursii nu duraaMikaa’eli\n" +
            "Gaggeessaa kan turtee sabootaIsraa’elii\n\n" +
            "Dursii nu duraaBiyyi keenya as mitii\n" +
            "           “               “      Karaafagootujiraa\n" +
            "           “               “      Akeeka seexanaa\n" +
            "           “               “      Dhabamsiisinurraa\n" +
            "           “               “      HirkooAfoomiyaa\n" +
            "           “               “      GargaaraaDaani’eeli\n" +
            "           “               “      Hangafaergamootaa\n" +
            "           “               “      KoottuMikaa’elii\n\n" +
            "Abiddadhaamsesagaleenkee\n" +
            "ErgamaaGaabri’eelguddaadha aangoon kee\n\n" +
            "AbiddadhaamseeMaamilawaaqayyoo\n" +
            "            “              “          Cinaa kan dhaabbattu\n" +
            "            “              “           Ijoolonnisadan\n" +
            "            “              “           Raajiiisaadubbatuu\n" +
            "            “              “           IyyaluuxaafQirqoos\n" +
            "            “              “          Ni galateeffatu\n" +
            "      “               “           Kan afuuraqabu\n" +
            "       “               “           Har’ashaafaarfatu\n\n" +
            "Nu faanata’iiGaabri’eeli\n" +
            "GammachuukanhimtedhalootaAmaanu’eeli\n\n" +
            "           Nu faanata’ii Lola samiitika’ee\n" +
            "                     “          “   Kan tasgabbeessite\n" +
            "                     “         “    Jabinaandhaabbataa\n" +
            "                     ”         “    Namni si waammatee\n" +
            "                     “         “    Mudaa kan hin qabne\n" +
            "                     “         “    Ergamaanageenyaa\n" +
            "                  “        “    Nu eegi nu tiksii\n" +
            "                      “        “     Bahaaf gala keenya \n";

    String title = "Galaana Dhaabee";

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