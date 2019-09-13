package com.zebra.printstationcard.fingerprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.zebra.printstationcard.R;
import com.zebra.printstationcard.util.*;

public class FormActivity extends AppCompatActivity {

    private Button btnGoToPicture;
    private Spinner etAcesso;
    private EditText etName, etSobrenome, etCpf, etRg, etState, etTipoSanguineo, etNascimento, etGenero, etPorteArma, etEndereco;
    private String name, sobrenome, cpf, rg, state, tipoDeAcesso, tipo_sanguineo, nascimento, genero, porte_arma, endereco, dados;


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

                //TIREI A CAMERA PRA AGILIZAR OS TESTES
                //Intent cameraIntent = new Intent(FormActivity.this, CameraActivity.class);
                Intent cameraIntent = new Intent(FormActivity.this, EnrollActivity.class);


                cameraIntent.putExtra("Dados", dados);
                startActivity(cameraIntent);
            }
        });



    }

    private void init() {
        btnGoToPicture = (Button) findViewById(R.id.btnGoToPicture);
        etName = (EditText) findViewById(R.id.etName);
        etSobrenome = (EditText) findViewById(R.id.etSobrenome);
        etEndereco = (EditText) findViewById(R.id.etEndereco);
        etCpf = (EditText) findViewById(R.id.etCPF);
        etRg = (EditText) findViewById(R.id.etRG);
        etState = (EditText) findViewById(R.id.etState);
        etTipoSanguineo = (EditText) findViewById(R.id.etTipoSanguineo);
        etNascimento = (EditText) findViewById(R.id.etDataNasc);
        etGenero = (EditText) findViewById(R.id.etGenero);
        etAcesso = (Spinner) findViewById(R.id.spinnerTipoAcesso);


        spinner_tipo_Acesso = (Spinner) findViewById(R.id.spinnerTipoAcesso);
        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.tipo_acesso, android.R.layout.simple_spinner_dropdown_item);
        spinner_tipo_Acesso.setAdapter(arrayAdapter);

    }

    private String getString() {
        name = etName.getText().toString();
        sobrenome = etSobrenome.getText().toString();
        endereco = etEndereco.getText().toString();
        cpf = etCpf.getText().toString();
        rg = etRg.getText().toString();
        state = etState.getText().toString();
        tipoDeAcesso = etAcesso.getSelectedItem().toString();
        tipo_sanguineo = etTipoSanguineo.getText().toString();
        nascimento = etNascimento.getText().toString();
        genero = etGenero.getText().toString();

        dados = "NAME:" + name + "£" + "SOBRENOME:" + sobrenome + "£" + "CPF:" + cpf + "£" + "RG:" + rg + "£" + "ENDERECO:" + endereco +"£"+ "ESTADO:" + state +"£" + "ACESSO:" + tipoDeAcesso
                +"£" + "TIPO_SANGUINEO:" + state + "£" + "NASCIMENTO:" + nascimento +"£" + "GENERO:" + genero +"£";

        return dados;
    }




}
