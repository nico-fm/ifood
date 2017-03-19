package com.example.gabriel.app_gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Elis extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elis);
    }
}

/**
 *  private Button btnBuscarElis;
 private Button btnPedidoElis;
 private Button btnElisPlanet;



 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_Planet);

 btnPedidoXpress=(Button)findViewById(R.id.btnPedidoElis);
 btnBuscarMapaXpress=(Button)findViewById(R.id.btnBuscarMapaElis);
 btnXpressPagina=(Button)findViewById(R.id.btnElisPagina);





 btnXpressPagina.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {





 Uri uriUrl = Uri.parse("http://www.elis.bo/");

 Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
 startActivity(intent);

 }
 });
 }
 }
 */
