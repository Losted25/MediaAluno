package com.example.mediaaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    //Declara os objetos que serão associados aos elementos de tela
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //Associa os objetos aos elementos de tela
        tvResultado = (TextView)findViewById(R.id.tvResultado);

        Intent i = getIntent();
        float media = i.getFloatExtra("média",0f);
        //define o que será apresentado ao usuário
        String situacao = null;
        if (media >= 6) {
            situacao = "Aprovado";
        } else
            situacao = "Reprovado";
        String msg = "Parabéns, você foi " + situacao + " com média " + media;

        tvResultado.setText(msg);

    }
}