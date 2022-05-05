package com.beckytech.faarfannaaafaanoromoo.atozsorted.hcontents;

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

public class HoolichaDhugaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Reebamuun kan siif hin taane Gooftaa ni reebamte\n" +
            "Madaa'uun kan siif hin mallee Gooftaa ni madoofte\n" +
            "Jaalala keenyaf waan hedduu taatee\n" +
            "Hoolicha dhugaa ati nuuf qalamtee\n" +
            "\n\n" +
            "Fannoo muka jiidhaa ati qofa kee baate\n" +
            "Goonfoo Qoraaticha mataatti godhatee\n" +
            "Mirga Abbaa keeti Samii irraa buutee\n" +
            "Nuu jiraachisuf ofi kee duutee      \n" +
            "\n\n" +
            "Kan sii waaqessinuu waaqummaa kee barre\n" +
            "Fannoo kee batanne sii faana hiriiree\n" +
            "Waaqni sii qofa kan waaqeessinuu\n" +
            "Bara jiraata kan siin jajaanjuu       \n" +
            "\n\n" +
            "Garbuummaa hadhaa ati nurra diigdee\n" +
            "Cabaa dhagna keenya ati nuuf dhidhibdee\n" +
            "Hooma hin sodaannu sii faana baanee\n" +
            "Gargaarsa keetin humna argannee\n" +
            " == F/taa Dn Sabboonaa Geetachoo\n";

    String mezmurTitle = "70. Hoolicha dhugaa";

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