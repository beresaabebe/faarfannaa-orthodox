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

public class CuuphameJira extends Fragment {

    String content = "Cuuphame jira Gooftaan Cuuphameera... (2)\n" +
            "             Cuuphame jira(2).......\n" +
            "....... Waggaa soddomaffatti.......\n" +
            "....... Laga yordaanositti.......\n" +
            "....... Gooftaan cuuphameera.......\n" +
            "....... Harka Yohaannisiitti.......\n" +
            "....... Mataasaa gad qabuun.......\n" +
            "....... Walakkaa galaanatti .......\n" +
            "....... Hundumaa kan uume.......\n" +
            "....... Harka Garbichasaatti.......\n" +
            "         ...................................\n" +
            "....... Lagni Yordannoosi.......\n" +
            "....... Teellaatti dheessite.......\n" +
            "....... Waaqummaan Kiristoos.......\n" +
            "....... Na danfisa jettee .......\n" +
            "....... Yooriif Daanoos turte .......\n" +
            "....... Cuuphaasaan tokkomte.......\n" +
            "....... Nuufis cuuphaa saatiin......\n" +
            "....... Tokkummaan argamte.......\n" +
            "        ...................................\n" +
            "....... Gooftaan yoo cuuphamu.......\n" +
            "....... Iccitiin labsame.......\n" +
            "....... Sadummaaf tokkummaan.......\n" +
            "....... Hundaatti ibsame .......\n" +
            "....... Afuurri qulqulluun.......\n" +
            "....... Bu'e bifa Gugeen .......\n" +
            "....... Abbaaniis dubbate.......\n" +
            "....... Ilma koo jechuunii.......\n" +
            "         ............................\n" +
            ".......Garbummaa balleessuuf.......\n" +
            "....... Seexanni kan barreesse.......\n" +
            "....... Xalayaa barootaa .......\n" +
            "....... Addaam mallateesse.......\n" +
            "....... Cuuphamuu isaatiin .......\n" +
            "....... Nurraa barbadeesse .......\n" +
            "....... Ijoollee saa hundaa.......\n" +
            "....... Bilisa nu baase.......\n" +
            "          F/taa Koo'eel Shawaa\n";

    String title = "Cuuphame jira Gooftaan Cuuphameera";

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