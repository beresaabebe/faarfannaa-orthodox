package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Koottuyaawaaqakoo  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Koottu yaa waaqa koo yaa qooricha koo\n" +
            "Siin galateeffadhaa hamma jireenya koo\n\n" +
            "Haari'amee hin hafnee Yaa qoricha koo\n" +
            "Addaam gannatiidha \"\"\"\"\"\"\n" +
            "Dhalate Fayyisaan\"\"\"\"\"\"\n" +
            "Gooftaan qulquloota\"\"\"\"\"\"\n\n" +
            "Na hin dhibin lubbuu koo\"\"\"\"\"\"\n" +
            "Mee na hin rakkisinii\n" +
            "Tokkkicha si uumee\n" +
            "Waaqayyootti amanii\n\n" +
            "Fannoon Gooftaa keenyaa\n" +
            "Anaaf fayyisaadhaa\n" +
            "Warra itti hin amanneef\n" +
            "Garuu doofummaadha\n\n" +
            "Qoricha naaf taatee\n" +
            "Abdii namaaf taatee\n" +
            "Kanan badee turee\n" +
            "Deebi'i nan jettee\n\n" +
            "Ani cubbuu kootiif\n" +
            "Waaqatti dhiyaachuuf\n" +
            "Maariyaam yaa haadha koo\n" +
            "Waaqayyoo nuuf kadhuu\n\n" +
            "waaqayyoo Gooftaa Koo\n" +
            "Baayyee na jaallataa\n" +
            "Ilma koo naa jedhaa\n" +
            "Ijoollee Addaamii\n\n" +
            "Maaloo yaa waaq koo\n" +
            "Ofitti naa fudhuu\n" +
            "Dahoo bobaa keettii\n" +
            "Of jala na godhu\n\n" +
            "waaqayyoo Gooftaa Koo\n" +
            "Baay'ee n jaallataa\n" +
            "Maariyaam Giiftiinii\n" +
            "Lubbuu naaf hirphitii\n";

    String title = "Koottu yaa waaqa koo yaa qooricha koo";

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