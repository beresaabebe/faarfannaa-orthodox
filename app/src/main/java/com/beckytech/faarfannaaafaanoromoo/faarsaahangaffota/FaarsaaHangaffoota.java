package com.beckytech.faarfannaaafaanoromoo.faarsaahangaffota;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.material.tabs.TabLayout;

public class FaarsaaHangaffoota extends OptionsMenuActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initUI("Faarsaa Hangaffoota faarfatoota");

        setContentView(R.layout.activity_faarsaa_hangaffoota);

        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);

        tabLayout.addTab(tabLayout.newTab().setText("Na moo’te jireenyi koo"));
        tabLayout.addTab(tabLayout.newTab().setText("Addunyaa Cubbuurraa"));
        tabLayout.addTab(tabLayout.newTab().setText("Qulqulloonni"));
        tabLayout.addTab(tabLayout.newTab().setText("Qaraaniyoorratti"));
        tabLayout.addTab(tabLayout.newTab().setText("Iyyesuus Kiristoos"));
        tabLayout.addTab(tabLayout.newTab().setText("Ifa Kan Uffate"));
        tabLayout.addTab(tabLayout.newTab().setText("Osoo hin qophaa'inaa"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(adapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }

}