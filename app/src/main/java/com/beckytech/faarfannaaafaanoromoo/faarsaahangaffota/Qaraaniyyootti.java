package com.beckytech.faarfannaaafaanoromoo.faarsaahangaffota;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.beckytech.faarfannaaafaanoromoo.R;

public class Qaraaniyyootti extends Fragment {

    String content = "Qaraaniyoo irratti kan nuuf fannifamee\n" +
            "Madaa qaama isaatiin kan nuti fayyinee\n" +
            "Ijoollee Addaam hundaaf kan jireenya ta’ee\n\n" +
            "Qaraaniyoo irratti gidiraa kan argee\n" +
            "Yemmuu garafamuu kan dirrisaa dhiigee\n" +
            "Gindillaa baachisuun kan itti qoosanii\n" +
            "Balleessaa raawwanneef nu fayyisuuf innii\n\n" +
            "Yihuudoonni fannisanii ittis murteessanii\n" +
            "Guyyaa gaaf jimaataa fannoorra oolchanii\n" +
            "Dheebodhe inni jennaan hadha’aa obaasanii\n" +
            "Leenginoos waamanii eeboon waraananii\n\n" +
            "Bilisa nu baasee bittaa seexanaarraa\n" +
            "Gooftaan nuuf dhiphatee nuyi biyya lafarraa\n" +
            "Dhiphinasaa ilaaluun laphee haa jijjiirrannuu\n" +
            "Yeroo bara dhumaa jireenya akka argannuu\n";

    String title = " Qaraaniyoo irratti ";

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