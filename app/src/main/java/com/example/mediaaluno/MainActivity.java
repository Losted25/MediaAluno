package com.example.mediaaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        // declara os objetos que identificam os campos de tela
    EditText edNota1;
    EditText edNota2;
    EditText edNota3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNota1 =(EditText)findViewById(R.id.edNota1);
        edNota2 =(EditText)findViewById(R.id.edNota2);
        edNota3 =(EditText)findViewById(R.id.edNota3);
    }

    public void calcularMedia(View v){
        //declara variáveis que farão o cálculo da média
        float nota1 = Float.parseFloat(edNota1.getText().toString());
        float nota2 = Float.parseFloat(edNota2.getText().toString());
        float nota3 = Float.parseFloat(edNota3.getText().toString());

        float media = (nota1+nota2+nota3) / 3; //calcula a média

        //Declara o controle Intent que será usado para identificar a próxima tela
        Intent i = new Intent(this, Resultado.class);
        //insere um parâmetro a ser usado na próxima tela
        i.putExtra ("média", media);
        //chama a próxima tela
        startActivity(i);
    }
}