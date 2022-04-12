package com.example.lanchonetefb2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular (View view){

        EditText codigo = findViewById(R.id.codigo);
        String lanche = codigo.getText().toString();
        int codLanche = Integer.parseInt(lanche);
        EditText qnt = findViewById(R.id.qnt);
        String quant = qnt.getText().toString();
        float quantidade = Float.parseFloat(quant);
        float valor;
        float calculo;

        switch (lanche) {
            case "30":
               valor = (float) 4.3;
               calculo = valor * quantidade;
                Toast.makeText(getApplicationContext(), "Valor final: "+String.valueOf(calculo),Toast.LENGTH_LONG).show();
            break;
            case "31":
                valor = (float) 5.7;
                calculo = valor * quantidade;
                Toast.makeText(getApplicationContext(), "Valor final: "+String.valueOf(calculo),Toast.LENGTH_LONG).show();
            break;
            case "32":
                valor = (float) 10.5;
                calculo = valor * quantidade;
                Toast.makeText(getApplicationContext(), "Valor final: "+String.valueOf(calculo),Toast.LENGTH_LONG).show();
            break;
            case "33":
                valor = (float) 12.9;
                calculo = valor * quantidade;
                Toast.makeText(getApplicationContext(), "Valor final: "+String.valueOf(calculo),Toast.LENGTH_LONG).show();
            break;
            case "34":
                valor = (float) 15.1;
                calculo = valor * quantidade;
                Toast.makeText(getApplicationContext(), "Valor final: "+String.valueOf(calculo),Toast.LENGTH_LONG).show();
            break;
            case "35":
                valor = (float) 16.4;
                calculo = valor * quantidade;
                Toast.makeText(getApplicationContext(), "Valor final: R$"+String.valueOf(calculo),Toast.LENGTH_LONG).show();
            break;
            default:
                Toast.makeText(getApplicationContext(), "Código desconhecido",Toast.LENGTH_LONG).show();
        }

    }
}