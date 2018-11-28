package com.example.eag.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SecundariasSociales extends AppCompatActivity {

    private TextView mentir, empatia, liderazgo, intimidar,
                     callejeo, comercio, seducir,
                     protocolo, convencer, actuar, timar, disfraz;

    private SeekBar sbMentir, sbEmpatia, sbLiderazgo, sbIntimidar,
                    sbCallejeo, sbComercio, sbSeducir,
                    sbProtocolo, sbConvencer, sbActuar, sbTimar, sbDisfraz;

    private TextView mentirValue, empatiaValue, liderazgoValue, intimidarValue,
                     callejeoValue, comercioValue, seducirValue,
                     protocoloValue, convencerValue, actuarValue, timarValue, disfrazValue;

    private TextView pTotales;
    private Button atras;
    public static int puntosTotales = 40;
    public int puntosRestantes, puntosUsados, porcentajeActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundarias_sociales);

        pTotales = (TextView) findViewById(R.id.pTotales);
        atras = (Button) findViewById(R.id.atras);

        mentir = (TextView) findViewById(R.id.mentir);
        empatia = (TextView) findViewById(R.id.empatia);
        liderazgo = (TextView) findViewById(R.id.liderazgo);
        intimidar = (TextView) findViewById(R.id.intimidar);
        callejeo = (TextView) findViewById(R.id.callejeo);
        comercio = (TextView) findViewById(R.id.comercio);
        seducir = (TextView) findViewById(R.id.seducir);
        protocolo = (TextView) findViewById(R.id.protocolo);
        convencer = (TextView) findViewById(R.id.convencer);
        actuar = (TextView) findViewById(R.id.actuar);
        timar = (TextView) findViewById(R.id.timar);
        disfraz = (TextView) findViewById(R.id.disfraz);

        sbMentir = (SeekBar) findViewById(R.id.sbMentir);
        sbEmpatia = (SeekBar) findViewById(R.id.sbEmpatia);
        sbLiderazgo = (SeekBar) findViewById(R.id.sbLiderazgo);
        sbIntimidar = (SeekBar) findViewById(R.id.sbIntimidar);
        sbCallejeo = (SeekBar) findViewById(R.id.sbCallejeo);
        sbComercio = (SeekBar) findViewById(R.id.sbComercio);
        sbSeducir = (SeekBar) findViewById(R.id.sbSeducir);
        sbProtocolo = (SeekBar) findViewById(R.id.sbProtocolo);
        sbConvencer = (SeekBar) findViewById(R.id.sbConvencer);
        sbActuar = (SeekBar) findViewById(R.id.sbActuar);
        sbTimar = (SeekBar) findViewById(R.id.sbTimar);
        sbDisfraz = (SeekBar) findViewById(R.id.sbDisfraz);

        mentirValue = (TextView) findViewById(R.id.mentirValue);
        empatiaValue = (TextView) findViewById(R.id.empatiaValue);
        liderazgoValue = (TextView) findViewById(R.id.liderazgoValue);
        intimidarValue = (TextView) findViewById(R.id.intimidarValue);
        callejeoValue = (TextView) findViewById(R.id.callejeoValue);
        comercioValue = (TextView) findViewById(R.id.comercioValue);
        seducirValue = (TextView) findViewById(R.id.seducirValue);
        protocoloValue = (TextView) findViewById(R.id.protocoloValue);
        convencerValue = (TextView) findViewById(R.id.convencerValue);
        actuarValue = (TextView) findViewById(R.id.actuarValue);
        timarValue = (TextView) findViewById(R.id.timarValue);
        disfrazValue = (TextView) findViewById(R.id.disfrazValue);

        sbMentir.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mentirValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sbEmpatia.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                empatiaValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbLiderazgo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                liderazgoValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbIntimidar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                intimidarValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbCallejeo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                callejeoValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbComercio.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                comercioValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbSeducir.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seducirValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbProtocolo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                protocoloValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbConvencer.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                convencerValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbActuar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                actuarValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbTimar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                timarValue.setText(progress + "");
                comprobador();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbDisfraz.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                disfrazValue.setText(progress + "");
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
        puntosUsados = sbMentir.getProgress() + sbEmpatia.getProgress() + sbLiderazgo.getProgress() +
                sbIntimidar.getProgress() + sbCallejeo.getProgress() + sbComercio.getProgress() +
                sbSeducir.getProgress() + sbProtocolo.getProgress() + sbConvencer.getProgress() +
                sbActuar.getProgress() + sbTimar.getProgress() + sbDisfraz.getProgress();


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
