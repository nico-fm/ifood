package com.example.gabriel.app_gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Mrpizza extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mrpizza);
    }
}



/**
 * private Button btnBuscarMrpizza;
 private Button btnPedidoMrpizza;
 private Button btnMrpizzaPagina;



 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_Mrpizza);

 btnPedidoMrpizza=(Button)findViewById(R.id.btnPedidoMrpizza);
 btnBuscarMapaMrpizza=(Button)findViewById(R.id.btnBuscarMapaMrpizza);
 btnMrpizzaPagina=(Button)findViewById(R.id.btnMrpizzaPagina);





 btnMrpizzaPagina.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {





 Uri uriUrl = Uri.parse("http://www.misterpizza.com.mx/");

 Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
 startActivity(intent);

 }
 });
 }
 }
 */
