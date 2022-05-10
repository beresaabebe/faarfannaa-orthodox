package com.beckytech.faarfannaaafaanoromoo.faarsaakooeel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DeessuuWaaqa extends Fragment {

    String content = "Deessuu waaqa durbee bara baraa(2)\n" +
            "Ayyaana qabeetti yaa haadha araara (2x\n\n" +
            "Dunkaana Abraaham giiftii qulqulleetti\n" +
            "Uumaama kam caalaa galanni kan keetti\n" +
            "Gonfoo salamoon nagaa situ busee\n" +
            "Kan ittin jiraanuu galaa situu kusee\n\n" +
            "Dubartoota keessaa ati kan filaatamtee\n" +
            "Haadha bara baras kanaaf kan jedhamte\n" +
            "Ilme kee hin argadhu karaa keetin malee\n" +
            "Kanaafan sii faarsaa mana keetti galee\n\n" +
            "Dumeessa Eeliyaas ati naf dhagahii\n" +
            "Kadhannaa koo fudhi Gooftaa biran gahi\n" +
            "Araarsummaa keetin dhaabbadhuu nu gidduu\n" +
            "Situ nuuf owwaataa nama jalaa diduu\n\n" +
            "Fannoo Ilma kee keetti jala jilbifatte\n" +
            "Imimmaan lolaaste gaafa gidiraamtee\n" +
            "Haadha akka taatuf nufiis nuuf kennaamte\n" +
            "Dhala Addaam hundaaf haadhumman dhaabbatte\n\n" +
            "Daandii badii irraa ofitti nuu qabi\n" +
            "Hin shakku haadha koo naaf ni taata wabii\n" +
            "Cubbamaaf kadhachuu yoomiyyuu hin dadhabdu\n" +
            "Kennaan kan guutamtee muuda tokko hin qabdu\n";

    String title = "Deessuu waaqa durbee";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_faarsaa_hangaffoota, container, false);

        TextView textView = view.findViewById(R.id.textview);
        textView.setText(content);

        TextView textTitle = view.findViewById(R.id.textTitle);
        textTitle.setText(title);

        return view;
    }

}