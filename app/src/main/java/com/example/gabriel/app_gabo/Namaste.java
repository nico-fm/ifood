package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class Namaste extends AppCompatActivity {

    private Button btnPedidoNamaste;
    private Button btnNamastepagina;
    private Button botonInfo;


    Spinner spinner1,
            spinner2,
            spinner3;

    String[] ensaladas;
    String[] almuerzos;
    String[] postres;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaste);


        ensaladas = getResources().getStringArray(R.array.nombre_lista_ensaladas);
        almuerzos = getResources().getStringArray(R.array.nombre_lista_almuerzos);
        postres = getResources().getStringArray(R.array.nombre_lista_postres);



        spinner1 = (Spinner) findViewById(R.id.Spinnerensaladas);
        spinner2 = (Spinner) findViewById(R.id.Spinneralmuerzos);
        spinner3 = (Spinner) findViewById(R.id.Spinnerpostres);


        /* ensaladas = new String[]{"Seleccionar", " Ensaladas Griega", "mixta", "Combo Especial","Gazpacho"};
        almuerzos = new String[]{"Seleccionar", "Paella", "Crema de verduras", "Bunuelos de calabaza"};
        postres = new String[]{"Seleccionar", "Tarta de chocolate", "kefir", "Tarta de Queso",
                "Tarta de Manzana"};*/




        ArrayAdapter<String> ensaladasList = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, ensaladas);
        ArrayAdapter<String> almuerzoslist = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, almuerzos);
        ArrayAdapter<String> postreslist = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, postres);

        spinner1.setAdapter(ensaladasList);
        spinner2.setAdapter(almuerzoslist);
        spinner3.setAdapter(postreslist);



        btnPedidoNamaste =(Button) findViewById(R.id.btnPedidoNamaste);
        btnNamastepagina =(Button) findViewById(R.id.btnNamastepagina);


        btnNamastepagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uriUrl = Uri.parse("http://namastebolivia.com/Namaste/Bienvenidos.html");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });


        botonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namaste.this, SucursalPollos.class);
                startActivity(intent);


            }
        });


    }

}
