package com.example.eag.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Principales extends AppCompatActivity {

    public TextView fuerza, destreza, resistencia,
                    inteligencia, percepcion, voluntad,
                    carisma, apariencia, manipulacion;
    public TextView fValue, dValue, rValue,
                    iValue, pValue, vValue,
                    cValue, aValue, mValue;

    private SeekBar sbFuerza, sbDestreza, sbResistencia,
                    sbInteligencia, sbPercepcion, sbVoluntad,
                    sbCarisma, sbApariencia, sbManipulacion;

    public TextView pTotales;

    private Button sig3;

    public static int puntosTotales = 40;
    public int puntosRestantes, puntosUsados, porcentajeActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principales);

        fuerza = (TextView) findViewById(R.id.fuerza);
        destreza = (TextView) findViewById(R.id.destreza);
        resistencia = (TextView) findViewById(R.id.resistencia);

        inteligencia = (TextView) findViewById(R.id.inteligencia);
        percepcion = (TextView) findViewById(R.id.percepcion);
        voluntad = (TextView) findViewById(R.id.voluntad);

        carisma = (TextView) findViewById(R.id.carisma);
        apariencia = (TextView) findViewById(R.id.apariencia);
        manipulacion = (TextView) findViewById(R.id.manipulacion);

        fValue = (TextView) findViewById(R.id.fValue);
        dValue = (TextView) findViewById(R.id.dValue);
        rValue = (TextView) findViewById(R.id.rValue);

        iValue = (TextView) findViewById(R.id.iValue);
        pValue = (TextView) findViewById(R.id.pValue);
        vValue = (TextView) findViewById(R.id.vValue);

        cValue = (TextView) findViewById(R.id.cValue);
        aValue = (TextView) findViewById(R.id.aValue);
        mValue = (TextView) findViewById(R.id.mValue);

        pTotales = (TextView) findViewById(R.id.pTotales);

        sbFuerza = (SeekBar) findViewById(R.id.sbFuerza);
        sbDestreza = (SeekBar) findViewById(R.id.sbDestreza);
        sbResistencia = (SeekBar) findViewById(R.id.sbResistencia);

        sbInteligencia = (SeekBar) findViewById(R.id.sbInteligencia);
        sbPercepcion = (SeekBar) findViewById(R.id.sbPercepcion);
        sbVoluntad = (SeekBar) findViewById(R.id.sbVoluntad);

        sbCarisma = (SeekBar) findViewById(R.id.sbCarisma);
        sbApariencia = (SeekBar) findViewById(R.id.sbApariencia);
        sbManipulacion = (SeekBar) findViewById(R.id.sbManipulacion);

        sig3 = (Button) findViewById(R.id.sig3);

        sbFuerza.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                fValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbDestreza.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                dValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbResistencia.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                rValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbInteligencia.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                iValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbPercepcion.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbVoluntad.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                vValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbCarisma.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                cValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbApariencia.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                aValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbManipulacion.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sig3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar3();
            }
        });
    }

    public void cambiar3(){
        Intent k = new Intent(this, HallSecundarias.class);
        startActivity(k);
    }

    public void comprobador(){
        //puntosRestantes, puntosUsados, porcentajeActual;
        puntosUsados = sbFuerza.getProgress() + sbDestreza.getProgress() + sbResistencia.getProgress() +
                sbInteligencia.getProgress() + sbPercepcion.getProgress() + sbVoluntad.getProgress() +
                sbCarisma.getProgress() + sbApariencia.getProgress() + sbManipulacion.getProgress();
        puntosRestantes = puntosTotales - puntosUsados;
        pTotales.setText(puntosRestantes+"");
        if(puntosRestantes < 0){
            sig3.setEnabled(false);
            Toast.makeText(this, "No puedes superar los 40 puntos.", Toast.LENGTH_SHORT).show();

        }else{
            sig3.setEnabled(true);
        }
    }
}
