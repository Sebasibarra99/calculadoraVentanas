package com.example.calculadoranormal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


public class resultadoSuma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_suma);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            int resultado = bundle.getInt("Resultado");

            TextView textViewResultado = findViewById(R.id.textViewResultado);
            textViewResultado.setText("EL RESULTADO DE LA OPERACION ES: "+resultado);
        }


    }

}
