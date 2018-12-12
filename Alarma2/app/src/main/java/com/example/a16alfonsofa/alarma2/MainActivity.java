package com.example.a16alfonsofa.alarma2;

import android.content.Intent;
import android.os.Build;
import android.provider.AlarmClock;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private DatePicker fecha;
    private TimePicker hora;
    private Button btnCompro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fecha = (DatePicker) findViewById(R.id.datePiker);
        hora = (TimePicker) findViewById(R.id.timePiker);
        btnCompro = (Button) findViewById(R.id.btnObtener);

        btnCompro.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                int mes = fecha.getMonth() + 1;
                int año = fecha.getYear();
                int dia = fecha.getDayOfMonth();
                int h = hora.getCurrentHour();
                int m = hora.getCurrentMinute();

                    createAlarm("alarma 1", h, m, dia, mes, año);
                    Toast.makeText(MainActivity.this, año + " " + mes + " " + dia + " : " + h + " - " + m, Toast.LENGTH_LONG).show();
            }
        });
    }


    public void createAlarm(String message, int hour, int minutes, int dia, int mes, int año) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
        intent.putExtra(AlarmClock.EXTRA_HOUR, hour);
        intent.putExtra(AlarmClock.EXTRA_MINUTES, minutes);
        //intent.putExtra(AlarmClock.EXTRA_DAYS,dia+mes+año);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
