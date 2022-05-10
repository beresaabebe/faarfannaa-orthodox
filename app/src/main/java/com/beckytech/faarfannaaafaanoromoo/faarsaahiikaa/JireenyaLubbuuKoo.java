package com.beckytech.faarfannaaafaanoromoo.faarsaahiikaa;

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

public class JireenyaLubbuuKoo extends Fragment {

    TextView textTitle, textContent;

    String content = "Dhugaatif nyaata koo Jireenya Lubbuu koo\n" +
            "Iyyesuus kiristoos naaf lateeta gaafas\n" +
            "Har'a maaltu Dhufee barumsi inni haaraa\n" +
            "Waaqayyoo sumaadha Gooftan bara bara\n" +
            "Iyyesuus sumaadha waaqni bara bara\n" +
            "Ceesisa\n" +
            "Jalqabaan sii Amanee lubbuun koo sii file\n" +
            "Sechiis hin argamuu waaqayyoo sii malee\n" +
            "Ergaan sii amanee garaan koo hin raafamuu\n" +
            "Jabiinaa keen dhaphee miili koos hin romuu(2)\n" +
            "Ceesisa\n" +
            "Amantii fakkeessuun Bayyeen sii waamani\n" +
            "Har'a hin deebi'aanii hunduu sii gananii\n" +
            "Arjummaan kee adda Dhiifama nuu ilaaltaa\n" +
            "Cubbuu keenyaa dhiiste jireenya nuuf laata(2)\n" +
            "Ceesisa\n" +
            "Si faana yoon bu’ee sittu naa jaalatee\n" +
            "Qarqaara boollaarra situ na deeffate\n" +
            "Du'a keessaa ka'e oli kee dhaabadhee\n" +
            "Ija koo isa laphee maqaa keen baradhee(2)\n" +
            "Ceesisa\n" +
            "Yeroo  hedduu man kee sodaadhaan guutamee\n" +
            "Naa gargaarii uumaa koo sinan kabajamee\n" +
            "Akka mulaatuuf ulfinnii maqaa kee\n" +
            "Ogummaa Afuura keen naa gageessi mucaa kee(2)\n" +
            "=======|======= F/taa Dn Hiikaa\n";

    String title = "Jireenya Lubbuu koo";


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