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

public class EebbifamaadhaKanEebbifamee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Eebbifamadha kan eebbifaamee(2)\n" +
            "Harka waaqasaatti namni gorfame(2)\n" +
            "Harka uumasaatti kan eebbifame(2)\n" +
            "\n\n" +
            "Ennaa cabse iyyuu inni ni dhidhiba\n" +
            "Hundaa danda'aa maaltu isa dhiba\n" +
            "Ennaa barbaadee jireenya laata\n" +
            "Fedha isaa ala eenyutuu jiraata\n" +
            "\n\n" +
            "Yeroo madeesseyyuu inni ni fayyisa\n" +
            "Wallaanuu beeka qoricha harkisaa\n" +
            "Waan hundaa keessaa si baasa inni\n" +
            "Tasa sinmiidhu waanti hammaani\n" +
            "\n\n" +
            "Beelaafi rakkinni ennaa dhufe iyyuu\n" +
            "Waraanni cimaan yoo hirire iyyuu\n" +
            "Nan du'a jette hin sodaatini\n" +
            "Irreen Waaqa kee sumaa wajjini.\n" +
            "\n\n" +
            "Namni adabame harka uumasaatti\n" +
            "Qajeelaa ta'a jireenya isatti\n" +
            "Egaa hin mufaatiin dheekkamumaa kee" +
            "Obsaan fudhadhu gorsa waaqa kee.\n" +
            "\n\n" +
            "F/taa D/n Soorii Guddatoo";

    String mezmurTitle = "36. Eebifamaadha kan eebbifamee";

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