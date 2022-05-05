package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Tawaahidoodha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Hin qana’uu maafan qaana’aa amantaa kooti\n" +
            "Taawahidoodha daandiin abbootii\n" +
            "Gooftaan naaf kennee Maariyaam harmeen naaf haadha kootii\n" +
            "Anoo hin gatu anoo hin ganu daandii abbootii               \n\n" +
            "Warri gananii qaoata badanii              \n" +
            "Ammas ni jiru sobduun baay’eenii            \n" +
            "Irraa na eegii ati waaqa koo            \n" +
            "Maaloo na cimsii amantaa kan koon\n\n" +
            "Karaan qajeelaan daandiin ganamaa\n" +
            "Taawahidoodha amaantain dhugaa\n" +
            "Duraian kan jirtuu ammas ishumaa\n" +
            "Nutoo hin feenuu Amantaa biraa       \n      \n" +
            "Lakkii yaa namaa mee qalbeeffadhuu             \n" +
            "Karaa ishee sirrii duraa gaafadhuu            \n" +
            "Hin gowwoominaa lakki namootaa            \n" +
            "Taawaahidoodha daandiin qulqullootaa\n\n" +
            " Irraa ofi eegaa lakki yaa namootaa\n" +
            "Ammas ni jiruu raajooni sobdootaa\n" +
            "Jedhee dubbatee waaqni waaqotaa\n" +
            "Walii haa gaafannu maaloo namootaa\n";

    String title = "Tawaahidoodha";

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