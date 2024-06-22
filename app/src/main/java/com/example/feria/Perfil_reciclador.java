package com.example.feria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Perfil_reciclador extends AppCompatActivity {
    Button btnReciclador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_reciclador);
        btnReciclador=findViewById(R.id.btreciclador);
        btnReciclador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReciclador=new Intent(Perfil_reciclador.this,Galeria.class);
                startActivity(intentReciclador);
            }
        });
    }
}