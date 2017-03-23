package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;


public class CasadelSol extends AppCompatActivity {

    private Button btnPedidoCasadelSol;
    private Button btnCasadelSolpagina;
    private Button botonInfo;

    Spinner spinner1,
            spinner2,
            spinner3;
    private ImageView imagen_ensaladas,
            imagen_almuerzos,
            imagen_postres;
    private TypedArray imge,
            imga,
            imgp;
    String[] ensaladas;
    String[] almuerzos;
    String[] postres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casadelsol);



        ensaladas = getResources().getStringArray(R.array.nombre_lista_ensaladas);
        almuerzos = getResources().getStringArray(R.array.nombre_lista_almuerzos);
        postres = getResources().getStringArray(R.array.nombre_lista_postres);

        imge = getResources().obtainTypedArray(R.array.lista_ensaladas);
        imga = getResources().obtainTypedArray(R.array.lista_almuerzos);
        imgp = getResources().obtainTypedArray(R.array.lista_postres);

        spinner1 = (Spinner) findViewById(R.id.Spinnerensaladas);
        spinner2 = (Spinner) findViewById(R.id.Spinneralmuerzos);
        spinner3 = (Spinner) findViewById(R.id.Spinnerpostres);

        imagen_ensaladas = (ImageView) findViewById(R.id.imagen_ensaladas);
        imagen_almuerzos = (ImageView) findViewById(R.id.imagen_almuerzos);
        imagen_postres = (ImageView) findViewById(R.id.imagen_postres);


        ensaladas = new String[]{"Seleccionar", " Ensaladas Griega", "mixta", "Daneza","Gazpacho"};
        almuerzos = new String[]{"Seleccionar", "Paella", "Crema de verduras", "Bunuelos de calabaza"};
        postres = new String[]{"Seleccionar", "Tarta de chocolate", "kefir", "Tarta de Queso",
                "Tarta de Manzana"};




        ArrayAdapter<String> ensaladasList = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, ensaladas);
        ArrayAdapter<String> almuerzoslist = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, almuerzos);
        ArrayAdapter<String> postreslist = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, postres);

        spinner1.setAdapter(ensaladasList);
        spinner2.setAdapter(almuerzoslist);
        spinner3.setAdapter(postreslist);


        btnPedidoCasadelSol = (Button) findViewById(R.id.btnPedidoCasadeSol);
        btnCasadelSolpagina = (Button) findViewById(R.id.btnCasadeSolPagina);


        btnCasadelSolpagina.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(CasadelSol.this, SucursalPollos.class);
                startActivity(intent);


            }
        });


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                               @Override
                                               public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                   imagen_ensaladas.setImageResource(imge.getResourceId(
                                                           spinner1.getSelectedItemPosition(), -1));
                                               }

                                               @Override
                                               public void onNothingSelected(AdapterView<?> parent) {

                                               }
                                           }
        );
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                               @Override
                                               public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                   imagen_almuerzos.setImageResource(imga.getResourceId(
                                                           spinner2.getSelectedItemPosition(), -1));
                                               }

                                               @Override
                                               public void onNothingSelected(AdapterView<?> parent) {

                                               }
                                           }
        );
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                               @Override
                                               public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                   imagen_postres.setImageResource(imgp.getResourceId(
                                                           spinner3.getSelectedItemPosition(), -1));
                                               }

                                               @Override
                                               public void onNothingSelected(AdapterView<?> parent) {

                                               }

                                           }
        );




    }


}









