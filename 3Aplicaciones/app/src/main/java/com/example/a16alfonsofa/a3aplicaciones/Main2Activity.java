package com.example.a16alfonsofa.a3aplicaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private Button btnReturn2;
    private TextView recibo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnReturn2 = (Button) findViewById(R.id.btnvolver1);
        recibo2 = (TextView) findViewById(R.id.lblSalida2);

        Intent i = getIntent();
        String mensajeR = i.getStringExtra("mensaje");
        recibo2.setText(mensajeR);

        btnReturn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent();
                float numero = 45.2f;
                j.putExtra("float",numero);
                setResult(RESULT_OK,j);
                finish();
            }
        });

    }
}
