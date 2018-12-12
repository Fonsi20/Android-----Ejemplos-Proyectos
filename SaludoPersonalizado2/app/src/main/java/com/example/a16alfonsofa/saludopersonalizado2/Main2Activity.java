package com.example.a16alfonsofa.saludopersonalizado2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.ResultSet;

public class Main2Activity extends AppCompatActivity {

    private TextView lblR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lblR = (TextView) findViewById(R.id.LBLResu);

        Intent i = getIntent();
        String datoRecibido = i.getExtras().getString("cadena");

        lblR.setText(datoRecibido);

    }
}
