package com.beckytech.faarfannaaafaanoromoo;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.text.HtmlCompat;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AboutUs extends OptionsMenuActivity {

    TextView textContents, textTitle;
    ImageView imageView;
    String setTitle = "About developer";
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
            "Facebook:https://www.facebook.com/beresabecky <br> Telegram: https://t.me/beresaabebe <br>" +
            " whatsapp'n yookiis bilbilaan Phone: +251917361283 na dubbisuu ni dandeessu.</p>" +
            "Barumsaa Amantaa hedduu argachuuf Sagantaa Barnoota Ortodooksii Oromoo: <br> https://afanoromobatch.wordpress.com/yookiis <br>" +
            "Yoosaad Online Learning Platform: <br> https://yoosaad.com/ seenun barnoota dabalata argachuu ni dandeessu.";

    String designed = "  Designed by: Beresa Abebe  ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galata);
        textContents = findViewById(R.id.textContents);

        initUI(setTitle);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textTitle = findViewById(R.id.textTitle);
        textTitle.setText(designed);

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

}