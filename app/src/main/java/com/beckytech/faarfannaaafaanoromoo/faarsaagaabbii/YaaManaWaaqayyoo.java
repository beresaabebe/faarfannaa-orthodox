package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaManaWaaqayyoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa mana Waaqayyoo  ulfina qabeetti\n" +
            "Koottu nu eebbisi Maariyaam qulqulleetti\n" +
            "Karaa badii irraa ati nu deebisi\n" +
            "Ilma kee kadhadhu maaloo nu araarsi\n" +
            "\n\n" +
            "Duumeessa Eeliyaas kan itti abdanne\n" +
            "Qoricha Naahoomi kan ittin fayyinee\n" +
            "Mootiin bara baraa kan hin jijjiramne\n" +
            "Kiristoos Waaqayyo sii haadha nuuf kenne \n" +
            "\n\n" +
            "Arjoomni bishaani maqaa keen kennamee\n" +
            "Lubbuu du’ee wajjin yommuu madaalame\n" +
            "Fayyinaaf ta’eera nutis kana beekne\n" +
            "Nu dhagahi Giifti yommuu si waammannee\n" +
            "\n\n" +
            "Nu wajjin dhaabadhu yaa Giiftii Maariyaami\n" +
            "Ilma kee nuuf kadhu jireenyaaf nu waami\n" +
            "Nu humna hin qabnu si godhaanna hirkoo\n" +
            "Ati nu jabeessi haadha gaafa rakkoo\n";

    String title = "Yaa mana Waaqayyoo  ulfina qabeetti";

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