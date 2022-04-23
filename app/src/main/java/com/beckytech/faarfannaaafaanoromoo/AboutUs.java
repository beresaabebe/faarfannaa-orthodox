package com.beckytech.faarfannaaafaanoromoo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

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

public class AboutUs extends AppCompatActivity {

    TextView textContents, textTitle;
    ImageView imageView;
    String contents = "<p style='text-align:justify;'>Kanan dura app waa'ee amantiin wal qabatu" +
            "hojjechan ture haa ta'u malee app'n ani kan dura hojjedhe namoota hedduu bira ga'uu" +
            "irratti baay'ee kan milka'ee miti. Anis garuu app'n kan dura hojjedhe nama bira hin geenye " +
            "jechuun guyyaa tokkoo abdii kutee hin beeku. Kana qofa osoo hin tannee websitiis hojjedhe " +
            "oromoon afaan isaan internet irraa barbaade argachuu qaba jechuun barreefamoota hedduu namoota baay'ee " +
            "biratti akka isaan irraa fayyadamaan taasisen jira. </p>" +
            "<p style='text-align:justify;'>Namoota baay'eetti hojii ani hojjedhu kun gaaffi ta'uu danda'aa, ati hojii amantii qofa hojjeta yoo nan jettan lakki ani " +
            "hojii amantii qofa miti garuu appfi websittin wal qabsisee hanga ammatti waa'ee amantiin kan wal qabattuun hojjedhe." +
            " Sababni isas afaan oromoon namootni hojjettan baay'inaan waan hin jireef ani immoo ogummaa xiqqoon qabu kana yoon ittin " +
            "waan tokkoo hojjedhe namootni irraa barataan yookiis itti fayyadamaan jechuun kan qopheessuu danda'eerraa.</p>" +
            "<p style='text-align:justify;'> Ani amantii koo nan jaalladha, amantii namoota biroos nan kabajaa kannaaf hodoftootni amantii keenyas " +
            "sababa afaaniif jechaa amantaa isarraa boodatti jechuun qabu jedheen akkasumas afaan oromoof ga'ee narra jiruu bahuun qaba jechuun hojjechan jira." +
            "Namootni ana waliin hojjechu barbaadaniif lakkoofsa bira koo fayyadamuun yookiis <br>" +
            "<a href='https://www.facebook.com/beresabecky'>Facebook</a> <a href='https://t.me/beresaabebe'>Telegram</a>" +
            " whatsapp'n yookiis bilbilaan Phone: +251917361283 na dubbisuu ni dandeessu.</p>" +
            "Barumsaa Amantaa hedduu argachuuf <br>" +
            "<a href='https://afanoromobatch.wordpress.com/'>Sagantaa Barnoota</a> yookiis <br>" +
            "<a href='https://yoosaad.com/'>Yoosaad Online Learning Platform</a> seenun barnoota dabalata argachuu ni dandeessu.";
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
        textTitle.setText("Designe by: Beresa Abebe");

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N) {
            textContents.setText(HtmlCompat.fromHtml(contents,HtmlCompat.FROM_HTML_MODE_COMPACT));
        }
        else {
            textContents.setText(Html.fromHtml(contents));
        }

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(view -> {
            Toast.makeText(AboutUs.this, "Share me, let other know about me!", Toast.LENGTH_SHORT).show();
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