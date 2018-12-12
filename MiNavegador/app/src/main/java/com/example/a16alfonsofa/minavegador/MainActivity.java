package com.example.a16alfonsofa.minavegador;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    EditText edtURL;
    Button Navegar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtURL = (EditText) findViewById(R.id.EDurl);
        Navegar = (Button) findViewById(R.id.btnIrseAWeb);

        Navegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = edtURL.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}
