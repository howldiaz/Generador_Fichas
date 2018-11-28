
package com.example.eag.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HallSecundarias extends AppCompatActivity {

    private ImageButton fisicos, mentales, sociales;
    private TextView fisicosTv, mentalesTv, socialesTv;
    private Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secundarias_hall);

        fisicos = (ImageButton) findViewById(R.id.fisicos);
        fisicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarFisicos();
            }
        });

        mentales = (ImageButton) findViewById(R.id.mentales);
        mentales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarMentales();
            }
        });

        sociales = (ImageButton) findViewById(R.id.sociales);
        sociales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarSociales();
            }
        });

        fisicosTv = (TextView) findViewById(R.id.fisicosTv);
        mentalesTv = (TextView) findViewById(R.id.mentalesTv);
        socialesTv = (TextView) findViewById(R.id.socialesTv);

        sig = (Button) findViewById(R.id.sig);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar();
            }
        });
    }

    public void cambiarFisicos() {
        Intent l = new Intent(this, SecundariasFisicas.class);
        startActivity(l);
    }

    public void cambiarMentales() {
        Intent m = new Intent(this, SecundariasMentales.class);
        startActivity(m);
    }

    public void cambiarSociales() {
        Intent n = new Intent(this, SecundariasSociales.class);
        startActivity(n);
    }

    public void cambiar() {
        Intent l = new Intent(this, TecnicasYHechizos.class);
        startActivity(l);
    }

}
