package com.beckytech.faarfannaaafaanoromoo.acontents;

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
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AraarsituuMaariyaamii extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = " Araarsituu Maariyaam araarsituu(2)\n" +
            " Araarsituu Maariyaam araarsituu x2\n" +
            "Araarsituu yaa haadha garraamii\n" +
            "                       Dubree Maariyaamii\n" +
            "                       Yaa gara-laafetii\n" +
            "Araarsituu Maariyaam araarsituu x2\n" +
            "Eenyu jedheen waamaa maqaakee \n" +
            "Maariyaam natti ulfaatee gochaankee(2)\n" +
            "\t Ceesisa\n"+
            "Araarsituu Yaa haadha jaalalaa\n" +
            "                      Sumatu naaf caala\n" +
            "                      Yeroon waa hin qabnetti\n" +
            "                     Qabeessa na gooteettii\n" +
            "Araarsituu Maaram araarsituu x2\n" +
            "Eenyu jedheen waama maqaakee \n" +
            "Maariyaam natti ulfaatee gochaankee(2)\n" +
            "\t Ceesisa\n"+
            "Araarsituu Yaa gara-laafetii\n" +
            "                         Diina nan falmatee\n" +
            "Araarsituu Maariyaam araarsituu x2\n" +
            "Eenyu jedheen waamaa maqaa kee Maariyaam\n" +
            "natti ulfaatee gochaan ke(2)\n" +
            "\t Ceesisa\n"+
            "Araarsituu koottuu mee gara koo\n" +
            "                       Yaa haadha Gooftaa koo\n" +
            "                       Laali hir’ina koo\n" +
            "                       Guuti hir’ina koo\n" +
            "Araarsituu Maaram araarsituu x2\n" +
            "Eenyu jedheen waamaa maqaakee \n" +
            "Maariyaam natti ulfaatee gochaan ke(2)\n" +
            "\t Ceesisa\n"+
            "Araarsituu Baay’inni yakka kootii\n" +
            "                      Gooftaatti na hin butuutii\n" +
            "                      Kadhannaa koo fuutee\n" +
            "                      Gooftaa gurra buuftee\n" +
            "Araarsituu Maaram araarsituu x2\n" +
            "Eenyu jedheen waama maqaa kee \n" +
            "Maariyaam natti ulfaatee oolmaankee x2\n";

    String mezmurTitle = "Araarsituu Maariyaamii";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbaaf_ilma);

        initUI();

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
            startActivity(Intent.createChooser(intent,"Share mezmur via "));
        });

    }


    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}