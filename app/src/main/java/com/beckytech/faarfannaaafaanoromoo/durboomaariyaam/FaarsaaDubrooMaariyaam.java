package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

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
import com.beckytech.faarfannaaafaanoromoo.darajee.AfaanKeenyaaHinQabu;
import com.beckytech.faarfannaaafaanoromoo.darajee.Darajee;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class FaarsaaDubrooMaariyaam extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Abbaan keenya yaa'iqoob", "Akka Mikaa'elaa Ergamaa", "Anis dhalootadha", "Araarsitu Maariyaam", "Beela keef dheebuu kee",
            "Eenyuttan himadhaa", "Gammadaa namoota", "Gammadii kaa", "Giiftii koo Maariyaam", "Haadha koo", "Haadha waaqa kan madaanalamii",
            "Hin dogogorre nutti", "Isheen hoo", "Jecha keessaa", "Latiin Jirma Qabaa", "Maaluma", "Maaramii giiftii koo", "Maaramiin qubeedha",
            "Maariyaam dubroo", "Maariyaam harmee Iyyesuus", "Maariyaamiin gadda lubbuu", "Mucaa kee baachudhaan", "Museen kan argee",
            "Nagaadhaan nu koottu", "Ni moo'ate", "Nuu araarsi", "Nuuf kadhadhu", "Nuuf kadhadhu giiftii", "Nuuf kadhadhu giiftii keenyaa",
            "Obboleettii ergamootaa", "Oolmaan kee yaa giiftii", "Qoricha foon keenya", "Qulqulloota irra qulqulluu", "Raawwatame Hannaa",
            "Si galateffannaa", "Uumama hunduma irra", "Yaa garaa laafeetti", "Yaa giiftii koo", "Yaa giiftii koo abdii jireenya koo",
            "Yaa haadha keenya Maariyaamii"
    };

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Giiftii Maariyaam");

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
                    startActivity(new Intent(this, AbbaanKeenyaYaaiqoob.class));
                    break;
                case 1:
                    startActivity(new Intent(this, AkkaMikaaelaaErgamaa.class));
                    break;
                case 2:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaDubrooMaariyaam.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaDubrooMaariyaam.this, AnisDhallootadha.class));
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
                        startActivity(new Intent(FaarsaaDubrooMaariyaam.this, AnisDhallootadha.class));
                    }
                    break;
                case 3:
                    startActivity(new Intent(this, AraarsituMaariyaam.class));
                    break;
                case 4:
                    startActivity(new Intent(this, BeelaKeefDheebuuKee.class));
                    break;
                case 5:
                    startActivity(new Intent(this, EenyuttanHimadhaa.class));
                    break;
                case 6:
                    startActivity(new Intent(this, GammadaaNamoota.class));
                    break;
                case 7:
                    startActivity(new Intent(this, GammadiiKaa.class));
                    break;
                case 8:
                    startActivity(new Intent(this, GiiftiiKooMaariyaam.class));
                    break;
                case 9:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaDubrooMaariyaam.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaDubrooMaariyaam.this, HaadhaKoo.class));
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
                        startActivity(new Intent(this, HaadhaKoo.class));
                    }
                    break;
                case 10:
                    startActivity(new Intent(this, HaadhaWaaqaKanMadaanalamii.class));
                    break;
                case 11:
                    startActivity(new Intent(this, HinDogogorreNuti.class));
                    break;
                case 12:
                    startActivity(new Intent(this, IsheenHoo.class));
                    break;
                case 13:
                    startActivity(new Intent(this, JechaKeessaa.class));
                    break;
                case 14:
                    startActivity(new Intent(this, LatiinJirmaQabaa.class));
                    break;
                case 15:
                    startActivity(new Intent(this, Maaluma.class));
                    break;
                case 16:
                    startActivity(new Intent(this, MaaramiGiiftiKoo.class));
                    break;
                case 17:
                    startActivity(new Intent(this, MaaramiinQubeedha.class));
                    break;
                case 18:
                    startActivity(new Intent(this, MaariyaamDubroo.class));
                    break;
                case 19:
                    startActivity(new Intent(this, MaariyaamHarmeeIyyesuus.class));
                    break;
                case 20:
                    startActivity(new Intent(this, MaariyaamiinGaddaLubbuu.class));
                    break;
                case 21:
                    startActivity(new Intent(this, MucaaKeeBaachudhaan.class));
                    break;
                case 22:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaDubrooMaariyaam.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaDubrooMaariyaam.this, MuseenKanArgee.class));
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
                        startActivity(new Intent(this, MuseenKanArgee.class));
                    }
                    break;
                case 23:
                    startActivity(new Intent(this, NagaadhaanNuKottuu.class));
                    break;
                case 24:
                    startActivity(new Intent(this, NiMoaate.class));
                    break;
                case 25:
                    startActivity(new Intent(this, NuuAraarsi.class));
                    break;
                case 26:
                    startActivity(new Intent(this, NuufKadhadhu.class));
                    break;
                case 27:
                    startActivity(new Intent(this, NuufKadhadhuGiiftii.class));
                    break;

                case 28:
                    startActivity(new Intent(this, NuufKadhadhuGiiftiiKeenya.class));
                    break;

                case 29:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaDubrooMaariyaam.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaDubrooMaariyaam.this, ObboleettiiErgamootaa.class));
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
                        startActivity(new Intent(this, ObboleettiiErgamootaa.class));
                    }
                    break;

                case 30:
                    startActivity(new Intent(this, OolmaanKeeYaaGiiftii.class));
                    break;

                case 31:
                    startActivity(new Intent(this, QorichaFoonKeenya.class));
                    break;
                case 32:
                    startActivity(new Intent(this, QulqullootaIrraQulqulluu.class));
                    break;

                case 33:
                    startActivity(new Intent(this, RaawwatameHannaa.class));
                    break;

                case 34:
                    startActivity(new Intent(this, SiGalateffannaa.class));
                    break;
                case 35:
                    startActivity(new Intent(this, UumamaHundumaIrraa.class));
                    break;

                case 36:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(FaarsaaDubrooMaariyaam.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(FaarsaaDubrooMaariyaam.this, YaaGaraaLafeetti.class));
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
                        startActivity(new Intent(this, YaaGaraaLafeetti.class));
                    }
                    break;

                case 37:
                    startActivity(new Intent(this, YaaGiiftiiKoo.class));
                    break;
                case 38:
                    startActivity(new Intent(this, YaaGiiftiiKooAbdijireenyaKoo.class));
                    break;

                case 39:
                    startActivity(new Intent(this, YaaHaadhaKeenyaMaariyaamii.class));
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