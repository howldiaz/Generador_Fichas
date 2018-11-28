package com.example.eag.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SecundariasMentales extends AppCompatActivity {

    private TextView alerta, supervivencia, coherencia, rastrear,
                    concentracion, buscar, esconderse,
                    resDolorM, estrategia, escuchar, conGeneral, tasar;

    private SeekBar sbAlerta, sbSupervivencia, sbCoherencia, sbRastrear,
                    sbConcentracion, sbBuscar, sbEsconderse,
                    sbResDolorM, sbEstrategia, sbEscuchar, sbConGeneral, sbTasar;

    private TextView alertaValue, supervivenciaValue, coherenciaValue, rastrearValue,
                     concentracionValue, buscarValue, esconderseValue,
                     resDolorMValue, estrategiaValue, escucharValue, conGeneralValue, tasarValue;
    private TextView pTotales;
    private Button atras;
    public static int puntosTotales = 40;
    public int puntosRestantes, puntosUsados, porcentajeActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundarias_mentales);

        pTotales = (TextView) findViewById(R.id.pTotales);
        atras = (Button) findViewById(R.id.atras);

        alerta = (TextView) findViewById(R.id.mentir);
        supervivencia = (TextView) findViewById(R.id.empatia);
        coherencia = (TextView) findViewById(R.id.liderazgo);
        rastrear = (TextView) findViewById(R.id.intimidar);
        concentracion = (TextView) findViewById(R.id.callejeo);
        buscar = (TextView) findViewById(R.id.comercio);
        esconderse = (TextView) findViewById(R.id.seducir);
        resDolorM = (TextView) findViewById(R.id.protocolo);
        estrategia = (TextView) findViewById(R.id.convencer);
        escuchar = (TextView) findViewById(R.id.actuar);
        conGeneral = (TextView) findViewById(R.id.timar);
        tasar = (TextView) findViewById(R.id.tasar);

        sbAlerta = (SeekBar) findViewById(R.id.sbMentir);
        sbSupervivencia = (SeekBar) findViewById(R.id.sbEmpatia);
        sbCoherencia = (SeekBar) findViewById(R.id.sbLiderazgo);
        sbRastrear = (SeekBar) findViewById(R.id.sbIntimidar);
        sbConcentracion = (SeekBar) findViewById(R.id.sbCallejeo);
        sbBuscar = (SeekBar) findViewById(R.id.sbComercio);
        sbEsconderse = (SeekBar) findViewById(R.id.sbSeducir);
        sbResDolorM = (SeekBar) findViewById(R.id.sbProtocolo);
        sbEstrategia = (SeekBar) findViewById(R.id.sbConvencer);
        sbEscuchar = (SeekBar) findViewById(R.id.sbActuar);
        sbConGeneral = (SeekBar) findViewById(R.id.sbTimar);
        sbTasar = (SeekBar) findViewById(R.id.sbDisfraz);

        alertaValue = (TextView) findViewById(R.id.mentirValue);
        supervivenciaValue = (TextView) findViewById(R.id.empatiaValue);
        coherenciaValue = (TextView) findViewById(R.id.liderazgoValue);
        rastrearValue = (TextView) findViewById(R.id.intimidarValue);
        concentracionValue = (TextView) findViewById(R.id.callejeoValue);
        buscarValue = (TextView) findViewById(R.id.comercioValue);
        esconderseValue = (TextView) findViewById(R.id.seducirValue);
        resDolorMValue = (TextView) findViewById(R.id.protocoloValue);
        estrategiaValue = (TextView) findViewById(R.id.convencerValue);
        escucharValue = (TextView) findViewById(R.id.actuarValue);
        conGeneralValue = (TextView) findViewById(R.id.timarValue);
        tasarValue = (TextView) findViewById(R.id.disfrazValue);

        sbAlerta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                alertaValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sbSupervivencia.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                supervivenciaValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbCoherencia.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                coherenciaValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbRastrear.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                rastrearValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbConcentracion.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                concentracionValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbBuscar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                buscarValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbEsconderse.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                esconderseValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbResDolorM.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                resDolorMValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbEstrategia.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                estrategiaValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbEscuchar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                escucharValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbConGeneral.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                conGeneralValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbTasar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tasarValue.setText(progress + "");
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
        puntosUsados = sbAlerta.getProgress() + sbSupervivencia.getProgress() + sbCoherencia.getProgress() +
                sbRastrear.getProgress() + sbConcentracion.getProgress() + sbBuscar.getProgress() +
                sbEsconderse.getProgress() + sbResDolorM.getProgress() + sbEstrategia.getProgress() +
                sbEscuchar.getProgress() + sbConGeneral.getProgress() + sbTasar.getProgress();


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

