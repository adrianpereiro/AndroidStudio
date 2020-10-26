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
        final Button btnHola = (Button) findViewById(R.id.BtnHola);

        btnHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( MainActivity.this,frmmensaje.class);
                Bundle bundle=new Bundle();
                bundle.putString("Escribe tu nombre",txtNombre.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        }
    }
