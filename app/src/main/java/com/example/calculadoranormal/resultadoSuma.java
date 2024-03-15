package com.example.calculadoranormal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resultadoSuma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_suma);

        int resultado = getIntent().getIntExtra("Resultado",0);

        TextView textViewResultado = findViewById(R.id.textViewResultado);
        textViewResultado.setText("EL RESULTADO ES: "+resultado);

    }
}