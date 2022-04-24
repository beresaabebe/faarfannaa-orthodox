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
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HalleeLuyyaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Haalee luyyaa 3x) jedhaati galateefadhaa\n" +
            "Waaqni humna qabeesaa kan isan qixxatu tasummaa eenyuudhaa\n" +
            "\n\n" +
            "Bakka inni dhaabbate eenyuutu dhaabbataa\n" +
            "Gargaarsa hin barbaadu qofaasaa jiraataa\n" +
            "Waan hundumaa mo'ee hunduu isaan gadii\n" +
            "Waaqa akkasii qabda lubbuu koo gammadii\n" +
            "\n\n" +
            "Baayyee sodachisa fuula isaa dhaabbachuun\n" +
            "Qaamni isaa ifasaaf hin argamu ijaan\n" +
            "Warrii ga'oo ta'aan ergamooni isaayyuu\n" +
            "Sodaafi hollachuudhaan fuulasaatti ba'uu\n" +
            "\n\n" +
            "Waan hin jirree fidee kan jiraachisuudhaa\n" +
            "Kan jirus barbaannaan akka hin jirree godhaa\n" +
            "\n\n" +
            "Hundumaa danda'aa waaqayyoo jabaadha\n" +
            "Kabajaa guddaadhaan fuulasaa dhaabbadhaa.\n" +
            "\n\n" +
            "F/taa D/n Garramuu Baayisaa";

    String mezmurTitle = "Haalee luyyaa";

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