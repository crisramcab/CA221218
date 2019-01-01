package com.example.klo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            txt = (TextView) findViewById(R.id.not_account);
            txt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    linkToRegistry();
                }
            });


    }

    public void linkToRegistry(){

        Intent intent = new Intent(this, RegistryActivity.class);
        startActivity(intent);
    }

}
