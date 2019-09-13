package com.zebra.printstationcard.Medic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.zebra.printstationcard.BluetoothPrinter.BluetoothMainActivity;
import com.zebra.printstationcard.R;

public class MedicActivity extends AppCompatActivity {


    private ImageView imgPrimeiroSocorros;
    private EditText etTipoExame, etNomePaciente, etDescricao;
    private Button btnImprimir;

    private String tipoExame, nomePaciente, Descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_medic);

        init();



    }


    private void init(){

        imgPrimeiroSocorros = (ImageView) findViewById(R.id.imgPrimeiroSocorro);
        etTipoExame = (EditText) findViewById(R.id.etTipoExame);
        etNomePaciente = (EditText) findViewById(R.id.etNomePaciente);
        etTipoExame = (EditText) findViewById(R.id.etDescricao);
        btnImprimir = (Button) findViewById(R.id.btnImprimirLaudo);

        btnImprimir.setOnClickListener(this::onClick);

    }


    private void getString(){
        tipoExame = etTipoExame.getText().toString();
        nomePaciente = etNomePaciente.getText().toString();
        Descricao = etDescricao.getText().toString();
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnImprimirLaudo:
                Intent printIntent = new Intent(this, BluetoothMainActivity.class);
                startActivity(printIntent);
                break;

        }
    }

}
