package com.example.feria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class recolector_descripcionActivity extends AppCompatActivity {
    Button btndes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recolector_descripcion);
        btndes = findViewById(R.id.btnrecolector);
        btndes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentdes = new Intent(recolector_descripcionActivity.this, ruta_establecidaActivity.class);
                startActivity(intentdes);
            }
        });

    }
}