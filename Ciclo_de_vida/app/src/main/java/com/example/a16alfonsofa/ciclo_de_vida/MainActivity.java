package com.example.a16alfonsofa.ciclo_de_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnFin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFin = (Button) findViewById(R.id.btn1);
        btnFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

                //toast y log
                Toast.makeText(MainActivity.this, "Se ejecuta el metodo onClick del Boton de Fin", Toast.LENGTH_LONG).show();
                Log.i("Ciclo-Vida", "Se ejecuta el metodo onClick del Boton de Fin");
            }
        });

        //toast y log
        Toast.makeText(this, "Se ejecuta el metodo onCreated", Toast.LENGTH_LONG).show();
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onCreated");
    }

    @Override
    protected void onStart() {
        super.onStart();

        //toast y log
        Toast.makeText(this, "Se ejecuta el metodo onStart", Toast.LENGTH_LONG).show();
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        //toast y log
        Toast.makeText(this, "Se ejecuta el metodo onResume", Toast.LENGTH_LONG).show();
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onResume");
    }


    @Override
    protected void onStop() {
        super.onStop();

        //toast y log
        Toast.makeText(this, "Se ejecuta el metodo onStop", Toast.LENGTH_LONG).show();
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();

        //toast y log
        Toast.makeText(this, "Se ejecuta el metodo onPause", Toast.LENGTH_LONG).show();
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //toast y log
        Toast.makeText(this, "Se ejecuta el metodo onDestroy", Toast.LENGTH_LONG).show();
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        //toast y log
        Toast.makeText(this, "Se ejecuta el metodo onRestrat", Toast.LENGTH_LONG).show();
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onRestrat");
    }
}
