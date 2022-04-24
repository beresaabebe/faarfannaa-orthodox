package com.beckytech.faarfannaaafaanoromoo.atozsorted.dcontents;

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

public class DuaaKaeera extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Du'aa ka'eeraa ilmi maariyaamii\n" +
            "Du'aas mo'eera ilmi maariyaamii\n" +
            "Galataan bahee  gara  Aariyaamii\n" +
            "          \tCeesisa\n" +
            "Bannee kufneera yeroo jennetti \n" +
            "Abdii dhabeesa yeroo taneetti \n" +
            "Abdii nuuf ta'ee bakka hundumatti\n" +
            "      \tCeesisa\n" +
            "Gidiraa hedduun irraatti raawwatee\n" +
            "Kanaa hundumaa waa'ee koofi baatee\n" +
            "Gennaati galuunis carraa koo taatee\n" +
            "              \tCeesisa\n" +
            "Waadaa nuuf galee hunda rawwaatee\n" +
            "Fannoo jiidhaas Gooftaan ni baatee \n" +
            "Uffaata dhiigaan badee uffaatee\n" +
            "    \tCeesisa\n" +
            "Waan hunda gochuu osoo danda'uu \n" +
            "Balleesaa keenyaaf kufee yoo ka'uu\n" +
            "Kansaa taneeraa hunduu haa dhaga'uu\n" +
            "      \tCeesisa\n" +
            "Eenyuut raawwatee isaa kana hunda \n" +
            "Jaalali abbaa koo hundumarraa adda\n" +
            "Ameen fayyinee hunduu gammada\n";

    String mezmurTitle = "33. Du'aa ka'eera";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbaaf_ilma);

        initUI(mezmurTitle);

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