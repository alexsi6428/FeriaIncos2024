package com.example.feria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CentroAcopioActivity extends AppCompatActivity {

    Button btnCAI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro_acopio);

        btnCAI=findViewById(R.id.btnInfoCA);
        btnCAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCAI=new Intent(CentroAcopioActivity.this,CentroAcopioInfoActivity.class);
                startActivity(intentCAI);
            }
        });
    }
}