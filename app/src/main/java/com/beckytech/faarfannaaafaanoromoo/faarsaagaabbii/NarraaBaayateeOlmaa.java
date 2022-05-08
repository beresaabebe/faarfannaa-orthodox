package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NarraaBaayateeOlmaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Narraa baay'atee olmaa kee maalinan baasa(×2)\n" +
            "Iyyesus jennaan maqaan kee du'otaa kaasaa\n" +
            "Yoomu hin callisuu galataan siif dhangalsaa\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Namnii jalqabaa hawwidhaan seera kee  cabsee\n" +
            "Ilmaan namoota hundumaa du'atuu marsee\n" +
            "Harkaa isaa mirgaa samirraa gad nuuf dirirsee\n" +
            "Ilmii waqayyoo iyyesus jirenyaa labsee\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Atoo ni qabdaa ulfinaa abbaan walqixxatee\n" +
            "Waqummaa keetif gaalanaf tullutuu hollatee\n" +
            "Xalayaa du'aa cuphaa keen barbadessitee\n" +
            "Waadaa nuuf sentee dhigaa keen mirkanessitee\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Fannoo kee ilalee dhigaa kee rooben yaadadhaa\n" +
            "Waan darbuuf jedhee olmaa kee maafan dagadhaa\n" +
            "Iyyesus jedhee si waamu maafan salfadhaa\n" +
            "Bara koo guutu maqaa kee sinaan dhadadhaa\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Yakkaaf cubbuun koo baay'atee yoo ta'ees dachaa\n" +
            "Naa ceesistettaa naaf taate dandiif riqichaa\n" +
            "Maaqan kee iyyesuus naaf ta'ee fajjii mo'ichaa\n" +
            "Enyuut naa dhorkaa ulfinaa keef naan ililchaa\n";

    String title = " Narraa baay'atee olmaa kee maalinan baasa ";

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