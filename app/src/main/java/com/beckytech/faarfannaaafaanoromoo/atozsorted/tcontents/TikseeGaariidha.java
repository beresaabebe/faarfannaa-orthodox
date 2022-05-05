package com.beckytech.faarfannaaafaanoromoo.atozsorted.tcontents;

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

public class TikseeGaariidha extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Tiksee gaariidha ati Tiksee hin dagannee\n" +
            "Yaa uumaa ummatoota nuti sii Abdannee\n" +
            "Ammas nuu tifkadhuu yaa Abbaa Jaalala(2)\n" +
            "\t\tCeesisa\n" +
            "Tiksee Gaarii ta'ee jaalalan nu tiksuuf\n" +
            "Ofitti nuu qabee inni nuu kunuunsuuf\n" +
            "Cubbuu hunda keenya isatu nuu dhisee\n" +
            "Madaa hunda keenyaas isatu nuu gogsee\n" +
            "\t\tCeesisa\n" +
            "Gooftaa Iyyesuus maaloo nuu Eebisii\n" +
            "Yaa waaqayyoo uumaa ati nuu fayyisii\n" +
            "Mana kee keessatti akka nuti hin badne\n" +
            "Ati nu yaadadhu akka kufene hin hafnee\n" +
            "\t\tCeesisa\n" +
            "Yeroo Rakkoo keenyas inni nuu gaafataa\n" +
            "Dhiphina keessayiis inni nuu Baafata\n" +
            "Abbaa gaari qabna Amaanaa yaa nama\n" +
            "Nama hin dagaatu inni hamma dhumaa\n" +
            "F/taa Koo'elin (Geetahun)\n";

    String mezmurTitle = "136. Tiksee gaariidha ati";

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