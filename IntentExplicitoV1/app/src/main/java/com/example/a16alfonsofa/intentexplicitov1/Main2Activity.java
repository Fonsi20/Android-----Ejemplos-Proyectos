package com.example.a16alfonsofa.intentexplicitov1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {


    private TextView lbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lbl = (TextView) findViewById(R.id.lblResu);

        Log.i("Ciclo-Vida", "Se ejecuta el metodo onCreate 2");

        Intent i = getIntent();
        String datoRecibido = i.getExtras().getString("cadena");
        
        lbl.setText(datoRecibido);

    }


    @Override
    protected void onStart() {
        super.onStart();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onStart 2");
    }

    @Override
    protected void onResume() {
        super.onResume();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onResume 2");
    }


    @Override
    protected void onStop() {
        super.onStop();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onStop 2");
    }

    @Override
    protected void onPause() {
        super.onPause();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onPause 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onDestroy 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onRestrat 2");
    }


}
