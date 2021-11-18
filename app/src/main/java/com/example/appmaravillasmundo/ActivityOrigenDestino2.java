package com.example.appmaravillasmundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

import java.util.Arrays;
import java.util.List;

public class ActivityOrigenDestino2 extends AppCompatActivity {

    private static final int FROM_REQUEST_CODE = 1;
    private static final int TO_REQUEST_CODE = 2;

    EditText txtDireccionOrigen, txtDireccionDestino;
    Button bttnObtenerOrigen, bttnObtenerDestino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origen_destino2);

        Places.initialize(getApplicationContext(), getString(R.string.android_sdk_places_api_key));

        txtDireccionOrigen = findViewById(R.id.txt_latitud_origen);
        txtDireccionDestino = findViewById(R.id.txt_latitud_destino);
        bttnObtenerOrigen = findViewById(R.id.bttn_obtener_origen);
        bttnObtenerDestino = findViewById(R.id.bttn_obtener_destino);

        bttnObtenerOrigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StarAutocomplete(FROM_REQUEST_CODE);
            }
        });
        bttnObtenerDestino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StarAutocomplete(TO_REQUEST_CODE);
            }
        });
    }

    private void StarAutocomplete(int requestCode) {
        // Set the fields to specify which types of place data to
        // return after the user has made a selection.
        List<Place.Field> fields = Arrays.asList(Place.Field.ID, Place.Field.NAME);

        // Start the autocomplete intent.
        Intent intent = new Autocomplete.IntentBuilder(AutocompleteActivityMode.FULLSCREEN, fields).build(this);
        startActivityForResult(intent, requestCode);
    }
}