package com.example.feria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerfilEmprendedorrActivity extends AppCompatActivity {
    Button btnperfilemprendedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_emprendedorr);
        btnperfilemprendedor=findViewById(R.id.btnperfilemprendedor);
        btnperfilemprendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRD=new Intent(PerfilEmprendedorrActivity.this, ProductosEmprendedorActivity.class);
                startActivity(intentRD);
            }
        });
    }
}