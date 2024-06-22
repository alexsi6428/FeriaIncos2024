package com.example.feria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CentroAcopioInfoActivity extends AppCompatActivity {

    Button btnBTK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro_acopio_info);

        btnBTK=findViewById(R.id.btnVolver);

        btnBTK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBTK= new Intent(CentroAcopioInfoActivity.this, CentroAcopioActivity.class);
                startActivity(intentBTK);
            }
        });
    }
}