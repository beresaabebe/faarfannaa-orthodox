package com.beckytech.faarfannaaafaanoromoo.faarsaaKeeber;

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
            case 1: return new GiyoorgiisNaOolcheDhufee();
            case 2: return new HinKutuFannooKoo();
            case 3: return new HoolichaDhugumaa();
            case 4: return new HumnaWaaqaafSafuu();

        }
        return new FakkeenyaHinQabdu();
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
