package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BueeJedhaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Bu'ee jedhaa ....hoy ×2\n" +
            "Kiristanni hundi..........hoy\n" +
            "Ilillii jedhaa............hoy\n" +
            "Gooftaan keenya...........hoy\n" +
            "Uumaan Addunyaa...........hoy\n" +
            "Waaqni na nageenya........hoy\n" +
            "Garaa laafessa............hoy\n" +
            "Sagaleesaa ni dhageenyaa\n" +
            "Duumessaa ifu keessa\n" +
            "Kuno ifti bu'e nufisoo ni ife\n\n" +
            "Yaa'iqob yohaanis.........hoy\n" +
            "Akkasumas pheexiroos......hoy\n" +
            "Waaqayyoon argan..........hoy\n" +
            "Muusee fi Eeliyaas........hoy\n" +
            "Abbaanis jedhe............hoy\n" +
            "Ilmakoo dhagahaa..........hoy\n" +
            "Jecha koodhahoo...........hoy\n" +
            "Kanan dhale...............hoy\n" +
            "Sagaleesaa ni dhageenyaa\n" +
            "Duumessaa ifu keessa\n" +
            "Kuno ifti bu'e nufisoo ni ife\n\n" +
            "Debre taaboritti..........hoy\n" +
            "Ifni mul'ate..............hoy\n" +
            "Tulluu qulqulluu..........hoy\n" +
            "Kan gammachiise...........hoy\n" +
            "Nagaa nagaa ..............hoy\n" +
            "Tulluu tabor..............hoy\n" +
            "Ifti waaqummaa............hoy\n" +
            "Sirratti ifee.............hoy\n" +
            "Sagaleesaa ni dhageenyaa\n" +
            "Duumessaa ifu keessa\n" +
            "Kuno ifti bu'e nufisoo ni ife\n\n" +
            "Itoophiyaanonni...........hoy\n" +
            "Seenaa qabeeyyii..........hoy\n" +
            "Aadaa isaanii.............hoy\n" +
            "Calaqqisiisan.............hoy\n" +
            "Xonbora ibsanii...........hoy\n" +
            "Akka abbootasaanii........hoy\n" +
            "Icciitii waan qabuuf .....hoy\n" +
            "Sin haa gammachiisu.......hoy\n" +
            "Sagaleesaa ni dhageenyaa\n" +
            "Duumessaa ifu keessa\n" +
            "Kuno ifti bu'e nufisoo ni ife\n\n" +
            "Bartootasaatiif............hoy\n" +
            "Afuura erge................hoy\n" +
            "Itoophiyaan hundi..........hoy\n" +
            "Kennaanshee guute..........hoy\n" +
            "Bu'e jedha ................hoy×2\n" +
            "Kiristaanni hundi .........hoy\n" +
            "Ilil jedha.................hoy \n" +
            "Sagaleesaa ni dhageenyaa\n" +
            "Duumessaa ifu keessa\n" +
            "Kuno ifti bu'e nufisoo ni ife\n\n" +
            "Waggaan ayyaan waggaa......Dabalataa\n" +
            "Ayyaan waggaa..............Dabalataa\n" +
            "Mana abbaa keenyaa.........Dabalata\n" +
            "Ayyaan waggaa..............Dabalataa\n" +
            "Eebbi Waaqa haa seenuu.....Dabalataa\n" +
            "Ayyaan waggaa..............Dabalataa\n" +
            "Mana harmee keenyaa........Dabalataa\n" +
            "Ayyaan waggaa..............Dabalataa\n" +
            "Eebbi waaqaa haa seenu.....Dabalataa\n" +
            "Dammii fi Aannanii.........Dabalataa\n" +
            "Itti nuuf haa roobuu.......Dabalataa\n" +
            "Ayyaan waggaa .............Dabalataa\n\n" +
            "Akkuma jirruuni............Ameen\n" +
            "Utuu nu hin qoodiin........Ameen\n" +
            "Kiristoos mirgaasaa........Ameen\n" +
            "Nun haa dhaabu.............Ameen\n" +
            "Dhaaltuu mootummaasaa......Ameen\n" +
            "Nu haa taasiisuu...........Ameen\n" +
            "Waggaasaas nagaadhaan......Ameen\n" +
            "Nuun haa ga'uu.............Ameen\n\n" +
            "Qulqulluu Ergamootaa\n" +
            "Qulqulluu tolootaa\n" +
            "Eebbi Waaqayyo Mana hunda haa seenuu\n" +
            "Mana hundaa×2 \n" +
            "Eebbi waaqaa\n" +
            "Haa seenu.\n" +
            "Ameen Ameen Ameen!!!\n";

    String title = "Kiristoos ka’eera du’aatii";

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