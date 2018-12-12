package com.example.a16alfonsofa.saludopersonalizado3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText ed;
    private EditText ed2;
    private int edad;
    private String solucion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        ed = (EditText) findViewById(R.id.edEdad);
        ed2 = (EditText) findViewById(R.id.edNombre);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edad = Integer.parseInt(ed.getText().toString());
                ComprobarEdad(edad);

                Intent i = new Intent(MainActivity.this, Main3Activity.class);
                i.putExtra("cadena", solucion);
                Log.i("Ciclo-Vida", "Se ejecuta el metodo onClick NOS VAMOS A LA DOS!");
                startActivity(i);
            }
        });
    }

    public void ComprobarEdad(int Edad) {

        if (Edad >= 18) {
            solucion = "Es mayor de edad " + ed2.getText().toString();
        } else {
            solucion = "Es menor de edad " + ed2.getText().toString();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK){
            String hola = data.getExtras().getString("cadena");
            Toast.makeText(this, hola, Toast.LENGTH_LONG).show();
        }
    }
}
