package com.zebra.printstationcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MedicoActivity extends AppCompatActivity {

    private ImageView imgPrimeiroSocorros;
    private EditText etTipoExame, etNomePaciente, etDescricao;

    private String tipoExame, nomePaciente, Descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_doctor);

        tipoExame = etTipoExame.getText().toString();
        nomePaciente = etNomePaciente.getText().toString();
        Descricao = etDescricao.getText().toString();

    }


    private void init(){

        imgPrimeiroSocorros = (ImageView) findViewById(R.id.imgPrimeiroSocorro);
        etTipoExame = (EditText) findViewById(R.id.etTipoExame);
        etNomePaciente = (EditText) findViewById(R.id.etNomePaciente);
        etTipoExame = (EditText) findViewById(R.id.etDescricao);

    }
}
