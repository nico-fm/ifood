package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CasaDelSolV extends AppCompatActivity {

    private Button btnCasaDelSolPedido;
    private Button btnCasaDelSolPagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa_del_sol_v);


        btnCasaDelSolPedido = (Button) findViewById(R.id.btnPedidoCasaDelSol);
        btnCasaDelSolPagina = (Button) findViewById(R.id.btnCasaDelSolPagina);



        btnCasaDelSolPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri uriUrl = Uri.parse("https://www.facebook.com/pg/Red-GFU-Casa-del-Sol-Bolivia-223130147851029/about/?ref=page_internal");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });
        btnCasaDelSolPedido.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                        Uri.parse("tel:22 440928"));
                startActivity(i);
            }
        });
    }
}
