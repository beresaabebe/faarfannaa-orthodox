package com.beckytech.faarfannaaafaanoromoo;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class GalataActivity extends OptionsMenuActivity {

    TextView textContents, textTitle;
    ImageView imageView;
    String titles = "Galata";
    String contents = "<p style='text-align:justify;'> Jalqaba irratti app kana akkan hojjedhu" +
            " osoo abdiin kutiin, boodattis osoo hin deebi'in yeroo hundaa ciminaa naaf ta'ee" +
            "kan nakakase <b>Waaqayyoof</b> galanni haa ta'u. Fayyuu keenyaaf sababa kan taate haadha" +
            " keenya qulqulleetti dubroo Maariyaamif akkasumas ergamoota qulqulloota hundaaf akka aangoofi " +
            "aboo isaaniif keennamen kan galateffamaan haa ta'an.</p>" +
            "<p style='text-align:justify;'>Itti ansuudhaan Maatiin koo, hiriyyoonni koo akkasumas namootni na beektanis ta'ee kanneen " +
            "na hin beekne yeroo hundaa haalla adda addaattin jajabbinaa naaf taasiftani Waaqayyoon gatii lubbuu " +
            "isiniif haa taasisuun. Ameen.</p>" +
            "<p style='text-align:justify;'>Walaloo faarfannawwani bakkaa tokkootti qindeessun akkan app kana bifa salphaafi" +
            "itti fayyadamuuf nama hin rakkisneetti tolutti akka hojjedhuf kan naaf kennee Faarfataa <b> Koo'eel Shawaa</b> f" +
            " galanni koo guddaadha. Waaqayyoon ammas kana caala nama mana isaa keessa taajajiluu si haa taasisu. Eebbii abboota " +
            "qulqulloota, ayyaanni isaanif sif haa baay'atu.</p>" +
            "<p style='text-align:justify;'>Isiniis app kan Google play irraa busuun jaallachun waan itti fayyadmatanniif galannii keessa " +
            "jireenya bara baraa isiniif haa ta'u. Ameen!</p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galata);
        textContents = findViewById(R.id.textContents);

        initUI(titles);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textTitle = findViewById(R.id.textTitle);
        textTitle.setText(titles);

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N) {
            textContents.setText(Html.fromHtml(contents,Html.FROM_HTML_MODE_COMPACT));
        }
        else {
            textContents.setText(Html.fromHtml(contents));
        }

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(view -> {
            Toast.makeText(GalataActivity.this, "Share me, let other know about me!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, R.string.app_name);
            intent.putExtra(Intent.EXTRA_TEXT, R.string.app_name);
            startActivity(Intent.createChooser(intent,"Share me via "));
        });

    }
}