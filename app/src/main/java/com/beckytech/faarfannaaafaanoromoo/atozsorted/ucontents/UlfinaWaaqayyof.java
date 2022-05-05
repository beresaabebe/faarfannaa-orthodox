package com.beckytech.faarfannaaafaanoromoo.atozsorted.ucontents;

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
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UlfinaWaaqayyof extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Ulfina waaqayyoof harka koon oli geessa\n" +
            "Amma reefun ba'ee Dukkanicha keessaa\n" +
            "Yaadni koos deebi'e eenyummaa koos baree\n" +
            "Karaan jireenya koo wangeelan diriiree\n" +
            "\t\tCeesisa\n" +
            "Gamana dhaabadhee biyyaa baadisaatti \n" +
            "Gaamatti ilaale qaraniyoorraatti\n" +
            "Hoolicha waaqayyoo isa tsihoon gubba\n" +
            "Abaarsi seexana kanaan nurra darbaa\n" +
            "\t\tCeesisa\n" +
            "Ajaa’ibsiifadhe seenaa eenyummaa koo\n" +
            "Galaana yoordanoos biyyi dhaloota koo\n" +
            "Hafuura qulqullu jedhama lammiin koo\n" +
            "Iyyesuus Kiristoos kayyoo jireenya koo\n" +
            "\t\tCeesisa\n" +
            "Isa jaaladheef miti isaa na jaalate\n" +
            "Jireenya isa dhumneef jedhe naa filatee\n" +
            "Jaalalasaa arge qaraniyoo irraatti\n" +
            "Boqonnaan argadhe fannoosaa jalatti\n";

    String mezmurTitle = "140. Ulfina waaqayyof";

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