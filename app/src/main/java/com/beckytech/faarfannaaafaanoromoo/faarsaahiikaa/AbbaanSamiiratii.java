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

public class AbbaanSamiiratii extends Fragment {

    String content = "Abban samiratii sinboo kee jalatee\n" +
            "Ilmii nii fayyisuf kan siraa dhalatee\n" +
            "Afurii qulquluun kenan sii agugee\n" +
            "Ebbi kee gudadhaa (garamii akka gugee ×2)\n\n" +
            "Hangaa kan hin qabnee ibbidaa waqumaa\n" +
            "Garaa ketii batee kan umee hundumaa\n" +
            "Durbumadhan dessee hadhaa goftaa tatee\n" +
            "Fannoo ilmaa kee jalatii badhasaa nuuf tatee\n\n" +
            "Gargarsaa afuraa qulquluutin malee\n" +
            "Kan sii farsuu hin jiruu namni tokkolee\n" +
            "Jaalalli kee mo'ee laphesaa kan cabsuu\n" +
            "Sii wamachudhafii tasumaa hin obsuu.\n\n" +
            "Dhiigni ilmaa ketii ini addunyaa dhiqee\n" +
            "Maddisaa si'umaa sii kessatii burqee\n" +
            "Kan siraa dhalatee nyataa jirenyaadha\n" +
            "Foonsaa inni fayyisan argamnisaa sidha.\n\n" +
            "Daawitii kan sii farsee tsiyonin fakkesee\n" +
            "Kabajaa keef mariyaam galataa lolasee\n" +
            "Maqaan kee mi'awaa kan damaa caaludhaa\n" +
            "Laphee ijoollee kee hundatii ati kan iftudhaa\n";

    String title = "Abban samiratii sinboo kee jalatee";

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