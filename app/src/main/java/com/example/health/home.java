package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.health.R;
import com.example.health.login;

public class home extends AppCompatActivity  {
Button homeS,homeR;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        homeS=findViewById(R.id.homeS);
        homeR=findViewById(R.id.homeR );


        homeS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hola mi perro", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void homeS(View v) {
        Intent i=new Intent(this, login.class);
        startActivity(i);


    }
}
