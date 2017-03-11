package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class Pollo extends AppCompatActivity {


    private Button btnBuscarMapaPollo;
    private Button btnPolloPagina;
    Spinner spinner1,spinner2,spinner3;
    String[] opciones1;
    String[] opciones2;
    String[] opciones3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollo);

        spinner1=(Spinner)findViewById(R.id.SpinnerPollo);
        spinner2=(Spinner)findViewById(R.id.SpinnerHam);
        spinner3=(Spinner)findViewById(R.id.SpinnerExtras);

        opciones1=new String[]{"Balde 12 Presas","Balde 8 Presas","Combo Especial",
                "Combo Trio","Combo Fiesta","Combo 1/4 Pollo","Combo Antojito","Copalitos"
                ,"Combo Copito"};
        opciones2=new String[]{"Combo Doble","Combo Copacabana","Combo Queso",
                "Combo Recreo","Sandwich de Pollo a la Plancha"};
        opciones3=new String[]{"Salsas","Papas Fritas","Arroz",
                "Gaseosas","Postres"};
        /*ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones1);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones2);*/




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
        btnBuscarMapaPollo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {




            }


        });
    }
}
