package com.example.a16alfonsofa.saludopersonalizado3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView lblR;
    private CheckBox cbDespe;
    private LinearLayout llySalidas;
    private RadioButton rbAmigo;
    private RadioButton rbEnemigo;
    private Button btnVolver

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        lblR = (TextView) findViewById(R.id.lblResu);
        cbDespe = (CheckBox) findViewById(R.id.chkDespe);
        llySalidas = (LinearLayout) findViewById(R.id.seleccionaSalida);
        rbAmigo = (RadioButton) findViewById(R.id.rbAmigo);
        rbEnemigo = (RadioButton) findViewById(R.id.rbEnemigo);
        btnVolver = (Button) findViewById(R.id.btnVolver);

        Intent i = getIntent();
        String datoRecibido = i.getExtras().getString("cadena");

        lblR.setText(datoRecibido);

        cbDespe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbDespe.isChecked()) {
                    llySalidas.setVisibility(View.VISIBLE);
                } else {
                    llySalidas.setVisibility(View.GONE);
                }
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i = getIntent();
                if (cbDespe.isChecked()) {
                    if (rbAmigo.isChecked()) {
                        String solucion = rbAmigo.getText().toString();
                        i.putExtra("cadena", solucion);
                    } else {
                        String solucion = rbEnemigo.getText().toString();
                        i.putExtra("cadena", solucion);
                    }
                } else {
                    String solucion = "No me despido, jum..";
                    i.putExtra("cadena", solucion);
                }
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}

