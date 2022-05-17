package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.beckytech.faarfannaaafaanoromoo.MainHomeActivity;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.beckytech.faarfannaaafaanoromoo.lameen2011.Lameen2011;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class AdaaneeAsraat extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {"Akka bishaan darbee",
            "An siin eebbifamee",
            "Fayyisuu kee",
            "Foonsaa muree",
            "Guddina kee",
            "Horree bulleerra",
            "Kan akka waaqayyoo",
            "Kennaa guyyaa jimaataa",
            "Kiristoos isumaa",
            "Mikaa'eel naaf dhufee",
            "Qaraniyoo",
            "Tiksee gaariin qabaa",
            "Yaa maariyamii giiftii koo",
            "Yaada keen dubroodha"
    };

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Adaanee Asraat");

        MobileAds.initialize(this, initializationStatus -> {});

        setAds();

        listView = findViewById(R.id.list_item);

        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, songTitles);
        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
           switch (i) {
               case 0:
                   startActivity(new Intent(AdaaneeAsraat.this, AkkaBishaanDarbee.class));
                   break;
               case 1:
                   startActivity(new Intent(AdaaneeAsraat.this, AnSiinEebbifamee.class));
                   break;
               case 2:
                   startActivity(new Intent(AdaaneeAsraat.this, FayyisuuKee.class));
                   break;
               case 3:
                   if (mInterstitialAd != null) {
                       mInterstitialAd.show(AdaaneeAsraat.this);
                       mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                           @Override
                           public void onAdDismissedFullScreenContent() {
                               super.onAdDismissedFullScreenContent();
                               startActivity(new Intent(AdaaneeAsraat.this, FoonsaaMuree.class));
                               mInterstitialAd = null;
                               setAds();
                           }

                           @Override
                           public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                               // Called when fullscreen content failed to show.
                               Log.d("TAG", "The ad failed to show.");
                           }

                           @Override
                           public void onAdShowedFullScreenContent() {
                               // Called when fullscreen content is shown.
                               // Make sure to set your reference to null so you don't
                               // show it a second time.
                               mInterstitialAd = null;
                               Log.d("TAG", "The ad was shown.");
                           }
                       });
                   } else {
                       startActivity(new Intent(AdaaneeAsraat.this, FoonsaaMuree.class));
                   }
                   break;
               case 4:
                   startActivity(new Intent(AdaaneeAsraat.this, GuddinaaKee.class));
                   break;
               case 5:
                   startActivity(new Intent(AdaaneeAsraat.this, HorreeBulleerra.class));
                   break;
               case 6:
                   startActivity(new Intent(AdaaneeAsraat.this, KanAkkaWaaqayyoo.class));
                   break;
               case 7:
                   startActivity(new Intent(AdaaneeAsraat.this, KennaaGuyyaaJimaata.class));
                   break;
               case 8:
                   startActivity(new Intent(AdaaneeAsraat.this, KiristoosIsuma.class));
                   break;
               case 9:
                   if (mInterstitialAd != null) {
                       mInterstitialAd.show(AdaaneeAsraat.this);
                       mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                           @Override
                           public void onAdDismissedFullScreenContent() {
                               super.onAdDismissedFullScreenContent();
                               startActivity(new Intent(AdaaneeAsraat.this, MikaaeelNaafDhufee.class));
                               mInterstitialAd = null;
                               setAds();
                           }

                           @Override
                           public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                               // Called when fullscreen content failed to show.
                               Log.d("TAG", "The ad failed to show.");
                           }

                           @Override
                           public void onAdShowedFullScreenContent() {
                               // Called when fullscreen content is shown.
                               // Make sure to set your reference to null so you don't
                               // show it a second time.
                               mInterstitialAd = null;
                               Log.d("TAG", "The ad was shown.");
                           }
                       });
                   } else {
                       startActivity(new Intent(AdaaneeAsraat.this, MikaaeelNaafDhufee.class));
                   }
                   break;
               case 10:
                   startActivity(new Intent(AdaaneeAsraat.this, Qaraniyoo.class));
                   break;
               case 11:
                   startActivity(new Intent(AdaaneeAsraat.this, TikseeGaariinQabaa.class));
                   break;
               case 12:
                   startActivity(new Intent(AdaaneeAsraat.this, YaadaKeenDubroodha.class));
                   break;
               case 13:
                   startActivity(new Intent(AdaaneeAsraat.this, YaaMaariyamiiGiiftiiKoo.class));
                   break;
           }
        });
    }

    static class CustomAdapter extends ArrayAdapter<String> {
        Context context;
        String[] title;

        CustomAdapter(Context context, String[] title) {
            super(context, R.layout.listitem, title);
            this.context = context;
            this.title = title;
        }

        @SuppressLint("SetTextI18n")
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View row = inflater.inflate(R.layout.listitem, parent, false);
            TextView textView = row.findViewById(R.id.textView1);
            String symbolSign = "\uD83C\uDF39✝\uD83C\uDF39";
            textView.setText(symbolSign +" "+ title[position]);
            return row;
        }

    }

    private void setAds() {
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,getString(R.string.test_interstitial_ads_unit_id), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mInterstitialAd = null;
                    }
                });
    }
}