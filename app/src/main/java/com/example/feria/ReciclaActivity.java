package com.example.feria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ReciclaActivity extends AppCompatActivity {
Button btnCargar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicla);

        btnCargar = findViewById(R.id.btnSiguiente3);
        btnCargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCargar = new Intent(ReciclaActivity.this,MainActivity.class);
                startActivity(intentCargar);
            }
        });
    }
}