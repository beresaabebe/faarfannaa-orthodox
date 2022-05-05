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
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GammadiiKaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Gammadii kaa gammadii kaa yaa maariyaam gammadii kaa\n" +
            "Gammadii kaa gammadii kaa yaa maariyaam gammadii kaa\n" +
            "\n" +
            "Gara kee dhufee ~~~gammadii kaa\n" +
            "Gabri'eel ergamee~~~~Gammadii kaa\n" +
            "Gammadii jedhee ~~~~gammadii kaa\n" +
            "Sii galateeffatee~~~~ Gammadii kaa\n" +
            "Jedhee ayyaana qabeetti~~~gammadii kaa\n" +
            "Dubroo qulqulletii ~~~~Gammadii kaa\n" +
            "\n" +
            "Gammadii kaa gammadii kaa yaa maariyaam gammadii kaa\n" +
            "Qaanaa galiilattii ~~~~gammadii kaa \n" +
            "Mana cidhaattii ~~~~Gammadii kaa\n" +
            "Dokkimas dhiphatee~~~~gammadii kaa\n" +
            "Wayinin dhumatee ~~~~gammadii kaa\n" +
            "Guuteef dinqasaa ~~~~gammadii kaa \n" +
            "Laaltee hirdhina saa ~~~gammadii kaa\n" +
            "\n" +
            "Si jaalannaa si jaalannaa Maariyaam si jaalannaa\n" +
            "Si jaalannaa si jaalannaa Haadha keenya si jaalannaa\n" +
            "Sanyii nuuf haftee ~~~~Si jaalannaa \n" +
            "Fayyinaaf taate ~~~~Si jaalannaa \n" +
            "Osoo ati hin jirree ~~~~Si jaalannaa \n" +
            "Gubanet turee ~~~~Si jaalannaa \n" +
            "Kanaf sii jaalannaa ~~~~Si jaalannaa \n" +
            "Lapheen sii waamna~~~~Si jaalannaa \n" +
            "\n" +
            "Si jaalannaa si jaalannaa Maariyaam si jaalannaa\n" +
            "Nuuf deessee ati ~~~~Si jaalannaa \n" +
            "Waaqa Waaqota ~~~~Si jaalannaa \n" +
            "Beetelemittii ~~~~Si jaalannaa \n" +
            "Mootii Moototaa ~~~~Si jaalannaa \n" +
            "Kanaf sii wamnee ~~~~Si jaalannaa \n" +
            "Maariyaam sin jennee~~~~Si jaalannaa \n" +
            "\n" +
            "Nuuf kadhadhu nuuf kadhadhu Maariyaam nuuf kadhadhu\n" +
            "Nuuf kadhadhu nuuf kadhadhu Kiristoosin nuuf kadhadhu\n" +
            "Rakkina Dookmaas ~~nuuf kadhadhu \n" +
            "Ati kan hubattee ~~~~nuuf kadhadhu \n" +
            "Rakkannee hardhaas ~~nuuf kadhadhu\n" +
            "Yeeyyiin nu seentee ~~~nuuf kadhadhu \n" +
            "Haadha kadhannaa ~~~nuuf kadhadhu \n" +
            "Maariyaam si waamna~~nuuf kadhadhu\n" +
            "\n" +
            "Nuuf kadhadhu nuuf kadhadhu Ilma keeti nuuf kadhadhu\n" +
            "Waadaa Fayyinaa ~~~nuuf kadhadhu \n" +
            "Guyyaa rakkina~~~nuuf kadhadhu \n" +
            "Nuto sii waamna~~nuuf kadhadhu \n" +
            "Yeroo dhiphinaa~~~nuuf kadhadhu \n" +
            "Sii qabaneerraa ~~~nuuf kadhadhu \n" +
            "Haadha araraa ~~~nuuf kadhadhu\n" +
            "\n" +
            "Na dagatin gafaa murtii Maariyaam Qulqulleetti\n" +
            "Na dagatin gafaa murtii Maariyaam Qulqulleetti\n" +
            "Dhiphadheen jiraa~~ Naa dagatin \n" +
            "Hin qabuu firaa ~~~Naa dagatin \n" +
            "Sitti of kenneraa ~~~~Naa dagatin \n" +
            "Waadaa araraa ~~~~Naa dagatin \n" +
            "Hadhaa koo adaraa~~~Naa dagatin \n" +
            "Murtii hamaarraa ~~~Naa dagatin \n" +
            "\n" +
            "Na dagatin gafaa murtii Maariyaam Qulqulleetti\n" +
            "Qabaadhu Eebbaa kee~~~Naa dagatin \n" +
            "Seenii mana koo ~~~~Naa dagatin \n" +
            "Naaf kadhuu ilma kee~~~Naa dagatin \n" +
            "Waayyee cubbuu koo~~~~Naa dagatin \n" +
            "Maariyaam adaraa~~~~Naa dagatin \n" +
            "Murtii du'arraa~~~~Naa Dagatin \n" +
            "Na dagatin gafaa murtii Maariyaam Qulqulleetti\n" +
            "Na dagatin gafaa murtii Maariyaam Qulqulleetti\n";

    String mezmurTitle = "57. Gammadii kaa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbaaf_ilma);

        initUI(mezmurTitle);

        MobileAds.initialize(this, initializationStatus -> {
        });

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