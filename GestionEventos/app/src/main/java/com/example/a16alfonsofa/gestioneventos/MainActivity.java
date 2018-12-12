package com.example.a16alfonsofa.gestioneventos;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblRespuesta;
    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //objetos
        lblRespuesta = (TextView) findViewById(R.id.respuesta);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        //objeto escuchador btn 1
        ClaseEventos escuchador1 = new ClaseEventos();

        //asociar escuchadores a la vistas correcpondientes
        btn1.setOnClickListener(escuchador1);
        btn2.setOnClickListener(escuchador2);

        //Metodo 3, todos los pasos en 1 sentencia
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblRespuesta.setText("Pulsado Boton 3 - Todo en uno");
            }
        });
    }

    private class ClaseEventos implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            //gestion boton 1
            lblRespuesta.setText("Pulsado Boton 1 - Clase interna");
        }
    }

    //METODO 2 crear el listener mediante una clase anonima, fuera del ON CREATED
    private View.OnClickListener escuchador2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            lblRespuesta.setText("Pulsado Boton 2 - Clase anónima");
        }
    };

}
