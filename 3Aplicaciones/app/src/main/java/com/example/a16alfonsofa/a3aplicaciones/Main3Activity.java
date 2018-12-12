package com.example.a16alfonsofa.a3aplicaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private Button btnReturn3;
    private TextView recibo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnReturn3 = (Button) findViewById(R.id.btnvolver2);
        recibo3 = (TextView) findViewById(R.id.lblSalida3);

        Intent i = getIntent();
        String mensajeR = i.getStringExtra("mensaje");
        recibo3.setText(mensajeR);

        btnReturn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent X = new Intent();
                int numero = 20;
                X.putExtra("int",numero);
                setResult(RESULT_OK,X);
                finish();
            }
        });

    }
}
