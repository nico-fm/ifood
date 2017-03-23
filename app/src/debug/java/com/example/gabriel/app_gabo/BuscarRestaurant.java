package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

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

public class BuscarRestaurant extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker marcador;
    double lat = 0.0;
    double lng = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_restaurant);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        miUbicaion();


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

        LatLng camacho = new LatLng(-16.500415972809623, -68.13152627494969);
        mMap.addMarker(new MarkerOptions().position(camacho).title("Xpress Camacho").icon(BitmapDescriptorFactory.fromResource(R.drawable.xpress_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(camacho));

        LatLng multicine = new LatLng(-16.510835134832732, -68.1220352783505);
        mMap.addMarker(new MarkerOptions().position(multicine).title("Xpress Multicine").icon(BitmapDescriptorFactory.fromResource(R.drawable.xpress_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(multicine));


        LatLng mega = new LatLng(-16.53298314937157, -68.08727384951749);
        mMap.addMarker(new MarkerOptions().position(mega).title("Xpress Megacenter").icon(BitmapDescriptorFactory.fromResource(R.drawable.xpress_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mega));

        LatLng aero = new LatLng(-16.50873926064417, -68.1767147913281);
        mMap.addMarker(new MarkerOptions().position(aero).title("Xpress Aeropuerto").icon(BitmapDescriptorFactory.fromResource(R.drawable.xpress_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(aero));

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

        LatLng socabaya = new LatLng(-16.49686949786757, -68.13505978625366);
        mMap.addMarker(new MarkerOptions().position(socabaya).title("BK Socabaya").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(socabaya));

        LatLng prado = new LatLng(-16.501865148169625, -68.13218311708519);
        mMap.addMarker(new MarkerOptions().position(prado).title("BK Prado").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(prado));

        LatLng multi = new LatLng(-16.51103250586201, -68.12212215107033);
        mMap.addMarker(new MarkerOptions().position(multi).title("BK Multicine").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(multi));

        LatLng miraflores = new LatLng(-16.499117877940137, -68.12469707172463);
        mMap.addMarker(new MarkerOptions().position(miraflores).title("BK Miraflores").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(miraflores));

        LatLng sur = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sur).title("BK Zona Sur").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sur));

        LatLng megacenter = new LatLng(-16.532385960311267, -68.08749215047905);
        mMap.addMarker(new MarkerOptions().position(megacenter).title("BK Megacenter").icon(BitmapDescriptorFactory.fromResource(R.drawable.bk_logo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(megacenter));



        LatLng monje= new LatLng(-16.500954753559455, -68.13294918683209);
        mMap.addMarker(new MarkerOptions().position(monje).title("Eli's Monje Campero").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(monje));

        LatLng comercio= new LatLng(-16.494810763772797, -68.13585804250874);
        mMap.addMarker(new MarkerOptions().position(comercio).title("Eli's Calle Comercio").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(comercio));

        /* LatLng comercio= new LatLng(-16.494810763772797, -68.13585804250874);
                mMap.addMarker(new MarkerOptions().position(comercio).title("Eli's Calle Comercio"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(comercio));*/

        LatLng multici= new LatLng(-16.51091999797118,-68.12190250900426);
        mMap.addMarker(new MarkerOptions().position(multici).title("Eli's Multicine").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(multici));

        LatLng avaroa= new LatLng(-16.510043077074084, -68.12635363486447);
        mMap.addMarker(new MarkerOptions().position(avaroa).title("Eli's Plaza Avaroa").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(avaroa));


        LatLng megace= new LatLng(-16.532576881019647, -68.08731944707074);
        mMap.addMarker(new MarkerOptions().position(megace).title("Eli's Megacenter").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(megace));

        LatLng san= new LatLng(-16.54027526371033,-68.07887585309186);
        mMap.addMarker(new MarkerOptions().position(san).title("Eli's San Miguel").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(san));


        LatLng achuma= new LatLng(-16.529885974431632, -68.07346717861333);
        mMap.addMarker(new MarkerOptions().position(achuma).title("Eli's Achumani").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(achuma));

        LatLng alto= new LatLng(-16.523310902042862,-68.15289811638036);
        mMap.addMarker(new MarkerOptions().position(alto).title("Eli's Ciudad Satelite").icon(BitmapDescriptorFactory.fromResource(R.drawable.logo_elis)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alto));

        LatLng ava = new LatLng(-16.51013565542089,-68.12625841644444);
        mMap.addMarker(new MarkerOptions().position(ava).title("Mr. Pizza Plaza Avaroa").icon(BitmapDescriptorFactory.fromResource(R.drawable.mr_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ava));

        LatLng sani = new LatLng(-16.542316800645263,-68.08091299083867);
        mMap.addMarker(new MarkerOptions().position(sani).title("Mr. Pizza San Miguel").icon(BitmapDescriptorFactory.fromResource(R.drawable.mr_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sani));

        LatLng miraflo = new LatLng(-16.49862666988389,-68.12098888155856);
        mMap.addMarker(new MarkerOptions().position(miraflo).title("Mr. Pizza Miraflores").icon(BitmapDescriptorFactory.fromResource(R.drawable.mr_logo_mapa)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(miraflo));


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
