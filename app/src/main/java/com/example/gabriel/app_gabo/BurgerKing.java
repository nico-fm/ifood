package com.example.gabriel.app_gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BurgerKing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
    }
}

/**
 * private Button btnBuscarBurgerKing;
 private Button btnPedidoBurgerKing;
 private Button btnBurgerKingPagina;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_burgerking);

 btnPedidoBurgerKing=(Button)findViewById(R.id.btnPedidoBurgerKing);
 btnBuscarBurgerKing=(Button)findViewById(R.id.btnBuscarMapaBurgerKing);
 btnBurgerKingPagina=(Button)findViewById(R.id.btnBurgerKingPagina);


 btnBurgerKingPagina.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {


 Uri uriUrl = Uri.parse("http://www.burgerking.com.bo/");

 Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
 startActivity(intent);

 }
 });
 }
 }




 */
