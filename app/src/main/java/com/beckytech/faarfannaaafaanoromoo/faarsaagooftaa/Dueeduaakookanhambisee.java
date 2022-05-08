package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Dueeduaakookanhambisee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Du'ee du'aa koo Kan hambisee\n" +
            "Nagaa naaf labsee×2\n" +
            "Arsaa Abrahamii ~~~Eyyee\n" +
            "Nutii hin fayyinee~~~~Eyyee\n" +
            "Jaalalaa waaqayyo ~~~Eyyee\n" +
            "Kan ijjan arginee ~~~~Eyyee\n" +
            "Guyyansaa yoo gahuu~~~Eyyee\n" +
            "Durberaa Dhalatee~~~~Eyyee\n" +
            "Fannorraa kan olee ~~~~Eyyee\n" +
            "Fayyinaa nuuf latee~~~~Eyyee\n\n" +
            "Fannooti ol bahee nuuf dhiphatee\n" +
            "Nuu fayyifatee×2.\n" +
            "Akka umamatii~~~~~Eyyee\n" +
            "Goftan ilalamee ~~~~Eyyee\n" +
            "Dhigasaan naa bitee~~~~Eyyee\n" +
            "Nagan naaf labsamee~~~~Eyyee\n" +
            "Gidiran Waqaa koo ~~~~~Eyyee\n" +
            "Anati mul'ataa ~~~~~Eyyee\n" +
            "Dandin jirenyaa koo~~~~Eyyee\n" +
            "Isan naaf mijjataa~~~~Eyyeee.\n\n" +
            "Uummamni hundumtuu sii faarfataa\n" +
            "Nuuf dessee goftaa×2.\n" +
            "Duran kan yaddamtee ~~~~Eyyee\n" +
            "Yaada abba keessatti ~~~~Eyyee\n" +
            "Hatii Amanu'el ~~~~Eyyee\n" +
            "Nafis hadhaa kotii~~~~Eyyee\n" +
            "Atii midhaginaa koo~~~~Eyyee\n" +
            "Yaa durbee hadhaa koo~~~~Eyyee\n" +
            "Akka jedhan miti ~~~~Eyyee\n" +
            "Naaf kadhuu goftaa koo~~~~Eyyee\n\n" +
            "Uummamnii hundumtuu sii faarfataa\n" +
            "Nuuf dessee goftaa\n" +
            "Du'ee du'aa koo kan hanbisee\n" +
            "Nagaa naaf labsee.\n" +
            "Durbee Maariyaami qulqulletti\n" +
            "Mi'oftu yaa hadhaa motii×2\n" +
            "Mi'ofituu ~~yaa hadhaa motii\n" +
            "Mi'oftuu ~~~yaa hadhaa motii\n" +
            "Ummamnii hunduu sii wammataa \n" +
            "Waqayyoon situu kadhataa ×2\n" +
            "Waqayoon ~~~situu kadhataa\n" +
            "Waqayoon ~~~situu kadhataa\n" +
            "Mallatodhaa Biyyaa kenyaa \n" +
            "Tawahidoon Amantaa dhugaa×2\n" +
            "Tawahidoon ~~~ Amantaa dhugaa\n" +
            "Tawahidoon ~~~Amantaa dhugaa\n" +
            "Fuula waqaa ni dhabataa Gabri'eel nu'if kadhataa×2\n" +
            "Gabri'eel ~~~nu'if kadhataa\n" +
            "Gabri'eel ~~~nu'if kadhataa\n" +
            "Kan gargartee Isra'elii mika'el kotu araranii×2\n" +
            "Mikaa'el ~~~~ kotuu araranii\n" +
            "Mika'el ~~~~kotuu araranii\n" +
            "Kiristoosin amanamtee \n" +
            "Arseman kinoo nuuf dhuftee×2\n" +
            "Arseman ~~~~ kinoo nuuf dhuftee\n" +
            "Arseman ~~~~kinoo nuuf dhuftee\n" +
            "Lafaratii kan dhalatee yohanis Enyuu Akki Kee×2\n" +
            "Yohanis ~~~~enyuu Akkii kee\n" +
            "Yohanis ~~~~enyuu Akkii kee\n" +
            "Waregamaa giyoorgisi \n" +
            "Nuuf kotuu maloo hardhasii×2\n" +
            "Nuuf kotuu ~~~~ maloo hardhasii\n" +
            "Nuuf kotuu ~~~~maloo hardhasii\n" +
            "Kan kabajee qulqulotaa ni argata tolotaa×2\n" +
            "Nii Argataa ~~~~ Gatii tolotaa×4..\n";

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