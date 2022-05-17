package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

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

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class FaarsaaDhaloota extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Ati ati Beteliheem lafa Yihudaa",
            "Beeteliyeemitti raajiin raawwateera",
            "Dalla keessa ciisee huccuudhaan marame",
            "Galanni haa ga'u Amanu'eeliin",
            "Ishoo Gooftaan Nuu Dhalate Qorichi Keenya",
            "Ishoo ishoo nuu dhalate",
            "Kunoo dhalatera fayyisaan addunyaa",
            "Mooraa Loonii Keessatti",
            "Nu fayyisudhaf Kan dhalate Amanu’elidha",
            "Beeteliyeemitti raajiin raawwateera",
            "Warri haayyoota dhufan Urjii hordofani"
    };

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Yeroo Dhaloota - Gannaa");

        MobileAds.initialize(this, initializationStatus -> {
        });

        setAds();

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(this, AtiAtiBeteliheem.class));
                    break;
                case 1:
                    startActivity(new Intent(this, Beeteliyeemitti.class));
                    break;
                case 2:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaDhaloota.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaDhaloota.this, DallaKeessaCiisee.class));
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
                        startActivity(new Intent(this, DallaKeessaCiisee.class));
                    }
                    break;
                case 3:
                    startActivity(new Intent(this, GalanniHaaGauAmanueeliini.class));
                    break;
                case 4:
                    startActivity(new Intent(this, IshooGooftaanNuuDhalateQorichiKeenya.class));
                    break;
                case 5:
                    startActivity(new Intent(this, IshooIshooNuuDhalate.class));
                    break;
                case 6:
                    startActivity(new Intent(this, KunooDhalatera.class));
                    break;
                case 7:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaDhaloota.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaDhaloota.this, MooraaLooniiKeessatti.class));
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
                        startActivity(new Intent(this, MooraaLooniiKeessatti.class));
                    }
                    break;
                case 8:
                    startActivity(new Intent(this, NuFayyisudhaf.class));
                    break;
                case 9:
                    startActivity(new Intent(this, SamiiIrraaNiBuee.class));
                    break;
                case 10:
                    startActivity(new Intent(this, UrjiidhaanDhufan.class));
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