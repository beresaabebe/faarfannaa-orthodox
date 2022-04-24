package com.beckytech.faarfannaaafaanoromoo.atozsorted.jcontents;

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

public class JaalalliKeeAddaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Maariyaam (2) 'n jedhaa \n" +
            "Giiftiikoo Ani SinWaammadhaa\n" +
            "Rakkoonkoo Martinuu Tareeraa\n" +
            "Hundumtuu  Seenaa Naaf Ta'eera\n" +
            "\n" +
            "  Maariyaam Dhaloonni Martinuu\n" +
            "   >>>> >>> >> Maqaakee Haa Waaman\n" +
            " >>>> >>> >> Siin Darbanii Jiruu\n" +
            " >>>> >>> >> Dhiiga Ilmakeetiin\n" +
            "\n" +
            "Jaalallikee Adda Maal Jedhu Ayyookoo\n" +
            "Dhiifama Naaf Laatte Gooftaa Kadhatteetoo\n" +
            "Arjummaakee Maraaf Kennaa Hin Qabu Anii\n" +
            "Halkaniifi Guyyaa Sin Farfaadha Anii\n" +
            "\n" +
            "      Maariyaam Addaamiif Sanyiinsaa \n" +
            "       >>>> >>> >> Maariyaam Haa Jedhan\n" +
            "        >>>> >>> >> Sitti Hirkataniitii\n" +
            "        >>>> >>> >> Gannnati Kan Argan\n" +
            "\n" +
            "Dukkanni HinJiru Ifa Jiruun Kankoo\n" +
            "Eebba Maariyaamiitiin Guutame Keessikoo\n" +
            "Gammadeen Burraaqa Ani Akka Waatii\n" +
            "Gannata Galuudhaaf Ayyoonkoo Naaf Jirtii\n" +
            "\n" +
            "   Maariyaam Warri Sitti Abdatee\n" +
            "   >>>> >>> >> Eenyuutu Rakkatee\n" +
            "    >>>> >>> >> Oolee Osoo Hin Buliin\n" +
            "      >>>> >>> >> Furmaata Argatee\n" +
            "\n" +
            "Qilee NaFuulduraa Laalee Sodaadhullee\n" +
            "Bidiruunkoo Si'i Nan Ka'a Kufullee\n" +
            "Waadaa Fannoo Jalaa Maariyaamii Jechuun\n" +
            "Eenyumtuu Hin Qaana'uu Harmee Si Kadhachuun\n";

    String mezmurTitle = "75. Jaalalli kee addaa";

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