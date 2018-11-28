package com.example.eag.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SecundariasFisicas extends AppCompatActivity {

    private TextView pelea, atletismo, robar, sigilo, nadar, montar,
                    abrirCerr, resDolorF, escalar, evadir, bloquear, esquivar;
    private SeekBar sbPelea, sbAtletismo, sbRobar, sbSigilo, sbNadar, sbMontar,
                    sbAbrirCerr, sbResDolorF, sbEscalar, sbEvadir, sbBloquear, sbEsquivar;
    private TextView peleaValue, atletismoValue, robarValue, sigiloValue, nadarValue, montarValue,
            abrirCerrValue, resDolorFValue, escalarValue, evadirValue, bloquearValue, esquivarValue;
    private TextView pTotales;
    private Button atras;
    public static int puntosTotales = 40;
    public int puntosRestantes, puntosUsados, porcentajeActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secundarias_fisicas);

        pTotales = (TextView) findViewById(R.id.pTotales);
        atras = (Button) findViewById(R.id.atras);

        pelea = (TextView) findViewById(R.id.mentir);
        atletismo = (TextView) findViewById(R.id.empatia);
        robar = (TextView) findViewById(R.id.liderazgo);
        sigilo = (TextView) findViewById(R.id.intimidar);
        nadar = (TextView) findViewById(R.id.callejeo);
        montar = (TextView) findViewById(R.id.comercio);
        abrirCerr = (TextView) findViewById(R.id.seducir);
        resDolorF = (TextView) findViewById(R.id.protocolo);
        escalar = (TextView) findViewById(R.id.convencer);
        evadir = (TextView) findViewById(R.id.actuar);
        bloquear = (TextView) findViewById(R.id.timar);
        esquivar = (TextView) findViewById(R.id.esquivar);

        sbPelea = (SeekBar) findViewById(R.id.sbMentir);
        sbAtletismo = (SeekBar) findViewById(R.id.sbEmpatia);
        sbRobar = (SeekBar) findViewById(R.id.sbLiderazgo);
        sbSigilo = (SeekBar) findViewById(R.id.sbIntimidar);
        sbNadar = (SeekBar) findViewById(R.id.sbCallejeo);
        sbMontar = (SeekBar) findViewById(R.id.sbComercio);
        sbAbrirCerr = (SeekBar) findViewById(R.id.sbSeducir);
        sbResDolorF = (SeekBar) findViewById(R.id.sbProtocolo);
        sbEscalar = (SeekBar) findViewById(R.id.sbConvencer);
        sbEvadir = (SeekBar) findViewById(R.id.sbActuar);
        sbBloquear = (SeekBar) findViewById(R.id.sbTimar);
        sbEsquivar = (SeekBar) findViewById(R.id.sbDisfraz);


        peleaValue = (TextView) findViewById(R.id.mentirValue);
        atletismoValue = (TextView) findViewById(R.id.empatiaValue);
        robarValue = (TextView) findViewById(R.id.liderazgoValue);
        sigiloValue = (TextView) findViewById(R.id.intimidarValue);
        nadarValue = (TextView) findViewById(R.id.callejeoValue);
        montarValue = (TextView) findViewById(R.id.comercioValue);
        abrirCerrValue = (TextView) findViewById(R.id.seducirValue);
        resDolorFValue = (TextView) findViewById(R.id.protocoloValue);
        escalarValue = (TextView) findViewById(R.id.convencerValue);
        evadirValue = (TextView) findViewById(R.id.actuarValue);
        bloquearValue = (TextView) findViewById(R.id.timarValue);
        esquivarValue = (TextView) findViewById(R.id.disfrazValue);

        sbPelea.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                peleaValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbAtletismo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                atletismoValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbRobar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                robarValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbSigilo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sigiloValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbNadar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                nadarValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbMontar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                montarValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbAbrirCerr.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                abrirCerrValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbResDolorF.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                resDolorFValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbEscalar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                escalarValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbEvadir.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                evadirValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbBloquear.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                bloquearValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbEsquivar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                esquivarValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

    }
    public void back(){
        Intent k = new Intent(this, HallSecundarias.class);
        startActivity(k);
    }

    public void comprobador() {
        //puntosRestantes, puntosUsados, porcentajeActual;
        puntosUsados = sbPelea.getProgress() + sbAtletismo.getProgress() + sbRobar.getProgress() +
                sbSigilo.getProgress() + sbNadar.getProgress() + sbMontar.getProgress() +
                sbAbrirCerr.getProgress() + sbResDolorF.getProgress() + sbEscalar.getProgress() +
                sbEvadir.getProgress() + sbBloquear.getProgress() + sbEsquivar.getProgress();


        puntosRestantes = puntosTotales - puntosUsados;
        pTotales.setText(puntosRestantes + "");
        if (puntosRestantes < 0) {
            atras.setEnabled(false);
            Toast.makeText(this, "No puedes superar los 40 puntos.", Toast.LENGTH_SHORT).show();

        } else {
            atras.setEnabled(true);
        }
    }
}

