package com.beckytech.faarfannaaafaanoromoo.bcontents;

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

public class BoqonnaaNaaf extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Maaloo yaa waaqa koo narra hin fagaatini\n" +
            "Anoo dhiphadheeraa boqonnaa naaf kenni\n" +
            "Diinni koo hundumtuu natti baay'atanii\n" +
            "Jabina naaf ta'ii siin kadhadha anii\n" +
            "\n" +
            "Kanneen naa miidhan hedduumaatanii\n" +
            "Gargaraan koo sidha siin eeggadha anii\n" +
            "Addaan hin baafne kan naaf ta'u hubadhee(2x)\n" +
            "Hubannaa naaf kenni gooftaa koo sin kadhadhe(2x)\n" +
            "\n" +
            "Natti bitachaa'ee daandiin irra deemu\n" +
            "Qajeelaa fakkaataa yemmuu ilaalamu\n" +
            "Lubbuu miidhee foon koo anaan kan fayyadu(2x)\n" +
            "Isa akkasii egaa tasa hin barbaadu(2x)\n" +
            "\n" +
            "Qorichaa kooti ati sagaleen kee yaa gooftaa\n" +
            "Kan gara kee dhufe furmaata argata\n" +
            "Sitti hirkadheera ani danda'aa gooftaa koo(2x)\n" +
            "Diina harkaa harkaa naa baasi naa qabii harkaa koo(2x)\n" +
            "\n" +
            "Bu'aa hin qabu jechuun inni namni gatee\n" +
            "Karaa hundumaa ilaalee tuffatee\n" +
            "Cubbamaa barbaaduu addunyaa kan dhuftee (2x)\n" +
            "Naaf guuti waaqa koo isa natti hir'atee (2x)\n" +
            "";

    String mezmurTitle = "Boqonnaa naaf kenni";

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