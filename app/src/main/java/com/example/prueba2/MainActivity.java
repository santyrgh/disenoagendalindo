package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn = (EditText)findViewById(R.id.txt_nombre);
        etp = (EditText)findViewById(R.id.text_pass);
    }
    // Metodo para evaluar campos

    public void Registar (View view){
        String nombre = etn.getText().toString();
        String contrasena = etp.getText().toString();
        if(nombre.length() == 0){
            Toast.makeText(this, "Debes ingresar un nombre",Toast.LENGTH_SHORT).show();
        }
        if(contrasena.length() == 0){
            Toast.makeText(this, "Debes ingresar una contraseña",Toast.LENGTH_SHORT).show();
        }
        if (nombre.length() != 0 && contrasena.length() != 0 ){
            Toast.makeText(this, "Registro en proceso",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, MainActivity2.class);
            i.putExtra("dato", nombre);
            startActivity(i);
        }
    }
}