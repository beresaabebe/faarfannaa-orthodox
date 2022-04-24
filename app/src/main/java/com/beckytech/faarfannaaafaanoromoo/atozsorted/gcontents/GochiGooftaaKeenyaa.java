package com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents;

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

public class GochiGooftaaKeenyaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Gochi gooftaa keenyaa nuuf baay’atee jira\n" +
            "Tolummaasaa hundaaf galata galchinaa\n" +
            "\n" +
            "    Yeroo rakkoo keenyaa dhiphinaa nu baasa\n" +
            "    Yakkaan yoo kufnellee jaalalaan nu kaasa\n" +
            "    Cubbuu keenya baayyee gonkuma balleessee\n" +
            "    Mo'annaa nuuf kennee bilisa nu baasee  \n" +
            "\n" +
            "Jibba keenya dhiisee inni nu jaalatee\n" +
            "Balleesuma keenyaaf beela'ee dheebotee\n" +
            "Hammeenya namootaa hundumasaa obsee\n" +
            "Icciitii jaalalasaa fannoodhaan mul'isee\n" +
            "\n" +
            "    Ka'aa yaa namootaa gara isatti deebina\n" +
            "    Cubbuurra fagaannee seerasaa raawwannaa\n" +
            "    Uffata salphinaa ofirraa mulqinee\n" +
            "    Haa taanu qulqulloota qalbii jijjiirrannee\n";

    String mezmurTitle = "61. Gochii gooftaa keenyaa";

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