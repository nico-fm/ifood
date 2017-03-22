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

public class XpressMapas extends FragmentActivity implements OnMapReadyCallback {

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
        LatLng camacho = new LatLng(-16.500415972809623, -68.13152627494969);
        mMap.addMarker(new MarkerOptions().position(camacho).title("Xpress Camacho"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(camacho));

        LatLng multicine = new LatLng(-16.510835134832732, -68.1220352783505);
        mMap.addMarker(new MarkerOptions().position(multicine).title("Xpress Multicine"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(multicine));


        LatLng mega = new LatLng(-16.53298314937157, -68.08727384951749);
        mMap.addMarker(new MarkerOptions().position(mega).title("Xpress Megacenter"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mega));

        LatLng aero = new LatLng(-16.50873926064417, -68.1767147913281);
        mMap.addMarker(new MarkerOptions().position(aero).title("Xpress Aeropuerto"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(aero));






    }
}
