package com.zebra.printstationcard.Medic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.zebra.printstationcard.R;

public class PacientActivity extends AppCompatActivity {


    private ImageView imgPaciente;
    private TextView tvDescricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacient);
    }


    private void init(){

        tvDescricao = (TextView) findViewById(R.id.tvDescricao);


    }
}
