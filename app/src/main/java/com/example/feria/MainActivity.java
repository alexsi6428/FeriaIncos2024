package com.example.feria;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCargarReciclador;

    Button btnCargarRecolector;

    Button btnCargarVendedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCargarReciclador = findViewById(R.id.btnReciclador);
        btnCargarReciclador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCargar = new Intent(MainActivity.this,ForReciActivity.class);
                startActivity(intentCargar);
            }
        });

        btnCargarRecolector = findViewById(R.id.btnRecolector);
        btnCargarRecolector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCargar = new Intent(MainActivity.this,ForRecolectorActivity.class);
                startActivity(intentCargar);
            }
        });
         btnCargarVendedor =findViewById(R.id.btnVendedor);
         btnCargarVendedor.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intentCargar = new Intent(MainActivity.this,ForEmprendedorActivity.class);
                 startActivity(intentCargar);
             }
         });
    }
}