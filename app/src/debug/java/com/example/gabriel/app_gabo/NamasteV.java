package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NamasteV extends AppCompatActivity {

    private Button btnNamastePedido;
    private Button btnNamastePagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaste_v);



        btnNamastePagina = (Button) findViewById(R.id.btnNamastePagina);
        btnNamastePedido = (Button) findViewById(R.id.btnPedidoNamaste);


        btnNamastePagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri uriUrl = Uri.parse("https://www.facebook.com/pages/Namaste/171831142880984");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });
        btnNamastePedido.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                        Uri.parse("tel: 2 2481401"));
                startActivity(i);
            }
        });
    }
}
