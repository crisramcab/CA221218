package com.example.klo.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables de esta clase
    TextView txt;


    //metodo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initVariables();


        //BottomNavigationView bottomNav = findViewById(R.id.bottom_navigator);
        //bottomNav.setOnNavigationItemSelectedListener(navListener);

        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
    }




    public void initVariables(){
        txt = (TextView) findViewById(R.id.not_account);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkToRegistry();
            }
        });


    }

    //link to registry method
    public void linkToRegistry(){

        Intent intent = new Intent(this, RegistryActivity.class);
        startActivity(intent);
    }

    //objeto nav

    //private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        //@Override
        //public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

           // Fragment selectedFragment = null;

            //switch (menuItem.getItemId()){

               // case R.id.nav_home:
                    //selectedFragment = new HomeFragment();
                    //break;


               // case R.id.nav_calendar:
                 //   selectedFragment = new CalendarFragment();
                   // break;

                //case R.id.nav_list:
                  //  selectedFragment = new ListFragment();
                    //break;

                //case R.id.nav_location:
                  //  selectedFragment = new LocationFragment();
                   // break;




            //}
            //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            //return true;
        //}


   // };



}
