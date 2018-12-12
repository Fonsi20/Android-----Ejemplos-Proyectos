package com.example.a16alfonsofa.eventoscambiomoneda;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Double resu;
    private Button btn1;
    private TextView lblResu;
    private EditText edPrice;
    private RadioButton rdb1, rdb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btnCalcu);
        lblResu = (TextView) findViewById(R.id.Resu);
        edPrice = (EditText) findViewById(R.id.price);
        rdb1 = (RadioButton) findViewById(R.id.PstEu);
        rdb2 = (RadioButton) findViewById(R.id.EuPst);


    }

    public void calcular(View v) {

        if (edPrice.getText().toString().isEmpty()) {
            lblResu.setText("INTRODUCE UN VALOR");
        } else {
            Double variable = Double.valueOf(edPrice.getText().toString());
            if (rdb1.isChecked()) {
                resu = variable * 166.386;
                lblResu.setText(String.format("La conversion es de: %.2f" + resu));
            } else if (rdb2.isChecked()) {
                resu = variable / 166.386 * 1000;
                lblResu.setText(String.format("La conversion es de: %.2f" + resu));
            } else {
                lblResu.setText("Selecciona una de las dos opciones");
            }
        }
    }

}
