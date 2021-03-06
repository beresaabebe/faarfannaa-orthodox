package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

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
import com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa.FaarsaaCidhaa;
import com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa.RaajiidhaDinqiidha;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class FaarsaaCuuphaa extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Amantiif Cuuphaadhaa",
            "Beenaa ni deemna Yordaanoosi",
            "Cuuphaamuusan Yoordaanositti",
            "Cuuphame Gooftaan keenya",
            "Cuuphame jira Gooftaan Cuuphameera",
            "Deeme Iyyesuus",
            "Dhuufe jechi",
            "Galiilati dhaqe gara Yohaannisi",
            "Ganna soddomatti",
            "Gooftaasaa dursee yordaanosiin",
            "Harka Yohaannisiin cuuphame",
            "Ilma Abbaa Ilma Maariyaami",
            "Iyyesuus Cuuphame nutis fayyinee",
            "Jechi dhufee",
            "Ni bu’e ilmi ወረደ ወልድ",
            "Ni cuuphame Iyyasuusii Yohaannisiin Yoordanoositti",
            "Nutii cuuphamnee gooftaa uffannee",
            "Nuuf cuuphame",
            "Raajiidhaa cuphamuun Gooftadhaa",
            "Sagaltamii saglanu saglanu ergamoota",
            "Walakkaa galaanaa",
            "Yordaanosi dhaloonni koo",
            "Yordaanos gammaddee hedduus ni carroomtee",
            "Yordanositti nuuf cuuphameera",
            "Yordaanositti cuuphame Amanu'eel"
    };

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Yeroo Cidhaa");

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
                    startActivity(new Intent(this, AmantiifCuuphaadhaa.class));
                    break;
                case 1:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaCuuphaa.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaCuuphaa.this, BeenaaNiDeemna.class));
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
                        startActivity(new Intent(this, BeenaaNiDeemna.class));
                    }
                    break;
                case 2:
                    startActivity(new Intent(this, CuuphaamuusanYoordaanositti.class));
                    break;
                case 3:

                    startActivity(new Intent(this, Cuuphame.class));
                    break;
                case 4:
                    startActivity(new Intent(this, CuuphameJira.class));
                    break;
                case 5:
                    startActivity(new Intent(this, DeemeIyyesuus.class));
                    break;
                case 6:
                    startActivity(new Intent(this, DhufeJechi.class));
                    break;
                case 7:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaCuuphaa.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaCuuphaa.this, GaliilatiDhaqe.class));
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
                        startActivity(new Intent(this, GaliilatiDhaqe.class));
                    }
                    break;
                case 8:
                    startActivity(new Intent(this, GannaSoddomatti.class));
                    break;
                case 9:
                    startActivity(new Intent(this, GooftaasaaDursee.class));
                    break;
                case 10:
                    startActivity(new Intent(this, HarkaYohaannisiinCuuphame.class));
                    break;
                case 11:
                    startActivity(new Intent(this, IlmaAbbaaIlmaMaariyaami.class));
                    break;
                case 12:
                    startActivity(new Intent(this, IyyesuusCuuphame.class));
                    break;
                case 13:
                    startActivity(new Intent(this, JechiDhufee.class));
                    break;
                case 14:
                    startActivity(new Intent(this, NiBueIlmi.class));
                    break;
                case 15:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaCuuphaa.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaCuuphaa.this, NiCuuphameIyyesuus.class));
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
                        startActivity(new Intent(this, NiCuuphameIyyesuus.class));
                    }
                    break;
                case 16:
                    startActivity(new Intent(this, NutiCuuphamne.class));
                    break;
                case 17:
                    startActivity(new Intent(this, NuufCuuphame.class));
                    break;
                case 18:
                    startActivity(new Intent(this, RaajiidhaaCuphamuunGooftadhaa.class));
                    break;
                case 19:
                    startActivity(new Intent(this, SagaltamiiSaglanu.class));
                    break;
                case 20:
                    startActivity(new Intent(this, WalakkaaGalaanaa.class));
                    break;
                case 21:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaCuuphaa.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaCuuphaa.this, YoordaanoosiDhaloonniKoo.class));
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
                        startActivity(new Intent(this, YoordaanoosiDhaloonniKoo.class));
                    }
                    break;
                case 22:
                    startActivity(new Intent(this, YordaanosGammaddee.class));
                    break;
                case 23:
                    startActivity(new Intent(this, Yordaanositti.class));
                    break;
                case 24:
                    startActivity(new Intent(this, YordaanosittiCuuphameAmanueel.class));
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