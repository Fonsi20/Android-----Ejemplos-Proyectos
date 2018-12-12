package com.example.a16alfonsofa.pruebaescuchaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a16alfonsofa.holamundo.Main2Activity;

public class MainActivity extends AppCompatActivity {

    int num = 1;
    TextView lbl;

    String solucion = "VENGO DE LA PANTALLA 1!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnIrse);
        lbl = (TextView) findViewById(R.id.lbl1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("cadena", solucion);
                startActivityForResult(i, num);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == num) {
            Log.i("Ciclo-Vida", "Se ejecuta el onActivityResult");
            lbl.setText(data.getExtras().getString("gracias"));
        }

    }

}
