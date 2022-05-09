package com.beckytech.faarfannaaafaanoromoo.faarsaahangaffota;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.beckytech.faarfannaaafaanoromoo.R;

public class NaMooateFragment extends Fragment {

    String content = "(Na moo’te jireenyi koo\n" +
            "Na jabeessi Giiftii koo) (2)\n" +
            "Wabii ta’ii dhaabbadhuu lubbuu koof (2)\n\n" +
            "Ati taabota Muusee ulee Aaroonidha\n" +
            "Sanyii Addaam hundaaf ati araarsituudha\n" +
            "Yaa’iqoob kan argee finootolozaatti\n" +
            "Kadhaa keenya kan ol baaftuu yaabbannoo warqiitii\n\n" +
            "Baganaa Daawwit yaa biiftuu ganamaa\n" +
            "Ifa keetiin baddee dhiphuun dhala namaa\n" +
            "Haadha Qulqullootaa gonfoo ulfinasaanii\n" +
            "Lubbuun cubbamootaa fayyee Ilma keetiinii\n\n" +
            "Gammadi yaa Durbee deessuu waaqayyoodha\n" +
            "Sanyii ijoollee Addaamiif ati araarsituudha\n" +
            "Cubbuun koo nan dhaabuu fuula Ilma keetii\n" +
            "Guyyaa mutii sanaa wabii naaf ta’i atii\n\n" +
            "Na gargaari Maariyaamii an waan tokko hin qabu\n" +
            "Fayyisaan Ilmi kee homaa hin dadhabu\n" +
            "Cubbuuf na qopheessee dadhabbinni foon koo\n" +
            "Kadhannaa keetiinna jabeessi Giiftii koo\n";

    String title = " Na moo’te jireenyi koo ";

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