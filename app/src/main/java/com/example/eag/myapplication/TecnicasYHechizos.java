package com.example.eag.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TecnicasYHechizos extends AppCompatActivity {

    private TextView poderes;
    private EditText poderesText;
    private Button sig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecnicas_yhechizos);

        poderes = (TextView) findViewById(R.id.inventario);
        poderesText = (EditText) findViewById(R.id.poderesText);
        sig = (Button) findViewById(R.id.sig);

        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar();
            }
        });
    }

    public void cambiar(){
        Intent o = new Intent(this, Inventario.class);
        startActivity(o);
    }
}
