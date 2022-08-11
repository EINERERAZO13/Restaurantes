package com.einer.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_splash extends AppCompatActivity {
    Button bntsiguiente,btnmapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        bntsiguiente =findViewById(R.id.btniniciarsesion);//REFERENCIAR


        bntsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(Activity_splash.this,MenuInicial.class);
                startActivity(ir);
            }
        });

        btnmapa =findViewById(R.id.btnmapa);//REFERENCIAR


        btnmapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(Activity_splash.this,MapsActivity.class);
                startActivity(ir);
            }
        });

    }
}