package com.example.a16alfonsofa.pulsaetiqueta;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resul = (TextView) findViewById(R.id.lbl);

    }

    public void textpincho (View v) {
        resul.setRotation(resul.getRotation() + 45);
        resul.setText("GIRA GIRA LA PEONZA");
        resul.setTextColor(Color.parseColor("#f45f12"));
        resul.setTextSize(45);
    }
}
