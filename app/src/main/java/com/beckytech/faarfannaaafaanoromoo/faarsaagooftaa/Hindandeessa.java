package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Hindandeessa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Hin dandeessa ati yaa gooftaa ni dandeessaa(2)\n" +
            "Sin arge hunda keessaa\n\n" +
            "Angoo keetiin waan dubbattee ni rawwaattaa\n" +
            "Harka keetiin kan eegalattee ni xumurtaa\n" +
            "Galata kee gooftaa\n\n" +
            "Waan dubbattee yeroo keetin miidhagsitaa\n" +
            "Booda dhuftee gargaarsii kee hunda caalataa\n" +
            "Situ na jaallataa\n\n" +
            "Qilleensaa fi bishaan gidduu dandii qabdaa\n" +
            "Qofa miti hin sodaadhuu sit naaf yaadaa\n" +
            "Naaf galteetta waadaa\n\n" +
            "Na dhabeera fulduraasaa galatafii\n" +
            "Kennaa isaa isa harkaa isumaafii \n" +
            "Galanni haa ta’ufii\n\n";

    String title = " Haa galateeffanu Waaqayyoni ";

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