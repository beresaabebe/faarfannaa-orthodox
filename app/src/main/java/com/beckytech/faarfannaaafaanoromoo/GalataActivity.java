package com.beckytech.faarfannaaafaanoromoo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class GalataActivity extends AppCompatActivity {

    TextView textContents, textTitle;
    ImageView imageView;
    String contents = "<p style='text-align:justify;'> Jalqaba irratti app kana akkan hojjedhu" +
            " osoo abdiin kutiin, boodattis osoo hin deebi'in yeroo hundaa ciminaa naaf ta'ee" +
            "kan nakakase <b>Waaqayyoof</b> galanni haa ta'u. Fayyuu keenyaaf sababa kan taate haadha" +
            " keenya qulqulleetti dubroo Maariyaamif akkasumas ergamoota qulqulloota hundaaf akka aangoofi " +
            "aboo isaaniif keennamen kan galateffamaan haa ta'an.</p>" +
            "<p style='text-align:justify;'>Itti ansuudhaan Maatiin koo, hiriyyoonni koo akkasumas namootni na beektanis ta'ee kanneen " +
            "na hin beekne yeroo hundaa haalla adda addaattin jajabbinaa naaf taasiftani Waaqayyoon gatii lubbuu " +
            "isiniif haa taasisuun. Ameen.</p>" +
            "<p style='text-align:justify;'>Walaloo faarfannawwani bifa adda addaan bakkee adda addaatti kan lakkiftan hundaa keessaniif galanni koo" +
            " guddaadha. Waaqayyoon ammas kana caala nama mana isaa keessa taajajiluu isiin haa taasisu. Eebbii abboota " +
            "qulqulloota, ayyaanni isaanif isiniif haa baay'atu.</p>" +
            "<p style='text-align:justify;'>Isiniis app kan Google play irraa busuun jaallachun waan itti fayyadmatanniif galannii keessa " +
            "jireenya bara baraa isiniif haa ta'u. Ameen!</p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galata);
        textContents = findViewById(R.id.textContents);

        initUI();

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textTitle = findViewById(R.id.textTitle);
        textTitle.setText("Galata");

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N) {
            textContents.setText(Html.fromHtml(contents,Html.FROM_HTML_MODE_COMPACT));
        }
        else {
            textContents.setText(Html.fromHtml(contents));
        }

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(view -> {
            Toast.makeText(GalataActivity.this, "Share me, let other know about me!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, R.string.app_name);
            intent.putExtra(Intent.EXTRA_TEXT, R.string.app_name);
            startActivity(Intent.createChooser(intent,"Share me via "));
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
}