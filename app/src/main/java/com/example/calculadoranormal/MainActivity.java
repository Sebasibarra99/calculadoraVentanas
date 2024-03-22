package com.example.calculadoranormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;
    private TextView text_respuesta;
    private EditText edit_numeroUno;
    private EditText edit_numeroDos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*DECLARACION DE BOTONES*/
        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = Suma(Integer.parseInt(edit_numeroUno.getText().toString()), Integer.parseInt(edit_numeroDos.getText().toString()));
                Intent i = new Intent(MainActivity.this,resultadoSuma.class);
                Bundle bundle = new Bundle();
                bundle.putInt("Resultado",resultado);
                i.putExtras(bundle);
                startActivity(i);
            }
        });



        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = Resta(Integer.parseInt(edit_numeroUno.getText().toString()), Integer.parseInt(edit_numeroDos.getText().toString()));
                Intent i = new Intent(MainActivity.this, resultadoSuma.class);
                Bundle bundle = new Bundle();
                bundle.putInt("Resultado",resultado);
                i.putExtras(bundle);
                startActivity(i);
            }
        });


        btn_multiplicacion = findViewById(R.id.button_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = Multiplicacion(Integer.parseInt(edit_numeroUno.getText().toString()), Integer.parseInt(edit_numeroDos.getText().toString()));
                Intent i = new Intent(MainActivity.this, resultadoSuma.class);
                Bundle bundle = new Bundle();
                bundle.putInt("Resultado",resultado);
                i.putExtras(bundle);
                startActivity(i);
            }
        });


        btn_division = findViewById(R.id.button_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = Division(Integer.parseInt(edit_numeroUno.getText().toString()), Integer.parseInt(edit_numeroDos.getText().toString()));
                Intent i = new Intent(MainActivity.this, resultadoSuma.class);
                Bundle bundle = new Bundle();
                bundle.putInt("Resultado",resultado);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        text_respuesta = findViewById(R.id.respuesta);

        edit_numeroUno = findViewById(R.id.numero1);
        edit_numeroDos = findViewById(R.id.numero2);


    }

    public int Suma(int a,int b){
        return a+b;
    }
    public int Resta(int a,int b){
        return a-b;
    }
    public int Multiplicacion(int a,int b){
        return a*b;
    }
    public int Division(int a,int b){
        int respuesta =0;
        if(b!=0){
            respuesta =a/b;
        }
        return respuesta;

    }
}