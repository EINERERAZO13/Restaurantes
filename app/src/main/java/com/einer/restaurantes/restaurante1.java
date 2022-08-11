package com.einer.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class restaurante1 extends AppCompatActivity {
  ImageButton btnsonido;
  MediaPlayer sonido1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante1);
        referenciar();
        sonido1= MediaPlayer.create(this,R.raw.sonido);
    }

    private void referenciar(){
        btnsonido = findViewById(R.id.btnsonido);
        btnsonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido1.start();

            }
        });

    }

}