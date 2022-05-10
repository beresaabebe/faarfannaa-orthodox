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

public class JaalalanJiraanna extends Fragment {

    String content = "Jaalalan jiraanna (maaliif wal jibbina)*2\n" +
            "Waaqayyoo jaalala durasatti amanamna\n" +
            "\n" +
            "Soreessis hiyyeessi galmisaa tokkodha\n" +
            "Waltuffachuun keenyas lafa qofattidha\n" +
            "Mootummaa olitti martuu walqixxedha\n" +
            "Waljaalachun keenya lubbuuf galaadha\n" +
            "\n" +
            "Namaatti fakkaata baay’ee waan turruu\n" +
            "Humni qabnus akka waan nu gargaaruu\n" +
            "Garuu guyyaan geenyan tasuma dabarra\n" +
            "Eegaa maalooree Jaalalli caala hundarra\n" +
            "\n" +
            "Gamoon nuti ijarru yoo fakkates tulluu\n" +
            "Godoo bososaattis yoo ta’e kan gallu\n" +
            "Dhabaaniis qabeessi dhumni isaa boolla\n" +
            "Waan darbuuf jennee maaliif wal lollaa?\n" +
            "\n" +
            "Eegaa yaa namootaa jaalalaan jiraanna\n" +
            "Akka abbootaa keenya jaalala facaasna\n" +
            "Qomoon wal hin qoonnu ni tokkoomna\n" +
            "Dhiiga kiristoosiin mallattoo godhanna\n";

    String title = "Jaalalan jiraanna";

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