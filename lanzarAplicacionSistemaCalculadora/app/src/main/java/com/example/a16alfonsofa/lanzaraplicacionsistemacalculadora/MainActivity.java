package com.example.a16alfonsofa.lanzaraplicacionsistemacalculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculadora;
    private Button btnAjustes;
    private Button btnCamara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculadora = (Button) findViewById(R.id.btnCalculadora);
        btnCamara = (Button) findViewById(R.id.btnCamera);
        btnAjustes = (Button) findViewById(R.id.btnAjustes);

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.android.calculator2","com.android.calculator2.Calculator");
                startActivity(i);
            }
        });


        btnAjustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.android.settings","com.android.settings.Settings");
                startActivity(i);
            }
        });


        btnCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.android.camera","com.android.camera.Camera");
                startActivity(i);
            }
        });


    }
}
