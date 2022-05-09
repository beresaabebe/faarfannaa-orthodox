package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IshooGooftaanNuuDhalateQorichiKeenya extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ishoo Gooftaan Nuu Dhalate Qorichi Keenya/2/\n" +
            "Ifni addunya dhalateera ifni addunya hunda/2/\n\n" +
            "Raajoni raajani waa’ee dhaloota isaa\n" +
            "Dinqisifachudhaan foon namaa uffachu isa\n" +
            "Qulqullooni gooftaa abdiidhaan jiraatan\n" +
            "Kan Addaamif gale waadaa yaadachuudhaan\n\n" +
            "Addaamin deebisuuf gara jireenyaatii\n" +
            "Akka bade hin hafne biyya lafaa irratti\n" +
            "Angoo irraa gad-bu’ee jaalalaaf bitame\n" +
            "Dallaa keessa ciise huccudhaan marame\n\n" +
            "Yakka keenya ilaale waaqni nu hin dhiisne\n" +
            "Tokkicha ilma isaa dabarsee nuu kenne\n" +
            "Jaalalli isaa guddaan hammana hin jedhamu\n" +
            "Jecha ilmaan namaan himamee hin dhumu\n";

    String title = "Ishoo Gooftaan Nuu Dhalate Qorichi Keenya";

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