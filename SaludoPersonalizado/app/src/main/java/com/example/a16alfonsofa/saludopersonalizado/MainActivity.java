package com.example.a16alfonsofa.saludopersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView lbl, lbl2;
    private EditText str;
    private RadioGroup rG;
    private RadioButton rb1, rb2, rb3, rb;
    private CheckBox cb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbl = (TextView) findViewById(R.id.lblResu);
        str = (EditText) findViewById(R.id.edtNombre);
        rb1 = (RadioButton) findViewById(R.id.rbS);
        rb2 = (RadioButton) findViewById(R.id.rbSra);
        rb3 = (RadioButton) findViewById(R.id.bye);
        rb4 = (RadioButton) findViewById(R.id.goodbye);
        cb1 = (CheckBox) findViewById(R.id.cbDespe);
        lbl2 = (TextView) findViewById(R.id.lblenunciado);
        rG = (RadioGroup) findViewById(R.id.RadioGroup);

    }

    public void comprobar(View v) {
        if (rb1.isChecked()) {
            if (str.getText().toString().isEmpty()) {
                lbl.setText("Tienes que introducir algo!!");
            } else {
                lbl.setText("Hola: " + str.getText());
                lbl.append(" eres Hombre");
                if (cb1.isChecked()) {
                    if (rb3.isChecked()) {
                        lbl.append(" Adios!");
                    } else {
                        lbl.append(" Hasta luego!");
                    }
                }
            }
        } else if (rb2.isChecked()) {
            if (str.getText().toString().isEmpty()) {
                lbl.setText("Tienes que introducir algo!!");
            } else {
                lbl.setText("Hola: " + str.getText());
                lbl.append(" eres Mujer");
                if (cb1.isChecked()) {
                    if (rb3.isChecked()) {
                        lbl.append(" Adios!");
                    } else {
                        lbl.append(" Hasta luego!");
                    }
                }
            }
        } else {
            lbl.setText("Tienes que seleccionar un sexo!");
        }
    }

    public void masInfo(View v) {
        if (cb1.isChecked()) {
            rG.setVisibility(View.VISIBLE);
            lbl2.setVisibility(View.VISIBLE);
        } else {
            rG.setVisibility(View.GONE);
            lbl2.setVisibility(View.GONE);
        }

    }

}
