package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SiWaamnaaAmaanueel extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Amaanu’eelii /2/…………Si waamnaa Amaanu’eelii \n" +
            "Abbaa arjaa hundaa olii…Si waamnaa Amaanu’eelii \n" +
            "Guyyaan waadaa yeroon geenyan……Si waamnaa Amaanu’eelii \n\n" +
            "Nuyiif kaffalame beenyaan \n" +
            "Fannifamuu waaqa keenyaan \n" +
            "Oljenneerra nus kabajaan \n" +
            "Bilisoomnee diinni hidhame \n" +
            "Nageenyi addunyaaf labsame \n\n" +
            "Rukutamaa fannoo baattee \n" +
            "Gara qaraaniyoo deemtee \n" +
            "Cubbuu keenyaaf fannifamtee \n" +
            "Saamtuu wajjiin lakkaawwamtee \n\n" +
            "Nutis jaalala kee kana  \n" +
            "Hin callisnu ragaa baana \n" +
            "Dhaloota dhalootatti himna \n" +
            "Raajii hojii kee lallabna \n\n" +
            "Si waamnaa Kiristoosi/2/\n" +
            "Si abdannee hin leeyyaanu….si waamnaa Kiristoosi\n" +
            "Si waammannee kufnee hin beeknu……\n" +
            "Wangeela keetti hin qaanofnu…..\n" +
            "Rakkoo addunyaas hin sodaannu…….\n" +
            "Maqaa waamnee faarfanna………\n" +
            "Bara baraan moo’i jenna………\n\n" +
            "Si waamnaa Maariyaamii/2/\n" +
            "Maariyaamii x2…………….si waamnaa Maariyamii\n" +
            "Haadha, dubroo, lafaa fi samii……..\n" +
            "Sin jenna iyyaruusaalemii\n" +
            "Giiftii keenya nuuf kadhadhu\n" +
            "Fuula gooftaa nuuf dhaabadhu\n" +
            "Haadha keenya si kadhanna\n" +
            "Halkan guyyaa si waammanna\n" +
            "Siin fayyine sanyiin Addaam\n" +
            "Qulqulleettii dubroo Maariyaamii\n" +
            "Siin fayyine sanyiin Addaam\n" +
            "Qulqulleettii dubroo Maariyaam\n";

    String title = "Si waamnaa Amaanu’eelii";

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