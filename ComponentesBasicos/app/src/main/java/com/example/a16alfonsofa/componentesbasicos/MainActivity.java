package com.example.a16alfonsofa.componentesbasicos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView salida;
    private ToggleButton tb1;
    private CheckBox chb1, chb2, chb3;
    private RadioButton rb1, rb2;
    private RadioGroup rbg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ToggleButton
        tb1 = (ToggleButton) findViewById(R.id.tgBtn);
        salida = (TextView) findViewById(R.id.texto1);

        //ToggleButton usando onClickListener
        tb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tb1.isChecked()) {
                    salida.setText("Seleccionado");
                } else {
                    salida.setText("NO SELECCIONADO");
                }
            }
        });

        //CheckBox
        chb1 = (CheckBox) findViewById(R.id.checkBox1);
        chb2 = (CheckBox) findViewById(R.id.checkBox2);
        chb3 = (CheckBox) findViewById(R.id.checkBox3);

        //CheckBox usando onClickListener
//        chb2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (chb2.isChecked()) {
//                    salida.setText("Seleccionado");
//
//                } else {
//                    salida.setText("NO SELECCIONADO");
//                }
//            }
//        });

        //CheckBox usando escuchador de Checked
//        chb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
//                if (chb3.isChecked()) {
//                    salida.setText("Seleccionado 3");
//                } else {
//                    salida.setText("NO SELECCIONADO");
//                }
//            }
//        });

        //RadioButtons
//        rb1 = (RadioButton) findViewById(R.id.radioButton);
//        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rbg = (RadioGroup) findViewById(R.id.rbg1);

    }

    //Checkbox llamada desde el OnClick de la layout
    //Usando onClick
    public void onClickChb1(View v) {
        if (chb1.isChecked()) {
            salida.setText("Seleccionado");
        } else {
            salida.setText("NO SELECCIONADO");
        }
    }

    public void todo(View v) {
        if (chb1.isChecked() && chb2.isChecked() && chb3.isChecked()) {
            salida.setText("Seleccionado 1,2 y 3");
        } else if (chb3.isChecked() && chb2.isChecked()) {
            salida.setText("Seleccionado 2 y 3");
        } else if (chb3.isChecked() && chb1.isChecked()) {
            salida.setText("Seleccionado 1 y 3");
        } else if (chb1.isChecked() && chb2.isChecked()) {
            salida.setText("Seleccionado 1 y 2");
        } else if (chb3.isChecked()) {
            salida.setText("Seleccionado 3");
        } else if (chb2.isChecked()) {
            salida.setText("Seleccionado 2");
        } else if (chb1.isChecked()) {
            salida.setText("Seleccionado 1");
        } else {
            salida.setText("NO SELECCIONADO");
        }
    }

//    public void rbclick(View v) {
//        if (rb1.isChecked()) {
//            salida.setText("Seleccionado 1");
//        } else {
//            salida.setText("Seleccionado 2");
//        }
//    }

    public void OnCheckRadioGroup(View v) {

        if (rbg.getCheckedRadioButtonId() == R.id.radioButton) {
            salida.setText("Seleccionado 1");
        } else {
            salida.setText("Seleccionado 2 PIROLA");
        }
    }
}
