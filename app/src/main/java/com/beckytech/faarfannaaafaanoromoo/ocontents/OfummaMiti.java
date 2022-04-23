package com.beckytech.faarfannaaafaanoromoo.ocontents;

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
import com.beckytech.faarfannaaafaanoromoo.R;
import com.beckytech.faarfannaaafaanoromoo.WaaeeApp;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class OfummaMiti extends AppCompatActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Ofumaa miti nu waamun kee\n" +
            "Samii samiirraa gadi bu'un kee\n" +
            "Bilisa nu baseera humni kee\n" +
            "Nurra golbobeera ayyanni kee\n" +
            "\t\tCeesisa\n" +
            "Iddoo isa gaarii qopheessite\n" +
            "Wanta nuuf ta'uus mijeesite\n" +
            "Booda deebinu murtoofnerra\n" +
            "Arjaa ta'uu kees hunaneerraa\n" +
            "\t\tCeesisa\n" +
            "Adeemsa keenya nuf sirreessi\n" +
            "Galaana cubbuu nu Ceesisi\n" +
            "Si malee kan nuf ta'u jiru\n" +
            "Arjaan akka kees tasa jiruu\n" +
            "\t\tCeesisa\n" +
            "Nama birattis tuffatamee\n" +
            "Galmee keenyaas haarafamee \n" +
            "Misiraachoon keenyas lallabemee \n" +
            "\t\tCeesisa\n" +
            "Iddoo Ati nu  waamte irraanfannuu\n" +
            "Maaqa kee faarsuus hin dagannuu\n" +
            "Mucummaatti nu guddifatee\n" +
            "Bakkee onaatii nu waamtee\n";

    String mezmurTitle = "Ofumma miti";

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
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (item.getItemId() == R.id.aboutusmenu) {
            startActivity(new Intent(this, AboutUs.class));
        }

        if (item.getItemId() == R.id.sharemenu) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo");
            intent.putExtra(Intent.EXTRA_TEXT, "Download this useful app's from Google play \n https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo");
            startActivity(Intent.createChooser(intent,"Share app's link via "));
        }

        if (item.getItemId() == R.id.starmenu) {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo";
            Intent  intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

        if (item.getItemId() == R.id.checkUpdateMenu) {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo";
            Intent  intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

        if (id == R.id.exitmenu) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Cufu barbaade?")
                    .setCancelable(false)
                    .setPositiveButton("Eeyyeen", (dialogInterface, i) -> finish())
                    .setNegativeButton("Lakki", (dialogInterface, i) -> dialogInterface.cancel()).create().show();
        }

        if (id == R.id.moreappmenu) {
            startActivity(new Intent(this, MoreApps.class));
        }

        if (id == R.id.aboutappmenu) {
            startActivity(new Intent(this, WaaeeApp.class));
        }

        if(id == R.id.galatamenu) {
            startActivity(new Intent(this, GalataActivity.class));
        }

        return super.onOptionsItemSelected(item);
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