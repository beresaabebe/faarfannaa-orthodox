package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Galateeffamaadhahammabarabaraatti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galateeffamaadha hamma bara baraatti(x2)\n" +
            "Hamma bara baraatti mootiidha ati (x2)  eeyyee\n\n" +
            "       Hunda duraa akka jirtuu\n" +
            "       Lafaaf samiin haa dubbatuu\n" +
            "       Hundi darbees ni jiraatta\n" +
            "       Yaa waaqa koo siif galata\n" +
            "        Baraan hin daanga'uu ulfinni fi aangoon kee\n" +
            "         Ililleen si faarsa dhaabbadhe fuulakee\n\n" +
            "Warri kaleessa mootii turan\n" +
            "Darbaniiruu har'a hin jiran\n" +
            "Beektonni fi ogeessonni \n" +
            "Liqimfanii du'aanii\n" +
            "Dhaloonni dhaalotaan barris yoo darbuu baraan\n" +
            "Ati ni jiraatta moote bara baraan\n\n" +
            "       Ergamoonni samiirratti\n" +
            "       Si faarfatuu maqaa keetiin \n" +
            "       Ilmaan namaa jilbeenfannaan\n" +
            "        Si waaqessuun siif bitaman.\n\n" +
            "Dureessa hiyyoomsitee beela'aa qubsitaa\n" +
            "Addunyaa kanarraa eenyutu siin qixxaataa\n";

    String title = " Galateeffamaadha hamma bara baraatti ";

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