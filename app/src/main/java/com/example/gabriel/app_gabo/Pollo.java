package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class Pollo extends AppCompatActivity {


    private Button btnBuscarMapaPollo;
    private Button btnPolloPagina;
    Spinner spinner1,
            spinner2,
            spinner3;
    private ImageView imagen_pollo,
            imagen_hamburguesas,
            imagen_extras;
    private TypedArray imgp,
            imgh,
            imge;
    String[] pollo;
    String[] hamburguesa;
    String[] extras;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollo);

        pollo=getResources().getStringArray(R.array.nombre_lista_pollo);
        hamburguesa=getResources().getStringArray(R.array.nombre_lista_hamburguesa);
        extras=getResources().getStringArray(R.array.nombre_lista_extras);

        imgp = getResources().obtainTypedArray(R.array.lista_pollo);
        imgh = getResources().obtainTypedArray(R.array.lista_hamburguesa);
        imge = getResources().obtainTypedArray(R.array.lista_extras);

        spinner1 = (Spinner) findViewById(R.id.SpinnerPollo);
        spinner2 = (Spinner) findViewById(R.id.SpinnerHam);
        spinner3 = (Spinner) findViewById(R.id.SpinnerExtras);

        imagen_pollo = (ImageView) findViewById(R.id.imagen_pollo);
        imagen_hamburguesas = (ImageView) findViewById(R.id.imagen_hamburguesa);
        imagen_extras = (ImageView) findViewById(R.id.imagen_extras);

       /* pollo = new String[]{"Seleccionar", "Balde 12 Presas", "Balde 8 Presas", "Combo Especial",
                "Combo Trio", "Combo Fiesta", "Combo 1/4 Pollo", "Combo Antojito", "Copalitos"
                , "Combo Copito"};
        hamburguesa = new String[]{"Seleccionar", "Combo Doble", "Combo Copacabana", "Combo Queso",
                "Combo Recreo"};
        extras = new String[]{"Seleccionar", "Salsas", "Papas Fritas", "Arroz",
                "Gaseosas"};*/
        ArrayAdapter<String> polloList = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, pollo);
        ArrayAdapter<String> hamburguesalist = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, hamburguesa);
        ArrayAdapter<String> extraslist = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, extras);


     // spinner1.setDropDownViewResources(android.R.layout.simple_spinner_dropdown_item);


        spinner1.setAdapter(polloList);
        spinner2.setAdapter(hamburguesalist);
        spinner3.setAdapter(extraslist);


        btnBuscarMapaPollo = (Button) findViewById(R.id.btnBuscarMapaPollo);
        btnPolloPagina = (Button) findViewById(R.id.btnPolloPagina);


        btnPolloPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uriUrl = Uri.parse("http://www.polloscopacabana.com/menu/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });
        btnBuscarMapaPollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }


        });

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                               @Override
                                               public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                   imagen_pollo.setImageResource(imgp.getResourceId(
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

                                                   imagen_hamburguesas.setImageResource(imgh.getResourceId(
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

                                                   imagen_extras.setImageResource(imge.getResourceId(
                                                           spinner3.getSelectedItemPosition(), -1));
                                               }

                                               @Override
                                               public void onNothingSelected(AdapterView<?> parent) {

                                               }
                                           }
        );
    }
}