package com.example.a16alfonsofa.eventov4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button btn, btn2;
    public TextView lblRespuesta;
    public int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblRespuesta = (TextView) findViewById(R.id.Resultado);
        btn = (Button) findViewById(R.id.btnSumar);
        btn2 = (Button) findViewById(R.id.btnfin);

        //Pulsamos y nos suma
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n++;
            }
        });

        //Pulsamos para ver resultado
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblRespuesta.setText("Has pulsado el botton " + n + " veces.");
                n = 0;
            }
        });
    }
}

