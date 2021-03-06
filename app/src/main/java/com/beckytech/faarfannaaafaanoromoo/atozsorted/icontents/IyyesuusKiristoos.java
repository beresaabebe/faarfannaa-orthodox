package com.beckytech.faarfannaaafaanoromoo.atozsorted.icontents;

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

public class IyyesuusKiristoos extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Iyyasuus kiristoos waaqayyoodha jettee\n" +
            "Tewaahidoo wangeelaan nu barsiisaa turtee\n" +
            "Nutis dhugaa baanaa eeyyyee(3) waaqayyoodha\n" +
            "Barumsi Tewaahidoos kunoo kanadha \n" +
            "\n\n" +
            "      Diinni maaf gungumaa sammuudha dhibamee\n" +
            "       Nutoo kan lallabnuu isa fannifamee\n" +
            "       Duubatti hin deebinuu fuulduratti malee\n" +
            "       Waaqa biraa hin qabnuu \twaaqayyootiin malee\n" +
            "\n\n" +
            "Shakkii shakkitootan waan tokko hin raafamnu\n" +
            "Tewaahidoon dhugaadha Tewaahidoo hin gadhiifnuu\n" +
            "Wangeelaan ijaaramee hundeen bu’uurrisaa\n" +
            "Qilleensa isa kamtu mana keenya raasaa\n" +
            "\n\n" +
            "      Waa’ee Qulqullootaa maaf dubbachuu dhiisnaa\n" +
            "      Jireenyasaaniitiin Gooftaatiin lallabnaa\n" +
            "      Dhugaatu nuuf galeera duubatti hin deebinu\n" +
            "      Dhugaadhaf hojjenna namni hundumtuu haa baruu\n";

    String mezmurTitle = "73. Iyyesuus Kiristoos";

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