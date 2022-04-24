package com.beckytech.faarfannaaafaanoromoo.atozsorted.tcontents;

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

public class TikseeGaariinQabaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Tiksee gaariin qabaa\n" +
            "Abbaan gaariin qabaa\n" +
            "Waa’eesaan odeessaa\n" +
            "Jireenyi koo isaa\n" +
            " \n" +
            "Bitaan saa jaalalaa\n" +
            "Haadhaf Abbaa caalaa\n" +
            "Ano hubadheeraa\n" +
            "Harka koo ol kaaseeraa\n" +
            "\n" +
            "    Tiksee amanamaa\n" +
            "    Abbaa jaalatamaa\n" +
            "    Iddoo boqonnaa koo\n" +
            "    Iyyesuus nagaa koo\n" +
            "\n" +
            "Waa’ee koof dhanamee\n" +
            "Eebboon waranamee\n" +
            "Naaf kenne lubbuusaa\n" +
            "Eenyuu kan akka saa\n" +
            "\n" +
            "    Tiksee amanamaa\n" +
            "    Abbaa jaalatamaa\n" +
            "    Iddoo boqonnaa koo\n" +
            "    Iyyesuus nagaa koo\n" +
            "\n" +
            "Naaf yaada hundaarra\n" +
            "Addaan bausaa rraa\n" +
            "Moo’eraa onnee koo\n" +
            "Iyyesuus mootiin koo\n" +
            "\n" +
            "    Tiksee amanamaa\n" +
            "    Abbaa jaalatamaa\n" +
            "    Iddoo boqonnaa koo\n" +
            "    Iyyesuus nagaa koo\n" +
            "\n" +
            "Michuu tokkon qaba\n" +
            "Gocha saa lallabaa\n" +
            "Iyyesuus jedhamaa\n" +
            "Fayyisaa hundumaa\n";

    String mezmurTitle = "137. Tiksee gaariin qaba";

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