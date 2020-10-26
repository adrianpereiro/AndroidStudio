package com.aulanosa.holausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
        final EditText txtApellidos = (EditText)findViewById(R.id.TxtApellidos);
        final EditText txtDNI = (EditText)findViewById(R.id.TxtDNI);
        final EditText txtDireccion = (EditText)findViewById(R.id.TxtDireccion);
        final EditText txtTelefono = (EditText)findViewById(R.id.TxtTelefono);
        final Button btnHola = (Button) findViewById(R.id.BtnHola);

        btnHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( MainActivity.this,frmmensaje.class);
                Bundle bundle=new Bundle();
                bundle.putString("Nombre",txtNombre.getText().toString());
                bundle.putString("Apellidos",txtApellidos.getText().toString());
                bundle.putString("DNI",txtDNI.getText().toString());
                bundle.putString("Direccion",txtDireccion.getText().toString());
                bundle.putString("Telefono",txtTelefono.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        }
    }
