package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NuFayyisudhaf  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nu fayyisudhaf Kan dhalate Amanu’elidha/2/\n" +
            "Kan dhalate/4/ Amanu’eli\n" +
            "Durbeerraa dhalate nu fayyisera Kansa tanerra /2/\n\n" +
            "Nuu fayiserra/4/ Kansa tannera\n" +
            "At yaa sexanna dinna kenyaa nurra fagadhu/2/\n" +
            "Dinna kenyaa/4/ nurraa fagadhu\n\n" +
            "Goftan jabbese nu dhaberaa garaa kutadhu/2/\n" +
            "Nuu dhaberaa/2/ garaa kutadhuu\n\n" +
            "Dhigaan nu bitee nu olchatera harka dinnarra/2/\n" +
            "Nuu olchatera/4/ harka dinnara\n\n" +
            "Gooftan barbade nu wammera sii harka bannerra (2)\n" +
            "Nuu wammerra/4/ sii harka bannera\n\n" +
            "Ergaman mika’el nuuf dhuferaa sii moo’annera(x2)\n" +
            "Nuuf dhuferra x4 sii mo’annera\n\n" +
            "Ergaman gabri’el abidarra nu olchatera/2/\n" +
            "Abidarra/2/ nu olchatera\n\n" +
            "Nuu fayyisudhaf kan dhalate amanu’elii/2/\n" +
            "Kan dhalate/4/ amanu’elii\n\n";

    String title = "Nu fayyisudhaf Kan dhalate Amanu’elidha";

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