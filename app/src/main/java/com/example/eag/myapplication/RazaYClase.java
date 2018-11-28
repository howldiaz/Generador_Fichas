package com.example.eag.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class RazaYClase extends AppCompatActivity {

    private Spinner spinner1, spinner2;
    private Button sig2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raza_clase);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        sig2 = (Button) findViewById(R.id.sig2);

        sig2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar2();
            }
        });
    }

    public void cambiar2(){
        Intent j = new Intent(this, Principales.class);
        startActivity(j);
    }
}
