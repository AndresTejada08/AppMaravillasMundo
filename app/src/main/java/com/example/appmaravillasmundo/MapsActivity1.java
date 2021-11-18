package com.example.appmaravillasmundo;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.appmaravillasmundo.databinding.ActivityMaps1Binding;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private ActivityMaps1Binding binding;
    String DoceAngulos = "Se dice que si fuese retirada, toda una cuadra se vendría para abajo.";
    String Sapantianaa = "Es una increíble arquitectura hidraulico colonial edificada sobre el rio P'ujru.";
    String SacsayHuamn = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Piedra12Angulos = new LatLng(-13.516001575997, -71.976251992841);
        mMap.addMarker(new MarkerOptions().position(Piedra12Angulos).title("Piedra de los 12 Ángulos").snippet(DoceAngulos).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_ubicacion)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Piedra12Angulos, 15));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(Piedra12Angulos));
        //.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)

        LatLng Sapantiana = new LatLng(-13.5120315, -71.9782520);
        mMap.addMarker(new MarkerOptions().position(Sapantiana).title("Sapantiana").snippet(Sapantianaa).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_ubicacion)));

        LatLng SacsayHuaman = new LatLng(-13.5036434, -71.9810969);
        mMap.addMarker(new MarkerOptions().position(Sapantiana).title("SacsayHuamán").snippet(SacsayHuamn).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_ubicacion)));

                googleMap.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        //Obtener la latitud y la longitud
        String lat, lon;
        lat = Double.toString(marker.getPosition().latitude);
        lon = Double.toString(marker.getPosition().longitude);
        Toast.makeText(this, lat + ", " + lon, Toast.LENGTH_LONG).show();
        return false;
    }
}