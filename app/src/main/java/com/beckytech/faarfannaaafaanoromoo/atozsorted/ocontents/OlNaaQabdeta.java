package com.beckytech.faarfannaaafaanoromoo.atozsorted.ocontents;

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

public class OlNaaQabdeta extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Haadha waaqayyoo Maariyaamii\n" +
            "Ol naa qabdeta diina koo giddutii\n" +
            "Naaf galatoomi baraa hamaa baraatii\n" +
            "\n" +
            "Maqaa kee yoon faarsuu nati inaafaanii\n" +
            "Bola naaf qotuudhaaf naannoo koo marsanii\n" +
            "Ana kufisufis toftaa godhatanii\n" +
            "Garu naa argachuuf tasa hin danda'anii(2x)\n" +
            "\n" +
            "Bola naaf qota ofii itti seenu (2x)\n" +
            "Tooftan anaaf maran ni fixaa isaanu\n" +
            "Humna koottiin miti kaadha Maariyaamiinii\n" +
            "Isaan injifaachuuf abdii qaba anii\n" +
            "\n" +
            "Yeroo hundaa yoon wamu maqaa kee giiftii koo (2x)\n" +
            "Abdiin qaba haa baduu dinni koo\n" +
            "Firootan koo hunduu kufaati koo eganii\n" +
            "Yommuma hiyomee bela'aa jedhanii\n" +
            "\n" +
            "Hiyumaa koo ilaaltee ati naa dirmatee\n" +
            "Cinaa koo dhabbaachuun seena koo jijjirtee\n" +
            "Kan ati kabaje eenyutu salphisaa\n" +
            "Kan ati eebbifte eenyutu abaaraa\n" +
            "\n" +
            "Sin faarfaadha kunnoo Maariyaam koo jedhe\n" +
            "Giiftii galatomii kan olol na qabdee\n" +
            "Haadha Balaayisab haadha Efreem atii\n" +
            "Gadaa koo gammachuuti naaf jijjirii ati\n" +
            "\n" +
            "Siif aarfaachuu koon jibamaa ta'ullee\n" +
            "Mana kee akkan hin dhufneef na daagasanillee\n" +
            "Sodaachisaa ta'uu adeemsi jiruu koo\n" +
            "Mana keetii hin ba'uu sodaadhee diinaa koo (2x)\n" +
            "\n" +
            "Ani hin irraanfadhu waan ati naaf gotee\n" +
            "Gaddaa koo isaa duraa odutti jijjirtee\n" +
            "Bakkan deeme maratti nan faarsa maqaa kee\n" +
            "Asiin na ga'eera giiftii kaadhanaan kee\n" +
            "Isaan naaf yaadaniif gaariis ta'ee hamaa\n" +
            "Haadha koo kaadhufi araaraafi dhiifamaa\n" +
            "\n";

    String mezmurTitle = "Ol naa qabdeta";

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
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}