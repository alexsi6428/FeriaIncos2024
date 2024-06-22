package com.example.feria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoRecicleActivity extends AppCompatActivity {

    Button btnBolsaP;
    Button btnPapelComida;
    Button btninfeccion;
    Button btnPorce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_recicle);

        btnBolsaP = findViewById(R.id.albtnBolsaPlastico);

        btnBolsaP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBolsa = new Intent(NoRecicleActivity.this, BolsaPlasticaActivity.class);
                startActivity(intentBolsa);
            }
        });

        btnPapelComida = findViewById(R.id.albtnEnvaseComida);
        btnPapelComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPapel = new Intent(NoRecicleActivity.this, BolsaPapelActivity.class);
                startActivity(intentPapel);
            }
        });
        btninfeccion = findViewById(R.id.albtnEnvaseInfeccion);
        btninfeccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetInfecc = new Intent(NoRecicleActivity.this, ArticulosMedicosActivity.class);
                startActivity(intetInfecc);
            }
        });
        btnPorce = findViewById(R.id.albtnPorcelana);
        btnPorce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPorce = new Intent(NoRecicleActivity.this, PorcelanaActivity.class);
                startActivity(intentPorce);
            }
        });
    }
}