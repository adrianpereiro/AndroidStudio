package com.aulanosa.holausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class frmmensaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmmensaje);

        TextView txtMensaje=(TextView) findViewById(R.id.TxtMensaje);

        Bundle bundle=getIntent().getExtras();

        txtMensaje.setText("Hola "+bundle.getString("Nombre")+" "+bundle.getString("Apellidos")+"\n Tus datos son:\n-DNI: "+bundle.getString("DNI")+
                "\n-Direccion: "+bundle.get("Direccion")+"\n-Telefono: "+bundle.getString("Telefono"));
    }
}