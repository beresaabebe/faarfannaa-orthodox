package com.beckytech.faarfannaaafaanoromoo.bcontents;

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

public class BagaGammaddanMisiroon extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Baga gammaddan misiroon lachuu\n" +
            "Umurii keessan waaqayyoo haa bubulchuu\n" +
            "Gaa'elii keessan baay'ee midhageeraa\n" +
            "Waaqayyoo gooftaan siin eebbiseeraa\n" +
            "\n" +
            "Mana Dookimaasfaa misirroon lachuu\n" +
            "Akkumma eebbisee\t\"\t\t\"\n" +
            "Isin haa eebbisuu \t\"\t\t\"\n" +
            "Harka isaa diriirsee \t\"\t\t\"\n" +
            "Leeyyoorraa isin olchee isin gammachisee\n" +
            "\n" +
            "Qilleensaa baraatiin misirroon lachuu\n" +
            "Akka hin dogoggorree \t\"\t\t\"\n" +
            "Barsiisa sobaatiin \t\"\t\t\"\n" +
            "Akka hin bitintirree \t\"\t\t\"\n" +
            "Gochaa waaqa keessanii ni irraanfattuurree\n" +
            "\n" +
            "Addaamis qofaasaa misirroon lachuu\n" +
            "Jiraachuun hin ta'uufi \t\"\t\t\"\n" +
            "Waaqayyoo gooftaan \t\"\t\t\"\n" +
            "Jedheetu dubbateefi \t\"\t\t\"\n" +
            "Cinaacha isaa keessaa gargaartuu uumeefi\n" +
            "\n" +
            "Isiin haa eebbisuu misirroon lachuu\n" +
            "Akka Abrihaamfaa \t\"\t\t\"\n" +
            "Isin haa eebbisuu \t\"\t\t\"\n" +
            "Akka Yisihaaqifaa \t\"\t\t\"\n" +
            "Akkuma Yaa'iqoobifaa akkuma Museefan.\n" +
            "";

    String mezmurTitle = "Baga Gammaddan Misiroon";

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