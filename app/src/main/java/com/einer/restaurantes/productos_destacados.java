package com.einer.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class productos_destacados extends AppCompatActivity {
        Spinner sprolusuarios;
        ListView apicultoresregistrados, listView2;
        ArrayAdapter<String>adaptador;
        String[] ciudades2={
                "Seleccione el municipio",
                "ALMAGUER",
                "BOLIVAR",
                "LA VEGA",
                "SAN SEBASTIAN",
                "LA SIERRRA",
        };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos_destacados);
        sprolusuarios =findViewById(R.id.sprolusuarios);//REFERENCIAR
        apicultoresregistrados =  findViewById(R.id.apicultoresregistrados);
        listView2 =  findViewById(R.id.ciudades2);

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ciudades2);

        listView2.setAdapter(adaptador);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(productos_destacados.this,"selecciono"+ " "+ adapterView.getItemAtPosition(i),Toast.LENGTH_SHORT).show();
            }
        });

        apicultoresregistrados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(productos_destacados.this,"presiono"+ " "+ adapterView.getItemAtPosition(i),Toast.LENGTH_SHORT).show();
            }
        });



        sprolusuarios.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(productos_destacados.this,"presiono"+ " "+ adapterView.getItemAtPosition(i),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}