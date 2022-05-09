package com.beckytech.faarfannaaafaanoromoo.faarsaahangaffota;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {

    public MyAdapter(FragmentManager fm, Lifecycle lifecycle) {
        super(fm, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1: return new AddunyaaCubbuurraa();
            case 2: return new Qulqulloonni();
            case 3: return new Qaraaniyyootti();
            case 4: return new IyyasuusKiristoos();
            case 5: return new IfaKanUffate();
            case 6: return new OsooHinQophaainaa();

        }
        return new NaMooateFragment();
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
