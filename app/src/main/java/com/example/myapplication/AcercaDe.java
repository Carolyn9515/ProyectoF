package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AcercaDe extends AppCompatActivity {

    TextView tvNombre, tvRedSocial, tvCel, tvDireccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        tvNombre = findViewById(R.id.tvnombre);
        tvRedSocial = findViewById(R.id.tvred);
        tvCel = findViewById(R.id.tvcel);
        tvDireccion = findViewById(R.id.tvdireccion);

        informacion();
    }

    public void informacion (){

        tvNombre.setText("Ada Luz Aalvarenga Belloso");
        tvRedSocial.setText("Facebook Ada Alvarenga");
        tvCel.setText("7o315067");
        tvDireccion.setText("San juan Nonualco ");

    }
}
