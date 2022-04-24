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

public class EenyuuOgeessiAkkaKee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Eenyu ogeessi akka kee\n" +
            "Hin jiru fakkenyi kee\n" +
            "Samii utubaa malee jabeessitee\n" +
            "Ajaa'ibaa kan kee maaltu sitti hirrate\n" +
            "\n\n" +
            "Qorattoonni addunyaa waliin mormanii\n" +
            "Waan akkanaa argannee jechuun lallabanii\n" +
            "Namni ogummaa isaattin maal hojjetaa\n" +
            "Yootii ibsiitteef malee maal hubata\n" +
            "\n\n" +
            "Yeroosaa hin dagattu aduudhaaf bokkaa\n" +
            "Gooftaa waanti hundumtuu yoommuu sii harkaa\n" +
            "Kennaan kan kee gati maleedhaa\n" +
            "Isa xiqqaa guddaaf wal qixxeedhaa\n" +
            "\n\n" +
            "Alfaa oomeegaadha baraan jiraatta\n" +
            "Kan nuti feenusi dursitee beekta\n" +
            "Hir'uu hin qabu hojiin kee hundisaa\n" +
            "Qalbii nama hata tilmaamuunsaa\n" +
            "\n\n" +
            "Digdamii afranii jarreen maanguddoonnii\n" +
            "Faarfatu maqaa kee wal harkaa fuudhanii\n" +
            "Ati amanamaadha qulqulluudhaa\n" +
            "Yoommuu ulfina keef uggumuudhaa\n" +
            "\n" +
            "F/ttu Warqineesh Asfawu";

    String mezmurTitle = "Eenyuu ogeessi akka kee";

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