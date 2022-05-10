package com.beckytech.faarfannaaafaanoromoo.faarsaaKeeber;

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

public class HoolichaDhugumaa extends Fragment {

    String content = "Hoolicha dhugumaa guyyaa jimaata \n" +
            "Oolmaan kee gooftaa garaa na nyaataa\n" +
            "Dubbadhee hin fixuu waan ati naaf taate\n" +
            "Gochan kee gooftaa na irratti bayyate 2*.\n" +
            "\nCeesisa \n\n" +
            "Cubbuu osoo hin qabatiin cubbamaa jedhamte\n" +
            "Mannaa samii buustee ofii kee beeloftee\n" +
            "Kattaa burqisiftee dheeboottee dhiphattee\n" +
            "Akka hoolaa qalamuu lafa irraa harkifamtee2*.\n" +
            "\nCeesisa \n\n" +
            "Anaan daara baastee ofii qullaa taatee\n" +
            "Fayyina koof jettee barruu waraanamtee\n" +
            "Qoree ofii gonfattee ulfina naaf laatte\n" +
            "Du'a koo naaf duute jireenyan jijjiirte 2*.\n" +
            "\nCeesisa \n\n" +
            "Asi fi achi kufaa gindillicha baattee\n" +
            "Tabba qaraaniyoo dadhaabbiin ol- baate\n" +
            "Warreen si fannisan dhiifaman daawwatte\n" +
            "Waan godhan hin beekaan dhiisiif abbaa jettee 2*.\n" +
            "\nCeesisa \n\n" +
            "Silaa anaaf turee fannoon fanniffamte\n" +
            "Jaalala kee dhoksee cubbuun ani hojjedhe\n" +
            "Miilla kootiin bahe ani sirraa fagadhee\n" +
            "Anis qulqulla'ee dhiigaa fi foon kee fudhee.\n";

    String title = "Hoolicha dhugumaa guyyaa jimaata";

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