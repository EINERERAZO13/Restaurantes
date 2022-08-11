package com.einer.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lista_restaurantes extends AppCompatActivity implements View.OnClickListener {
            Button btnrestaurante1,btnrestaurante2,btnrestaurante3,btnmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

   referenciar();


    }
    private void referenciar() {

        btnrestaurante1 =findViewById(R.id.btnrestaurante1);//REFERENCIAR
        btnrestaurante1.setOnClickListener(this);
        btnrestaurante2 =findViewById(R.id.btnrestaurante2);//REFERENCIAR
        btnrestaurante2.setOnClickListener(this);
        btnrestaurante3 =findViewById(R.id.btnrestaurante3);//REFERENCIAR
        btnrestaurante3.setOnClickListener(this);
        btnmenu =findViewById(R.id.btnmenu);//REFERENCIAR
        btnmenu.setOnClickListener(this);


}

    @Override
     public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnrestaurante1:
                Intent intent = new Intent(lista_restaurantes.this, restaurante1.class);
                startActivity(intent);
                break;
            case R.id.btnrestaurante2:
                Intent intent2 = new Intent(lista_restaurantes.this, restaurante2.class);
                startActivity(intent2);
                break;
            case R.id.btnrestaurante3:
                Intent intent3 = new Intent(lista_restaurantes.this, restaurante3.class);
                startActivity(intent3);
                break;

            case R.id.btnmenu:
                Intent intent4 = new Intent(lista_restaurantes.this, MenuInicial.class);
                startActivity(intent4);
                break;

        }

    }
}