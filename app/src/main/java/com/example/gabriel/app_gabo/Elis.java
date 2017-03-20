package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elis extends AppCompatActivity {







 private Button btnBuscarElis;
 private Button btnPedidoElis;
 private Button btnElisPagina;



 @Override
 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_elis);

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
 }
 }

