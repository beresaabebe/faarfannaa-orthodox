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

public class NuufDhalatee extends Fragment {

    String content = "Nuuf Dhalatee dhalateeraa inni nuuf dhalate(2)\n" +
            "Jaalalaa isaatiin Gooftaan  nuuf Dhalatee\n" +
            "Ceesisa\n" +
            "Nuuf Dhalatee Mooraa horiititti\n" +
            "\"\"        \"\"      Akka hiyyeessaatti\n" +
            "\"\"        \"\"        mootiin moototaa\n" +
            "\"\"        \"\"        inni dhalateeraa\n" +
            "\"\"        \"\"        nagaaha namootaa\n" +
            "\"\"        \"\"        isaatu nuuf laataa\n" +
            "Ceesisa\n" +
            "\n" +
            "\n" +
            "Nuuf Dhalatee Gooftaan foon uffate\n" +
            "\"\"        \"\"        inni nuu jaalate\n" +
            "\"\"        \"\"        bilisa nu baasee\n" +
            "\"\"        \"\"        Kiyyoo seexanarraa\n" +
            "\"\"        \"\"        akka jirannuuf\n" +
            "\"\"        \"\"       inni nu biteeraa\n" +
            "Ceesisa\n" +
            "Nuuf Dhalatee Ibsaan jireenya koo\n" +
            "\"\"        \"\"       mootiin nageenya koo\n" +
            "\"\"        \"\"       Dukkanicha keessaa\n" +
            "\"\"        \"\"       isaatu nu baasee\n" +
            "\"\"        \"\"       seexanni haa fagatuu\n" +
            "\"\"        \"\"        isaatu nu kaasee\n" +
            "Ceesisa\n" +
            "Nuf Dhalate Garba cubbichaa\n" +
            "\"\"        \"\"       nuti  kan turee\n" +
            "\"\"        \"\"       Iyyesuus dhufeetoo\n" +
            "\"\"        \"\"       irraa nuu furee\n" +
            "\"\"        \"\"       dukkana fageessee\n" +
            "\"\"        \"\"       ifaan nu geggeesee\n" +
            "Ceesisa\n" +
            "Nuuf Dhalatee kootta ni gammannaa\n" +
            "\"\"        \"\"        ifni nuuf baheeraa\n" +
            "\"\"        \"\"        fayyisaan Addunyaa\n" +
            "\"\"        \"\"      Iyyesuus Dhalatee\n" +
            "\"\"        \"\"      Gammachuun kan guutee\n" +
            "\"\"        \"\"      Jireenya nuuf laatee\n";

    String title = "Nuuf Dhalatee";

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