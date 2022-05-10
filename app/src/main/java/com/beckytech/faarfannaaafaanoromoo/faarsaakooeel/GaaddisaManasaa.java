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

public class GaaddisaManasaa extends Fragment {

    String content = "Gaaddisa manasaa iddoo gammachisaa\n" +
            "Kabajni manichaa baayyeedha ifnisaa \n" +
            "Nama hawwisiisaa baayyee jireenyisaa(2)                            \n" +
            "\n" +
            "Kiristoos nuuf dhufee kuno nuu fayyise          \n" +
            "Jaalala bayyisee cubbu nama dhisee                \n" +
            "Sillaasee qulqulluun dhufee nuu eebisee             \n" +
            "Yakkarra nuu olchee daandii nuu qabsiise\n\n" +
            "Maal jedhen dubbadha jecha waaqummaasaa\n" +
            "Danda'ee dubbadhuu ani maal jedheen ibsaa\n" +
            "Hunduu jijjirame kallattin qaamasaa\n" +
            "Akkamiinan ibsaa gochaa waaqummasaa       \n                    \n" +
            "Yeroo dhiyaateraa ganuu addunyaatti                                                            \n" +
            "Iddoon  jireenyaadha gara gannatittii                                            \n" +
            "Nama gammachiisaa jireenyi achiitti                                \n" +
            "Gaarii yaa hojjennu nuti hangaa dhumatti\n";

    String title = "Gaaddisa manasaa iddoo gammachisaa";

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