package com.beckytech.faarfannaaafaanoromoo.faarsaahangaffota;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.beckytech.faarfannaaafaanoromoo.R;

public class Qulqulloonni extends Fragment {

    String content = "Qulqulloonni deemsi isaanii waaqa wajjinii\n" +
            "Bara baraanii kabajamee yaadatamaa seenaan isaanii (2)\n\n" +
            "Kan darbu dhiisanii Gooftaa filatanii \n" +
            "Dhugaa sagaleesaa sirriitti hubatanii\n" +
            "Gooftaa keenya hin dhiisnu nutoo jechuudhanii\n" +
            "Osoo lubbuun jiruu gogaa irraa baasanii\n\n" +
            "Ajajamuu beekuu soda waaqayyootiin\n" +
            "Dhala dabarsanii dhiyeessu aarsaafii\n" +
            "Mamuu hin beekanii akka ha’aa isaanii\n" +
            "Kan dhufu hubatuu Afuura waaqaanii\n\n" +
            "Lammata sin ganuu Gooftaa anuu jedhee\n" +
            "Qulqulluun Pheexiroos miilasaatti kufee\n" +
            "Magaalaa Roomeetti mootota duratti\n" +
            "Soda tokko malee of laatee fannootti\n\n" +
            "Hawwiin guutamanii hin beekan hinaafuu\n" +
            "Diinotasaanitiif qajeelina yaaduu\n" +
            "Warra isaan miidhaaniif dhiifama kadhatuu\n" +
            "Kan akka Isxifaanos seenaan hin dagatuu\n\n" +
            "Waa’ee fayyisuusaa Iyyasuus labsanii\n" +
            "Galchani mana adabaa irratti ka’anii\n" +
            "Kan isaan dabarsan wanta yaraa mitii\n" +
            "Akka hoolotadha hoofaman du’attii\n";

    String title = " Qulqulloonni deemsi isaanii waaqa wajjinii ";

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