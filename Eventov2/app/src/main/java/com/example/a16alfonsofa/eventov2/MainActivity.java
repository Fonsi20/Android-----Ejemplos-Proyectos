package com.example.a16alfonsofa.eventov2;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView lblRespuesta;
    public int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblRespuesta = (TextView) findViewById(R.id.Resultado);
    }

    public void summar(View v) {
        n++;
        lblRespuesta.setText("Has pulsado el botón " + n + " veces");
    }

}
