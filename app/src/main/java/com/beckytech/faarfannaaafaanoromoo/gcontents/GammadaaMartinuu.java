package com.beckytech.faarfannaaafaanoromoo.gcontents;

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

public class GammadaaMartinuu extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Gammadaa martinuu Gooftaan du’aa ka’e\n" +
            "Faarfaadhaa ililchaa nageenyi nuuf ta’e\n" +
            "\n\n" +
            "Darbiirraa gadbu’.........gammadaa martinuu\n" +
            "Yaa Meelkool faarfaadhu\n" +
            "Akka ilma Iseey\n" +
            "Baganaa qabadhu\n" +
            "Nutoo hin callisnuu\n" +
            "Gooftaadhaaf faarfaanna\n" +
            "Halkanii fi guyyaa\n" +
            "Galataaf dhaabbanna\n" +
            "\n\n" +
            "Gaddi eessa jiraa\n" +
            "Isa waliin taanee\n" +
            "Jaalala isaatiin\n" +
            " Du’a injifanne\n" +
            "Maqaasaa olqabaa\n" +
            "Dachee kamirrattis\n" +
            "Ililchaa faarfadhaa\n" +
            "Mana leehemittis\n" +
            "\n\n" +
            "Dooqa keenya kutee\n" +
            "Dhiigaan kan nubitee\n" +
            "Du’a du’aan moo’ee\n" +
            "Kan isaa kan nu godhe\n" +
            "Du’a fannoo du’uun\n" +
            "Isa olnu qabeef\n" +
            "Faarfaadhaa martinuu\n" +
            "Gooftaa kabajaatiif\n" +
            "\n\n" +
            "Har’a gaddi hin jiru\n" +
            "Diinni hidhameera\n" +
            "Karra si’oolitis\n" +
            "Iyyasuus cufeeraa\n" +
            "Dhalli namaa martuu\n" +
            "Ifaan golgameeraa\n" +
            "Dhukkubsachuu isaan \n" +
            "Bilisa baheera\n";

    String mezmurTitle = "Gammadaa martinuu";

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

    private void initUI() {
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setIcon(R.drawable.ic_launcher_foreground);
        mActionBar.setDisplayShowCustomEnabled(true);
        mActionBar.setCustomView(R.layout.custom_actionbar_layout);
        mActionBar.setTitle("Abbaafi Ilma");
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#0A6E73"));
        mActionBar.setBackgroundDrawable(colorDrawable);
    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}