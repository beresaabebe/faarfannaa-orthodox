package com.beckytech.faarfannaaafaanoromoo.faarsaahangaffota;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.beckytech.faarfannaaafaanoromoo.R;

public class IfaKanUffate extends Fragment {

    String content = "Ifa kan uffate samiirra kan jiru\n" +
            "Kan akka waaqayyoo tasumaayyuu hin jiru\n" +
            "Uumama hundumaa kan uumee Gooftaanii\n" +
            "Hunduma dabarsee jiraataa baraanii\n\n" +
            "Jechaan kan hin dhumnee waa’een arjummaa kee\n" +
            "Ija koo naaf ibsee jaalalli Abbummaa kee\n" +
            "Kan akka hin jiruu Gooftaa fayyisaa koo\n" +
            "Maqaa keen faarfadhaa gaddas gaafa rakkoo\n\n" +
            "Baay’isee na dhibaa akki jaalala kee \n" +
            "Sammuu koon ol ta’ee obsuus nan dadhabee\n" +
            "Dadhabbii koo ilaaltee bara koo eebbistee \n" +
            "Jaalala kee guddaan keessa koo na guuttee\n\n" +
            "Baay’een gaddisiisee qulqulluu Gooftaa koo\n" +
            "Inni  anaaf naa dhiisee balleessaa cubbuu koo\n" +
            "Lammataayyuu hin baduu manasaatii bahee\n" +
            "Inni anaan nan gannee ana faana tahee\n";

    String title = "Ifa kan uffate samiirra kan jiru";

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