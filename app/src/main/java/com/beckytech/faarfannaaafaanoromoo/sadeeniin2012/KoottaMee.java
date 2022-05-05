package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KoottaMee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kootta mee ni deemina(3) \n" +
            "Gabra manfasqiddusii bakka inni dhaabbate\n\n" +
            "Leencootaf Qeerrensa eegaa isaa godhatee\n" +
            "Waggaa 100 mataadhaan dhaabbatee\n" +
            "Kan cubbuu hojjetee dhiifama argatee\n" +
            "Saba itiyoophiyaaf waaqayyo kadhate\n" +
            "Abboon Abbaa keenya inni nu jaallatte       \n  \n" +
            "Kootta mee ni deemna(3) \n" +
            "Gabra manfasqiddusii bakka inni dhaabbate\n\n" +
            "Kadhanna isaatin lubbuuwwan boqatee\n" +
            "Uummata itiyoopiyaa Gibtsirra filatee\n" +
            "Abboon Abbaa keenya inni nu jaalatee\n" +
            "Waa’ee cubbuu keenyaf waaqayyoo kadhatee\n\n" +
            "   Kootta mee deemnee yaa deemnuu\n" +
            "   Tsadqaannee maaram yaa geenyuu\n\n" +
            "Lafa  Eebbifamtuu maaram qulqulleetti\n" +
            "Haadha waaqayyoodha yaa garaa lafeetti\n" +
            "Nuti si waamanna yaa haadha namooti\n" +
            "Harmee waaqayyoodha biqiltuu Gannati\n\n" +
            "      Kootta mee deemnee yaa deemnuu\n" +
            "      Tsadqaannee maaram yaa geenyuu\n\n" +
            "Si waamachaa jirraa dhaloonni hundumtii\n" +
            "Ati nuuf kadhadhuu yaa haadha nageettii\n" +
            "Cubbuun keenya fayyee biyya lafarratti\n" +
            "Ilma kee nuf kadhadhu maaram qulqulleetti\n" +
            "Yaa waadaa araara kidaaneemihiratii   \n    \n" +
            "Nuti si waamanna(2)  \n" +
            "maaram si kadhanna    \n   \n" +
            "Yeroo gammachuu fi yeroo dhiphanneetti       \n" +
            "Ati nuuf birmadhuu kidaaneemihiratii       \n" +
            "Qorumsi bayyatee biyya lafaarratti\n" +
            "Nu yaadadhu ati galmee samiirratt\n" +
            "Ati nu jajjabeesi yeroo dhiphannetti\n" +
            "Haati keenya dhugaa ishee samiirratii\n\n" +
            "    F/taa Dn Mankir Girmaa\n";

    String title = "Kootta mee";

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