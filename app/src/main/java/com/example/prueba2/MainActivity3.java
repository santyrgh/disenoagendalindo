package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        et1 = (EditText)findViewById(R.id.txt_mail);
    }
    public  void  navegation (View view){
        Intent e = new Intent(this, MainActivity4.class);
        e.putExtra("sitioweb", et1.getText().toString());
        startActivity(e);
    }

    public  void  navegar (View view){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}
