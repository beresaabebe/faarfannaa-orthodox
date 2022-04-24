package com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents;

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

public class Eeyyeennii extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Dursii gooftaa dura koo\n" +
            "Amaanu'eel Waaqa koo uumaa koo (3x)\n" +
            "Eeyyeen dursi ati dura koo(4x)\n" +
            "Gooftaa Iyyeesuus haa qaana'uu diinni koo\n" +
            "\n\n" +
            "Sootroo saabeeqiidhaa Maariyaam giiftiidhaa(3x)\n" +
            "Eeyyeen gannatni cufamamnan sababa Hewaaniin\n" +
            "Kunoo nuuf banamee dubroo Maariyaamiin\n" +
            "Eyyeenii giiftii Maariyaamiin\n" +
            "\n\n" +
            "Nurraa adda hin bahinii eegumsa keetiinii (3x)\n" +
            "Eeyyeen Mikaa'eel (2x) gargaaraa Daani'eel (2x)\n" +
            "Eeyyeen mo'ataa saxinaa'eel\n" +
            "\n\n" +
            "Arseemaan jabaattee mootii dirxaadisiin mo'attee(2x)\n" +
            "Eeyyeen kan kee ajaa'ibumaa Qulqulleetti Arseemaa\n" +
            "Hin callisu qabsuura keen himaa\n";

    String mezmurTitle = "41. Eeyyeennii";

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