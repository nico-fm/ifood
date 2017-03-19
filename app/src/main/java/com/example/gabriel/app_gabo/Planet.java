package com.example.gabriel.app_gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Planet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);
    }
}





/**
 * private Button btnBuscarPlanet;
 private Button btnPedidoPlanet;
 private Button btnMrpizzaPlanet;



 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_Planet);

 btnPedidoXpress=(Button)findViewById(R.id.btnPedidoPlanet);
 btnBuscarMapaXpress=(Button)findViewById(R.id.btnBuscarMapaPlanet);
 btnXpressPagina=(Button)findViewById(R.id.btnPlanetPagina);





 btnXpressPagina.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {





 Uri uriUrl = Uri.parse("http://www.planetpizza.com.bo/");

 Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
 startActivity(intent);

 }
 });
 }
 }

 */






