package com.beckytech.faarfannaaafaanoromoo.lameen2011;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class TikseeGaariidhaAti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Tiksee gaariidha ati Tiksee hin daganne\n" +
            "Yaa uumaa umamtoota nuti si Abdannee\n" +
            "Ammas nuu tikfaadhu yaa Abbaa Jaalalaa(2)\n\n" +
            "Tiksee Gaarii ta'ee jaalalaan nu tiksuuf\n" +
            "Ofitti nuu qabee inni nuu kunuunsuuf\n" +
            "Cubbuu hunda keenyaa isatu nuu dhisee\n" +
            "Madaa hunda keenyas isatu nuu gogsee       \n   \n" +
            "Gooftaa Iyyesuus maaloo nuu Eebisii\n" +
            "Yaa waaqayyoo uumaa ati nu fayyisii\n" +
            "Mana kee keesaatti akka nuti hin badnee\n" +
            "Ati nuu yaadadhu akka kufne hin hafnee       \n     \n" +
            "Yeroo Rakkoo keenyaa inni nuu gaafataa\n" +
            "Dhiphinaa keessayiis inni nuu Baafataa\n" +
            "Abbaa gaarii qabna Amanaa yaa nama\n" +
            "Nama hin dagatu inni hamma dhumaa\n\n" +
            "                 F/ta Geetahun Shawaa(Koo'el)\n";

    String title = "Tiksee gaariidha ati";

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