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

public class FannoonArgameera extends Fragment {

    String content = "Fannoon Argameera ililichaa yaa nama!\n" +
            "....................................................\n" +
            "Fannoon argameera(2)~ililichaa yaa nama\n" +
            "Kan ittiin fayyinee                   \"\"      \"\"\n" +
            "Mallattoon nageenya               \"\"      \"\"\n" +
            "Kan isaa nuuf Kenne                \"\"      \"\"\n" +
            "Fayyisaa Addunyaa                  \"\"      \"\"\n" +
            "Coba dhiiga saatu                     \"\"      \"\"\n" +
            "Fannicharra jira                       \"\"      \"\"\n" +
            "Nus ittiin fayyine                      \"\"      \"\"\n" +
            "Hamaa milqineerra                 \"\"      \"\"\n" +
            "....................................................\n" +
            "Baroota hedduudhaf                 \"\"      \"\"\n" +
            "Dhofkamee kan ture                 \"\"      \"\"\n" +
            "Mul'achuu isaatiin                    \"\"      \"\"\n" +
            "Gammachuu nu hire               \"\"      \"\"\n" +
            "Ifni fannoo Gooftaa                \"\"      \"\"\n" +
            "Diina rifaasise                         \"\"      \"\"\n" +
            "Warreen dhibamanis             \"\"      \"\"\n" +
            "Fannoon ni fayyise                 \"\"      \"\"\n" +
            "....................................................\n" +
            "Mootitti Illeeniin                   \"\"      \"\"\n" +
            "Kadhannadhan kaate         \"\"      \"\"\n" +
            "Abbootiis gaafatte                 \"\"      \"\"\n" +
            "Fannoo ni argatte                 \"\"      \"\"\n" +
            "Mallattoon argamsaa           \"\"      \"\"\n" +
            "Fannoorra qubatee              \"\"      \"\"\n" +
            "Iddoo Aarri taa'ee                 \"\"      \"\"\n" +
            "Fannichiis mul'ate                \"\"      \"\"\n" +
            "....................................................\n" +
            "Kan ittiin beekkamnu             \"\"      \"\"\n" +
            "Faajjii nageenyaati                  \"\"      \"\"\n" +
            "Qabannee yoo baanu              \"\"      \"\"\n" +
            "Dirree qabsoorratti                 \"\"      \"\"\n" +
            "Injifannoon keenya                 \"\"      \"\"\n" +
            "Hin moo'amnu nutii                \"\"      \"\"\n" +
            "Kan diigu hammeenya             \"\"      \"\"\n" +
            "Fannoon humna keenya          \"\"      \"\"\n" +
            "....................................................\n" +
            "Fannoo qabannee-too              \"\"      \"\"\n" +
            "Faachadhan garmaamna        \"\"      \"\"\n" +
            "Waraana Daabiloos               \"\"      \"\"\n" +
            "Isaatiin moo'anna                 \"\"      \"\"\n" +
            "Isaan caccabeera                 \"\"      \"\"\n" +
            "Wanjichi garbummaa        \"\"      \"\"\n" +
            "Alaabaa keenyadha            \"\"      \"\"\n" +
            "Ifa bilisummaa                  \"\"      \"\"\n";

    String title = "Fannoon Argameera ililichaa yaa nama";

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