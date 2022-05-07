package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Jilbinfadhee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Jilbeenfadheen galata isaaf laadha\n" +
            "Haleeluyyaa maqaasan jajaadha\n" +
            "Kiyyoo diinaa keessa dhufee na barbaade\n" +
            "Anaaf du'a ture jireenya naaf laate \n" +
            "\n" +
            "   Ceesisa \n" +
            "\n" +
            "Guyoomsaa diinaatin an yeroon qabame\n" +
            "Bakka oolmaa jaraatti yamuuttin geeffame\n" +
            "Harkakoo na qabee harkaa na baaseera \n" +
            "Kiyyoo ishee caccabsee naan na dhuunfateera\n" +
            "   Ceesisa\n" +
            "Cubbuunkoo baayyate yeroo natti Marse\n" +
            "Waaqakoo   yoon jedhu afaanko ukkamsee\n" +
            "Gargaarsa keetini kunoo injifadheera\n" +
            "Gaarbichaa kee ta'e dhiifama argadheera\n" +
            "   Ceesisa\n" +
            "Badiikoo madaaluun du'a barbaadeera\n" +
            "Hiikee siitti himachuu itti leeyya'era\n" +
            "Kootaateetta jette ofittii na waamte\n" +
            "Qulqulluu obdiike geessite na dhaabde \n" +
            "\n" +
            "    Ceesisa \n" +
            "\n" +
            "Maal jedheen dubbadha seenako  isa darbee\n" +
            "Sito feedha keetin barbaade na agree\n" +
            "Narraa hin kutatini gargaarsa harka keeti\n" +
            "Halkaniifi guyya koo galata keeti\n";

    String title = "Jilbinfadhee";

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