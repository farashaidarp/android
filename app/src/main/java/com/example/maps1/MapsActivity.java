package com.example.maps1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng loc = new LatLng(-7.885005, 112.647217);
        mMap.addMarker(new MarkerOptions().position(loc).title("smp 2 singosari"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(loc));
        LatLng ca = new LatLng(-7.891556, 112.661617);
        mMap.addMarker(new MarkerOptions().position(ca).title("smk  asiyiah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ca));
        LatLng tion = new LatLng(-7.918585, 112.673074);
        mMap.addMarker(new MarkerOptions().position(tion).title("sma 1 singosari"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tion));

    }
}
