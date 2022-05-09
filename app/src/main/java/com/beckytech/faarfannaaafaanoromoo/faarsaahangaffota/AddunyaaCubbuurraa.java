package com.beckytech.faarfannaaafaanoromoo.faarsaahangaffota;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.beckytech.faarfannaaafaanoromoo.R;

public class AddunyaaCubbuurraa extends Fragment {

    String content = "Addunyaa cubbuurraa nuyinis nu waamtee(2)\n" +
            "Osoo nuyi sin fedhin ati nu filattee\n" +
            "Ijoollee kee taanee ulfaadhuu Sillaasee\n\n" +
            "Qulqulluu (3) jenneeti maqaa kee waammannaa\n" +
            "Akka Ergamootaa sodaatiin guutamnee si galateeffannaa\n\n" +
            "Bakka hundaa jirtaa yaa waaqayyo keenyaa eenyutu si daangessaa\n" +
            "Jireeny ilma namaa kaayyoo ilma namaa kaayyoo hunda keenyaa sumatu murteessaa\n\n" +
            "Osoo nuyi sin filin ati nu filattee\n" +
            "Ijoollee kee taanee ulfaadhuu Sillaasee\n\n" +
            "Ba’aa keessan koottaa salphifadhaa jettee ati nurraa fuutee\n" +
            "Mana kee akka dhufnuuf nuyinis nu waamtee gammachuun nu simtee\n\n" +
            "Osoo nuyi sin fedhin ati nu filattee\n" +
            "Ijoollee kee taanee ulfaadhuu Sillaasee\n\n" +
            "Bakka nuyi kufnerraa olqabdee nu dhaabdee jireenya nuuf laattee\n" +
            "Gaaddisa mana keetti walitti nu qabdee  ulfaadhuu Sillaasee\n";

    String title = " Addunyaa cubbuurraa ";

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