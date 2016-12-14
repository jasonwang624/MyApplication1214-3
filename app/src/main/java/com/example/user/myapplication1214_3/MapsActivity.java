package com.example.user.myapplication1214_3;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
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


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(24.930, 121.172);
        LatLng s2 = new LatLng(24.950, 121.18);
        LatLng s3 = new LatLng(24.930, 121.22);

        mMap.addMarker(new MarkerOptions().position(sydney).title("職訓中心"));
        mMap.addMarker(new MarkerOptions().position(s2).title("S2"));
        mMap.addMarker(new MarkerOptions().position(s3).title("S3"));

        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(sydney, (float)15.0);
        //mMap.moveCamera(cameraUpdate);
        mMap.animateCamera(cameraUpdate, 5000, null);

    }
}
