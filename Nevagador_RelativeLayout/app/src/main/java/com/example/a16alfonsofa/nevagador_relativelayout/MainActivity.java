package com.example.a16alfonsofa.nevagador_relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView lblResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblResul = (TextView) findViewById(R.id.lblResultado);
    }


    //TOOOODOS ESTOS METODOS estan llamados desdel el XML, desde el parametro:
    //android:onclick:"NOMBRE DEL METODO"

    //llamadas a diferentes metodos para cada boton
    public void onChanceSiii(View v) {
        lblResul.setText("Pulsaste SI");
    }

    public void onChanceNo(View v) {
        lblResul.setText("Pulsaste NO");
    }

    public void onChanceSome(View v) {
        lblResul.setText("Pulsaste que ni te importa ni te preocupa");
    }

    //llamamos al mismo metodo desde todos los botones y vemos cual a pulsado para poner el mensaje
    public void onBtnClick(View v) {
        if (v.getId() == R.id.buttonSI)
            lblResul.setText("Pulsaste SI");
        else if (v.getId() == R.id.buttonno)
            lblResul.setText("Pulsaste NO");
        else if (v.getId() == R.id.buttonaveces)
           lblResul.setText("Pulsaste que ni te importa ni te preocupa");

    }

}
