package com.example.gabriel.app_gabo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
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

import android.location.LocationListener;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class PlanetMapas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker marcador;
    double lat = 0.0;
    double lng = 0.0;

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
        miUbicaion();

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);




        LatLng pinos = new LatLng(-16.545226724792336, -68.07453570362964);
        mMap.addMarker(new MarkerOptions().position(pinos).title("Planet Pizza Los Pinos").icon(BitmapDescriptorFactory.fromResource(R.drawable.planet_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pinos));

        LatLng achumani = new LatLng(-16.530064040837395,-68.07356746237824);
        mMap.addMarker(new MarkerOptions().position(achumani).title("Planet Pizza Achumani").icon(BitmapDescriptorFactory.fromResource(R.drawable.planet_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(achumani));

        LatLng obrajes = new LatLng(-16.52867807559329, -68.1039273862178);
        mMap.addMarker(new MarkerOptions().position(obrajes).title("Planet Pizza Obrajes").icon(BitmapDescriptorFactory.fromResource(R.drawable.planet_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(obrajes));

        LatLng sopo = new LatLng(-16.514670654326668,-68.13008965294907);
        mMap.addMarker(new MarkerOptions().position(sopo).title("Planet Pizza Sopocachi").icon(BitmapDescriptorFactory.fromResource(R.drawable.planet_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sopo));

        LatLng mira = new LatLng(-16.50479046907538, -68.1209647778804);
        mMap.addMarker(new MarkerOptions().position(mira).title("Planet Pizza Miraflores").icon(BitmapDescriptorFactory.fromResource(R.drawable.planet_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mira));

        LatLng julio = new LatLng(-16.49775290796723, -68.16487790387222);
        mMap.addMarker(new MarkerOptions().position(julio).title("Planet Pizza Zona 16 de Julio").icon(BitmapDescriptorFactory.fromResource(R.drawable.planet_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(julio));

        LatLng satelite = new LatLng(-16.51826694723411, -68.15051199238846);
        mMap.addMarker(new MarkerOptions().position(satelite).title("Planet Pizza Ciudad Satelite").icon(BitmapDescriptorFactory.fromResource(R.drawable.planet_logo_mapa)));
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
    public void agregarMarcador(double lat, double lng) {
        LatLng coordenadas = new LatLng(lat, lng);
        CameraUpdate miUbicacion = CameraUpdateFactory.newLatLngZoom(coordenadas, 16);
        if (marcador != null) marcador.remove();
        marcador = mMap.addMarker(new MarkerOptions()
                .position(coordenadas)
                .title("Mi Posicion")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.user)));
        mMap.animateCamera(miUbicacion);

    }

    private void actualizarUbicacion(Location location) {
        if (location != null) {
            lat = location.getLatitude();
            lng = location.getLongitude();
            agregarMarcador(lat, lng);
        }
    }

    LocationListener localizacion = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            actualizarUbicacion(location);
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }

    };

    private void miUbicaion() {

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        actualizarUbicacion(location);
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,10000,0, localizacion);



    }
}
