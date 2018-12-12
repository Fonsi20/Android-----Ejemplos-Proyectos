package com.example.a16alfonsofa.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a16alfonsofa.pruebaescuchaactivity.R;

public class Main2Activity extends AppCompatActivity {

    TextView lb2;
    int num = 1;

    final String solucion = "Vuelvo a la pantalla 1!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btn2 = (Button) findViewById(R.id.btnvenirse);
        lb2 = (TextView) findViewById(R.id.lbl2);

        setContentView(R.layout.activity_main2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("gracias", solucion);
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}
