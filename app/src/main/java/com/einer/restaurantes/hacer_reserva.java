package com.einer.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hacer_reserva extends AppCompatActivity {
    Button btnreservar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hacer_reserva);
        btnreservar =findViewById(R.id.btnreservar);//REFERENCIAR

        btnreservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(hacer_reserva.this,MenuInicial.class);
                startActivity(ir);
            }
        });
    }
}