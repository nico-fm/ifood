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

public class BurgerKingMapas extends FragmentActivity implements OnMapReadyCallback {

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
        // Add a marker in Sydney and move the camera
        LatLng socabaya = new LatLng(-16.49686949786757, -68.13505978625366);
        mMap.addMarker(new MarkerOptions().position(socabaya).title("BK Socabaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(socabaya));

        LatLng prado = new LatLng(-16.501865148169625, -68.13218311708519);
        mMap.addMarker(new MarkerOptions().position(prado).title("BK Prado"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(prado));

        LatLng multicine = new LatLng(-16.51103250586201, -68.12212215107033);
        mMap.addMarker(new MarkerOptions().position(multicine).title("BK Multicine"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(multicine));

        LatLng miraflores = new LatLng(-16.499117877940137, -68.12469707172463);
        mMap.addMarker(new MarkerOptions().position(miraflores).title("BK Miraflores"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(miraflores));

        LatLng sur = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sur).title("BK Zona Sur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sur));

        LatLng megacenter = new LatLng(-16.532385960311267, -68.08749215047905);
        mMap.addMarker(new MarkerOptions().position(megacenter).title("BK Megacenter"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(megacenter));

      /*  LatLng socabaya = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(socabaya).title("BK Socabaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(socabaya));*/
    }
}
