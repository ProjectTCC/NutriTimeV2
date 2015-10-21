package com.nutritime2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

public class dieta extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ViewPager viewPager = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta);
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new MeuAdaper(fragmentManager));
    }

}

class MeuAdaper extends FragmentPagerAdapter{


    public MeuAdaper(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        if(position==0){
            fragment = new FragmentoA();
        }

        if(position==1){
            fragment = new FragmentoB();
        }

        if(position==2){
            fragment = new FragmentoC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}