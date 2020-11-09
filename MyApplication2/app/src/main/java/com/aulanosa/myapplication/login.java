package com.aulanosa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText txtCorreoLogin = (EditText) findViewById(R.id.TxtCorreoLogin);
        final EditText txtContraseñaLogin = (EditText) findViewById(R.id.TxtContraseñaLogin);
        final Button btnInicioSesion = (Button) findViewById(R.id.btnInicioSesion);
        final Button btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);

        Bundle bundle = getIntent().getExtras();

        final String correoLogin = txtContraseñaLogin.getText().toString();
        final String contraseñaLogin = txtContraseñaLogin.getText().toString();

        final String txtCorreoElectronico =  bundle.getString("Correo Electronico");
        final String txtContraseña = bundle.getString("Contraseña");

        btnInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((txtContraseña == contraseñaLogin) && (txtCorreoElectronico == correoLogin)) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Inicio de sesión exitoso.", Toast.LENGTH_SHORT);

                    toast.show();
                } else {
                    if ((txtContraseña != contraseñaLogin) || (txtCorreoElectronico != correoLogin)) {
                        Toast toast2 = Toast.makeText(getApplicationContext(),"Contraseña o correo incorrectos", Toast.LENGTH_SHORT);
                    }
                }


            }
        });

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}