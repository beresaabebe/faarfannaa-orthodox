package com.beckytech.faarfannaaafaanoromoo.atozsorted.jcontents;

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

public class JireenyaLubbuuKoo extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Dhugaatif nyaata koo Jireenya Lubbuu koo\n" +
            "Iyyesuus kiristoos naaf lateeta gaafas\n" +
            "Har'a maaltu Dhufee barumsi inni haaraa\n" +
            "Waaqayyoo sumaadha Gooftan bara bara\n" +
            "Iyyesuus sumaadha waaqni bara bara\n" +
            "       \t\tCeesisa\n" +
            "Jalqabaan sii Amanee lubbuun koo sii file\n" +
            "Sechiis hin argamuu waaqayyoo sii malee\n" +
            "Ergaan sii amanee garaan koo hin raafamuu\n" +
            "Jabiinaa keen dhaphee miili koos hin romuu(2)\n" +
            "      \t\tCeesisa\n" +
            "Amantii fakkeessuun Bayyeen sii waamani\n" +
            "Har'a hin deebi'aanii hunduu sii gananii\n" +
            "Arjummaan kee adda Dhiifama nuu ilaaltaa\n" +
            "Cubbuu keenyaa dhiiste jireenya nuuf laata(2)\n" +
            "       \t\tCeesisa\n" +
            "Si faana yoon bu’ee sittu naa jaalatee\n" +
            "Qarqaara boollaarra situ na deeffate\n" +
            "Du'a keessaa ka'e oli kee dhaabadhee\n" +
            "Ija koo isa laphee maqaa keen baradhee(2)\n" +
            "       \t\tCeesisa\n" +
            "Yeroo  hedduu man kee sodaadhaan guutamee\n" +
            "Naa gargaarii uumaa koo sinan kabajamee\n" +
            "Akka mulaatuuf ulfinnii maqaa kee\n" +
            "Ogummaa Afuura keen naa gageessi mucaa kee(2)\n" +
            "\n\n" +
            "  F/taa Dn Hiikaa\n";

    String mezmurTitle = "76. Jireenya lubbuu koo";

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