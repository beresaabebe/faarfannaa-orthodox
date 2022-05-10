package com.beckytech.faarfannaaafaanoromoo.faarsaakooeel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import com.beckytech.faarfannaaafaanoromoo.R;

public class KoottuGugeeKoo extends Fragment {

    String content = "Koottuu Gugee koo Maariyaamii\n" +
            "Si waammadha Giiftii garraamii\n" +
            "\n" +
            "Koottuu gugee koo Maqaa kan keetu\n" +
            "       \"\"         \"\"        \"\"  Wabii naaf ta'e\n" +
            "       \"\"         \"\"        \"\"  Galaana cubbuu\n" +
            "       \"\"         \"\"        \"\"  Kadhaa keen ce'e\n" +
            "       \"\"         \"\"        \"\"  Deessuu mooticha\n" +
            "       \"\"         \"\"        \"\"  Hamaa siin moo'e\n" +
            "\n" +
            "Koottuu gugee koo Diina qaanessee\n" +
            "       \"\"         \"\"        \"\"  Hidhaadhas ba'e\n" +
            "       \"\"         \"\"        \"\"  Eenyut na morma\n" +
            "       \"\"         \"\"        \"\"  Eegaan kee ta'e\n" +
            "       \"\"         \"\"        \"\"  Irree naaf taatee\n" +
            "       \"\"         \"\"        \"\"  lolaan koos na'e\n" +
            "\n" +
            "Koottuu gugee koo Naaf jirjirteetta\n" +
            "       \"\"         \"\"        \"\"  Xuuraa'aa seenaa\n" +
            "       \"\"         \"\"        \"\"  Narraa hiikteetta\n" +
            "       \"\"         \"\"        \"\"  Galmee dhiphina\n" +
            "       \"\"         \"\"        \"\"  Ararsummaan kee\n" +
            "       \"\"         \"\"        \"\"  Jiraam na cinaa......\n" +
            "\n" +
            "Koottu gugee koo Ayyaantummaan kee\n" +
            "       \"\"         \"\"        \"\"  baayyee Ajaa’ibaa\n" +
            "       \"\"         \"\"        \"\"  Kadhannaa keetiin\n" +
            "       \"\"         \"\"        \"\"  sit naan qaqqaba\n" +
            "       \"\"         \"\"        \"\"  caaltuu uumamaa\n" +
            "       \"\"         \"\"        \"\"  Anoo siin qaba\n";

    String title = "Koottuu Gugee koo Maariyaamii";

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