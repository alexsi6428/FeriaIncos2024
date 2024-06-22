package com.example.feria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class RecolectorActivity extends AppCompatActivity {

    Button bt_cargar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recolector);
        bt_cargar = findViewById(R.id.btncargar);
        bt_cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCargar = new Intent(RecolectorActivity.this, recolector_descripcionActivity.class);
                startActivity(intentCargar);
            }
        });
    }
}