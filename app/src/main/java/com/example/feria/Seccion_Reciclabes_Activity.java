package com.example.feria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seccion_Reciclabes_Activity extends AppCompatActivity {
    Button btnPapel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_reciclabes);

        btnPapel=findViewById(R.id.btnPapel);
        btnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRD=new Intent(Seccion_Reciclabes_Activity.this, SeccionReciclablesDescripcionActivity.class);
                startActivity(intentRD);
            }
        });
    }
}