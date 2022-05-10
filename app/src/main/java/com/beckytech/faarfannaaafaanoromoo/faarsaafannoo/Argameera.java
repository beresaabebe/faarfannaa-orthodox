package com.beckytech.faarfannaaafaanoromoo.faarsaafannoo;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Argameera extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Argameera (Fannoon Gooftaa *2)\n" +
            "Iliil jedhaa yaa namootaa\n" +
            "\uD83C\uDF39✝\uD83C\uDF39     \uD83C\uDF39✝\uD83C\uDF39\n" +
            "Argameerra     Yihudoonni inaaffan\n" +
            "        >>             Waliin mari'aatan\n" +
            "        >>             Fannoo isaas dhoksuufi\n" +
            "        >>             Kosii itti guraanii\n" +
            "        >>             Waggoota hedduudhaf\n" +
            "        >>             Dhokaate tureerra\n" +
            "        >>             Fannoon Kiristoosii\n" +
            "        >>             Kunoo argameerra\n" +
            "\uD83C\uDF39✝\uD83C\uDF39\n" +
            "Argameerra     Kan dhokate hafu\n" +
            "        >>            Itti fakkachuudhan\n" +
            "        >>            Fannoo isaa dhoksaani\n" +
            "        >>            gataa itti guurudhan\n" +
            "        >>            Dhokate hin hafne\n" +
            "        >>            Fannoon argameera\n" +
            "        >>            Diinnis leeyya'eera\n" +
            "        >>            Nutis gammanneera\n" +
            "\uD83C\uDF39✝\uD83C\uDF39\n" +
            "Argameerra      Mootiitiin Illeennii\n" +
            "        >>             Hawwiin eegaa turtee\n" +
            "       >>              Fannoo Kiristoosii\n" +
            "       >>              Kadhannan argatte\n" +
            "       >>              Kan ittin mo'aannu\n" +
            "       >>              Fannoon nuuf gachanna\n" +
            "       >>              Kunoo nuuf argamee\n" +
            "       >>              Gammachuun faarfanna\n" +
            "\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
            "✝✝✝✝✝✝✝✝✝\n" +
            "Fannoon Gooftaa (humna keenya*2)\n" +
            "Ittiin moonaa diina keenya\n" +
            "\uD83C\uDF39✝\uD83C\uDF39\n" +
            "Fannoon Gooftaa     Jaalala fannootin\n" +
            "           >>                   Inni booji'amee\n" +
            "           >>                   Qabatee yoo deemus\n" +
            "           >>                   Diinan yoom moo'amee\n" +
            "           >>                   ta'e nuuf gaachana\n" +
            "           >>                   mallattoo nageenyaa\n" +
            "           >>                   kan ittin moo'annu\n" +
            "           >>                   Fannoon humna Keenya\n" +
            "\uD83C\uDF39✝\uD83C\uDF39\n" +
            "Fannoon Gooftaa Dhiigni gooftaa keenyaa    \n" +
            "       >>                   Irratti kan cobee\n" +
            "       >>                   Irraa nu faggeessuuf\n" +
            "        >>                  Diini yoo nu sobee\n" +
            "        >>                  Dhugaarraa hin maqnuu   \n" +
            "        >>                  Ittiin jabaannerraa\n" +
            "        >>                  Fannoo Kiristoosii\n" +
            "         >>                 Humna arganneerraa\n" +
            "\uD83C\uDF39✝\uD83C\uDF39\n" +
            "Fannoon Gooftaa Jechi fannoo Gooftaa\n" +
            "      >>                     Gowwootaaf badiidha\n" +
            "       >>                   Nu warraa amanuuf\n" +
            "       >>                   Garuu fayyiinaadha\n" +
            "      >>                    Dhibamaa Fayyisa\n" +
            "      >>                    Humni fannoo Gooftaa\n" +
            "      >>                    Diina ittiin moonaa\n" +
            "      >>                    Amanaa namootaa\n" +
            "           ==|==\n" +
            "\uD83C\uDF39❤️\uD83C\uDF39\n" +
            "Faarfattoota sadiin\n" +
            "\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
            "F/taa Dn Yeroosan Asaffaa\n" +
            "F/ttuu Maskaram Xilaayee\n" +
            "F/taa Koo'eel Shawaa\n" +
            "\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n";

    String title = " Argameera Fannoon Gooftaa ";

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