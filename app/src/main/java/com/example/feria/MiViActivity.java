package com.example.feria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MiViActivity extends AppCompatActivity {
    Button btnVision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_vi);

        btnVision=findViewById(R.id.btnSiguiente1);
        btnVision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentCargar = new Intent(MiViActivity.this,InicioActivity.class);
                startActivity(IntentCargar);
            }
        });
    }
}