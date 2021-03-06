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

public class ElisMapas extends FragmentActivity implements OnMapReadyCallback {

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



        LatLng monje= new LatLng(-16.500954753559455, -68.13294918683209);
        mMap.addMarker(new MarkerOptions().position(monje).title("Eli's Monje Campero").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(monje));

        LatLng comercio= new LatLng(-16.494810763772797, -68.13585804250874);
        mMap.addMarker(new MarkerOptions().position(comercio).title("Eli's Calle Comercio").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(comercio));

        /* LatLng comercio= new LatLng(-16.494810763772797, -68.13585804250874);
                mMap.addMarker(new MarkerOptions().position(comercio).title("Eli's Calle Comercio"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(comercio));*/

         LatLng multi= new LatLng(-16.51091999797118,-68.12190250900426);
                mMap.addMarker(new MarkerOptions().position(multi).title("Eli's Multicine").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(multi));

         LatLng avaroa= new LatLng(-16.510043077074084, -68.12635363486447);
                mMap.addMarker(new MarkerOptions().position(avaroa).title("Eli's Plaza Avaroa").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(avaroa));


         LatLng mega= new LatLng(-16.532576881019647, -68.08731944707074);
                mMap.addMarker(new MarkerOptions().position(mega).title("Eli's Megacenter").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(mega));

        LatLng san= new LatLng(-16.54027526371033,-68.07887585309186);
               mMap.addMarker(new MarkerOptions().position(san).title("Eli's San Miguel").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
               mMap.moveCamera(CameraUpdateFactory.newLatLng(san));


        LatLng achumani= new LatLng(-16.529885974431632, -68.07346717861333);
               mMap.addMarker(new MarkerOptions().position(achumani).title("Eli's Achumani").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
               mMap.moveCamera(CameraUpdateFactory.newLatLng(achumani));

        LatLng alto= new LatLng(-16.523310902042862,-68.15289811638036);
                    mMap.addMarker(new MarkerOptions().position(alto).title("Eli's Ciudad Satelite").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(alto));



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
