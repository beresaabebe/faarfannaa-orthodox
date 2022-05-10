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

public class GiyoorgiisNaOolcheDhufee extends Fragment {

    String content = "Naaf ga'e Fardaan gulufee\n" +
            "Giyoorgiis na oolche dhufee.\n" +
            "\n\n" +
            "Giyoorgiis na fure dhufee - Harkaa kiyya na hidhaani\n" +
            ">>    - Diraagooniif na geessani\n" +
            ">>    - Dafee dhufee Giyoorgiisi\n" +
            ">>    - Narraa ciree kiyyoo saanisi.\n" +
            "\n\n" +
            "Giyoorgiis na fure dhufee - Biruktaayit Kan hambisee\n" +
            ">>    - Jawwiichaas kan ajjeesee\n" +
            ">>    - Dudiyanoosiin Kan qaanesse\n" +
            ">>    - Humna Waaqaa Kan mul'ise.\n" +
            "\n\n" +
            "Giyoorgiis na fure dhufee - Fardaa adiin Kan gulufu\n" +
            ">>     - Rakkoo namaaf dafee dhufu\n" +
            ">>     - Eenyuu hin jiru Kan akka isaa\n" +
            ">>     - Jabaadhakaa ergamnisaa.\n" +
            "\n\n" +
            "Giyoorgiis na fure dhufee - Kan kabaje qulqulloota\n" +
            ">>      - Gatii isaanii ni argata\n" +
            ">>      - Siin kabaja Giyoorgiisi\n" +
            ">>       - Waaqaa biraatti naf galmeessi.\n" +
            "\n\n" +
            "Giyoorgiis na fure dhufee - Yoon du'ellee akkan ka'u\n" +
            ">>       - Hin sodaadhu homaa hin ta'u\n" +
            ">>       - Waaqni kiyya na baraaraa\n" +
            ">>       - Giyoorgiisin naf ga'eeraa.\n" +
            "\n\n" +
            "Giyoorgiis na fure dhufee - Galata kee yaa Waaqakoo\n" +
            ">>      - Na hambiste nyaatamuukoo\n" +
            ">>      - Bilisummaan dhaabbadheera\n" +
            ">>      - Si faarsuufis hidhadheeraa.\n";

    String title = "Giyoorgiis Na Oolche Dhufee";

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