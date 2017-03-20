package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Planet extends AppCompatActivity {



    private Button btnBuscarPlanet;
    private Button btnPedidoPlanet;
    private Button btnPlanetPagina;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);

        btnPedidoPlanet = (Button) findViewById(R.id.btnPedidoPlanet);
        btnBuscarPlanet = (Button) findViewById(R.id.btnBuscarMapaPlanet);
        btnPlanetPagina = (Button) findViewById(R.id.btnPlanetPagina);


        btnPlanetPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uriUrl = Uri.parse("http://www.planetpizza.com.bo/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });
        btnBuscarPlanet.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent inten = new Intent(Planet.this,PlanetMapas.class);
                startActivity(inten);
            }
        });
    }
}








