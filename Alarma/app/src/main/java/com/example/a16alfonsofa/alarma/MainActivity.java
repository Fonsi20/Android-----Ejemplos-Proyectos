package com.example.a16alfonsofa.alarma;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAlarma(View v){
        String mensaje ="mensaje de alarma";
        int hora =14;
        int minutos = 20;
        createAlarm(mensaje,hora,minutos);
    }

    public void createAlarm(String message, int hour, int minutes){
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        Intent.putExtra(AlarmClock.EXTRA_MESSAGE,message);
        Intent.putExtra(AlarmClock.EXTRA_HOUR,hour);
        Intent.putExtra(AlarmClock.EXTRA_MINUTES,minutes);
        if(intent.resolveActivity(getPackageManager())!= null){
            startActivity(intent);
        }
    }
}
