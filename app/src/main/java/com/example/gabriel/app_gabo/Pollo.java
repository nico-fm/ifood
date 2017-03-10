package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Pollo extends AppCompatActivity {


    private Button btnBuscarMapaPollo;
    private Button btnPolloPagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollo);


        btnBuscarMapaPollo=(Button)findViewById(R.id.btnBuscarMapaPollo);
        btnPolloPagina=(Button)findViewById(R.id.btnPolloPagina);


        btnPolloPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uriUrl = Uri.parse("http://www.polloscopacabana.com/menu/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });
        /*btnBuscarMapaPollo.setOnClickListener(new View.OnClickListener(){

        });*/
    }
}
