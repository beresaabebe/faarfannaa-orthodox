package com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents;

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

public class Gammanneerra extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Gammannerra baayyee gammmanneerra (2)\n" +
            "Ebba isaa waaqarraas arganneerra \n" +
            "Dukkana kanture……….gammanneerra \n" +
            "Cubbuu dhaan qabamne……... >>\n" +
            "Ifni jireenya Koo ….……….…>>\n" +
            "Gara bahaa ilaalee .…………..>>\n" +
            "Iddoo aduun jirtuu …………..>>\n" +
            "Dukkanni karaa kenyaa ……...>>\n" +
            "Ilmaan qulqullaa’e..………..…>>\n" +
            "Ati ifa keenya………….. ..…>>\n" +
            "\n\n" +
            "Maariyaam giiftii koo……………..>>\n" +
            "Ani sin abdadha…………………..>>\n" +
            "Hanga du’a kootti…………….…...>>\n" +
            "Bara jireenya koo………………….>>\n" +
            "Boqonnaa lubbuu koo…………..…>>\n" +
            "Si’uma abdiin koo…………………>>\n" +
            "Gooftaa fayyisa koo……………….>>\n" +
            "\n\n" +
            "Ati biyyaa gisheen ………..gammanneerra \n" +
            "Yaa haadha gooftaa koo……….>>\n" +
            "Taatee kan argamte ………..….>>\n" +
            "Kan ittiin ka’ani ……………...>>\n" +
            "Nyaatanii dhugani …………….>>\n" +
            "Kan ittiin quufani …………. …>>\n" +
            "Golga boqonnaa Koo …….….. >>\n" +
            "Maariyaam si’uma ……….…...>>\n" +
            "\n\n" +
            "Ulfaattuun giiftiikoo….gammannerra\n" +
            "Ifni biyyaa sirra………………>>\n" +
            "Balbala Hizqi’eel ……….……>>\n" +
            "Duumessi Museedha …..……>>\n" +
            "Misiroon mooticha ……….…>>\n" +
            "Baganaan Daawwitii …..……>>\n" +
            "Warqeerra Kan caaltu …….…>>\n" +
            "Abdii an laattadhe….…….…>>\n" +
            "Firii garaa keettiin ……....….>>\n" +
            "Jireenyaa arganne………...…>>\n";

    String mezmurTitle = "58. Gammanneerra";

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