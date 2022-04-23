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

public class BirraanGahee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Habaaboon daddaraaree bara moofaa sirra ni tarree\n" +
            "Ganni darbee ifatti baanee birraan ga'ee ni gagammannee\n" +
            "\n" +
            "Habaaboon daddararee baroonni kee tasa hin dhumannii\n" +
            "\t\"  \t\t\" siinni jijjiramu isaanii\n" +
            "\t\"  \t\t\" siinni jijjiramu isaanii\n" +
            "\n" +
            "Uumamni hundi qooqa beekuunii\n" +
            "Hundisaanii siin siif aarsanii\n" +
            "Birraan bari'uu isaa arganii\n" +
            "Gammadaniis buburraaqanii\n" +
            "Ati eebbisnaan umuri isaanii\n" +
            "\n" +
            "Ajaa'iba kan kee yaa uumaa\n" +
            "Yeroon muuddee wantoota hundumaa\n" +
            "Bonas geenyee ifa arginaa\n" +
            "Kanaaf gooftaa nu siin dhaadanaa\n" +
            "\n" +
            "Bara haaraa arguuf hawwinee\n" +
            "Maatiwoos Maarqoos Luqaas jeennee\n" +
            "Yoohaannisiin nuu ga'ii jenee\n" +
            "Baattiiwaan jiraanis lakkoofnee\n" +
            "Kan hawwinees kunoo argaa\n" +
            "\n" +
            "Jecha dhabnee himuuf oolmaa kee\n" +
            "Homma hin qabnuu hoo'uu galata kee\n" +
            "Nuu eebbisii nuu ijoollee kee\n" +
            "Bara dhufuun ati nuu ga'ii\n" +
            "Kadhaa keenyaa maaloo dhaga'ii\n" +
            "\n" +
            "Nuu ga'ii egaan nuu ga'ii\n" +
            "Waggaa waggaadhan nuu ga'ii\n" +
            "Foon keef dhiigaa kee fudhannee\n" +
            "Cubbuu hundarraas fagaannee\n" +
            "Fayyina lubbuu akka argannuuf\n" +
            "Mirgaa kee gooftaa akka dhaabanuuf\n";

    String mezmurTitle = "Birraan Ga'ee";

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