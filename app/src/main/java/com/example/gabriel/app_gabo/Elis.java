package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Elis extends AppCompatActivity {

    Spinner spinner1,
            spinner2,
            spinner3,
            spinner4;
    String[] pizza,
            clasico,
            premium,
            gourmet;

 private Button btnBuscarElis;
 private Button btnPedidoElis;
 private Button btnElisPagina;


 @Override
 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_elis);


     spinner1=(Spinner)findViewById(R.id.spinnerPizzaElis);
     pizza=getResources().getStringArray(R.array.nombre_lista_Piza_elis);
     ArrayAdapter<String> pizzalist = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,pizza);


     spinner2=(Spinner)findViewById(R.id.spinnerSaborClasicoElis);
     clasico=getResources().getStringArray(R.array.nombre_lista_sabor_clasico_elis);
     ArrayAdapter<String> claasicolist = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,clasico);


     spinner3=(Spinner)findViewById(R.id.spinnerSaborPremiumElis);
     premium=getResources().getStringArray(R.array.nombre_lista_sabor_premium_elis);
     ArrayAdapter<String> premiumlist = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,premium);


     spinner4=(Spinner)findViewById(R.id.spinnerSaborGourmetElis);
     gourmet=getResources().getStringArray(R.array.nombre_lista_sabor_gourmet_elis);
     ArrayAdapter<String> gourmetlist = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,gourmet);
     spinner1.setAdapter(gourmetlist);


     spinner1.setAdapter(pizzalist);
     spinner2.setAdapter(claasicolist);
     spinner3.setAdapter(premiumlist);
     spinner4.setAdapter(gourmetlist);


     btnPedidoElis = (Button) findViewById(R.id.btnPedidoElis);
     btnBuscarElis = (Button) findViewById(R.id.btnBuscarMapaElis);
     btnElisPagina = (Button) findViewById(R.id.btnElisPagina);


     btnElisPagina.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {


             Uri uriUrl = Uri.parse("http://www.elis.bo/");

             Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
             startActivity(intent);

         }
     });
     btnBuscarElis.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View v) {


             Intent inten = new Intent(Elis.this,ElisMapas.class);
             startActivity(inten);
         }
     });
     btnPedidoElis.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View v) {


             Intent inten = new Intent(Elis.this,ElisPedido.class);
             startActivity(inten);
         }
     });
 }
 }

