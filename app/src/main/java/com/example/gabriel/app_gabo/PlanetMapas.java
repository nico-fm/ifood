package com.example.gabriel.app_gabo;

import android.app.Activity;
import android.app.Dialog;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class PlanetMapas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xpress_mapas);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        int status= GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());

        if (status== ConnectionResult.SUCCESS) {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }else{
            Dialog dialog=GooglePlayServicesUtil.getErrorDialog(status,(Activity)getApplicationContext(),10);
            dialog.show();
        }
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

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        mMap.setMinZoomPreference(12);


        LatLng pinos = new LatLng(-16.545226724792336, -68.07453570362964);
        mMap.addMarker(new MarkerOptions().position(pinos).title("Planet Pizza Los Pinos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pinos));

        LatLng achumani = new LatLng(-16.530064040837395,-68.07356746237824);
        mMap.addMarker(new MarkerOptions().position(achumani).title("Planet Pizza Achumani"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(achumani));

        LatLng obrajes = new LatLng(-16.52867807559329, -68.1039273862178);
        mMap.addMarker(new MarkerOptions().position(obrajes).title("Planet Pizza Obrajes"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(obrajes));

        LatLng sopo = new LatLng(-16.514670654326668,-68.13008965294907);
        mMap.addMarker(new MarkerOptions().position(sopo).title("Planet Pizza Sopocachi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sopo));

        LatLng mira = new LatLng(-16.50479046907538, -68.1209647778804);
        mMap.addMarker(new MarkerOptions().position(mira).title("Planet Pizza Miraflores"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mira));

        LatLng julio = new LatLng(-16.49775290796723, -68.16487790387222);
        mMap.addMarker(new MarkerOptions().position(julio).title("Planet Pizza Zona 16 de Julio"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(julio));

        LatLng satelite = new LatLng(-16.51826694723411, -68.15051199238846);
        mMap.addMarker(new MarkerOptions().position(satelite).title("Planet Pizza Ciudad Satelite"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(satelite));

        /*LatLng pinos = new LatLng(-16.545226724792336, -68.07453570362964);
        mMap.addMarker(new MarkerOptions().position(pinos).title("Planet Pizza Los Pinos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pinos));

        LatLng pinos = new LatLng(-16.545226724792336, -68.07453570362964);
        mMap.addMarker(new MarkerOptions().position(pinos).title("Planet Pizza Los Pinos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pinos));

        LatLng pinos = new LatLng(-16.545226724792336, -68.07453570362964);
        mMap.addMarker(new MarkerOptions().position(pinos).title("Planet Pizza Los Pinos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pinos));

        LatLng pinos = new LatLng(-16.545226724792336, -68.07453570362964);
        mMap.addMarker(new MarkerOptions().position(pinos).title("Planet Pizza Los Pinos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pinos));

        LatLng pinos = new LatLng(-16.545226724792336, -68.07453570362964);
        mMap.addMarker(new MarkerOptions().position(pinos).title("Planet Pizza Los Pinos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pinos));*/
    }
}
