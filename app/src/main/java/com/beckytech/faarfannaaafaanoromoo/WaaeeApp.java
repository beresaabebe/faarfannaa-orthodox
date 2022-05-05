package com.beckytech.faarfannaaafaanoromoo;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class WaaeeApp extends OptionsMenuActivity {

    TextView textContents, textTitle;
    ImageView imageView;
    String contents = "<p style='text-align:justify;'>Faarfannaa haaraadhaan waaqayyoon faarfadhaa," +
            " guutummaan biyyaa lafaas waaqayyoon faarfadhaa. (Far.97:1).</p> " +
            "<p style='text-align:justify;'>Akkumaa mootichi Daawit jedhee faarfatee, nuttis bakka deemu hundaatti yeroo amma kana" +
            " Kitaaba baanne hangaa deemu irra mobiyilii keenya qabannee deemna waan ta'eef, App'n kunis" +
            " kanumaa sababeeffachuun akka salphaafi namatti tolun faarsaa <b>150</b> ol kan ta'ee haalla" +
            " tarreeffama qubeen jechunnis (A-Z) faarsaa jiran baay'inaan namni hedduun kan beeku, " +
            "baratootni yuunivarsitti adda addaa kan isaan fayyadaman waliitti qindeessun isiin biraan" +
            "akka ga'amuuf app'n kun qoopha'e.</p>" +
            "<p style='text-align:justify;'>Waaqayyo yeroo hundaa haaraadha. Kanafidhaa Raajichi Ermiyaas" +
            "<i> Barii barii haaraadhaa amaanamummaan isaa baay'eedhaa</i> kan jedhe. Biyyaa lafaarraa watootni" +
            " jiraan baay'een isaannii irraa deddeebidhaa waaqayyoo garuu yeroo hundaa haaraadha. Nuus waaqa yeroo " +
            "hundaa haaraa ta'eetti yeroo siqnu haaraa tanna.</p>" +
            "<p style='text-align:justify;'>Qulqulluun Phaawuloos (Qor.5:17) irratti <i> Kanaafis namni" +
            " kan Kiristoos yoo ta'e, uumama haaraadha inni moofaan darbe, kunoo, inni haaraan dhufeera.</i>" +
            " Waaqayyoo waan haaraa jaallata. Gooftaan eenyu iyyuu kan itti hin awwaalamnee awwaala haaraatti" +
            " awwaalame. (Mat. 27:60). Guyyaa gaafaa Hoosayinaas ilmoo haaree enyuu iyyuu irraa hin teenyee" +
            " irraa ta'uun ulfinaan gara Iyyeerusaalem gale. (Luk. 19:30).</p>" +
            "<p style='text-align:justify;'>Kannaaf jaallatamtoota maatiiwaan waaqayyoo nuus laphee haaraan, afuuraa haaraan sammuu haaraan " +
            "kannee waaqa haa galateffannu. Qooqa garaa garaatiin, faarfannaa galataatiin weedduu afuraatiinis wal harkaa fuudhaa! " +
            "Garaa keessan keessatti faarfachaa galata gooftaa dhageessisa! (Efe. 5:19)</p>" +
            "<p style='text-align:justify;'>Dhuma irrattis app'n kun akka inni baay'ee isin gargaruu abdii qabna. Waaqayyon bakka jirtaan biyyaa jirtaan " +
            "hundaatti isin haa eebbisuu. <i> Isin keessa namni rakkinni itti dhufe jiraa?, " +
            "inni haa kadhatu! Namni gammadu immoo jiraa? inni immoo faarfannaadhaan galata haa dhiyeessu. (Yaiq. 5:13)</i></p>" +
            "<p style='text-align:justify;'> <b>Galanni Waaqayyof haa ta'u! Waaqayyoon Faarfannaan nuu haa eebbisuu!</b></p>";

    String title = "  Yaada App'n Waal qabsisnee   ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galata);
        textContents = findViewById(R.id.textContents);

        initUI(title);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textTitle = findViewById(R.id.textTitle);
        textTitle.setText(title);

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N) {
            textContents.setText(Html.fromHtml(contents,Html.FROM_HTML_MODE_COMPACT));
        }
        else {
            textContents.setText(Html.fromHtml(contents));
        }

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(view -> {
            Toast.makeText(WaaeeApp.this, "Share me, let other know about me!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo");
            intent.putExtra(Intent.EXTRA_TEXT, "Download this useful app's from Google play \n https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo");
            startActivity(Intent.createChooser(intent,"Share app's link via "));
        });

    }

    @Override
    public void onBackPressed() {
        WaaeeApp.this.finish();
    }
}