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
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GarraKoofJedhee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Garaa koof jedhee sin gatu \n" +
            "Maariyaamii keessi koo si hin dagatu \n" +
            "Na guddisteerta hoo mana keetti \n" +
            "Ilma keetiin lubbuunkoo boqotteertii\n" +
            "\n\n" +
            "     Galaa kooti ati kan bara dheeraa \n" +
            "     Karaa koo deemuudhaaf an si abdadheera \n" +
            "     Ati yoomuu na hin gattu haadha jaalalaatii \n" +
            "     Kennaa fannoo jalaa kan nama hundumaatii \n" +
            "\n\n" +
            "Ifti bara baraa sirraatii nuuf ba’e \n" +
            "Boqonnaan lubbuutis Ilma keen nuuf ta’e \n" +
            "Sanyii nuuf hafteedhaa ati yaa Maariyaamii \n" +
            "Osoo ati hin jirree taane akka sadoomii \n" +
            "\n\n" +
            "     Addunyaa fi lafti hundumtuu hin dabarti \n" +
            "     Qabeenyi lafarraas yeroof malee hin dhumti \n" +
            "     Yaa Haadha Waaqayyoo ati haadha Suugaa\n" +
            "    Sidhiisee hin deemuu anoo kan kee dhugaa\n";

    String mezmurTitle = "Garra koof jedhe";

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
            startActivity(Intent.createChooser(intent,"Share faarfannaa via "));
        });

    }


    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}