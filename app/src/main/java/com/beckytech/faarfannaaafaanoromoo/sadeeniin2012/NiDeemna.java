package com.beckytech.faarfannaaafaanoromoo.sadeeniin2012;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NiDeemna extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ni deemna Gishee Maaramii \n" +
            "Waqayyoo keenya nutti araaramii\n" +
            "Ni deemna ni deemna     Gisheen Maaramii\n" +
            "Ni deemna ni deemna                '\"\"            '\"\"\n" +
            "Namni achi deemee                '\"\"            '\"\"\n" +
            "Akka daa'imummaa                '\"\"            '\"\"\n" +
            "Ta'eetoo Argamaa                    '\"\"            '\"\"\n" +
            "Waadaa waqayyootin                '\"\"            '\"\"\n" +
            "Fayyina Fannootin                      '\"\"            '\"\"\n" +
            "Diina ni moo'anna                        '\"\"            '\"\"\n" +
            "Dhigni isaa lola'e                            '\"\"            '\"\"\n" +
            "Fannoo irraa yaa'ee                '\"\"            '\"\"\n" +
            "Achitti argama                          '\"\"            '\"\"\n" +
            "Fannoon kiristoos                   '\"\"            '\"\"\n" +
            "Kanaafu ni deemna               '\"\"            '\"\"\n" +
            "Eebbaa achi arganna               '\"\"            '\"\"\n" +
            "Ni deemna Gishee Maaramii \n" +
            "Waqayyoo keenya nutti araaramii\n" +
            "Ni deemna ni deemna     Gisheen Maaramii\n" +
            "Ni deemna ni deemna                '\"\"            '\"\"\n" +
            "Gisheen dabra kibren              '\"\"            '\"\"\n" +
            "Gaararratti argama                '\"\"            '\"\"\n" +
            "Laafti iddoo sanaa                 ''''               ''''\n" +
            "Fannoo iyyesuusin                '\"\"            '\"\"\n" +
            "Isaan fakkeefama              '\"\"            '\"\"\n" +
            "Ergama uraa'el                '\"\"            '\"\"\n" +
            "Achitti ergame                '\"\"            '\"\"\n" +
            "Daachee biyyaa sanaa     ''''         ''''\n" +
            " Dhiiga Gooftaatin              '\"\"        ''''\n" +
            "inni qulqulleesse.         ''''              ''''\n" +
            "Namni achi deeme                '\"\"            '\"\"\n" +
            "Sanyiinsaa hundinuu            '\"\"            '\"\"\n" +
            "Dhiifama argataa                '\"\"            '\"\"\n" +
            "Araara waaqayyoon                '\"\"            '\"'\n" +
            "Galimee samirraati                  ''''             ''''\n" +
            "Maqaan isaa wamamaa           ''''         ''''\n" +
            "Ni buuna biyya Abbaa Taklee\n" +
            "Waaqharkee fi Diina hundumtuu gannee\n" +
            "Ni buuna ni buuna        biyya Abbaa Taklee\n" +
            "Ni buuna ni buuna                '\"\"            '\"\"\n" +
            "Namni achi bu’e                '\"\"            '\"\"\n" +
            "Fayyina argataa                '\"\"            '\"\"\n" +
            "Qorumsi Seexanaa                '\"\"            '\"\"\n" +
            "Namarraa salphataa                '\"\"            '\"\"\n" +
            "Wanti nu dhiphisuu                '\"\"            '\"\"\n" +
            "Nurraa ni baqataa               '\"\"            '\"\n" +
            "Ni buuna biyyaa Abbaa Takilee\n" +
            " Ni buuna biyya Abbaa Taklee\n" +
            "Waaqharkee fi Diina hundumtuu gannee\n" +
            "Ni buuna ni buunaa      ''''             '''''\n" +
            "Nuti yoo amannee         ''''               ''''\n" +
            "Xabala isaatii                '\"\"            '\"\"\n" +
            "Diinni nu gadhiisu                '\"\"            '\"\"\n" +
            "Takliyyee yoo waamnu                '\"\"            '\"\"\n" +
            "Humnoonni Daabiloosii                '\"\"            '\"\"\n" +
            "Aangoo waaqayyoottin                '\"\"            '\"\"\n" +
            "Hundii nu gadhiisuu                '\"\"            '\"\"\n" +
            "Ni deemna Qullubbii Gabri'eel\n" +
            "Biyyaa erigamaa egumsaa ketiin situ beekamaa\n" +
            "Ni deemna ni deemna      Qullubbii Gabri'eel\n" +
            "Ni deemna ni deemna                '\"\"            '\"\"\n" +
            "Achi deemuu keenyan                '\"\"            '\"\"\n" +
            "Rakkoo ni daganna                '\"\"            '\"\"\n" +
            "Yeroo dhiphanneettis                '\"\"            '\"\"\n" +
            "Nut isa waammanna                '\"\"            '\"\"\n" +
            "Ergama Gabri'eel                '\"\"            '\"\"\n" +
            "Ergamaa gammachuu                '\"\"            '\"\"\n" +
            "Yeroo rakkaneetti                '\"\"            '\"\"\n" +
            "Nut sii farfaachuu                 '\"\"            '\"'\n" +
            "Ni deemina qullbbii gebri'eel \n" +
            "Biyyaa ergamaa egumisaa ketin situu beekama\n" +
            "Ni deemina ni deemina qullubbii gebri'eel\n" +
            "Ni deemina ni deemina         ''''           ''''\n" +
            "Manasa yoo deemne                '\"\"            '\"\"\n" +
            "Isatti yoo boonyee                '\"\"            '\"\"\n" +
            "Inni nuuf dhagaha                '\"\"            '\"\"\n" +
            "Diinas ni fonqolchaa              '\"\"            '\"\"\n" +
            "Erigamaa gachanaa               ''''              ''''\n" +
            "Ani siin ammana                    '''                '''  \n \n" +
            "               F/taa Dn Mankir Girmaa      \n";

    String title = "Ni deemna";

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