package com.example.practise;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.practise.Fragments.CallsFragment;
import com.example.practise.Fragments.ChatsFragment;
import com.example.practise.Fragments.StatusFragment;

public class VIewPagerAdapter extends FragmentPagerAdapter {
    public VIewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public VIewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    //sets the fragments on the viewPager
    @NonNull
    @Override
    public Fragment getItem(int position) {

        if(position==0) return new ChatsFragment();
        else if(position==1) return new StatusFragment();
        if(position==2) return new CallsFragment();


        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    //sets the title of each tab.

    @Override
    public CharSequence getPageTitle(int position){
        if(position==0) return "Chat";
        else if(position==1) return "Status";
        if(position==2) return "Call";
        return null;

    }

}
