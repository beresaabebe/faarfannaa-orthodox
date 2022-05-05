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

public class GalmaKoo extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Galma koo galgala iddoo boqonnaa koo\n" +
            "Iyyesuus si waama Abbaa gaafa rakkoo\n" +
            "Galana gargaar hirtee karaa keessa naa baaste\n" +
            "Iyya koo dhaggeeffatte eebba naratti harcaafttee\n" +
            "         \t\tCeesisa\n" +
            "Karaa jireenya kooti bakka dhibaayyuu lubbuu\n" +
            "Humna kee narraa guuree danqaraaf tuulaa cubbuu\n" +
            "Si waaqessaa Abbaa koo qulqulloota faana hiriiree\n" +
            "Dadhabaa harka ormaan cabee sito dhufe na furee\n" +
            "         \t\tCeesisa\n" +
            "Konkolaataa koo si'idha kanan diina ittin loluu\n" +
            "Maqaa kee waamu malee adeemuun natti  tolu\n" +
            "Surraa kee uffadheen deema sila hin jiru mitiree\n" +
            "Bakka Tikeerraa waamtee siti maqaa naaf jijjiiree\n" +
            "         \t\tCeesisa\n" +
            "Duula narratti ka'ee walgahii warra gantuu\n" +
            "Eenyutu nati cufaree karra ati naaf bantuu\n" +
            "Dachaati sigigaata malee kattaatu tatarsa'a\n" +
            "Ati jennan Iyyesuus ani galma koon ga'a\n" +
            "         \t\tCeesisa\n" +
            "Ilaalchi nama cabsee biyyooti na dabaluu iyyuu\n" +
            "Jecha keen qajeelfamni Gooftaa eenyun hin fayyuu\n" +
            "Boolla dinni naa qoote isumaaf taasisteeree\n" +
            "Mootummaa kee naaf qoddee situ funcha narra ciree\n";

    String mezmurTitle = "55. Galma koo";

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