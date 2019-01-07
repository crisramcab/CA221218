package com.example.klo.esqueleto;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //preguntar que es
    Fragment selectedFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_nav); //lqe decimos en donde tiene que empezar


        //objeto de tipo BottomNavigation
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigator);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        selectedFragment = new Home_Fragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();



    }

    public BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.nav_home:
                    selectedFragment = new  Home_Fragment();
                    break;

                case R.id.nav_calendar:
                    selectedFragment = new Calendar_Fragment();
                    break;

                case R.id.nav_list:
                    selectedFragment = new  List_Fragment();
                    break;

                case R.id.nav_location:
                    selectedFragment = new Location_Fragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            return true;
        }
    };

}
