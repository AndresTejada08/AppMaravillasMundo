package com.example.appmaravillasmundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bttnLugaresTuristicos, bttnMaravillasAntiguas, bttnMaravillasModernas, bttnRutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttnLugaresTuristicos = findViewById(R.id.bttn_lugares_turisticos);
        bttnMaravillasAntiguas = findViewById(R.id.bttn_maravillas_antiguas);
        bttnMaravillasModernas = findViewById(R.id.bttn_maravillas_modernas);
        bttnRutas = findViewById(R.id.bttn_rutas);

        bttnLugaresTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity1.class);
                startActivity(intent);
            }
        });
        bttnRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityOrigenDestino2.class);
                startActivity(intent);
            }
        });
    }
}