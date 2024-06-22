package com.example.feria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CentroAcopioActivity extends AppCompatActivity {

    Button btnCAI;
    Button btnSIG;
    Button btnATR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro_acopio);

        btnSIG=findViewById(R.id.buttonSIG);

        btnATR=findViewById(R.id.button2ATR);

        btnCAI=findViewById(R.id.btnInfoCA);
        btnCAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCAI=new Intent(CentroAcopioActivity.this,CentroAcopioInfoActivity.class);
                startActivity(intentCAI);
            }
        });

        btnSIG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSig=new Intent(CentroAcopioActivity.this,MainActivity.class);
                startActivity(intentSig);
            }
        });

        btnATR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentATR=new Intent(CentroAcopioActivity.this,MainActivity.class);
                startActivity(intentATR);
            }
        });
    }
}