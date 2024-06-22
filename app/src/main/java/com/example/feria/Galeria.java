package com.example.feria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Galeria extends AppCompatActivity {
 Button btngale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        btngale=findViewById(R.id.btgaleria);
        btngale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgale=new Intent(Galeria.this, Noticias.class);
                startActivity(intentgale);
            }
        });
    }
}