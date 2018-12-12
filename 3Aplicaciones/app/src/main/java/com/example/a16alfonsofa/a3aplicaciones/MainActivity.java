package com.example.a16alfonsofa.a3aplicaciones;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnAct1, btnAct2, btnActCuenta;
    private TextView lblResul;
    private int codigo = 1;
    private int codigo2 = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAct1 = (Button) findViewById(R.id.btnactividad2);
        btnAct2 = (Button) findViewById(R.id.btnactividad3);
        btnActCuenta = (Button) findViewById(R.id.btnOTRAactividad);
        lblResul = (TextView) findViewById(R.id.lblSalida);

        btnAct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("mensaje", "Vengo de la actividad 1!");
                startActivityForResult(i, codigo);
            }
        });

        btnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main3Activity.class);
                i.putExtra("mensaje", "Vengo de la actividad 1 HOHOHO!");
                startActivityForResult(i, codigo2);
            }
        });

        btnActCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent();
                w.setClassName("com.example.a16alfonsofa.eventov4","com.example.a16alfonsofa.eventov4.MainActivity");
                PackageManager pm = getPackageManager();
                List actividadesPosibles = pm.queryIntentActivities(w, PackageManager.MATCH_DEFAULT_ONLY);
                if (actividadesPosibles.size()>0) {
                    startActivity(w);
                } else {
                    Toast.makeText(MainActivity.this, "Ninguna actividad puede cumplir la accion", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == 1) {
                float devuelve2 = data.getExtras().getFloat("float");
                Toast.makeText(this, "" + devuelve2, Toast.LENGTH_LONG).show();
            }
            if (requestCode == 2) {
                int devuelve3 = data.getExtras().getInt("int");
                Toast.makeText(this, "" + devuelve3, Toast.LENGTH_LONG).show();
            }
        }

    }
}
