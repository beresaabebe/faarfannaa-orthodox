package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NiCuuphameIyyesuus extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ni cuuphame Iyyasuusii Yohaannisiin Yoordanoositti\n" +
            "Arganneerra bilisummaa kan nuuf kenne Ilma Waaqayyootii\n" +
            "\n\n" +
            "Samii irraa gadi bu’ee-Harka Yohaannisiin   \n" +
            "Yoordaanoos keessatti- Ni cuuphame Gooftaan     \n" +
            "Garbicha seexanaa-Garbitti ta’uun    \n" +
            "Iyyasuusiin hafe-Humna waaqayyoon\n" +
            "\n\n" +
            "Gammoojjiitii dhufee-Yohaannis lallabe\n" +
            "Qalbii jijjirradhaa-Afuuraan jiraadhaa\n" +
            "Karaa kan sirreesse-Ilma Waaqayyoof\n" +
            "Inni anarra caaluu-Isin cuupha Afuuraan\n" +
            "\n\n" +
            "Lammata dhalanne-Bishaanii fi Afuuraan    \n" +
            " Deebi’ee jiraachuuf – Laphee Amantiidhaan     \n" +
            "Sanyiin Addaam hundaa-Bilisummaa qabna      \n" +
            "Fayyina arganne-Addunyaaf lallabna\n" +
            "\n\n" +
            "Mootummaan waaqayyoo-Nutti dhihaateera\n" +
            "Qulqulluu Yohaannis - Jedhee barsiiseera\n" +
            "Amantiif Gooftaaniis-cuuphaanis tokkicha\n" +
            "Isatti jabaadhaa – Amantiitti cichaa\n" +
            "\n\n" +
            "Ijoolleen Waloomaa -Takka amanneerra      \n" +
            "Barumsa keessummaa-Nuti ciigaaneerra      \n" +
            "Nuuf galeetu malee-Jaalalli Goofticha      \n" +
            "Callisnee hin deemnu-Bitnetu baricha\n" +
            "\n\n" +
            "Ilma Abbaa eebbifamaa – Dhiifama kan laattu\n" +
            "Akka Melketsediq – Luba bara baraa\n" +
            "Dhiifama nuuf godhi – Jedhiitii na cuuphi\n" +
            "Gooftaan ni dubbate – Yohaannis cuuphaatti  \n";

    String title = "Ni cuuphame Iyyasuusii Yohaannisiin Yoordanoositti";

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