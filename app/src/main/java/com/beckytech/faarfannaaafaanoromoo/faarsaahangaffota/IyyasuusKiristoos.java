package com.beckytech.faarfannaaafaanoromoo.faarsaahangaffota;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.beckytech.faarfannaaafaanoromoo.R;

public class IyyasuusKiristoos extends Fragment {

    String content = "Iyyasuus kiristoos waaqayyoodha jettee\n" +
            "Tewaahidoo wangeelaan nu barsiisaa turtee\n" +
            "Nutis dhugaa baanaa eeyyyee(3) waaqayyoodha\n" +
            "Barumsi Tewaahidoos kunoo kanadha \n\n" +
            "Diinni maaf gungumaa sammuudha dhibamee\n" +
            "Nutoo kan lallabnuu isa fannifamee\n" +
            "Duubatti hin deebinuu fuulduratti malee\n" +
            "Waaqa biraa hin qabnuu waaqayyootiin malee\n\n" +
            "Shakkii shakkitootan waan tokko hin raafamnu\n" +
            "Tewaahidoon dhugaadha Tewaahidoo hin gadhiifnuu\n" +
            "Wangeelaan ijaaramee hundeen bu’uurrisaa\n" +
            "Qilleensa isa kamtu mana keenya raasaa\n\n" +
            "Waa’ee Qulqullootaa maaf dubbachuu dhiisnaa\n" +
            "Jireenyasaaniitiin Gooftaatiin lallabnaa\n" +
            "Dhugaatu nuuf galeera duubatti hin deebinu\n" +
            "Dhugaadhaf hojjenna namni hundumtuu haa baruu\n";

    String title = " Iyyasuus kiristoos waaqayyoodha ";

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