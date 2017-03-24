package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TomateCafeV extends AppCompatActivity {

    private Button btnTomatePedido;
    private Button btnTomatePagina;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomate_cafe_v);


        btnTomatePagina = (Button) findViewById(R.id.btnTomateCafePagina);
        btnTomatePedido = (Button) findViewById(R.id.btnPedidoTomateCafe);


        btnTomatePagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri uriUrl = Uri.parse("http://www.boliviaentusmanos.com/amarillas/businesscard/tomate_cafe.html");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });
        btnTomatePedido.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                        Uri.parse("tel: 2 2902001"));
                startActivity(i);
            }
        });
    }
}
