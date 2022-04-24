package com.beckytech.faarfannaaafaanoromoo.atozsorted.ocontents;

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

public class OoMaariyaam extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Oo yaa giiftii koo nu si jaalanna\n" +
            "Oo yaa giiftii koo nu si jaalanna\n" +
            "Waan nuuf deesseef nyaata jireenya\n" +
            "Haadha Amanu'eel nu si jaalanna\n" +
            "\n" +
            "Lapheen koo waan gaarii nu si jaalannaa\n" +
            "Burqisuu jalqabe \t\t\"\t\"\n" +
            "Galata Maariyaamii  \t\t\"\t\"\n" +
            "Dubbachu eegalee \t\t\"\t\"\n" +
            "Ulfinni ishee addaa \t\t\"\t\"\n" +
            "Kanaaf ni jaalanna \t\t\"\t\"\n" +
            "\n" +
            "Waaqayyoo samiirraa nu si jaalannaa\n" +
            "Biyya lafa ilaale \t\t\"\t\"\n" +
            "Qulqullummaa ishee \t\t\"\t\"\n" +
            "Hundumarra caalee \t\t\"\t\"\n" +
            "Haadha gooftaa keenyaa \t\t\"\t\"\n" +
            "Hiiktuu himtee keenyaa \t\t\"\t\"\n" +
            "\n" +
            "Laallistuu miidhagdu nu si jaalannaa\n" +
            "Abiddaan marfamtee  \t\t\"\t\"\n" +
            "Ifa ifa caalu \t\t\"\t\"\n" +
            "Mucaa ishee haammattee \t\t\"\t\"\n" +
            "Ulee Aaroniidha \t\t\"\t\"\n";

    String mezmurTitle = "Oo Maariyaam nu si jaalannaa";

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