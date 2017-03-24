package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.gabriel.app_gabo.R.id.btnNamastePagina;

public class VinaphoV extends AppCompatActivity {

    private Button btnVinaphoPedido;
    private Button btnVinaphoPagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinapho_v);


        btnVinaphoPagina = (Button) findViewById(R.id.btnVinaphoPagina);
        btnVinaphoPedido = (Button) findViewById(R.id.btnPedidoVinapho);


        btnVinaphoPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri uriUrl = Uri.parse("https://www.facebook.com/Vinapho.LP/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });
        btnVinaphoPedido.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                        Uri.parse("tel: 2 2944778"));
                startActivity(i);
            }
        });
    }
}
