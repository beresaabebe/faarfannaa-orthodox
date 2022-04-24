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

public class DhaabachuDadhabee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Dhaabachun dadhabee milli koo roomera\n" +
            "Lapheen koo sodaadhaan bayyee raafameera\n" +
            "Dhaabbanna koo tolchi Gooftaa naa hin gaatini\n" +
            "Dadhabbi koo laalte ati naa hin dhiisini\n" +
            "              \t Ceesisa\n" +
            "Diinni qoraattidha karaa nati cufeera\n" +
            "Ano keessa bahu Gooftaa dadhabeera\n" +
            "Keessa na dabarsi yaa Waaqa koo Ati\n" +
            "Hundaa ni dandeessaa angoonis kan keeti\n" +
            "              \tCeesisa\n" +
            "Biyyi lafaa kun bayyee rakkisaadha\n" +
            "Kan keessa bahuuf ati murteessaadha\n" +
            "Ati naa gargaari naaf ta'i haamilee\n" +
            "Ano hin danda'u Gooftaa sii malee\n" +
            "        \tCeesisa\n" +
            "Hunda ni dandeessa maali dadhabde beekta\n" +
            "Ana fayyisuufi dhuftee naaf duteeta\n" +
            "Har'as naa gargaari naaf ta'i furmaata\n" +
            "Waa’ee jireenya koo Iyyesuus ni beektaa\n";

    String mezmurTitle = "Dhaabachu dadhabee";

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