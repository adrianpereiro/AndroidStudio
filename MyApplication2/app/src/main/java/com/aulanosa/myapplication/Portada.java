package com.aulanosa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Portada extends AppCompatActivity {
    TextView mensaje;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada);

        mensaje = (TextView) findViewById(R.id.mensaje);
        imagen = (ImageView) findViewById(R.id.imagenPortada);
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambioVentana = new Intent(Portada.this, login.class);
                startActivity(cambioVentana);
            }
        });
        mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"No se que poner",Toast.LENGTH_SHORT);
            }
        });
    }
}