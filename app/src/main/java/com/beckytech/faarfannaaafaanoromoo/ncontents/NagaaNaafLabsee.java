package com.beckytech.faarfannaaafaanoromoo.ncontents;

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
import com.beckytech.faarfannaaafaanoromoo.R;
import com.beckytech.faarfannaaafaanoromoo.WaaeeApp;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NagaaNaafLabsee extends AppCompatActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Du'ee du'aa koo Kan hambisee\n" +
            "nagaa naaf labsee×2\n" +
            "Arsaa Abrahamii ~~~Eyyee\n" +
            "Nutii hin fayyinee~~~~Eyyee\n" +
            "Jaalalaa waaqayyo ~~~Eyyee\n" +
            "Kan ijjan arginee ~~~~Eyyee\n" +
            "Guyyansaa yoo gahuu~~~Eyyee\n" +
            "Durberaa Dhalatee~~~~Eyyee\n" +
            "Fannorraa kan olee ~~~~Eyyee\n" +
            "Fayyinaa nuuf latee~~~~Eyyee\n" +
            "Fannooti ol bahee nuuf dhiphatee\n" +
            "Nuu fayyifatee×2.\n" +
            "\n" +
            "Akka umamatii~~~~~Eyyee\n" +
            "Goftan ilalamee ~~~~Eyyee\n" +
            "Dhigasaan naa bitee~~~~Eyyee\n" +
            "Nagan naaf labsamee~~~~Eyyee\n" +
            "Gidiran Waqaa koo ~~~~~Eyyee\n" +
            "Anati mul'ataa ~~~~~Eyyee\n" +
            "Dandin jirenyaa koo~~~~Eyyee\n" +
            "Isan naaf mijjataa~~~~Eyyeee.\n" +
            "Uummamni hundumtuu sii faarfataa\n" +
            "Nuuf dessee goftaa×2.\n" +
            "\n" +
            "Duran kan yaddamtee ~~~~Eyyee\n" +
            "Yaada abba keessatti ~~~~Eyyee\n" +
            "Hatii Amanu'el ~~~~Eyyee\n" +
            "Nafis hadhaa kotii~~~~Eyyee\n" +
            "Atii midhaginaa koo~~~~Eyyee\n" +
            "Yaa durbee hadhaa koo~~~~Eyyee\n" +
            "Akka jedhan miti ~~~~Eyyee\n" +
            "Naaf kadhuu goftaa koo~~~~Eyyee\n" +
            "Uummamnii hundumtuu sii faarfataa\n" +
            "Nuuf dessee goftaa\n" +
            "Du'ee du'aa koo kan hanbisee\n" +
            "Nagaa naaf labsee.\n" +
            "\n" +
            "Durbee Maariyaami qulqulletti\n" +
            "Mi'oftu yaa hadhaa motii×2\n" +
            "Mi'ofituu ~~yaa hadhaa motii\n" +
            "Mi'oftuu ~~~yaa hadhaa motii\n" +
            "Ummamnii hunduu sii wammataa \n" +
            "Waqayyoon situu kadhataa ×2\n" +
            "Waqayoon ~~~situu kadhataa\n" +
            "Waqayoon ~~~situu kadhataa\n" +
            "Mallatodhaa Biyyaa kenyaa \n" +
            "Tawahidoon Amantaa dhugaa×2\n" +
            "\n" +
            "Tawahidoon ~~~ Amantaa dhugaa\n" +
            "Tawahidoon ~~~Amantaa dhugaa\n" +
            "Fuula waqaa ni dhabataa Gabri'eel nu'if kadhataa×2\n" +
            "Gabri'eel ~~~nu'if kadhataa\n" +
            "Gabri'eel ~~~nu'if kadhataa\n" +
            "Kan gargartee Isra'elii mika'el kotu araranii×2\n" +
            "Mikaa'el ~~~~ kotuu araranii\n" +
            "Mika'el ~~~~kotuu araranii\n" +
            "Kiristoosin amanamtee \n" +
            "Arseman kinoo nuuf dhuftee×2\n" +
            "\n" +
            "Arseman ~~~~ kinoo nuuf dhuftee\n" +
            "Arseman ~~~~kinoo nuuf dhuftee\n" +
            "Lafaratii kan dhalatee yohanis Enyuu Akki Kee×2\n" +
            "Yohanis ~~~~enyuu Akkii kee\n" +
            "Yohanis ~~~~enyuu Akkii kee\n" +
            "Waregamaa giyoorgisi \n" +
            "nuuf kotuu maloo hardhasii×2\n" +
            "Nuuf kotuu ~~~~ maloo hardhasii\n" +
            "Nuuf kotuu ~~~~maloo hardhasii\n" +
            "Kan kabajee qulqulotaa ni argata tolotaa×2\n" +
            "Nii Argataa ~~~~ Gatii tolotaa×4\n";

    String mezmurTitle = "Nagaa naaf labsee";

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
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (item.getItemId() == R.id.aboutusmenu) {
            startActivity(new Intent(this, AboutUs.class));
        }

        if (item.getItemId() == R.id.sharemenu) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo");
            intent.putExtra(Intent.EXTRA_TEXT, "Download this useful app's from Google play \n https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo");
            startActivity(Intent.createChooser(intent,"Share app's link via "));
        }

        if (item.getItemId() == R.id.starmenu) {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo";
            Intent  intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

        if (item.getItemId() == R.id.checkUpdateMenu) {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo";
            Intent  intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

        if (id == R.id.exitmenu) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Cufu barbaade?")
                    .setCancelable(false)
                    .setPositiveButton("Eeyyeen", (dialogInterface, i) -> finish())
                    .setNegativeButton("Lakki", (dialogInterface, i) -> dialogInterface.cancel()).create().show();
        }

        if (id == R.id.moreappmenu) {
            startActivity(new Intent(this, MoreApps.class));
        }

        if (id == R.id.aboutappmenu) {
            startActivity(new Intent(this, WaaeeApp.class));
        }

        if(id == R.id.galatamenu) {
            startActivity(new Intent(this, GalataActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    private void initUI() {
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setIcon(R.drawable.ic_launcher_foreground);
        mActionBar.setDisplayShowCustomEnabled(true);
        mActionBar.setCustomView(R.layout.custom_actionbar_layout);
        mActionBar.setTitle("Abbaafi Ilma");
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#0A6E73"));
        mActionBar.setBackgroundDrawable(colorDrawable);
    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}