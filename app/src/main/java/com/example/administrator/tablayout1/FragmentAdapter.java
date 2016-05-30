package com.example.administrator.tablayout1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/21.
 */
public class FragmentAdapter extends FragmentStatePagerAdapter{
ArrayList <String>list=new ArrayList();
    List<Fragment>fragmentList;

    public FragmentAdapter(FragmentManager fm,List<Fragment>fragments) {
        super(fm);
fragmentList=fragments;
        for (int i=0;i<4;i++){
            list.add("ni"+i);
        }
    }



    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
