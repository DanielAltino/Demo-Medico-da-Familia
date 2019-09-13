package com.zebra.printstationcard.fingerprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zebra.printstationcard.BluetoothPrinter;
import com.zebra.printstationcard.MainActivity;
import com.zebra.printstationcard.util.UIHelper;


import com.zebra.printstationcard.R;


public class FirstActivity extends AppCompatActivity {

    Button btnSignup;
    Button btnPrintCard;
    Button btnIdentify;
    Button btnPrintText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finger_main);

        UIHelper.setLogoOnActionBar(this);

        btnSignup = (Button) findViewById(R.id.btnSignup);
        btnPrintCard = (Button) findViewById(R.id.btnPrintCard);
        btnIdentify = (Button) findViewById(R.id.btnIdentify);
        btnPrintText = (Button) findViewById(R.id.btnPrintText);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FirstActivity.this, "Singup user", Toast.LENGTH_SHORT).show();
                Intent formIntent = new Intent(FirstActivity.this, FormActivity.class);
                startActivity(formIntent);
            }
        });

        btnIdentify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FirstActivity.this, "Identification", Toast.LENGTH_SHORT).show();
                Intent identifyIntent = new Intent(FirstActivity.this, IdentificationActivity.class);
                startActivity(identifyIntent);
            }
        });

        btnPrintCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FirstActivity.this, "Identification", Toast.LENGTH_SHORT).show();
                Intent printIntent = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(printIntent);
            }
        });

        btnPrintText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FirstActivity.this, "Identification", Toast.LENGTH_SHORT).show();
                Intent printIntent = new Intent(FirstActivity.this, BluetoothPrinter.class);
                startActivity(printIntent);
            }
        });
    }
}

