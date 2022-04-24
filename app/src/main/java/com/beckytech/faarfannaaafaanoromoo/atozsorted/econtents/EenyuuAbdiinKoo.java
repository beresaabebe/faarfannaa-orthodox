package com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents;

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

public class EenyuuAbdiinKoo extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Eenyu anaaf abdiin koo (2)\n" +
            "Ati naa hin gatin waaqa uumaa koo\n" +
            "\n\n" +
            "Yaadaan joonja'een baayyee jooreeraa\n" +
            "Gammachuus dhabeen biyya lafaarraa\n" +
            "Laphee ijoollummaa koo ati naaf deebisii\n" +
            "Gooftaa koo adaraa naa jajjabeessii\n" +
            "\n\n" +
            "Addunyaan naannoo nattii taatee\n" +
            "Nama hin fayyadne nan jettee\n" +
            "Addunyaaf du'uus siitoo fayyeeraa\n" +
            "Cubbuu koo naaf dhiisi gooftaa koo adaraa\n" +
            "\n\n" +
            "Karaa koo isaa qoreen cufamtee\n" +
            "Baay'ee dhiphatee naa barsiifattee\n" +
            "Har'a hirkoon koo eessaa dhaqeeraa\n" +
            "Abdii naaf ta'ii abbaa koo adaraa.\n" +
            "\n\n" +
            "F/taa Waldeeseenbaat Baqallaa";

    String mezmurTitle = "Eenyuu abdiin koo";

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