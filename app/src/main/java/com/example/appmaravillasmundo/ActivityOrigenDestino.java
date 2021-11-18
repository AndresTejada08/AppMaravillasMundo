package com.example.appmaravillasmundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class ActivityOrigenDestino extends AppCompatActivity {

    EditText txtLatitudOrigen, txtLongitudOrigen, txtLatitudDestino, txtLongitudDestino;
    Button bttnLimpiar, bttnFijarRuta;

    JsonObjectRequest jsonObjectRequest;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origen_destino);

        /*txtLatitudOrigen = findViewById(R.id.txt_latitud_origen);
        txtLongitudOrigen = findViewById(R.id.txt_longitud_origen);
        txtLatitudDestino = findViewById(R.id.txt_latitud_destino);
        txtLongitudDestino = findViewById(R.id.txt_longitud_destino);
        bttnLimpiar = findViewById(R.id.bttn_limpiar);
        bttnFijarRuta = findViewById(R.id.bttn_fijar_ruta);

        bttnFijarRuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utilidades.coordenadas.setLatitudOrigen(Double.valueOf(txtLatitudOrigen.getText().toString()));
                Utilidades.coordenadas.setLongitudOrigen(Double.valueOf(txtLongitudOrigen.getText().toString()));
                Utilidades.coordenadas.setLatitudDestino(Double.valueOf(txtLatitudDestino.getText().toString()));
                Utilidades.coordenadas.setLongitudDestino(Double.valueOf(txtLongitudDestino.getText().toString()));


            }
        });*/
    }

    private void WebServiseObtenerRuta (String latitudOrigen, String longitudOrigen, String latitudDestino, String longitudDestino) {

    }
}