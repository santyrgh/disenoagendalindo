package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class shared_preferen extends AppCompatActivity {
    private EditText et1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferen);

        et1 = (EditText)findViewById(R.id.txt_mail);

        SharedPreferences preferencia = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(preferencia.getString("mail",""));

    }

    public  void  guardar (View v){
        SharedPreferences preferencia = getSharedPreferences("datos", Context.MODE_PRIVATE);
         SharedPreferences.Editor objet_editor = preferencia.edit();
         objet_editor.putString("mail", et1.getText().toString());
         objet_editor.commit();
         finish();
    }


}