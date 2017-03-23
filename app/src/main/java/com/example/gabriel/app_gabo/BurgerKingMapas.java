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

import android.location.LocationListener;
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

public class BurgerKingMapas extends FragmentActivity implements OnMapReadyCallback {

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


        // Add a marker in Sydney and move the camera
        LatLng socabaya = new LatLng(-16.49686949786757, -68.13505978625366);
        mMap.addMarker(new MarkerOptions().position(socabaya).icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(socabaya));

        LatLng prado = new LatLng(-16.501865148169625, -68.13218311708519);
        mMap.addMarker(new MarkerOptions().position(prado).title("BK Prado").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(prado));

        LatLng multicine = new LatLng(-16.51103250586201, -68.12212215107033);
        mMap.addMarker(new MarkerOptions().position(multicine).title("BK Multicine").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(multicine));

        LatLng miraflores = new LatLng(-16.499117877940137, -68.12469707172463);
        mMap.addMarker(new MarkerOptions().position(miraflores).title("BK Miraflores").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(miraflores));

        LatLng sur = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sur).title("BK Zona Sur").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sur));

        LatLng megacenter = new LatLng(-16.532385960311267, -68.08749215047905);
        mMap.addMarker(new MarkerOptions().position(megacenter).title("BK Megacenter").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(megacenter));

      /*  LatLng socabaya = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(socabaya).title("BK Socabaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(socabaya));*/
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
