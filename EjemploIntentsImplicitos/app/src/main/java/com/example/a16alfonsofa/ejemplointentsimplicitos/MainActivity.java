package com.example.a16alfonsofa.ejemplointentsimplicitos;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnContacto, btnLlamar, btnNavegador, btnMarcar, btnDial;
    private static final int LLAMADA_TELEFONO = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContacto = (Button) findViewById(R.id.btnContactos);
        btnLlamar = (Button) findViewById(R.id.btnLlamar);
        btnNavegador = (Button) findViewById(R.id.btnNavegador);
        btnDial = (Button) findViewById(R.id.btnDial);
        btnMarcar = (Button) findViewById(R.id.btnMarcarNumero);


        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"));
                startActivity(i);
            }
        });

        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tenemos permiso para realizar esta accion?
                //------------------------------------------
                //Int permiso=checkSelfPermission(Manifest.permission.CALL_PHONE);
                //PackageManager tiene los ctes. para calidacion
                //PERO EN LUGAR DE ESTO PODEMOS HACERLO COMO EN LOS APUNTE:

                if (Build.VERSION.SDK_INT >= 23) {
                    if (checkSelfPermission(android.Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {

                        //existe el permiso
                        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(+34)678170042"));
                        startActivity(i);

                    } else {

                        //no hay permiso
                        requestPermissions(new String[]{android.Manifest.permission.CALL_PHONE}, LLAMADA_TELEFONO);
                    }
                } else {
                    Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(+34)678170042"));
                    startActivity(i);
                }
            }
        });

        btnNavegador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.xunta.gal/"));
                startActivity(i);

            }
        });

        btnMarcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (Build.VERSION.SDK_INT >= 23) {
                    if (checkSelfPermission(android.Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {

                        //existe el permiso
                        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+34)986122233"));
                        startActivity(i);

                    } else {

                        //no hay permiso
                        requestPermissions(new String[]{android.Manifest.permission.CALL_PHONE}, LLAMADA_TELEFONO);
                    }
                } else {
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+34)986122233"));
                    startActivity(i);
                }
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                startActivity(i);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        //Vemos si el codigo de respuesta coincide con el indentificador de nuestra seleccion
        if (requestCode == LLAMADA_TELEFONO) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //Permiso Concedido
            } else {
                //Permiso denegado
            }
        }
    }

}
