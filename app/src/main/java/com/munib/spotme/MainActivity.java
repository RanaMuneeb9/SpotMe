package com.munib.spotme;

import android.os.Bundle;

import com.munib.spotme.fragments.InvestFragment;
import com.munib.spotme.fragments.RequestsFragment;
import com.munib.spotme.fragments.HomeFragment;
import com.munib.spotme.fragments.MyDealsFragment;
import com.munib.spotme.fragments.OffersFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {

    NavController navController;
    SmoothBottomBar bottomBar;
    Fragment homeFragment,requestFragment,offersFragment,myDealsFragment,investFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomBar=findViewById(R.id.bottomBar);
        homeFragment=new HomeFragment();
        requestFragment=new RequestsFragment();
        offersFragment=new OffersFragment();
        myDealsFragment=new MyDealsFragment();
        investFragment=new InvestFragment();
       //myOffersFragment=new HomeFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container, homeFragment).commit();

        bottomBar.setOnItemSelectedListener(i -> {
            if (i == 0) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, homeFragment).addToBackStack(null).commit();
            } else if (i == 1) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, offersFragment).addToBackStack(null).commit();
            } else if (i == 2) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, requestFragment).addToBackStack(null).commit();
            } else if (i == 3) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, myDealsFragment).addToBackStack(null).commit();
            }else {
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, investFragment).addToBackStack(null).commit();
            }
            return false;
        });

    }
}