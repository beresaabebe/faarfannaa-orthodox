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

public class WabiiKiyyaTaii extends Fragment {

    String content = "Wabbii kiyya ta’ii dhaabbadhuu na bukkee\n" +
            "Du’atti na laachuuf Diinni natti morkee\n" +
            "Yaa kakuu Araaraa si’ii agarraan sokkee (2)\n                            \n" +
            "Keessummaa fakkaate      yaa kakuu Araaraa                          \n" +
            "Nattii seenee Diinni                                      \n" +
            "Fakkeesse dubbatee                                      \n" +
            "Naa mo’aatee inni            \n\n" +
            "Ilma kee naaf kadhuu haadha bara baraa\n" +
            "Lubbuu koo haa boqotuu maaloo haadha Araaraa\n\n" +
            "Na dhisnee haati koo  yaa kakuu Araaraa\n" +
            "Cubbamaadha jettee        \n" +
            "Dadhabbii koo laaltee           \n" +
            "Harmee na fo’attee                  \n\n" +
            "Ilma kee naaf kadhuu haadha bara baraa\n" +
            "Lubbuu koo haa boqotuu maaloo haadha Araaraa\n\n" +
            "Arasummaa kan keen yaa kakuu araaraa                      \n" +
            "Yoonaa nuu ga’eraa                                \n" +
            "Ulfaadhuu haadha koo                          \n" +
            "Maqaa kee waameraa       \n\n" +
            "Ilma kee naaf kadhuu haadha bara baraa\n" +
            "Lubbuu koo haa boqotuu maaloo haadha Araaraa\n";

    String title = "Wabbii kiyya ta’ii";

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