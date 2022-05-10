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

public class IttiFufaa extends Fragment {

    TextView textTitle, textContent;

    String content = "Sii galateeffata afaan koo\n" +
            "Ililedhaan guutee manni koo\n" +
            "Olmaa kee dubbate arrabni koo\n" +
            "Hin hafuu hin itti fufa galatni koo\n" +
            "Ceesisa\n" +
            "Seera umamattin hojaa gababbadhe\n" +
            "Sii ilaalun fedhe mukarraa yaabadhe\n" +
            "Taree namas naa dhabdee mukicharras naa buuste\n" +
            "Waaniin yaade hin beekne irbaataa mana koo nyaatee\n" +
            "Ceesisa\n" +
            "Akka seera muuseetti naa ajjeessuuf ka'anii\n" +
            "Ejjituu jedhan dhagaa darbatanii\n" +
            "Qulqullun yoo jiraatee haa ajjeesuu ittin jette\n" +
            "Leeyyoo itti uuffistee anaaf fayyinaa laatee\n" +
            "Ceesisa\n" +
            "Barootan bayyeedhaf bishaan bira ciise\n" +
            "Yeroon dhukkubsadhee fayyuu naa dhoobachiise\n" +
            "Fayyinaa ni barbaada jette too naa gaafatte\n" +
            "Oli ka'iiti adeemi siree kee badhu jette\n" +
            "Ceesisa\n" +
            "Ni ajaa’iba raajiidha gochaan kee\n" +
            "Himamee hin dhumu gudhaadha dhiifaman kee\n" +
            "Walaloodhaan katabee  gargaarsa keetini\n" +
            "Yeedaloon koo hin dhaabatuu qooqa yareedin\n" +
            "=======|========= f/taa dn hiikaa\n";

    String title = "Sii galateeffata afaan koo";


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