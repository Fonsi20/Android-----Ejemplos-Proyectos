package com.example.a16alfonsofa.eventov3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView lblRespuesta;
    public int n;
    private Button btnSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSumar = (Button) findViewById(R.id.btnSumar);

        //asociar escuchadores a la vistas correcpondientes
        btnSumar.setOnClickListener(escuchador1);

        lblRespuesta = (TextView) findViewById(R.id.Resultado);
    }

    private View.OnClickListener escuchador1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            n++;
            lblRespuesta.setText("Has pulsado el botón " + n + " veces");
        }
    };

}
