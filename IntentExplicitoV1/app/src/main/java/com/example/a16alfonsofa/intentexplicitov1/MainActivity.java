package com.example.a16alfonsofa.intentexplicitov1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("Ciclo-Vida", "Se ejecuta el metodo onCreate");
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("cadena","cadena");
                startActivity(i);
                Log.i("Ciclo-Vida", "Se ejecuta el metodo onClick NOS VAMOS A LA DOS!");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onResume");
    }


    @Override
    protected void onStop() {
        super.onStop();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        //toast y log
        Log.i("Ciclo-Vida", "Se ejecuta el metodo onRestrat");
    }

}
