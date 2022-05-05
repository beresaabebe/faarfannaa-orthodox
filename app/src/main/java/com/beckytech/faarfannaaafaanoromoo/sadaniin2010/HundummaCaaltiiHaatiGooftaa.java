package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HundummaCaaltiiHaatiGooftaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Hunduu dhaga’aa yaa namootaa\n" +
            "Hundumaa caaltii haatii Gooftaa\n" +
            ".......\n\n" +
            "Yaa namootaa eyyee                         \n" +
            "Yaa namootaa  “                        \n" +
            "Hundaa caaltii  “                       \n" +
            "Haati Gooftaa    “                       \n" +
            "Ni kadhatti   “                       \n" +
            "Cubbamoota   “                      \n" +
            "Ni dhaabbatti  “                    \n" +
            "Mirga gooftaa  “\n\n" +
            "Hunduu dhaga’aa yaa namootaa\n" +
            "Hundumaa caaltii haatii Gooftaa\n\n" +
            "Uumamarraa eyyee\n" +
            "Hundaa caaltii  “\n" +
            "Waqaa uumaan “\n" +
            "Filatamtee       “\n" +
            "Ergamootan “\n" +
            "Kabajamtee “\n" +
            "Amaanu’eel   “\n" +
            "Gooftaa deessee  “                  \n            \n" +
            "Araarsitudhaa Maariyaamiin (2)                                   \n" +
            "Hirkoo dhugaa   eyyee                                     \n" +
            "Kan fayyinaa    “                                     \n" +
            "Maariyaamii         “                                     \n" +
            "Si faarsinaa           “                                    \n" +
            "Cubbuun keenyaa   “                                     \n" +
            "Baay’ateeraa          “                                    \n" +
            "Nuuf kadhaadhuu     “                                    \n" +
            "Ilmaa keerraa         “\n\n" +
            "Araarsitudhaa Maariyaamii (2) \n" +
            "Mirga Gooftaa   eyyee\n" +
            "Kan dhaabbattuu   “\n" +
            "Cubbamootaaf      “\n" +
            "Kan kadhattuu     “\n" +
            "Warqee uffattee      “\n" +
            "Kan dhaabbattuu    “\n" +
            "Yaa harmee koo     “\n" +
            "Mee nuuf koottuu     “       \n    \n" +
            "Warri Maariyaam gananii           \n" +
            "Boodde maal ta’aa dhumni saanii      \n                 \n" +
            "Abiddichaan  eyyee                      \n" +
            "Ni nyaatamuu    “                       \n" +
            "Si’oolittii           “                      \n" +
            "Ni gatamuu     “                      \n" +
            "Daabiloosiin       “                     \n" +
            "Fudhatamuu     “                     \n" +
            "Hin fayyanii     “                      \n" +
            "Isaan yoomu     “\n\n" +
            "Warri Tsihoonin jibbanii \n" +
            "Miila isheetti haa kufanii          \n      \n" +
            "Gara durbee   eyyee              \n" +
            "Haa dhufanii     “              \n" +
            "Miila sheettii        “             \n" +
            "Haa kufanii       “            \n" +
            "Booda gaabbu “           \n" +
            "Hundi saanii     “           \n" +
            "Garuu fayyuu  “            \n" +
            "Yoo kufanii             “    \n                                                            \n" +
            "Warrii Maariyaam kabajanii                                 \n" +
            "Ni eebbifamaa dhumni isaanii\n\n" +
            "Haadha Gooftaa eyyee \n" +
            "Ni kabajna    “\n" +
            "Maariyaamii    “\n" +
            "Ni jaalannaa    “\n" +
            "Maqaa ishees  “\n" +
            "Ni Faarfannaa    “\n" +
            "Galata isheef     “\n" +
            "Ni dhaabbàanna    “          \n\n" +
            "Kanaaf Maaramii  ni jaalannaa\n" +
            "Kanaaf maaramii ni jaalannaa          \n      \n" +
            "Ni jaalannaa eyyee               \n" +
            "Ni jaalannaa    “              \n" +
            "Harmee dhugaa  “             \n" +
            "Ishee qabnaa       “             \n" +
            "Tawaahidoon    “            \n" +
            "Maal sodannaa  “            \n" +
            "Maariyaamii         “           \n" +
            "Abdii qabnaa     “                  \n";

    String title = "Hundummaa Caaltii Haati Gooftaa";

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