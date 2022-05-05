package com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GalaanaDhaabe extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Galaana dhaabee sagaleen kee/2/\n" +
            "Ergamaa Mikaa’el guddaadha aangoon kee\n" +
            "\n\n" +
            "    Galaana dhaabee Biyya Gitsii keessaa\n" +
            "                “          “        Israa’eliin baasee\n" +
            "                “          “        Loltoota fari’oon            \n" +
            "                “         “         Galaanan dabarsee\n" +
            "                “         “         Mannaa kan nu sooru\n" +
            "                “         “         Bishaan kattaa yaasee\n" +
            "                “         “         Iyyaasuuf kaaleebin\n" +
            "                “         “         Kana’aanin galchee\n" +
            "\n\n" +
            "Dursii nu duraa Mikaa’eli\n" +
            "Gaggeessaa kan turtee saboota Israa’elii\n" +
            "Dursii nu duraa Biyyi keenya as mitii\n" +
            "           “               “      Karaa fagootu jiraa\n" +
            "           “               “      Akeeka seexanaa\n" +
            "           “               “      Dhabamsiisi nurraa\n" +
            "           “               “      Hirkoo Afoomiyaa\n" +
            "           “               “      Gargaaraa Daani’eeli\n" +
            "           “               “      Hangafa ergamootaa\n" +
            "           “               “      Koottu Mikaa’elii\n" +
            "\n\n" +
            "Abidda dhaamse sagaleen kee\n" +
            "Ergamaa Gaabri’eel guddaadha aangoon kee\n" +
            "Abidda dhaamsee Maamila waaqayyoo\n" +
            "            “              “          Cinaa kan dhaabbattu\n" +
            "            “              “           Ijoolonni sadan\n" +
            "            “              “           Raajiiisaa dubbatuu\n" +
            "            “              “           Iyyaluuxaaf Qirqoos\n" +
            "            “              “          Ni galateeffatu\n" +
            "      “               “           Kan afuura qabu\n" +
            "       “               “           Har’as haa faarfatu\n" +
            "\n\n" +
            "Nu faana ta’ii Gaabri’eeli\n" +
            "Gammachuu kan himte dhaloota Amaanu’eeli\n" +
            "           Nu faanata’ii Lola samiiti ka’ee\n" +
            "                     “          “   Kan tasgabbeessite\n" +
            "                     “         “    Jabinaan dhaabbataa\n" +
            "                     ”         “    Namni si waammatee\n" +
            "                     “         “    Mudaa kan hin qabne\n" +
            "                     “         “    Ergamaanageenyaa\n" +
            "                      “        “    Nu eegi nu tiksii\n" +
            "                      “        “     Bahaaf gala keenya \n";

    String mezmurTitle = "49. Galaana dhaabe";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbaaf_ilma);

        initUI(mezmurTitle);

        MobileAds.initialize(this, initializationStatus -> {
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textView = findViewById(R.id.textview);
        textView.setText(mezmur);

        textView.setOnLongClickListener(view -> {
            ClipboardManager clipboardManager = (ClipboardManager) getApplicationContext().getSystemService(Context.CLIPBOARD_SERVICE);
            clipboardManager.setText(textView.getText().toString());
            Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();
            return true;
        });

        textTitle = findViewById(R.id.textTitle);
        textTitle.setText(mezmurTitle);

        fabShare = findViewById(R.id.fabShare);
        fabShare.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, mezmurTitle);
            intent.putExtra(Intent.EXTRA_TEXT, mezmur);
            startActivity(Intent.createChooser(intent,"Share faarfannaa via "));
        });

    }


    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}