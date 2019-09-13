package com.zebra.printstationcard.fingerprint;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.zebra.printstationcard.R;
import com.zebra.printstationcard.util.UIHelper;

import java.util.ArrayList;

public class FormActivity extends AppCompatActivity {

    private Button btnGoToPicture;
    private EditText etName, etSobrenome, etCpf, etRg, etState, etCargo, etTipoSanguineo, etNascimento, etGenero, etPorteArma, etRegistro;
    private String name, sobrenome, cpf, rg, state, cargo, tipo_sanguineo, nascimento, genero, porte_arma, registro, dados;


    //o Tipo de acesso vai dizer se o usuario é um médico ou passiente
    private Spinner spinner_tipo_Acesso;
    private ArrayAdapter arrayAdapter;

    private String[] tipoAcesso = new String[]{"Médico", "Paciente"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        UIHelper.setLogoOnActionBar(this);

        init();

        btnGoToPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getString();
                Intent cameraIntent = new Intent(FormActivity.this, CameraActivity.class);
                cameraIntent.putExtra("Dados", dados);
                startActivity(cameraIntent);
            }
        });



    }

    private void init() {
        btnGoToPicture = (Button) findViewById(R.id.btnGoToPicture);
        etName = (EditText) findViewById(R.id.etName);
        etSobrenome = (EditText) findViewById(R.id.etSobrenome);
        etRegistro = (EditText) findViewById(R.id.etRegistro);
        etCpf = (EditText) findViewById(R.id.etCPF);
        etRg = (EditText) findViewById(R.id.etRG);
        etState = (EditText) findViewById(R.id.etState);
        etTipoSanguineo = (EditText) findViewById(R.id.etTipoSanguineo);
        etNascimento = (EditText) findViewById(R.id.etDataNasc);
        etGenero = (EditText) findViewById(R.id.etGenero);


        spinner_tipo_Acesso = (Spinner) findViewById(R.id.spinnerTipoAcesso);
        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.tipo_acesso, android.R.layout.simple_spinner_dropdown_item);
        spinner_tipo_Acesso.setAdapter(arrayAdapter);

    }

    private String getString() {
        name = etName.getText().toString();
        sobrenome = etSobrenome.getText().toString();
        registro = etRegistro.getText().toString();
        cpf = etCpf.getText().toString();
        rg = etRg.getText().toString();
        state = etState.getText().toString();
        cargo = etCargo.getText().toString();
        tipo_sanguineo = etTipoSanguineo.getText().toString();
        nascimento = etNascimento.getText().toString();
        genero = etGenero.getText().toString();

        dados = "NAME:" + name + "£" + "SOBRENOME:" + sobrenome + "£" + "CPF:" + cpf + "£" + "RG:" + rg + "£" + "REGISTRO:" + registro +"£"+ "ESTADO:" + state +"£" + "CARGO:" + cargo
                +"£" + "TIPO_SANGUINEO:" + state + "£" + "NASCIMENTO:" + nascimento +"£" + "GENERO:" + genero +"£";

        return dados;
    }




}
