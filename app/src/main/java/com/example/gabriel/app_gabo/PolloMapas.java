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
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
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

public class PolloMapas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker marcador;
    double lat = 0.0;
    double lng = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollo_mapas);
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



        UiSettings uiSettings=mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera
      /*  LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/

        LatLng pollomulti = new LatLng(-16.510890424457667, -68.12183411267438);
        mMap.addMarker(new MarkerOptions().position(pollomulti).title("Pollos Copacaba Multicine").icon(BitmapDescriptorFactory.fromResource(R.drawable.pollos_copacabana_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollomulti));

        LatLng polloscomer = new LatLng(-16.494684744359958, -68.13585636612811);
        mMap.addMarker(new MarkerOptions().position(polloscomer).title("Pollos Copacaba Comercio").icon(BitmapDescriptorFactory.fromResource(R.drawable.pollos_copacabana_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polloscomer));


        LatLng pollosprado = new LatLng(-16.503710355741116, -68.1316174700562);
        mMap.addMarker(new MarkerOptions().position(pollosprado).title("Pollos Copacaba El Prado").icon(BitmapDescriptorFactory.fromResource(R.drawable.pollos_copacabana_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollosprado));


        LatLng pollosmega = new LatLng(-16.532575595359194,-68.08685408380666);
        mMap.addMarker(new MarkerOptions().position(pollosmega).title("Pollos Copacaba Megacenter").icon(BitmapDescriptorFactory.fromResource(R.drawable.pollos_copacabana_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollosmega));

        LatLng polloscal = new LatLng(-16.539052645291157,-68.07920442369618);
        mMap.addMarker(new MarkerOptions().position(polloscal).title("Pollos Copacaba Calacoto").icon(BitmapDescriptorFactory.fromResource(R.drawable.pollos_copacabana_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polloscal));


        LatLng polloscancha = new LatLng(-16.500089360359084,-68.12364326265492);
        mMap.addMarker(new MarkerOptions().position(polloscancha).title("Pollos Copacaba Hernando Siles").icon(BitmapDescriptorFactory.fromResource(R.drawable.pollos_copacabana_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polloscancha));


        LatLng pollossoca = new LatLng(-16.496625177041345,-68.13451962021031);
        mMap.addMarker(new MarkerOptions().position(pollossoca).title("Pollos Copacaba Hernando Socabaya").icon(BitmapDescriptorFactory.fromResource(R.drawable.pollos_copacabana_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollossoca));


        LatLng pollosjungla = new LatLng( -16.507891903831478,-68.16326351311841);
        mMap.addMarker(new MarkerOptions().position(pollosjungla).title("Pollos Copacaba La Jungla").icon(BitmapDescriptorFactory.fromResource(R.drawable.pollos_copacabana_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollosjungla));

        LatLng pollosteleferico = new LatLng( -16.51858967171302,-68.14995439198651);
        mMap.addMarker(new MarkerOptions().position(pollosteleferico).title("Pollos Copacaba Teleferico").icon(BitmapDescriptorFactory.fromResource(R.drawable.pollos_copacabana_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollosteleferico));




    }
    public void agregarMarcador(double lat, double lng) {
        LatLng coordenadas = new LatLng(lat, lng);
        CameraUpdate miUbicacion = CameraUpdateFactory.newLatLngZoom(coordenadas, 16);
        if (marcador != null) marcador.remove();
        marcador = mMap.addMarker(new MarkerOptions()
                .position(coordenadas)
                .title("Mi Posicion")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.persona)));
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
