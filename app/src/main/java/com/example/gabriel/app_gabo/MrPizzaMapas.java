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

public class MrPizzaMapas extends FragmentActivity implements OnMapReadyCallback {

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


        LatLng avaroa = new LatLng(-16.51013565542089,-68.12625841644444);
        mMap.addMarker(new MarkerOptions().position(avaroa).title("Mr. Pizza Plaza Avaroa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(avaroa));

        LatLng san = new LatLng(-16.542316800645263,-68.08091299083867);
        mMap.addMarker(new MarkerOptions().position(san).title("Mr. Pizza San Miguel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(san));

        LatLng mira = new LatLng(-16.49862666988389,-68.12098888155856);
        mMap.addMarker(new MarkerOptions().position(mira).title("Mr. Pizza Miraflores"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mira));

       /* LatLng avaroa = new LatLng(-16.51013565542089,-68.12625841644444);
        mMap.addMarker(new MarkerOptions().position(avaroa).title("Mr. Pizza Plaza Avaroa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(avaroa));*/
    }
}
