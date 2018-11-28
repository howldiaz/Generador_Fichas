package com.example.eag.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inventario extends AppCompatActivity {

    private TextView inventario;
    private EditText inventarioText;
    private Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario);

        inventario = (TextView) findViewById(R.id.inventario);
        inventarioText = (EditText) findViewById(R.id.poderesText);
        sig = (Button) findViewById(R.id.sig);

        /*sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar();
            }
        });*/
    }

    /*public void cambiar(){
        Intent p = new Intent(this, Inventario.class);
        startActivity(p);
    }*/
}
