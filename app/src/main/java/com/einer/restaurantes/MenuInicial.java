package com.einer.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuInicial extends AppCompatActivity {
    Button bntrestaurantes,btnreservas,btnproductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);
        bntrestaurantes =findViewById(R.id.btnrestaurantes);//REFERENCIAR
        btnreservas =findViewById(R.id.btnreservas);//REFERENCIAR
        btnproductos =findViewById(R.id.bntproductos);//REFERENCIAR

        bntrestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(MenuInicial.this,lista_restaurantes.class);
                startActivity(ir);
            }
        });
        btnreservas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(MenuInicial.this,hacer_reserva.class);
                startActivity(ir);
            }
        });
        btnproductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(MenuInicial.this,productos_destacados.class);
                startActivity(ir);
            }
        });
    }
}