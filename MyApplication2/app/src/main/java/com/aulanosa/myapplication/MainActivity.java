package com.aulanosa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtCorreoElectronico = (EditText)findViewById(R.id.TxtCorreoElectronico);
        final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
        final EditText txtApellidos = (EditText)findViewById(R.id.TxtApellidos);
        final EditText txtContraseña = (EditText)findViewById(R.id.TxtContraseña);
        final EditText txtRepetirContraseña = (EditText)findViewById(R.id.TxtRepetirContraseña);
        final Button btnOkay = (Button) findViewById(R.id.BtnOkay);

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, login.class);
                Bundle bundle = new Bundle();
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Un mensaje bien bacano", Toast.LENGTH_SHORT);

                toast.show();
                bundle.putString("Correo Electronico",txtCorreoElectronico.getText().toString());
                bundle.putString("Nombre",txtNombre.getText().toString());
                bundle.putString("Apellidos",txtApellidos.getText().toString());
                bundle.putString("Contraseña",txtContraseña.getText().toString());
                bundle.putString("Repetir Contraseña",txtRepetirContraseña.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}