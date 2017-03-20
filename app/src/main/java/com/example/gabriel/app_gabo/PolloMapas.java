package com.example.gabriel.app_gabo;

import android.app.Activity;
import android.app.Dialog;
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

public class PolloMapas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

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

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        mMap.setMinZoomPreference(12);

        UiSettings uiSettings=mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera
      /*  LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/

        LatLng pollomulti = new LatLng(-16.510890424457667, -68.12183411267438);
        mMap.addMarker(new MarkerOptions().position(pollomulti).title("Pollos Copacaba Multicine"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollomulti));

        LatLng polloscomer = new LatLng(-16.494684744359958, -68.13585636612811);
        mMap.addMarker(new MarkerOptions().position(polloscomer).title("Pollos Copacaba Comercio"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polloscomer));


        LatLng pollosprado = new LatLng(-16.503710355741116, -68.1316174700562);
        mMap.addMarker(new MarkerOptions().position(pollosprado).title("Pollos Copacaba El Prado"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollosprado));


        LatLng pollosmega = new LatLng(-16.532575595359194,-68.08685408380666);
        mMap.addMarker(new MarkerOptions().position(pollosmega).title("Pollos Copacaba Megacenter"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollosmega));

        LatLng polloscal = new LatLng(-16.539052645291157,-68.07920442369618);
        mMap.addMarker(new MarkerOptions().position(polloscal).title("Pollos Copacaba Calacoto"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polloscal));


        LatLng polloscancha = new LatLng(-16.500089360359084,-68.12364326265492);
        mMap.addMarker(new MarkerOptions().position(polloscancha).title("Pollos Copacaba Hernando Siles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polloscancha));


        LatLng pollossoca = new LatLng(-16.496625177041345,-68.13451962021031);
        mMap.addMarker(new MarkerOptions().position(pollossoca).title("Pollos Copacaba Hernando Socabaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollossoca));


        LatLng pollosjungla = new LatLng( -16.507891903831478,-68.16326351311841);
        mMap.addMarker(new MarkerOptions().position(pollosjungla).title("Pollos Copacaba La Jungla"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollosjungla));

        LatLng pollosteleferico = new LatLng( -16.51858967171302,-68.14995439198651);
        mMap.addMarker(new MarkerOptions().position(pollosteleferico).title("Pollos Copacaba Teleferico"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pollosteleferico));




    }
}
