package com.beckytech.faarfannaaafaanoromoo.atozsorted.ucontents;

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
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UraaelKoottu extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Uraa'el koottu kennaa qabda ati\n" +
            "Nu baduuf jennaa nu gargaari ati\n" +
            "\t\tCeesisa\n" +
            "Uraa'el koottu bakka deemnutti\n" +
            "      \"\"        \"\"      Nu wajjin ba'i\n" +
            "      \"\"        \"\"      Akka nuyi hin bannee\n" +
            "      \"\"        \"\"      Nu duuka ta'i\n" +
            "      \"\"        \"\"      Akkuma izraà\n" +
            "    \"\"        \"\"      Nu faana bu'i\n" +
            "\t\tCeesisa\n" +
            "Uraa'el koottu Xoofoo Qeessitee\n" +
            "      \"\"        \"\"      Dhiiga Gooftaanis\n" +
            "      \"\"        \"\"      Qulqulleessitee\n" +
            "      \"\"        \"\"      Biyyaa lafas\n" +
            "      \"\"        \"\"      Isaan fayyinee\n" +
            "      \"\"        \"\"      Ijoollee kees\n" +
            "\t\tCeesisa\n" +
            "Nutti cimeera dhiphuun lafarraa\n" +
            "Gabri'eel kootu Maaloo nu biraa\n" +
            "\t\tCeesisa\n" +
            "Gabri'eel koottu ijoollee sadan\n" +
            "      \"\"        \"\"      ati gaargartee\n" +
            "      \"\"        \"\"      ibiddaa sana\n" +
            "      \"\"        \"\"      ati bishaan goote\n" +
            "      \"\"        \"\"      kennaa qabduun\n" +
            "      \"\"        \"\"      ibiddaa baastee\n" +
            "\t\tCeesisa\n" +
            "Gabri'eel koottu Qirqoos mucichaa\n" +
            "      \"\"        \"\"      Haadha isaa wajjin\n" +
            "      \"\"        \"\"      Mooticha sana\n" +
            "      \"\"        \"\"      ibiddaa bu'aan\n" +
            "      \"\"        \"\"      Garuu hin gubanne\n" +
            "      \"\"        \"\"      Maqaa keef hafan\n";

    String mezmurTitle = "141. Uraa'el koottu";

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