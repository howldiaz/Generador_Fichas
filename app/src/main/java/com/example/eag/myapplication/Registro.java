package com.example.eag.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private EditText nombre, apellidos, edad;
    private Button sig1;
    private RadioButton radio_hombre, radio_mujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        nombre = (EditText) findViewById(R.id.nombre);
        apellidos = (EditText) findViewById(R.id.apellido);
        edad = (EditText) findViewById(R.id.edad);

        radio_hombre = (RadioButton) findViewById(R.id.radio_hombre);
        radio_mujer = (RadioButton) findViewById(R.id.radio_mujer);


        sig1 = (Button) findViewById(R.id.sig1);

        sig1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar();
            }
        });
    }

    public void cambiar(){
        Intent i = new Intent(this, RazaYClase.class);
        startActivity(i);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio_hombre:
                if (checked)
                    Toast.makeText(this, "Has seleccionado que eres hombre", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.radio_mujer:
                if (checked)
                    Toast.makeText(this, "Has seleccionado que eres mujer", Toast.LENGTH_SHORT).show();
                    break;
        }
    }
}
