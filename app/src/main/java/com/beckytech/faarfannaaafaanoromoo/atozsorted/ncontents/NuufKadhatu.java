package com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.beckytech.faarfannaaafaanoromoo.AboutUs;
import com.beckytech.faarfannaaafaanoromoo.GalataActivity;
import com.beckytech.faarfannaaafaanoromoo.MoreApps;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.beckytech.faarfannaaafaanoromoo.WaaeeApp;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Optional;

public class NuufKadhatu extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Ergamoonni Yeroo Hundaa Nuuf Kadhatu\n" +
            "Waaqa Keenya Dura Dhaabbatanii\n" +
            "Gidiraaf Qorumsarraa Nu Oolchu \n" +
            "Naannoo Keenya Buufatanii\n" +
            "\n" +
            "       Madaallii Afuuraa Kan Qabatu\n" +
            "       Har'as Mikaa'eliin Nu Hin Dagatuu\n" +
            "        Isa Nu Adamsuu Lubbuu Keenyaa\n" +
            "       Aangoon Irra Ejjetee Diina Keenya\n" +
            "\n" +
            "Waaqa Keenya Dura Kan Dhaabbatu\n" +
            "Ijoollee Waaqayyoof Kan Kadhatu\n" +
            "Gabri'eeliin Dhufee Gara Keenya\n" +
            "Gammachuutti Jijjiire Gadda Keenya\n" +
            "\n" +
            "       Ergamaan Rufaa'eel Ogeessadhaa\n" +
            "       Gadameessa Deessuu Kan Furudha\n" +
            "       Qorumsi Da'umsaa Yoo Hammaate \n" +
            "       Dhufeetu Nu Fura Ariifatee\n" +
            "\n" +
            "Ergamaa Guddicha Raagu'eelii\n" +
            "Dukkana Addunyaa Nu Baraarii\n" +
            "Urjiif Ji'a Aduu Situ Abboomaa\n" +
            "Ifaan Nu Gaggeessi Yeroo Hundumaa\n" +
            "\n" +
            "       Dhiiga Gooftaa Xoofootti Kan Qeensee\n" +
            "       Biyya Lafaa Ittiin Qulqulleesse \n" +
            "       Hangafa Ergamootaa Uraa'eelii\n" +
            "       Nutoo Cubbamoota Nu Gargaari\n";

    String mezmurTitle = "115. Nuuf Kadhatu";

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