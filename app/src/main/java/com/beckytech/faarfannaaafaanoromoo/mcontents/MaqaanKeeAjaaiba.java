package com.beckytech.faarfannaaafaanoromoo.mcontents;

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

public class MaqaanKeeAjaaiba extends AppCompatActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Maqaan kee Ajaa’iba maqaa waaqa qaba\n" +
            "Ergamaa mikaa’el siif galatan qaba\n" +
            "Naa guddisteta ati hamaarra naa eegdee\n" +
            "Warra sii qabneef garaan koo naa gadde\n" +
            " \t\tCeesisa\n" +
            "Jawwichi hin Dandeenye surra keetu caale\n" +
            "Darbatamee kufee fuula kee laale\n" +
            "Kanafan sii waama ati mirga kooti\n" +
            "Simboo argadheera atu gartuu kooti\n" +
            " \t\tCeesisa\n" +
            "Gargaara koodha ati akka Dani'eeli\n" +
            "Qormumsa keessatti gara koo ilaali\n" +
            "Maqaa kee waamaman diinni ni rifataa\n" +
            "Anis bilisoomeen qabaadhe galataa\n" +
            " \t\tCeesisa\n" +
            "Libaana mana keen urgaa'e Keessi koo\n" +
            "Harka keerra jira Kaadhaf galatni koo\n" +
            "Mirga waaqa jirta mirgaaf naa jaalatee\n" +
            "Halkaniifi guyyaa kanaf naa dhaabate ×2\n";

    String mezmurTitle = "Maqaan kee ajaa'iba";

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